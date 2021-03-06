/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jecelyin.editor.v2.ui;

import android.database.DataSetObserver;
import android.support.v4.view.GravityCompat;
import android.view.View;

import com.jecelyin.editor.v2.R;
import com.jecelyin.editor.v2.adapter.EditorAdapter;
import com.jecelyin.editor.v2.adapter.TabAdapter;
import com.jecelyin.editor.v2.common.TabCloseListener;
import com.jecelyin.editor.v2.utils.DBHelper;
import com.jecelyin.editor.v2.utils.ExtGrep;
import com.jecelyin.editor.v2.view.EditorView;
import com.jecelyin.editor.v2.view.TabViewPager;
import com.jecelyin.editor.v2.Pref;
import com.yqritc.recyclerviewflexibledivider.HorizontalDividerItemDecoration;

import java.io.File;
import java.util.ArrayList;

/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class TabManager implements TabViewPager.OnPageChangeListener {
    private final MainActivity mainActivity;
    private final TabAdapter tabAdapter;
    private EditorAdapter editorAdapter;
    private boolean exitApp;

    public TabManager(MainActivity activity) {
        this.mainActivity = activity;

        this.tabAdapter = new TabAdapter();
        tabAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onTabMenuViewsClick(v);
            }
        });
//        tabAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
//            @Override
//            public void onChanged() {
//                mainActivity.tabDrawable.setText(String.valueOf(tabAdapter.getItemCount()));
//            }
//        });
        mainActivity.mTabRecyclerView.addItemDecoration(new HorizontalDividerItemDecoration.Builder(activity.getContext()).build());
        mainActivity.mTabRecyclerView.setAdapter(tabAdapter);

        initEditor();

        mainActivity.mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.mDrawerLayout.openDrawer(GravityCompat.START);
            }
        });
        mainActivity.mTabPager.setOnPageChangeListener(this);
        setCurrentTab(0);
    }

    private void onTabMenuViewsClick(View v) {
        switch (v.getId()) {
            case R.id.close_image_view:
                closeTab((int)v.getTag());
                break;
            default:
                int position = (int) v.getTag();
                mainActivity.closeMenu();
                setCurrentTab(position);
                break;
        }
    }

    private void initEditor() {
        editorAdapter = new EditorAdapter(mainActivity);
        mainActivity.mTabPager.setAdapter(editorAdapter); //优先，避免TabAdapter获取不到正确的CurrentItem

        if (Pref.getInstance(mainActivity).isOpenLastFiles()) {
            ArrayList<DBHelper.RecentFileItem> recentFiles = DBHelper.getInstance(mainActivity).getRecentFiles(true);

            File f;
            for (DBHelper.RecentFileItem item : recentFiles) {
                f = new File(item.path);
                if(!f.isFile())
                    continue;
                editorAdapter.newEditor(false, f, item.offset, item.encoding);
            }
            editorAdapter.notifyDataSetChanged();
            updateTabList();
        }

        editorAdapter.registerDataSetObserver(new DataSetObserver() {
            @Override
            public void onChanged() {
                updateTabList();

                if (!exitApp && editorAdapter.getCount() == 0) {
                    mainActivity.mTabPager.post(new Runnable() {
                        @Override
                        public void run() {
                            newTab();
                        }
                    });
                }
            }
        });

        if (editorAdapter.getCount() == 0)
            editorAdapter.newEditor(mainActivity.getString(R.string.new_filename, editorAdapter.countNoFileEditor() + 1), null);
    }

    public void newTab() {
        editorAdapter.newEditor(mainActivity.getString(R.string.new_filename, editorAdapter.getCount() + 1), null);
        setCurrentTab(editorAdapter.getCount() - 1);
    }

    public boolean newTab(CharSequence content) {
        editorAdapter.newEditor(mainActivity.getString(R.string.new_filename, editorAdapter.getCount() + 1), content);
        setCurrentTab(editorAdapter.getCount() - 1);
        return true;
    }

    public boolean newTab(ExtGrep grep) {
        editorAdapter.newEditor(grep);
        setCurrentTab(editorAdapter.getCount() - 1);
        return true;
    }

    public boolean newTab(File path, String encoding) {
        return newTab(path, 0, encoding);
    }

    public boolean newTab(File path, int offset, String encoding) {
        int count = editorAdapter.getCount();
        for(int i = 0; i < count; i++) {
            EditorDelegate fragment = editorAdapter.getItem(i);
            if(fragment.getPath() == null)
                continue;
            if(fragment.getPath().equals(path.getPath())) {
                setCurrentTab(i);
                return false;
            }
        }
        editorAdapter.newEditor(path, offset, encoding);
        setCurrentTab(count);
        return true;
    }

    public void setCurrentTab(final int index) {
        mainActivity.mTabPager.setCurrentItem(index);
        tabAdapter.setCurrentTab(index);
        updateToolbar();
    }

    public int getTabCount() {
        if(tabAdapter == null)
            return 0;
        return tabAdapter.getItemCount();
    }

    public int getCurrentTab() {
        return mainActivity.mTabPager.getCurrentItem();
    }

    public void closeTab(int position) {
        editorAdapter.removeEditor(position, new TabCloseListener() {
            @Override
            public void onClose(String path, String encoding, int offset) {
                DBHelper.getInstance(mainActivity).updateRecentFile(path, false);
                int currentTab = getCurrentTab();
                if (getTabCount() != 0) {
                    setCurrentTab(currentTab); //设置title等等
                }
//                tabAdapter.setCurrentTab(currentTab);
            }
        });
    }

    public EditorAdapter getEditorAdapter() {
        return editorAdapter;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        tabAdapter.setCurrentTab(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    private void updateTabList() {
        tabAdapter.setTabInfoList(editorAdapter.getTabInfoList());
        tabAdapter.notifyDataSetChanged();
    }

    public void updateEditorView(int index, EditorView editorView) {
        editorAdapter.setEditorView(index, editorView);
    }

    public void onDocumentChanged(int index) {
        updateTabList();
        updateToolbar();
    }

    private void updateToolbar() {
        EditorDelegate delegate = editorAdapter.getItem(getCurrentTab());
        if(delegate == null)
            return;
        mainActivity.mToolbar.setTitle(delegate.getToolbarText());
    }

    public boolean closeAllTabAndExitApp() {
        EditorDelegate.setDisableAutoSave(true);
        exitApp = true;
        return editorAdapter.removeAll(new TabCloseListener() {
            @Override
            public void onClose(String path, String encoding, int offset) {
                DBHelper.getInstance(mainActivity).updateRecentFile(path, encoding, offset);
                int count = getTabCount();
                if (count == 0) {
                    mainActivity.finish();
                } else {
                    editorAdapter.removeAll(this);
                }
            }
        });
    }
}
