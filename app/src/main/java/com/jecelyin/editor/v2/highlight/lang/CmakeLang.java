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

package com.jecelyin.editor.v2.highlight.lang;

import com.jecelyin.editor.v2.highlight.LangDefine;
import com.jecelyin.editor.v2.highlight.syntax.*;
/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class CmakeLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "#";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = "4";
        PROPERTY2.NAME = "indentSize";

        PROPERTY3.VALUE = "";
        PROPERTY3.NAME = "firstlineGlob";

        PROPERTY4.VALUE = "none";
        PROPERTY4.NAME = "wrap";

        PROPERTY5.VALUE = "false";
        PROPERTY5.NAME = "noTabs";

        PROPERTY6.VALUE = "8";
        PROPERTY6.NAME = "tabSize";

        PROPERTY7.VALUE = "0";
        PROPERTY7.NAME = "maxLineLen";

        PROPERTY8.VALUE = "_";
        PROPERTY8.NAME = "noWordSep";

        PROPERTY9.VALUE = "none";
        PROPERTY9.NAME = "folding";

        PROPERTY10.VALUE = "true";
        PROPERTY10.NAME = "customSettings";

        PROPERTY11.VALUE = "false";
        PROPERTY11.NAME = "deepIndent";

        PROPERTY12.VALUE = "1000";
        PROPERTY12.NAME = "collapseFolds";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "TRUE";

        EOL_SPAN1.text = "#";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "KEYWORD2";

        BEGIN1.text = "${";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "$";
        MARK_FOLLOWING1.TYPE = "KEYWORD2";

        SPAN2.TYPE = "LITERAL1";
        SPAN2.DELEGATE = "LITERAL";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        MARK_PREVIOUS MARK_PREVIOUS1 = new MARK_PREVIOUS();
        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ1.text = ")";
        SEQ1.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD2", new String[]{"ADD_CUSTOM_COMMAND", "ADD_CUSTOM_TARGET", "ADD_DEFINITIONS", "ADD_DEPENDENCIES", "ADD_EXECUTABLE", "ADD_LIBRARY", "ADD_SUBDIRECTORY", "ADD_TEST", "AUX_SOURCE_DIRECTORY", "BUILD_COMMAND", "BUILD_NAME", "CMAKE_MINIMUM_REQUIRED", "CONFIGURE_FILE", "CREATE_TEST_SOURCELIST", "ENABLE_LANGUAGE", "ENABLE_TESTING", "EXEC_PROGRAM", "EXECUTE_PROCESS", "EXPORT_LIBRARY_DEPENDENCIES", "FILE", "FIND_FILE", "FIND_LIBRARY", "FIND_PACKAGE", "FIND_PATH", "FIND_PROGRAM", "FLTK_WRAP_UI", "GET_CMAKE_PROPERTY", "GET_DIRECTORY_PROPERTY", "GET_FILENAME_COMPONENT", "GET_SOURCE_FILE_PROPERTY", "GET_TARGET_PROPERTY", "GET_TEST_PROPERTY", "INCLUDE", "INCLUDE_DIRECTORIES", "INCLUDE_EXTERNAL_MSPROJECT", "INCLUDE_REGULAR_EXPRESSION", "INSTALL", "INSTALL_FILES", "INSTALL_PROGRAMS", "INSTALL_TARGETS", "LINK_DIRECTORIES", "LINK_LIBRARIES", "LIST", "LOAD_CACHE", "LOAD_COMMAND", "MAKE_DIRECTORY", "MARK_AS_ADVANCED", "MATH", "MESSAGE", "OPTION", "OUTPUT_REQUIRED_FILES", "PROJECT", "QT_WRAP_CPP", "QT_WRAP_UI", "REMOVE", "REMOVE_DEFINITIONS", "SEPARATE_ARGUMENTS", "SET", "SET_DIRECTORY_PROPERTIES", "SET_SOURCE_FILES_PROPERTIES", "SET_TARGET_PROPERTIES", "SET_TESTS_PROPERTIES", "SITE_NAME", "SOURCE_GROUP", "STRING", "SUBDIR_DEPENDS", "SUBDIRS", "TARGET_LINK_LIBRARIES", "TRY_COMPILE", "TRY_RUN", "USE_MANGLED_MESA", "UTILITY_SOURCE", "VARIABLE_REQUIRES", "VTK_MAKE_INSTANTIATOR", "VTK_WRAP_JAVA", "VTK_WRAP_PYTHON", "VTK_WRAP_TCL", "WRITE_FILE", });
        KEYWORDS1.add("KEYWORD4", new String[]{"FOREACH", "ELSE", "ELSEIF", "IF", "MACRO", "ENDIF", "ENDWHILE", "ENDFOREACH", "ENDMACRO", "WHILE", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        RULES1.SEQ = new SEQ[] { SEQ1, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LITERAL";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.ESCAPE = "\\";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "KEYWORD2";

        BEGIN1.text = "${";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "$";
        MARK_FOLLOWING1.TYPE = "KEYWORD2";


        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}