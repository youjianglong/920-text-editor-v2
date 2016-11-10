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
public class PlaintexLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "%";
        PROPERTY1.NAME = "lineComment";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN1.text = "%";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.TYPE = "OPERATOR";
        SPAN1.DELEGATE = "MATH";

        BEGIN1.text = "$$";

        END1.text = "$$";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "OPERATOR";
        SPAN2.DELEGATE = "MATH";

        BEGIN2.text = "$";

        END2.text = "$";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "\\\\[a-zA-Z@]{25}[a-zA-Z@]*";
        SEQ_REGEXP1.HASH_CHARS = "\\";
        SEQ_REGEXP1.TYPE = "LABEL";

        SEQ1.text = "\\interfootnotelinepenalty";
        SEQ1.TYPE = "KEYWORD1";

        SEQ_REGEXP2.text = "\\\\[a-zA-Z@]{24}";
        SEQ_REGEXP2.HASH_CHARS = "\\";
        SEQ_REGEXP2.TYPE = "LABEL";

        SEQ2.text = "\\interdisplaylinepenalty";
        SEQ2.TYPE = "KEYWORD1";

        SEQ_REGEXP3.text = "\\\\[a-zA-Z@]{23}";
        SEQ_REGEXP3.HASH_CHARS = "\\";
        SEQ_REGEXP3.TYPE = "LABEL";

        SEQ_REGEXP4.text = "\\\\[a-zA-Z@]{22}";
        SEQ_REGEXP4.HASH_CHARS = "\\";
        SEQ_REGEXP4.TYPE = "LABEL";

        SEQ3.text = "\\belowdisplayshortskip";
        SEQ3.TYPE = "KEYWORD4";

        SEQ4.text = "\\abovedisplayshortskip";
        SEQ4.TYPE = "KEYWORD4";

        SEQ_REGEXP5.text = "\\\\[a-zA-Z@]{21}";
        SEQ_REGEXP5.HASH_CHARS = "\\";
        SEQ_REGEXP5.TYPE = "LABEL";

        SEQ5.text = "\\doublehyphendemerits";
        SEQ5.TYPE = "KEYWORD4";

        SEQ6.text = "\\abovedisplayshortskip";
        SEQ6.TYPE = "KEYWORD1";

        SEQ_REGEXP6.text = "\\\\[a-zA-Z@]{20}";
        SEQ_REGEXP6.HASH_CHARS = "\\";
        SEQ_REGEXP6.TYPE = "LABEL";

        SEQ7.text = "\\normallineskiplimit";
        SEQ7.TYPE = "KEYWORD1";

        SEQ8.text = "\\finalhyphendemerits";
        SEQ8.TYPE = "KEYWORD4";

        SEQ9.text = "\\displaywidowpenalty";
        SEQ9.TYPE = "KEYWORD4";

        SEQ_REGEXP7.text = "\\\\[a-zA-Z@]{19}";
        SEQ_REGEXP7.HASH_CHARS = "\\";
        SEQ_REGEXP7.TYPE = "LABEL";

        SEQ10.text = "\\postdisplaypenalty";
        SEQ10.TYPE = "KEYWORD4";

        SEQ11.text = "\\nulldelimiterspace";
        SEQ11.TYPE = "KEYWORD4";

        SEQ12.text = "\\normalbaselineskip";
        SEQ12.TYPE = "KEYWORD1";

        SEQ13.text = "\\Longleftrightarrow";
        SEQ13.TYPE = "KEYWORD1";

        SEQ14.text = "\\longleftrightarrow";
        SEQ14.TYPE = "KEYWORD1";

        SEQ15.text = "\\delimitershortfall";
        SEQ15.TYPE = "KEYWORD4";

        SEQ_REGEXP8.text = "\\\\[a-zA-Z@]{18}";
        SEQ_REGEXP8.HASH_CHARS = "\\";
        SEQ_REGEXP8.TYPE = "LABEL";

        SEQ16.text = "\\tracingparagraphs";
        SEQ16.TYPE = "KEYWORD4";

        SEQ17.text = "\\scriptscriptstyle";
        SEQ17.TYPE = "KEYWORD1";

        SEQ18.text = "\\rightleftharpoons";
        SEQ18.TYPE = "KEYWORD1";

        SEQ19.text = "\\predisplaypenalty";
        SEQ19.TYPE = "KEYWORD1";

        SEQ20.text = "\\errorcontextlines";
        SEQ20.TYPE = "KEYWORD4";

        SEQ21.text = "\\defaulthyphenchar";
        SEQ21.TYPE = "KEYWORD4";

        SEQ_REGEXP9.text = "\\\\[a-zA-Z@]{17}";
        SEQ_REGEXP9.HASH_CHARS = "\\";
        SEQ_REGEXP9.TYPE = "LABEL";

        SEQ22.text = "\\tracinglostchars";
        SEQ22.TYPE = "KEYWORD4";

        SEQ23.text = "\\scriptscriptfont";
        SEQ23.TYPE = "KEYWORD1";

        SEQ24.text = "\\rightharpoondown";
        SEQ24.TYPE = "KEYWORD1";

        SEQ25.text = "\\predisplaypenaty";
        SEQ25.TYPE = "KEYWORD4";

        SEQ26.text = "\\pagefilllstretch";
        SEQ26.TYPE = "KEYWORD1";

        SEQ27.text = "\\offinterlineskip";
        SEQ27.TYPE = "KEYWORD1";

        SEQ28.text = "\\nonfrenchspacing";
        SEQ28.TYPE = "KEYWORD1";

        SEQ29.text = "\\interlinepenalty";
        SEQ29.TYPE = "KEYWORD4";

        SEQ30.text = "\\emergencystretch";
        SEQ30.TYPE = "KEYWORD4";

        SEQ31.text = "\\belowdisplayskip";
        SEQ31.TYPE = "KEYWORD4";

        SEQ32.text = "\\allocationnumber";
        SEQ32.TYPE = "KEYWORD1";

        SEQ33.text = "\\abovedisplayskip";
        SEQ33.TYPE = "KEYWORD4";

        SEQ_REGEXP10.text = "\\\\[a-zA-Z@]{16}";
        SEQ_REGEXP10.HASH_CHARS = "\\";
        SEQ_REGEXP10.TYPE = "LABEL";

        SEQ34.text = "\\tracingrestores";
        SEQ34.TYPE = "KEYWORD4";

        SEQ35.text = "\\tracingcommands";
        SEQ35.TYPE = "KEYWORD4";

        SEQ36.text = "\\smallskipamount";
        SEQ36.TYPE = "KEYWORD1";

        SEQ37.text = "\\pagefillstretch";
        SEQ37.TYPE = "KEYWORD1";

        SEQ38.text = "\\normalbaselines";
        SEQ38.TYPE = "KEYWORD1";

        SEQ39.text = "\\nointerlineskip";
        SEQ39.TYPE = "KEYWORD1";

        SEQ40.text = "\\leftharpoondown";
        SEQ40.TYPE = "KEYWORD1";

        SEQ41.text = "\\insertpenalties";
        SEQ41.TYPE = "KEYWORD1";

        SEQ42.text = "\\floatingpenalty";
        SEQ42.TYPE = "KEYWORD4";

        SEQ43.text = "\\exhyphenpenalty";
        SEQ43.TYPE = "KEYWORD4";

        SEQ44.text = "\\delimiterfactor";
        SEQ44.TYPE = "KEYWORD4";

        SEQ45.text = "\\defaultskewchar";
        SEQ45.TYPE = "KEYWORD4";

        SEQ46.text = "\\bigtriangledown";
        SEQ46.TYPE = "KEYWORD1";

        SEQ47.text = "\\afterassignment";
        SEQ47.TYPE = "KEYWORD1";

        SEQ48.text = "\\abovewithdelims";
        SEQ48.TYPE = "KEYWORD1";

        SEQ_REGEXP11.text = "\\\\[a-zA-Z@]{15}";
        SEQ_REGEXP11.HASH_CHARS = "\\";
        SEQ_REGEXP11.TYPE = "LABEL";

        SEQ49.text = "\\splitfirstmark";
        SEQ49.TYPE = "KEYWORD1";

        SEQ50.text = "\\showboxbreadth";
        SEQ50.TYPE = "KEYWORD4";

        SEQ51.text = "\\righthyphenmin";
        SEQ51.TYPE = "KEYWORD4";

        SEQ52.text = "\\rightharpoonup";
        SEQ52.TYPE = "KEYWORD1";

        SEQ53.text = "\\rightarrowfill";
        SEQ53.TYPE = "KEYWORD1";

        SEQ54.text = "\\removelastskip";
        SEQ54.TYPE = "KEYWORD1";

        SEQ55.text = "\\predisplaysize";
        SEQ55.TYPE = "KEYWORD4";

        SEQ56.text = "\\pagefilstretch";
        SEQ56.TYPE = "KEYWORD1";

        SEQ57.text = "\\overwithdelims";
        SEQ57.TYPE = "KEYWORD1";

        SEQ58.text = "\\overrightarrow";
        SEQ58.TYPE = "KEYWORD1";

        SEQ59.text = "\\normallineskip";
        SEQ59.TYPE = "KEYWORD1";

        SEQ60.text = "\\longrightarrow";
        SEQ60.TYPE = "KEYWORD1";

        SEQ61.text = "\\Longrightarrow";
        SEQ61.TYPE = "KEYWORD1";

        SEQ62.text = "\\Leftrightarrow";
        SEQ62.TYPE = "KEYWORD1";

        SEQ63.text = "\\leftrightarrow";
        SEQ63.TYPE = "KEYWORD1";

        SEQ64.text = "\\hookrightarrow";
        SEQ64.TYPE = "KEYWORD1";

        SEQ65.text = "\\holdinginserts";
        SEQ65.TYPE = "KEYWORD4";

        SEQ66.text = "\\atopwithdelims";
        SEQ66.TYPE = "KEYWORD1";

        SEQ_REGEXP12.text = "\\\\[a-zA-Z@]{14}";
        SEQ_REGEXP12.HASH_CHARS = "\\";
        SEQ_REGEXP12.TYPE = "LABEL";

        SEQ67.text = "\\ttraggedright";
        SEQ67.TYPE = "KEYWORD1";

        SEQ68.text = "\\triangleright";
        SEQ68.TYPE = "KEYWORD1";

        SEQ69.text = "\\tracingoutput";
        SEQ69.TYPE = "KEYWORD4";

        SEQ70.text = "\\tracingonline";
        SEQ70.TYPE = "KEYWORD4";

        SEQ71.text = "\\tracingmacros";
        SEQ71.TYPE = "KEYWORD4";

        SEQ72.text = "\\splitmaxdepth";
        SEQ72.TYPE = "KEYWORD4";

        SEQ73.text = "\\overleftarrow";
        SEQ73.TYPE = "KEYWORD1";

        SEQ74.text = "\\outputpenalty";
        SEQ74.TYPE = "KEYWORD4";

        SEQ75.text = "\\nopagenumbers";
        SEQ75.TYPE = "KEYWORD1";

        SEQ76.text = "\\medskipamount";
        SEQ76.TYPE = "KEYWORD1";

        SEQ77.text = "\\maxdeadcycles";
        SEQ77.TYPE = "KEYWORD4";

        SEQ78.text = "\\magnification";
        SEQ78.TYPE = "KEYWORD1";

        SEQ79.text = "\\Longleftarrow";
        SEQ79.TYPE = "KEYWORD1";

        SEQ80.text = "\\longleftarrow";
        SEQ80.TYPE = "KEYWORD1";

        SEQ81.text = "\\lineskiplimit";
        SEQ81.TYPE = "KEYWORD4";

        SEQ82.text = "\\lefthyphenmin";
        SEQ82.TYPE = "KEYWORD4";

        SEQ83.text = "\\leftharpoonup";
        SEQ83.TYPE = "KEYWORD1";

        SEQ84.text = "\\leftarrowfill";
        SEQ84.TYPE = "KEYWORD1";

        SEQ85.text = "\\hyphenpenalty";
        SEQ85.TYPE = "KEYWORD4";

        SEQ86.text = "\\hookleftarrow";
        SEQ86.TYPE = "KEYWORD1";

        SEQ87.text = "\\frenchspacing";
        SEQ87.TYPE = "KEYWORD1";

        SEQ88.text = "\\errorstopmode";
        SEQ88.TYPE = "KEYWORD1";

        SEQ89.text = "\\downbracefill";
        SEQ89.TYPE = "KEYWORD1";

        SEQ90.text = "\\displaylimits";
        SEQ90.TYPE = "KEYWORD1";

        SEQ91.text = "\\displayindent";
        SEQ91.TYPE = "KEYWORD4";

        SEQ92.text = "\\discretionary";
        SEQ92.TYPE = "KEYWORD1";

        SEQ93.text = "\\brokenpenalty";
        SEQ93.TYPE = "KEYWORD4";

        SEQ94.text = "\\bigtriangleup";
        SEQ94.TYPE = "KEYWORD1";

        SEQ95.text = "\\bigskipamount";
        SEQ95.TYPE = "KEYWORD1";

        SEQ96.text = "\\advancepageno";
        SEQ96.TYPE = "KEYWORD1";

        SEQ_REGEXP13.text = "\\\\[a-zA-Z@]{13}";
        SEQ_REGEXP13.HASH_CHARS = "\\";
        SEQ_REGEXP13.TYPE = "LABEL";

        SEQ97.text = "\\widowpenalty";
        SEQ97.TYPE = "KEYWORD4";

        SEQ98.text = "\\triangleleft";
        SEQ98.TYPE = "KEYWORD1";

        SEQ99.text = "\\tracingstats";
        SEQ99.TYPE = "KEYWORD4";

        SEQ100.text = "\\tracingpages";
        SEQ100.TYPE = "KEYWORD4";

        SEQ101.text = "\\splittopskip";
        SEQ101.TYPE = "KEYWORD4";

        SEQ102.text = "\\splitbotmark";
        SEQ102.TYPE = "KEYWORD1";

        SEQ103.text = "\\showboxdepth";
        SEQ103.TYPE = "KEYWORD4";

        SEQ104.text = "\\romannumeral";
        SEQ104.TYPE = "KEYWORD1";

        SEQ105.text = "\\raggedbottom";
        SEQ105.TYPE = "KEYWORD1";

        SEQ106.text = "\\pretolerance";
        SEQ106.TYPE = "KEYWORD4";

        SEQ107.text = "\\pagecontents";
        SEQ107.TYPE = "KEYWORD1";

        SEQ108.text = "\\overfullrule";
        SEQ108.TYPE = "KEYWORD4";

        SEQ109.text = "\\normalbottom";
        SEQ109.TYPE = "KEYWORD1";

        SEQ110.text = "\\negthinspace";
        SEQ110.TYPE = "KEYWORD1";

        SEQ111.text = "\\mathsurround";
        SEQ111.TYPE = "KEYWORD4";

        SEQ112.text = "\\makeheadline";
        SEQ112.TYPE = "KEYWORD1";

        SEQ113.text = "\\makefootline";
        SEQ113.TYPE = "KEYWORD1";

        SEQ114.text = "\\ignorespaces";
        SEQ114.TYPE = "KEYWORD1";

        SEQ115.text = "\\footnoterule";
        SEQ115.TYPE = "KEYWORD1";

        SEQ116.text = "\\everydisplay";
        SEQ116.TYPE = "KEYWORD4";

        SEQ117.text = "\\dosupereject";
        SEQ117.TYPE = "KEYWORD1";

        SEQ118.text = "\\displaywidth";
        SEQ118.TYPE = "KEYWORD4";

        SEQ119.text = "\\displaystyle";
        SEQ119.TYPE = "KEYWORD1";

        SEQ120.text = "\\displaylines";
        SEQ120.TYPE = "KEYWORD1";

        SEQ121.text = "\\bordermatrix";
        SEQ121.TYPE = "KEYWORD1";

        SEQ122.text = "\\binoppenalty";
        SEQ122.TYPE = "KEYWORD4";

        SEQ123.text = "\\beginsection";
        SEQ123.TYPE = "KEYWORD1";

        SEQ124.text = "\\baselineskip";
        SEQ124.TYPE = "KEYWORD1";

        SEQ_REGEXP14.text = "\\\\[a-zA-Z@]{12}";
        SEQ_REGEXP14.HASH_CHARS = "\\";
        SEQ_REGEXP14.TYPE = "LABEL";

        SEQ125.text = "\\Updownarrow";
        SEQ125.TYPE = "KEYWORD1";

        SEQ126.text = "\\updownarrow";
        SEQ126.TYPE = "KEYWORD1";

        SEQ127.text = "\\upbracefill";
        SEQ127.TYPE = "KEYWORD1";

        SEQ128.text = "\\thickmuskip";
        SEQ128.TYPE = "KEYWORD4";

        SEQ129.text = "\\spacefactor";
        SEQ129.TYPE = "KEYWORD1";

        SEQ130.text = "\\showhyphens";
        SEQ130.TYPE = "KEYWORD1";

        SEQ131.text = "\\scriptstyle";
        SEQ131.TYPE = "KEYWORD1";

        SEQ132.text = "\\scriptspace";
        SEQ132.TYPE = "KEYWORD4";

        SEQ133.text = "\\raggedright";
        SEQ133.TYPE = "KEYWORD1";

        SEQ134.text = "\\plainoutput";
        SEQ134.TYPE = "KEYWORD1";

        SEQ135.text = "\\parfillskip";
        SEQ135.TYPE = "KEYWORD4";

        SEQ136.text = "\\pagestretch";
        SEQ136.TYPE = "KEYWORD1";

        SEQ137.text = "\\nonstopmode";
        SEQ137.TYPE = "KEYWORD1";

        SEQ138.text = "\\newlinechar";
        SEQ138.TYPE = "COMMENT2";

        SEQ139.text = "\\mathpalette";
        SEQ139.TYPE = "KEYWORD1";

        SEQ140.text = "\\mathchardef";
        SEQ140.TYPE = "FUNCTION";

        SEQ141.text = "\\magstephalf";
        SEQ141.TYPE = "KEYWORD1";

        SEQ142.text = "\\linepenalty";
        SEQ142.TYPE = "KEYWORD4";

        SEQ143.text = "\\lastpenalty";
        SEQ143.TYPE = "KEYWORD1";

        SEQ144.text = "\\hyphenation";
        SEQ144.TYPE = "KEYWORD1";

        SEQ145.text = "\\expandafter";
        SEQ145.TYPE = "KEYWORD1";

        SEQ146.text = "\\endlinechar";
        SEQ146.TYPE = "KEYWORD4";

        SEQ147.text = "\\diamondsuit";
        SEQ147.TYPE = "KEYWORD1";

        SEQ148.text = "\\clubpenalty";
        SEQ148.TYPE = "KEYWORD4";

        SEQ149.text = "\\boxmaxdepth";
        SEQ149.TYPE = "KEYWORD4";

        SEQ150.text = "\\adjdemerits";
        SEQ150.TYPE = "KEYWORD4";

        SEQ_REGEXP15.text = "\\\\[a-zA-Z@]{11}";
        SEQ_REGEXP15.HASH_CHARS = "\\";
        SEQ_REGEXP15.TYPE = "LABEL";

        SEQ151.text = "\\xspaceskip";
        SEQ151.TYPE = "KEYWORD4";

        SEQ152.text = "\\varepsilon";
        SEQ152.TYPE = "KEYWORD1";

        SEQ153.text = "\\underbrace";
        SEQ153.TYPE = "KEYWORD1";

        SEQ154.text = "\\tracingall";
        SEQ154.TYPE = "KEYWORD1";

        SEQ155.text = "\\thinmuskip";
        SEQ155.TYPE = "KEYWORD4";

        SEQ156.text = "\\textindent";
        SEQ156.TYPE = "KEYWORD1";

        SEQ157.text = "\\supereject";
        SEQ157.TYPE = "KEYWORD1";

        SEQ158.text = "\\sqsupseteq";
        SEQ158.TYPE = "KEYWORD1";

        SEQ159.text = "\\smallbreak";
        SEQ159.TYPE = "KEYWORD1";

        SEQ160.text = "\\scrollmode";
        SEQ160.TYPE = "KEYWORD1";

        SEQ161.text = "\\scriptfont";
        SEQ161.TYPE = "KEYWORD1";

        SEQ162.text = "\\rmoustache";
        SEQ162.TYPE = "KEYWORD1";

        SEQ163.text = "\\Rightarrow";
        SEQ163.TYPE = "KEYWORD1";

        SEQ164.text = "\\rightarrow";
        SEQ164.TYPE = "KEYWORD1";

        SEQ165.text = "\\relpenalty";
        SEQ165.TYPE = "KEYWORD4";

        SEQ166.text = "\\pageshrink";
        SEQ166.TYPE = "KEYWORD1";

        SEQ167.text = "\\pageinsert";
        SEQ167.TYPE = "KEYWORD1";

        SEQ168.text = "\\obeyspaces";
        SEQ168.TYPE = "KEYWORD1";

        SEQ169.text = "\\mathhexbox";
        SEQ169.TYPE = "KEYWORD1";

        SEQ170.text = "\\mathchoice";
        SEQ170.TYPE = "KEYWORD1";

        SEQ171.text = "\\mathaccent";
        SEQ171.TYPE = "KEYWORD1";

        SEQ172.text = "\\mapstochar";
        SEQ172.TYPE = "KEYWORD1";

        SEQ173.text = "\\longmapsto";
        SEQ173.TYPE = "KEYWORD1";

        SEQ174.text = "\\lmoustache";
        SEQ174.TYPE = "KEYWORD1";

        SEQ175.text = "\\leqalignno";
        SEQ175.TYPE = "KEYWORD1";

        SEQ176.text = "\\leavevmode";
        SEQ176.TYPE = "KEYWORD1";

        SEQ177.text = "\\hyphenchar";
        SEQ177.TYPE = "KEYWORD1";

        SEQ178.text = "\\hangindent";
        SEQ178.TYPE = "KEYWORD4";

        SEQ179.text = "\\globaldefs";
        SEQ179.TYPE = "KEYWORD4";

        SEQ180.text = "\\fmtversion";
        SEQ180.TYPE = "KEYWORD1";

        SEQ181.text = "\\escapechar";
        SEQ181.TYPE = "KEYWORD4";

        SEQ182.text = "\\errmessage";
        SEQ182.TYPE = "KEYWORD1";

        SEQ183.text = "\\dospecials";
        SEQ183.TYPE = "KEYWORD1";

        SEQ184.text = "\\deadcycles";
        SEQ184.TYPE = "KEYWORD1";

        SEQ185.text = "\\centerline";
        SEQ185.TYPE = "KEYWORD1";

        SEQ186.text = "\\begingroup";
        SEQ186.TYPE = "KEYWORD1";

        SEQ187.text = "\\allowbreak";
        SEQ187.TYPE = "KEYWORD1";

        SEQ188.text = "\\aftergroup";
        SEQ188.TYPE = "KEYWORD1";

        SEQ_REGEXP16.text = "\\\\[a-zA-Z@]{10}";
        SEQ_REGEXP16.HASH_CHARS = "\\";
        SEQ_REGEXP16.TYPE = "LABEL";

        SEQ189.text = "\\widetilde";
        SEQ189.TYPE = "KEYWORD1";

        SEQ190.text = "\\vfootnote";
        SEQ190.TYPE = "KEYWORD1";

        SEQ191.text = "\\uppercase";
        SEQ191.TYPE = "KEYWORD1";

        SEQ192.text = "\\unpenalty";
        SEQ192.TYPE = "KEYWORD1";

        SEQ193.text = "\\underline";
        SEQ193.TYPE = "KEYWORD1";

        SEQ194.text = "\\undefined";
        SEQ194.TYPE = "KEYWORD1";

        SEQ195.text = "\\topinsert";
        SEQ195.TYPE = "KEYWORD1";

        SEQ196.text = "\\tolerance";
        SEQ196.TYPE = "KEYWORD4";

        SEQ197.text = "\\thinspace";
        SEQ197.TYPE = "KEYWORD1";

        SEQ198.text = "\\textstyle";
        SEQ198.TYPE = "KEYWORD1";

        SEQ199.text = "\\spadesuit";
        SEQ199.TYPE = "KEYWORD1";

        SEQ200.text = "\\spaceskip";
        SEQ200.TYPE = "KEYWORD4";

        SEQ201.text = "\\smallskip";
        SEQ201.TYPE = "KEYWORD1";

        SEQ202.text = "\\showlists";
        SEQ202.TYPE = "KEYWORD1";

        SEQ203.text = "\\rightskip";
        SEQ203.TYPE = "KEYWORD4";

        SEQ204.text = "\\rightline";
        SEQ204.TYPE = "KEYWORD1";

        SEQ205.text = "\\prevdepth";
        SEQ205.TYPE = "KEYWORD1";

        SEQ206.text = "\\preloaded";
        SEQ206.TYPE = "KEYWORD1";

        SEQ207.text = "\\parindent";
        SEQ207.TYPE = "KEYWORD4";

        SEQ208.text = "\\pagetotal";
        SEQ208.TYPE = "KEYWORD1";

        SEQ209.text = "\\pagedepth";
        SEQ209.TYPE = "KEYWORD1";

        SEQ210.text = "\\overbrace";
        SEQ210.TYPE = "KEYWORD1";

        SEQ211.text = "\\obeylines";
        SEQ211.TYPE = "KEYWORD1";

        SEQ212.text = "\\nonscript";
        SEQ212.TYPE = "KEYWORD1";

        SEQ213.text = "\\newmuskip";
        SEQ213.TYPE = "FUNCTION";

        SEQ214.text = "\\newinsert";
        SEQ214.TYPE = "FUNCTION";

        SEQ215.text = "\\muskipdef";
        SEQ215.TYPE = "FUNCTION";

        SEQ216.text = "\\multispan";
        SEQ216.TYPE = "KEYWORD1";

        SEQ217.text = "\\moveright";
        SEQ217.TYPE = "KEYWORD1";

        SEQ218.text = "\\midinsert";
        SEQ218.TYPE = "KEYWORD1";

        SEQ219.text = "\\medmuskip";
        SEQ219.TYPE = "KEYWORD4";

        SEQ220.text = "\\mathstrut";
        SEQ220.TYPE = "KEYWORD1";

        SEQ221.text = "\\mathpunct";
        SEQ221.TYPE = "KEYWORD1";

        SEQ222.text = "\\mathinner";
        SEQ222.TYPE = "KEYWORD1";

        SEQ223.text = "\\mathclose";
        SEQ223.TYPE = "KEYWORD1";

        SEQ224.text = "\\lowercase";
        SEQ224.TYPE = "KEYWORD1";

        SEQ225.text = "\\looseness";
        SEQ225.TYPE = "KEYWORD4";

        SEQ226.text = "\\Leftarrow";
        SEQ226.TYPE = "KEYWORD1";

        SEQ227.text = "\\leftarrow";
        SEQ227.TYPE = "KEYWORD1";

        SEQ228.text = "\\immediate";
        SEQ228.TYPE = "KEYWORD1";

        SEQ229.text = "\\hrulefill";
        SEQ229.TYPE = "KEYWORD1";

        SEQ230.text = "\\hidewidth";
        SEQ230.TYPE = "KEYWORD1";

        SEQ231.text = "\\heartsuit";
        SEQ231.TYPE = "KEYWORD1";

        SEQ232.text = "\\hangafter";
        SEQ232.TYPE = "KEYWORD4";

        SEQ233.text = "\\goodbreak";
        SEQ233.TYPE = "KEYWORD1";

        SEQ234.text = "\\futurelet";
        SEQ234.TYPE = "COMMENT3";

        SEQ235.text = "\\footstrut";
        SEQ235.TYPE = "KEYWORD1";

        SEQ236.text = "\\fontdimen";
        SEQ236.TYPE = "KEYWORD1";

        SEQ237.text = "\\firstmark";
        SEQ237.TYPE = "KEYWORD1";

        SEQ238.text = "\\everyvbox";
        SEQ238.TYPE = "KEYWORD4";

        SEQ239.text = "\\everymath";
        SEQ239.TYPE = "KEYWORD4";

        SEQ240.text = "\\everyhbox";
        SEQ240.TYPE = "KEYWORD4";

        SEQ241.text = "\\eqalignno";
        SEQ241.TYPE = "KEYWORD1";

        SEQ242.text = "\\endinsert";
        SEQ242.TYPE = "KEYWORD1";

        SEQ243.text = "\\endcsname";
        SEQ243.TYPE = "FUNCTION";

        SEQ244.text = "\\Downarrow";
        SEQ244.TYPE = "KEYWORD1";

        SEQ245.text = "\\downarrow";
        SEQ245.TYPE = "KEYWORD1";

        SEQ246.text = "\\delimiter";
        SEQ246.TYPE = "KEYWORD1";

        SEQ247.text = "\\copyright";
        SEQ247.TYPE = "KEYWORD1";

        SEQ248.text = "\\cleartabs";
        SEQ248.TYPE = "KEYWORD1";

        SEQ249.text = "\\centering";
        SEQ249.TYPE = "KEYWORD1";

        SEQ250.text = "\\bracevert";
        SEQ250.TYPE = "KEYWORD1";

        SEQ251.text = "\\bigotimes";
        SEQ251.TYPE = "KEYWORD1";

        SEQ252.text = "\\batchmode";
        SEQ252.TYPE = "KEYWORD1";

        SEQ253.text = "\\backslash";
        SEQ253.TYPE = "KEYWORD2";

        SEQ254.text = "\\Arrowvert";
        SEQ254.TYPE = "KEYWORD1";

        SEQ255.text = "\\arrowvert";
        SEQ255.TYPE = "KEYWORD1";

        SEQ_REGEXP17.text = "\\\\muskip([0-1][0-9][0-9]|2([0-4][0-9]|5[0-5]))";
        SEQ_REGEXP17.HASH_CHARS = "\\";
        SEQ_REGEXP17.TYPE = "COMMENT4";

        SEQ_REGEXP18.text = "\\\\[a-zA-Z@]{9}";
        SEQ_REGEXP18.HASH_CHARS = "\\";
        SEQ_REGEXP18.TYPE = "LABEL";

        SEQ256.text = "\\xleaders";
        SEQ256.TYPE = "KEYWORD1";

        SEQ257.text = "\\vphantom";
        SEQ257.TYPE = "KEYWORD1";

        SEQ258.text = "\\vbadness";
        SEQ258.TYPE = "KEYWORD4";

        SEQ259.text = "\\vartheta";
        SEQ259.TYPE = "KEYWORD1";

        SEQ260.text = "\\varsigma";
        SEQ260.TYPE = "KEYWORD1";

        SEQ261.text = "\\underbar";
        SEQ261.TYPE = "KEYWORD1";

        SEQ262.text = "\\triangle";
        SEQ262.TYPE = "KEYWORD1";

        SEQ263.text = "\\textfont";
        SEQ263.TYPE = "KEYWORD1";

        SEQ264.text = "\\tabsdone";
        SEQ264.TYPE = "KEYWORD1";

        SEQ265.text = "\\tabalign";
        SEQ265.TYPE = "KEYWORD1";

        SEQ266.text = "\\supseteq";
        SEQ266.TYPE = "KEYWORD1";

        SEQ267.text = "\\subseteq";
        SEQ267.TYPE = "KEYWORD1";

        SEQ268.text = "\\strutbox";
        SEQ268.TYPE = "KEYWORD1";

        SEQ269.text = "\\smallint";
        SEQ269.TYPE = "KEYWORD1";

        SEQ270.text = "\\skewchar";
        SEQ270.TYPE = "KEYWORD1";

        SEQ271.text = "\\setminus";
        SEQ271.TYPE = "KEYWORD1";

        SEQ272.text = "\\proclaim";
        SEQ272.TYPE = "KEYWORD1";

        SEQ273.text = "\\prevgraf";
        SEQ273.TYPE = "KEYWORD1";

        SEQ274.text = "\\patterns";
        SEQ274.TYPE = "KEYWORD1";

        SEQ275.text = "\\parshape";
        SEQ275.TYPE = "KEYWORD1";

        SEQ276.text = "\\parallel";
        SEQ276.TYPE = "KEYWORD1";

        SEQ277.text = "\\pagegoal";
        SEQ277.TYPE = "KEYWORD1";

        SEQ278.text = "\\pagebody";
        SEQ278.TYPE = "KEYWORD1";

        SEQ279.text = "\\overline";
        SEQ279.TYPE = "KEYWORD1";

        SEQ280.text = "\\oldstyle";
        SEQ280.TYPE = "KEYWORD1";

        SEQ281.text = "\\nolimits";
        SEQ281.TYPE = "KEYWORD1";

        SEQ282.text = "\\noindent";
        SEQ282.TYPE = "KEYWORD1";

        SEQ283.text = "\\noexpand";
        SEQ283.TYPE = "KEYWORD1";

        SEQ284.text = "\\newwrite";
        SEQ284.TYPE = "COMMENT2";

        SEQ285.text = "\\newdimen";
        SEQ285.TYPE = "COMMENT2";

        SEQ286.text = "\\newcount";
        SEQ286.TYPE = "COMMENT2";

        SEQ287.text = "\\narrower";
        SEQ287.TYPE = "KEYWORD1";

        SEQ288.text = "\\moveleft";
        SEQ288.TYPE = "KEYWORD1";

        SEQ289.text = "\\medbreak";
        SEQ289.TYPE = "KEYWORD1";

        SEQ290.text = "\\maxdimen";
        SEQ290.TYPE = "KEYWORD1";

        SEQ291.text = "\\maxdepth";
        SEQ291.TYPE = "KEYWORD4";

        SEQ292.text = "\\mathopen";
        SEQ292.TYPE = "KEYWORD1";

        SEQ293.text = "\\mathcode";
        SEQ293.TYPE = "KEYWORD1";

        SEQ294.text = "\\mathchar";
        SEQ294.TYPE = "KEYWORD1";

        SEQ295.text = "\\lineskip";
        SEQ295.TYPE = "KEYWORD1";

        SEQ296.text = "\\leftskip";
        SEQ296.TYPE = "KEYWORD4";

        SEQ297.text = "\\leftline";
        SEQ297.TYPE = "KEYWORD4";

        SEQ298.text = "\\lastskip";
        SEQ298.TYPE = "KEYWORD1";

        SEQ299.text = "\\lastkern";
        SEQ299.TYPE = "KEYWORD1";

        SEQ300.text = "\\language";
        SEQ300.TYPE = "KEYWORD4";

        SEQ301.text = "\\itemitem";
        SEQ301.TYPE = "KEYWORD1";

        SEQ302.text = "\\hphantom";
        SEQ302.TYPE = "KEYWORD1";

        SEQ303.text = "\\hideskip";
        SEQ303.TYPE = "KEYWORD1";

        SEQ304.text = "\\headline";
        SEQ304.TYPE = "KEYWORD1";

        SEQ305.text = "\\hbadness";
        SEQ305.TYPE = "KEYWORD4";

        SEQ306.text = "\\footnote";
        SEQ306.TYPE = "KEYWORD1";

        SEQ307.text = "\\footline";
        SEQ307.TYPE = "KEYWORD1";

        SEQ308.text = "\\multiply";
        SEQ308.TYPE = "KEYWORD1";

        SEQ309.text = "\\fontname";
        SEQ309.TYPE = "KEYWORD1";

        SEQ310.text = "\\filbreak";
        SEQ310.TYPE = "KEYWORD1";

        SEQ311.text = "\\everypar";
        SEQ311.TYPE = "KEYWORD4";

        SEQ312.text = "\\everyjob";
        SEQ312.TYPE = "KEYWORD4";

        SEQ313.text = "\\endinput";
        SEQ313.TYPE = "KEYWORD1";

        SEQ314.text = "\\endgroup";
        SEQ314.TYPE = "KEYWORD1";

        SEQ315.text = "\\emptyset";
        SEQ315.TYPE = "KEYWORD1";

        SEQ316.text = "\\dimendef";
        SEQ316.TYPE = "FUNCTION";

        SEQ317.text = "\\countdef";
        SEQ317.TYPE = "FUNCTION";

        SEQ318.text = "\\clubsuit";
        SEQ318.TYPE = "KEYWORD1";

        SEQ319.text = "\\closeout";
        SEQ319.TYPE = "KEYWORD1";

        SEQ320.text = "\\cleaders";
        SEQ320.TYPE = "KEYWORD1";

        SEQ321.text = "\\buildrel";
        SEQ321.TYPE = "KEYWORD1";

        SEQ322.text = "\\bigwedge";
        SEQ322.TYPE = "KEYWORD1";

        SEQ323.text = "\\biguplus";
        SEQ323.TYPE = "KEYWORD1";

        SEQ324.text = "\\bigsqcup";
        SEQ324.TYPE = "KEYWORD1";

        SEQ325.text = "\\bigoplus";
        SEQ325.TYPE = "KEYWORD1";

        SEQ326.text = "\\bigbreak";
        SEQ326.TYPE = "KEYWORD1";

        SEQ_REGEXP19.text = "\\\\muskip[0-9][0-9]";
        SEQ_REGEXP19.HASH_CHARS = "\\";
        SEQ_REGEXP19.TYPE = "COMMENT4";

        SEQ_REGEXP20.text = "\\\\dimen([0-1][0-9][0-9]|2([0-4][0-9]|5[0-5]))";
        SEQ_REGEXP20.HASH_CHARS = "\\";
        SEQ_REGEXP20.TYPE = "COMMENT4";

        SEQ_REGEXP21.text = "\\\\count([0-1][0-9][0-9]|2([0-4][0-9]|5[0-5]))";
        SEQ_REGEXP21.HASH_CHARS = "\\";
        SEQ_REGEXP21.TYPE = "COMMENT4";

        SEQ_REGEXP22.text = "\\\\[a-zA-Z@]{8}";
        SEQ_REGEXP22.HASH_CHARS = "\\";
        SEQ_REGEXP22.TYPE = "LABEL";

        SEQ327.text = "\\widehat";
        SEQ327.TYPE = "KEYWORD1";

        SEQ328.text = "\\voffset";
        SEQ328.TYPE = "KEYWORD4";

        SEQ329.text = "\\vfilneg";
        SEQ329.TYPE = "KEYWORD1";

        SEQ330.text = "\\vcenter";
        SEQ330.TYPE = "KEYWORD1";

        SEQ331.text = "\\vadjust";
        SEQ331.TYPE = "KEYWORD1";

        SEQ332.text = "\\Upsilon";
        SEQ332.TYPE = "KEYWORD1";

        SEQ333.text = "\\upsilon";
        SEQ333.TYPE = "KEYWORD1";

        SEQ334.text = "\\Uparrow";
        SEQ334.TYPE = "KEYWORD1";

        SEQ335.text = "\\uparrow";
        SEQ335.TYPE = "KEYWORD1";

        SEQ336.text = "\\unvcopy";
        SEQ336.TYPE = "KEYWORD1";

        SEQ337.text = "\\unhcopy";
        SEQ337.TYPE = "KEYWORD1";

        SEQ338.text = "\\topskip";
        SEQ338.TYPE = "KEYWORD4";

        SEQ339.text = "\\topmark";
        SEQ339.TYPE = "KEYWORD1";

        SEQ340.text = "\\toksdef";
        SEQ340.TYPE = "FUNCTION";

        SEQ341.text = "\\tabsyet";
        SEQ341.TYPE = "KEYWORD1";

        SEQ342.text = "\\tabskip";
        SEQ342.TYPE = "KEYWORD4";

        SEQ343.text = "\\swarrow";
        SEQ343.TYPE = "KEYWORD1";

        SEQ344.text = "\\special";
        SEQ344.TYPE = "KEYWORD1";

        SEQ345.text = "\\skipdef";
        SEQ345.TYPE = "FUNCTION";

        SEQ346.text = "\\showthe";
        SEQ346.TYPE = "KEYWORD1";

        SEQ347.text = "\\showbox";
        SEQ347.TYPE = "KEYWORD1";

        SEQ348.text = "\\shipout";
        SEQ348.TYPE = "KEYWORD1";

        SEQ349.text = "\\sevensy";
        SEQ349.TYPE = "KEYWORD1";

        SEQ350.text = "\\sevenrm";
        SEQ350.TYPE = "KEYWORD1";

        SEQ351.text = "\\sevenbf";
        SEQ351.TYPE = "KEYWORD1";

        SEQ352.text = "\\settabs";
        SEQ352.TYPE = "KEYWORD1";

        SEQ353.text = "\\searrow";
        SEQ353.TYPE = "KEYWORD1";

        SEQ354.text = "\\rootbox";
        SEQ354.TYPE = "KEYWORD1";

        SEQ355.text = "\\radical";
        SEQ355.TYPE = "KEYWORD1";

        SEQ356.text = "\\pmatrix";
        SEQ356.TYPE = "KEYWORD1";

        SEQ357.text = "\\phantom";
        SEQ357.TYPE = "KEYWORD1";

        SEQ358.text = "\\penalty";
        SEQ358.TYPE = "KEYWORD1";

        SEQ359.text = "\\pausing";
        SEQ359.TYPE = "KEYWORD4";

        SEQ360.text = "\\partial";
        SEQ360.TYPE = "KEYWORD1";

        SEQ361.text = "\\parskip";
        SEQ361.TYPE = "KEYWORD4";

        SEQ362.text = "\\openout";
        SEQ362.TYPE = "KEYWORD1";

        SEQ363.text = "\\ooalign";
        SEQ363.TYPE = "KEYWORD1";

        SEQ364.text = "\\nwarrow";
        SEQ364.TYPE = "KEYWORD1";

        SEQ365.text = "\\nobreak";
        SEQ365.TYPE = "KEYWORD1";

        SEQ366.text = "\\noalign";
        SEQ366.TYPE = "KEYWORD1";

        SEQ367.text = "\\newtoks";
        SEQ367.TYPE = "COMMENT2";

        SEQ368.text = "\\newskip";
        SEQ368.TYPE = "COMMENT2";

        SEQ369.text = "\\newread";
        SEQ369.TYPE = "COMMENT2";

        SEQ370.text = "\\newhelp";
        SEQ370.TYPE = "COMMENT2";

        SEQ371.text = "\\nearrow";
        SEQ371.TYPE = "KEYWORD1";

        SEQ372.text = "\\natural";
        SEQ372.TYPE = "KEYWORD1";

        SEQ373.text = "\\mscount";
        SEQ373.TYPE = "KEYWORD1";

        SEQ374.text = "\\message";
        SEQ374.TYPE = "KEYWORD1";

        SEQ375.text = "\\medskip";
        SEQ375.TYPE = "KEYWORD1";

        SEQ376.text = "\\meaning";
        SEQ376.TYPE = "KEYWORD1";

        SEQ377.text = "\\mathrel";
        SEQ377.TYPE = "KEYWORD1";

        SEQ378.text = "\\mathord";
        SEQ378.TYPE = "KEYWORD1";

        SEQ379.text = "\\mathbin";
        SEQ379.TYPE = "KEYWORD1";

        SEQ380.text = "\\magstep";
        SEQ380.TYPE = "KEYWORD1";

        SEQ381.text = "\\leaders";
        SEQ381.TYPE = "KEYWORD1";

        SEQ382.text = "\\lastbox";
        SEQ382.TYPE = "KEYWORD1";

        SEQ383.text = "\\joinrel";
        SEQ383.TYPE = "KEYWORD1";

        SEQ384.text = "\\jobname";
        SEQ384.TYPE = "KEYWORD1";

        SEQ385.text = "\\iterate";
        SEQ385.TYPE = "KEYWORD1";

        SEQ386.text = "\\ifvmode";
        SEQ386.TYPE = "KEYWORD3";

        SEQ387.text = "\\ifmmode";
        SEQ387.TYPE = "KEYWORD3";

        SEQ388.text = "\\ifinner";
        SEQ388.TYPE = "KEYWORD3";

        SEQ389.text = "\\ifhmode";
        SEQ389.TYPE = "KEYWORD3";

        SEQ390.text = "\\iffalse";
        SEQ390.TYPE = "KEYWORD3";

        SEQ391.text = "\\hoffset";
        SEQ391.TYPE = "KEYWORD4";

        SEQ392.text = "\\hfilneg";
        SEQ392.TYPE = "KEYWORD1";

        SEQ393.text = "\\footins";
        SEQ393.TYPE = "KEYWORD1";

        SEQ394.text = "\\fmtname";
        SEQ394.TYPE = "KEYWORD1";

        SEQ395.text = "\\everycr";
        SEQ395.TYPE = "KEYWORD4";

        SEQ396.text = "\\errhelp";
        SEQ396.TYPE = "KEYWORD4";

        SEQ397.text = "\\eqalign";
        SEQ397.TYPE = "KEYWORD1";

        SEQ398.text = "\\epsilon";
        SEQ398.TYPE = "KEYWORD1";

        SEQ399.text = "\\enspace";
        SEQ399.TYPE = "KEYWORD1";

        SEQ400.text = "\\endline";
        SEQ400.TYPE = "KEYWORD1";

        SEQ401.text = "\\endgraf";
        SEQ401.TYPE = "KEYWORD1";

        SEQ402.text = "\\dotfill";
        SEQ402.TYPE = "KEYWORD1";

        SEQ403.text = "\\diamond";
        SEQ403.TYPE = "KEYWORD1";

        SEQ404.text = "\\delcode";
        SEQ404.TYPE = "KEYWORD1";

        SEQ405.text = "\\ddagger";
        SEQ405.TYPE = "KEYWORD1";

        SEQ406.text = "\\columns";
        SEQ406.TYPE = "KEYWORD1";

        SEQ407.text = "\\closein";
        SEQ407.TYPE = "KEYWORD1";

        SEQ408.text = "\\chardef";
        SEQ408.TYPE = "FUNCTION";

        SEQ409.text = "\\cdprime";
        SEQ409.TYPE = "KEYWORD2";

        SEQ410.text = "\\catcode";
        SEQ410.TYPE = "KEYWORD1";

        SEQ411.text = "\\braceru";
        SEQ411.TYPE = "KEYWORD1";

        SEQ412.text = "\\bracerd";
        SEQ412.TYPE = "KEYWORD1";

        SEQ413.text = "\\bracelu";
        SEQ413.TYPE = "KEYWORD1";

        SEQ414.text = "\\braceld";
        SEQ414.TYPE = "KEYWORD1";

        SEQ415.text = "\\botmark";
        SEQ415.TYPE = "KEYWORD1";

        SEQ416.text = "\\bigskip";
        SEQ416.TYPE = "KEYWORD1";

        SEQ417.text = "\\bigodot";
        SEQ417.TYPE = "KEYWORD1";

        SEQ418.text = "\\bigcirc";
        SEQ418.TYPE = "KEYWORD1";

        SEQ419.text = "\\advance";
        SEQ419.TYPE = "KEYWORD1";

        SEQ_REGEXP23.text = "\\\\muskip[0-9]";
        SEQ_REGEXP23.HASH_CHARS = "\\";
        SEQ_REGEXP23.TYPE = "COMMENT4";

        SEQ_REGEXP24.text = "\\\\dimen[0-9][0-9]";
        SEQ_REGEXP24.HASH_CHARS = "\\";
        SEQ_REGEXP24.TYPE = "COMMENT4";

        SEQ_REGEXP25.text = "\\\\count[0-9][0-9]";
        SEQ_REGEXP25.HASH_CHARS = "\\";
        SEQ_REGEXP25.TYPE = "COMMENT4";

        SEQ_REGEXP26.text = "\\\\toks([0-1][0-9][0-9]|2([0-4][0-9]|5[0-5]))";
        SEQ_REGEXP26.HASH_CHARS = "\\";
        SEQ_REGEXP26.TYPE = "COMMENT4";

        SEQ_REGEXP27.text = "\\\\skip([0-1][0-9][0-9]|2([0-4][0-9]|5[0-5]))";
        SEQ_REGEXP27.HASH_CHARS = "\\";
        SEQ_REGEXP27.TYPE = "COMMENT4";

        SEQ_REGEXP28.text = "\\\\char([0-1][0-9][0-9]|2([0-4][0-9]|5[0-5]))";
        SEQ_REGEXP28.HASH_CHARS = "\\";
        SEQ_REGEXP28.TYPE = "KEYWORD2";

        SEQ_REGEXP29.text = "\\\\char'[0-7][0-7]";
        SEQ_REGEXP29.HASH_CHARS = "\\";
        SEQ_REGEXP29.TYPE = "KEYWORD2";

        SEQ_REGEXP30.text = "\\\\char\"[0-9A-Fa-f][0-9A-Fa-f]";
        SEQ_REGEXP30.HASH_CHARS = "\\";
        SEQ_REGEXP30.TYPE = "KEYWORD2";

        SEQ_REGEXP31.text = "\\\\[a-zA-Z@]{7}";
        SEQ_REGEXP31.HASH_CHARS = "\\";
        SEQ_REGEXP31.TYPE = "LABEL";

        SEQ420.text = "\\vsplit";
        SEQ420.TYPE = "KEYWORD1";

        SEQ421.text = "\\varrho";
        SEQ421.TYPE = "KEYWORD1";

        SEQ422.text = "\\varphi";
        SEQ422.TYPE = "KEYWORD1";

        SEQ423.text = "\\valign";
        SEQ423.TYPE = "KEYWORD1";

        SEQ424.text = "\\utilde";
        SEQ424.TYPE = "KEYWORD2";

        SEQ425.text = "\\unvbox";
        SEQ425.TYPE = "KEYWORD1";

        SEQ426.text = "\\unskip";
        SEQ426.TYPE = "KEYWORD1";

        SEQ427.text = "\\unkern";
        SEQ427.TYPE = "KEYWORD1";

        SEQ428.text = "\\unhbox";
        SEQ428.TYPE = "KEYWORD1";

        SEQ429.text = "\\uchyph";
        SEQ429.TYPE = "KEYWORD4";

        SEQ430.text = "\\uccode";
        SEQ430.TYPE = "KEYWORD1";

        SEQ431.text = "\\topins";
        SEQ431.TYPE = "KEYWORD1";

        SEQ432.text = "\\supset";
        SEQ432.TYPE = "KEYWORD1";

        SEQ433.text = "\\succeq";
        SEQ433.TYPE = "KEYWORD1";

        SEQ434.text = "\\subset";
        SEQ434.TYPE = "KEYWORD1";

        SEQ435.text = "\\string";
        SEQ435.TYPE = "KEYWORD1";

        SEQ436.text = "\\sfcode";
        SEQ436.TYPE = "KEYWORD1";

        SEQ437.text = "\\seveni";
        SEQ437.TYPE = "KEYWORD1";

        SEQ438.text = "\\setbox";
        SEQ438.TYPE = "KEYWORD1";

        SEQ439.text = "\\rgroup";
        SEQ439.TYPE = "KEYWORD1";

        SEQ440.text = "\\rfloor";
        SEQ440.TYPE = "KEYWORD1";

        SEQ441.text = "\\repeat";
        SEQ441.TYPE = "KEYWORD1";

        SEQ442.text = "\\Relbar";
        SEQ442.TYPE = "KEYWORD1";

        SEQ443.text = "\\relbar";
        SEQ443.TYPE = "KEYWORD1";

        SEQ444.text = "\\rbrack";
        SEQ444.TYPE = "KEYWORD1";

        SEQ445.text = "\\rbrace";
        SEQ445.TYPE = "KEYWORD1";

        SEQ446.text = "\\rangle";
        SEQ446.TYPE = "KEYWORD1";

        SEQ447.text = "\\propto";
        SEQ447.TYPE = "KEYWORD1";

        SEQ448.text = "\\preceq";
        SEQ448.TYPE = "KEYWORD1";

        SEQ449.text = "\\pageno";
        SEQ449.TYPE = "KEYWORD1";

        SEQ450.text = "\\output";
        SEQ450.TYPE = "KEYWORD4";

        SEQ451.text = "\\otimes";
        SEQ451.TYPE = "KEYWORD1";

        SEQ452.text = "\\oslash";
        SEQ452.TYPE = "KEYWORD1";

        SEQ453.text = "\\openup";
        SEQ453.TYPE = "KEYWORD1";

        SEQ454.text = "\\openin";
        SEQ454.TYPE = "KEYWORD1";

        SEQ455.text = "\\ominus";
        SEQ455.TYPE = "KEYWORD1";

        SEQ456.text = "\\ointop";
        SEQ456.TYPE = "KEYWORD1";

        SEQ457.text = "\\oalign";
        SEQ457.TYPE = "KEYWORD1";

        SEQ458.text = "\\number";
        SEQ458.TYPE = "KEYWORD1";

        SEQ459.text = "\\newfam";
        SEQ459.TYPE = "COMMENT2";

        SEQ460.text = "\\newbox";
        SEQ460.TYPE = "COMMENT2";

        SEQ461.text = "\\muskip";
        SEQ461.TYPE = "COMMENT4";

        SEQ462.text = "\\models";
        SEQ462.TYPE = "KEYWORD1";

        SEQ463.text = "\\matrix";
        SEQ463.TYPE = "KEYWORD1";

        SEQ464.text = "\\mathop";
        SEQ464.TYPE = "KEYWORD1";

        SEQ465.text = "\\mapsto";
        SEQ465.TYPE = "KEYWORD1";

        SEQ466.text = "\\limsup";
        SEQ466.TYPE = "KEYWORD1";

        SEQ467.text = "\\limits";
        SEQ467.TYPE = "KEYWORD1";

        SEQ468.text = "\\liminf";
        SEQ468.TYPE = "KEYWORD1";

        SEQ469.text = "\\lgroup";
        SEQ469.TYPE = "KEYWORD1";

        SEQ470.text = "\\lfhook";
        SEQ470.TYPE = "KEYWORD2";

        SEQ471.text = "\\lfloor";
        SEQ471.TYPE = "KEYWORD1";

        SEQ472.text = "\\lccode";
        SEQ472.TYPE = "KEYWORD1";

        SEQ473.text = "\\lbrack";
        SEQ473.TYPE = "KEYWORD1";

        SEQ474.text = "\\lbrace";
        SEQ474.TYPE = "KEYWORD1";

        SEQ475.text = "\\langle";
        SEQ475.TYPE = "KEYWORD1";

        SEQ476.text = "\\Lambda";
        SEQ476.TYPE = "KEYWORD1";

        SEQ477.text = "\\lambda";
        SEQ477.TYPE = "KEYWORD1";

        SEQ478.text = "\\insert";
        SEQ478.TYPE = "KEYWORD1";

        SEQ479.text = "\\indent";
        SEQ479.TYPE = "KEYWORD1";

        SEQ480.text = "\\ifvoid";
        SEQ480.TYPE = "KEYWORD3";

        SEQ481.text = "\\ifvbox";
        SEQ481.TYPE = "KEYWORD3";

        SEQ482.text = "\\iftrue";
        SEQ482.TYPE = "KEYWORD3";

        SEQ483.text = "\\ifhbox";
        SEQ483.TYPE = "KEYWORD3";

        SEQ484.text = "\\ifcase";
        SEQ484.TYPE = "KEYWORD3";

        SEQ485.text = "\\ialign";
        SEQ485.TYPE = "KEYWORD1";

        SEQ486.text = "\\halign";
        SEQ486.TYPE = "KEYWORD1";

        SEQ487.text = "\\global";
        SEQ487.TYPE = "FUNCTION";

        SEQ488.text = "\\forall";
        SEQ488.TYPE = "KEYWORD1";

        SEQ489.text = "\\fivesy";
        SEQ489.TYPE = "KEYWORD1";

        SEQ490.text = "\\fiverm";
        SEQ490.TYPE = "KEYWORD1";

        SEQ491.text = "\\fivebf";
        SEQ491.TYPE = "KEYWORD1";

        SEQ492.text = "\\exists";
        SEQ492.TYPE = "KEYWORD1";

        SEQ493.text = "\\enskip";
        SEQ493.TYPE = "KEYWORD1";

        SEQ494.text = "\\egroup";
        SEQ494.TYPE = "KEYWORD1";

        SEQ495.text = "\\divide";
        SEQ495.TYPE = "KEYWORD1";

        SEQ496.text = "\\dagger";
        SEQ496.TYPE = "KEYWORD1";

        SEQ497.text = "\\csname";
        SEQ497.TYPE = "FUNCTION";

        SEQ498.text = "\\cprime";
        SEQ498.TYPE = "KEYWORD2";

        SEQ499.text = "\\coprod";
        SEQ499.TYPE = "KEYWORD1";

        SEQ500.text = "\\choose";
        SEQ500.TYPE = "KEYWORD1";

        SEQ501.text = "\\cfudot";
        SEQ501.TYPE = "KEYWORD2";

        SEQ502.text = "\\candra";
        SEQ502.TYPE = "KEYWORD2";

        SEQ503.text = "\\bullet";
        SEQ503.TYPE = "KEYWORD1";

        SEQ504.text = "\\bowtie";
        SEQ504.TYPE = "KEYWORD1";

        SEQ505.text = "\\bigvee";
        SEQ505.TYPE = "KEYWORD1";

        SEQ506.text = "\\bigcup";
        SEQ506.TYPE = "KEYWORD1";

        SEQ507.text = "\\bigcap";
        SEQ507.TYPE = "KEYWORD1";

        SEQ508.text = "\\bgroup";
        SEQ508.TYPE = "KEYWORD1";

        SEQ509.text = "\\arctan";
        SEQ509.TYPE = "KEYWORD1";

        SEQ510.text = "\\arcsin";
        SEQ510.TYPE = "KEYWORD1";

        SEQ511.text = "\\arccos";
        SEQ511.TYPE = "KEYWORD1";

        SEQ512.text = "\\approx";
        SEQ512.TYPE = "KEYWORD1";

        SEQ513.text = "\\acudot";
        SEQ513.TYPE = "KEYWORD2";

        SEQ514.text = "\\active";
        SEQ514.TYPE = "KEYWORD1";

        SEQ515.text = "\\accent";
        SEQ515.TYPE = "KEYWORD1";

        SEQ_REGEXP32.text = "\\\\dimen[0-9]";
        SEQ_REGEXP32.HASH_CHARS = "\\";
        SEQ_REGEXP32.TYPE = "COMMENT4";

        SEQ_REGEXP33.text = "\\\\count[0-9]";
        SEQ_REGEXP33.HASH_CHARS = "\\";
        SEQ_REGEXP33.TYPE = "COMMENT4";

        SEQ_REGEXP34.text = "\\\\toks[0-9][0-9]";
        SEQ_REGEXP34.HASH_CHARS = "\\";
        SEQ_REGEXP34.TYPE = "COMMENT4";

        SEQ_REGEXP35.text = "\\\\skip[0-9][0-9]";
        SEQ_REGEXP35.HASH_CHARS = "\\";
        SEQ_REGEXP35.TYPE = "COMMENT4";

        SEQ_REGEXP36.text = "\\\\box([0-1][0-9][0-9]|2([0-4][0-9]|5[0-5]))";
        SEQ_REGEXP36.HASH_CHARS = "\\";
        SEQ_REGEXP36.TYPE = "COMMENT4";

        SEQ_REGEXP37.text = "\\\\char[0-9][0-9]";
        SEQ_REGEXP37.HASH_CHARS = "\\";
        SEQ_REGEXP37.TYPE = "KEYWORD2";

        SEQ_REGEXP38.text = "\\\\char'[0-7]";
        SEQ_REGEXP38.HASH_CHARS = "\\";
        SEQ_REGEXP38.TYPE = "KEYWORD2";

        SEQ_REGEXP39.text = "\\\\char\"[0-9A-Fa-f]";
        SEQ_REGEXP39.HASH_CHARS = "\\";
        SEQ_REGEXP39.TYPE = "KEYWORD2";

        SEQ_REGEXP40.text = "\\\\[a-zA-Z@]{6}";
        SEQ_REGEXP40.HASH_CHARS = "\\";
        SEQ_REGEXP40.TYPE = "LABEL";

        SEQ516.text = "\\write";
        SEQ516.TYPE = "KEYWORD1";

        SEQ517.text = "\\wedge";
        SEQ517.TYPE = "KEYWORD1";

        SEQ518.text = "\\vskip";
        SEQ518.TYPE = "KEYWORD1";

        SEQ519.text = "\\vsize";
        SEQ519.TYPE = "KEYWORD4";

        SEQ520.text = "\\vrule";
        SEQ520.TYPE = "KEYWORD1";

        SEQ521.text = "\\vglue";
        SEQ521.TYPE = "KEYWORD1";

        SEQ522.text = "\\vfuzz";
        SEQ522.TYPE = "KEYWORD4";

        SEQ523.text = "\\vfill";
        SEQ523.TYPE = "KEYWORD1";

        SEQ524.text = "\\vdots";
        SEQ524.TYPE = "KEYWORD1";

        SEQ525.text = "\\vdash";
        SEQ525.TYPE = "KEYWORD1";

        SEQ526.text = "\\varpi";
        SEQ526.TYPE = "KEYWORD1";

        SEQ527.text = "\\uplus";
        SEQ527.TYPE = "KEYWORD1";

        SEQ528.text = "\\ttfam";
        SEQ528.TYPE = "KEYWORD1";

        SEQ529.text = "\\times";
        SEQ529.TYPE = "KEYWORD1";

        SEQ530.text = "\\tilde";
        SEQ530.TYPE = "KEYWORD1";

        SEQ531.text = "\\Theta";
        SEQ531.TYPE = "KEYWORD1";

        SEQ532.text = "\\theta";
        SEQ532.TYPE = "KEYWORD1";

        SEQ533.text = "\\tentt";
        SEQ533.TYPE = "KEYWORD1";

        SEQ534.text = "\\tensy";
        SEQ534.TYPE = "KEYWORD1";

        SEQ535.text = "\\tensl";
        SEQ535.TYPE = "KEYWORD1";

        SEQ536.text = "\\tenrm";
        SEQ536.TYPE = "KEYWORD1";

        SEQ537.text = "\\tenit";
        SEQ537.TYPE = "KEYWORD1";

        SEQ538.text = "\\tenex";
        SEQ538.TYPE = "KEYWORD1";

        SEQ539.text = "\\tenbf";
        SEQ539.TYPE = "KEYWORD1";

        SEQ540.text = "\\strut";
        SEQ540.TYPE = "KEYWORD1";

        SEQ541.text = "\\sqcup";
        SEQ541.TYPE = "KEYWORD1";

        SEQ542.text = "\\sqcap";
        SEQ542.TYPE = "KEYWORD1";

        SEQ543.text = "\\space";
        SEQ543.TYPE = "KEYWORD1";

        SEQ544.text = "\\smile";
        SEQ544.TYPE = "KEYWORD1";

        SEQ545.text = "\\smash";
        SEQ545.TYPE = "KEYWORD1";

        SEQ546.text = "\\slfam";
        SEQ546.TYPE = "KEYWORD1";

        SEQ547.text = "\\slash";
        SEQ547.TYPE = "KEYWORD1";

        SEQ548.text = "\\simeq";
        SEQ548.TYPE = "KEYWORD1";

        SEQ549.text = "\\Sigma";
        SEQ549.TYPE = "KEYWORD1";

        SEQ550.text = "\\sigma";
        SEQ550.TYPE = "KEYWORD1";

        SEQ551.text = "\\sharp";
        SEQ551.TYPE = "KEYWORD1";

        SEQ552.text = "\\right";
        SEQ552.TYPE = "KEYWORD1";

        SEQ553.text = "\\rhook";
        SEQ553.TYPE = "KEYWORD1";

        SEQ554.text = "\\relax";
        SEQ554.TYPE = "KEYWORD1";

        SEQ555.text = "\\rceil";
        SEQ555.TYPE = "KEYWORD1";

        SEQ556.text = "\\raise";
        SEQ556.TYPE = "KEYWORD1";

        SEQ557.text = "\\qquad";
        SEQ557.TYPE = "KEYWORD1";

        SEQ558.text = "\\prime";
        SEQ558.TYPE = "KEYWORD1";

        SEQ559.text = "\\outer";
        SEQ559.TYPE = "FUNCTION";

        SEQ560.text = "\\oplus";
        SEQ560.TYPE = "KEYWORD1";

        SEQ561.text = "\\Omega";
        SEQ561.TYPE = "KEYWORD1";

        SEQ562.text = "\\omega";
        SEQ562.TYPE = "KEYWORD1";

        SEQ563.text = "\\notin";
        SEQ563.TYPE = "KEYWORD1";

        SEQ564.text = "\\newif";
        SEQ564.TYPE = "COMMENT2";

        SEQ565.text = "\\nabla";
        SEQ565.TYPE = "KEYWORD1";

        SEQ566.text = "\\mskip";
        SEQ566.TYPE = "KEYWORD1";

        SEQ567.text = "\\month";
        SEQ567.TYPE = "KEYWORD4";

        SEQ568.text = "\\mkern";
        SEQ568.TYPE = "KEYWORD1";

        SEQ569.text = "\\lower";
        SEQ569.TYPE = "KEYWORD1";

        SEQ570.text = "\\lhook";
        SEQ570.TYPE = "KEYWORD1";

        SEQ571.text = "\\leqno";
        SEQ571.TYPE = "KEYWORD1";

        SEQ572.text = "\\ldots";
        SEQ572.TYPE = "KEYWORD1";

        SEQ573.text = "\\ldotp";
        SEQ573.TYPE = "KEYWORD1";

        SEQ574.text = "\\lceil";
        SEQ574.TYPE = "KEYWORD1";

        SEQ575.text = "\\kappa";
        SEQ575.TYPE = "KEYWORD1";

        SEQ576.text = "\\jmath";
        SEQ576.TYPE = "KEYWORD1";

        SEQ577.text = "\\itfam";
        SEQ577.TYPE = "KEYWORD1";

        SEQ578.text = "\\intop";
        SEQ578.TYPE = "KEYWORD1";

        SEQ579.text = "\\input";
        SEQ579.TYPE = "KEYWORD1";

        SEQ580.text = "\\infty";
        SEQ580.TYPE = "KEYWORD1";

        SEQ581.text = "\\imath";
        SEQ581.TYPE = "KEYWORD1";

        SEQ582.text = "\\ifodd";
        SEQ582.TYPE = "KEYWORD3";

        SEQ583.text = "\\ifnum";
        SEQ583.TYPE = "KEYWORD3";

        SEQ584.text = "\\ifeof";
        SEQ584.TYPE = "KEYWORD3";

        SEQ585.text = "\\ifdim";
        SEQ585.TYPE = "KEYWORD3";

        SEQ586.text = "\\ifcat";
        SEQ586.TYPE = "KEYWORD3";

        SEQ587.text = "\\hskip";
        SEQ587.TYPE = "KEYWORD1";

        SEQ588.text = "\\hsize";
        SEQ588.TYPE = "KEYWORD4";

        SEQ589.text = "\\hrule";
        SEQ589.TYPE = "KEYWORD1";

        SEQ590.text = "\\hglue";
        SEQ590.TYPE = "KEYWORD1";

        SEQ591.text = "\\hfuzz";
        SEQ591.TYPE = "KEYWORD4";

        SEQ592.text = "\\hfill";
        SEQ592.TYPE = "KEYWORD1";

        SEQ593.text = "\\grave";
        SEQ593.TYPE = "KEYWORD1";

        SEQ594.text = "\\Gamma";
        SEQ594.TYPE = "KEYWORD1";

        SEQ595.text = "\\gamma";
        SEQ595.TYPE = "KEYWORD1";

        SEQ596.text = "\\frown";
        SEQ596.TYPE = "KEYWORD1";

        SEQ597.text = "\\folio";
        SEQ597.TYPE = "KEYWORD1";

        SEQ598.text = "\\fivei";
        SEQ598.TYPE = "KEYWORD1";

        SEQ599.text = "\\equiv";
        SEQ599.TYPE = "KEYWORD1";

        SEQ600.text = "\\empty";
        SEQ600.TYPE = "KEYWORD1";

        SEQ601.text = "\\eject";
        SEQ601.TYPE = "KEYWORD1";

        SEQ602.text = "\\doteq";
        SEQ602.TYPE = "KEYWORD1";

        SEQ603.text = "\\dimen";
        SEQ603.TYPE = "COMMENT4";

        SEQ604.text = "\\Delta";
        SEQ604.TYPE = "KEYWORD1";

        SEQ605.text = "\\delta";
        SEQ605.TYPE = "KEYWORD1";

        SEQ606.text = "\\ddots";
        SEQ606.TYPE = "KEYWORD1";

        SEQ607.text = "\\dashv";
        SEQ607.TYPE = "KEYWORD1";

        SEQ608.text = "\\count";
        SEQ608.TYPE = "COMMENT4";

        SEQ609.text = "\\colon";
        SEQ609.TYPE = "KEYWORD1";

        SEQ610.text = "\\check";
        SEQ610.TYPE = "KEYWORD1";

        SEQ611.text = "\\cdots";
        SEQ611.TYPE = "KEYWORD1";

        SEQ612.text = "\\cdotp";
        SEQ612.TYPE = "KEYWORD1";

        SEQ613.text = "\\cases";
        SEQ613.TYPE = "KEYWORD1";

        SEQ614.text = "\\breve";
        SEQ614.TYPE = "KEYWORD1";

        SEQ615.text = "\\break";
        SEQ615.TYPE = "KEYWORD1";

        SEQ616.text = "\\brack";
        SEQ616.TYPE = "KEYWORD1";

        SEQ617.text = "\\brace";
        SEQ617.TYPE = "KEYWORD1";

        SEQ618.text = "\\Biggr";
        SEQ618.TYPE = "KEYWORD1";

        SEQ619.text = "\\biggr";
        SEQ619.TYPE = "KEYWORD1";

        SEQ620.text = "\\Biggm";
        SEQ620.TYPE = "KEYWORD1";

        SEQ621.text = "\\biggm";
        SEQ621.TYPE = "KEYWORD1";

        SEQ622.text = "\\Biggl";
        SEQ622.TYPE = "KEYWORD1";

        SEQ623.text = "\\biggl";
        SEQ623.TYPE = "KEYWORD1";

        SEQ624.text = "\\bffam";
        SEQ624.TYPE = "KEYWORD1";

        SEQ625.text = "\\asymp";
        SEQ625.TYPE = "KEYWORD1";

        SEQ626.text = "\\angle";
        SEQ626.TYPE = "KEYWORD1";

        SEQ627.text = "\\amalg";
        SEQ627.TYPE = "KEYWORD1";

        SEQ628.text = "\\alpha";
        SEQ628.TYPE = "KEYWORD1";

        SEQ629.text = "\\aleph";
        SEQ629.TYPE = "KEYWORD1";

        SEQ630.text = "\\acute";
        SEQ630.TYPE = "KEYWORD1";

        SEQ631.text = "\\above";
        SEQ631.TYPE = "KEYWORD1";

        SEQ_REGEXP41.text = "\\\\toks[0-9]";
        SEQ_REGEXP41.HASH_CHARS = "\\";
        SEQ_REGEXP41.TYPE = "COMMENT4";

        SEQ_REGEXP42.text = "\\\\skip[0-9]";
        SEQ_REGEXP42.HASH_CHARS = "\\";
        SEQ_REGEXP42.TYPE = "COMMENT4";

        SEQ_REGEXP43.text = "\\\\box[0-9][0-9]";
        SEQ_REGEXP43.HASH_CHARS = "\\";
        SEQ_REGEXP43.TYPE = "COMMENT4";

        SEQ_REGEXP44.text = "\\\\char[0-9]";
        SEQ_REGEXP44.HASH_CHARS = "\\";
        SEQ_REGEXP44.TYPE = "KEYWORD2";

        SEQ632.text = "\\char'";
        SEQ632.TYPE = "KEYWORD2";

        SEQ633.text = "\\char\"";
        SEQ633.TYPE = "KEYWORD2";

        SEQ_REGEXP45.text = "\\\\[a-zA-Z@]{5}";
        SEQ_REGEXP45.HASH_CHARS = "\\";
        SEQ_REGEXP45.TYPE = "LABEL";

        SEQ634.text = "\\zeta";
        SEQ634.TYPE = "KEYWORD1";

        SEQ635.text = "\\year";
        SEQ635.TYPE = "KEYWORD4";

        SEQ636.text = "\\xdef";
        SEQ636.TYPE = "FUNCTION";

        SEQ637.text = "\\wlog";
        SEQ637.TYPE = "KEYWORD1";

        SEQ638.text = "\\vtop";
        SEQ638.TYPE = "KEYWORD1";

        SEQ639.text = "\\vfil";
        SEQ639.TYPE = "KEYWORD1";

        SEQ640.text = "\\vert";
        SEQ640.TYPE = "KEYWORD1";

        SEQ641.text = "\\Vert";
        SEQ641.TYPE = "KEYWORD1";

        SEQ642.text = "\\vbox";
        SEQ642.TYPE = "KEYWORD1";

        SEQ643.text = "\\uarc";
        SEQ643.TYPE = "KEYWORD2";

        SEQ644.text = "\\toks";
        SEQ644.TYPE = "KEYWORD4";

        SEQ645.text = "\\time";
        SEQ645.TYPE = "KEYWORD4";

        SEQ646.text = "\\teni";
        SEQ646.TYPE = "KEYWORD1";

        SEQ647.text = "\\tanh";
        SEQ647.TYPE = "KEYWORD1";

        SEQ648.text = "\\tabs";
        SEQ648.TYPE = "KEYWORD1";

        SEQ649.text = "\\surd";
        SEQ649.TYPE = "KEYWORD1";

        SEQ650.text = "\\succ";
        SEQ650.TYPE = "KEYWORD1";

        SEQ651.text = "\\star";
        SEQ651.TYPE = "KEYWORD1";

        SEQ652.text = "\\sqrt";
        SEQ652.TYPE = "KEYWORD1";

        SEQ653.text = "\\span";
        SEQ653.TYPE = "KEYWORD1";

        SEQ654.text = "\\skip";
        SEQ654.TYPE = "KEYWORD4";

        SEQ655.text = "\\skew";
        SEQ655.TYPE = "KEYWORD1";

        SEQ656.text = "\\sinh";
        SEQ656.TYPE = "KEYWORD1";

        SEQ657.text = "\\show";
        SEQ657.TYPE = "KEYWORD1";

        SEQ658.text = "\\root";
        SEQ658.TYPE = "KEYWORD1";

        SEQ659.text = "\\rlap";
        SEQ659.TYPE = "KEYWORD1";

        SEQ660.text = "\\read";
        SEQ660.TYPE = "KEYWORD1";

        SEQ661.text = "\\quad";
        SEQ661.TYPE = "KEYWORD1";

        SEQ662.text = "\\prod";
        SEQ662.TYPE = "KEYWORD1";

        SEQ663.text = "\\prec";
        SEQ663.TYPE = "KEYWORD1";

        SEQ664.text = "\\pmod";
        SEQ664.TYPE = "KEYWORD1";

        SEQ665.text = "\\perp";
        SEQ665.TYPE = "KEYWORD1";

        SEQ666.text = "\\owns";
        SEQ666.TYPE = "KEYWORD1";

        SEQ667.text = "\\over";
        SEQ667.TYPE = "KEYWORD1";

        SEQ668.text = "\\omit";
        SEQ668.TYPE = "KEYWORD1";

        SEQ669.text = "\\oint";
        SEQ669.TYPE = "KEYWORD1";

        SEQ670.text = "\\odot";
        SEQ670.TYPE = "KEYWORD1";

        SEQ671.text = "\\null";
        SEQ671.TYPE = "KEYWORD1";

        SEQ672.text = "\\next";
        SEQ672.TYPE = "KEYWORD1";

        SEQ673.text = "\\mark";
        SEQ673.TYPE = "KEYWORD1";

        SEQ674.text = "\\loop";
        SEQ674.TYPE = "KEYWORD1";

        SEQ675.text = "\\long";
        SEQ675.TYPE = "FUNCTION";

        SEQ676.text = "\\lnot";
        SEQ676.TYPE = "KEYWORD1";

        SEQ677.text = "\\llap";
        SEQ677.TYPE = "KEYWORD1";

        SEQ678.text = "\\line";
        SEQ678.TYPE = "KEYWORD1";

        SEQ679.text = "\\left";
        SEQ679.TYPE = "KEYWORD1";

        SEQ680.text = "\\land";
        SEQ680.TYPE = "KEYWORD1";

        SEQ681.text = "\\kern";
        SEQ681.TYPE = "KEYWORD1";

        SEQ682.text = "\\item";
        SEQ682.TYPE = "KEYWORD1";

        SEQ683.text = "\\iota";
        SEQ683.TYPE = "KEYWORD1";

        SEQ684.text = "\\hfil";
        SEQ684.TYPE = "KEYWORD1";

        SEQ685.text = "\\hbox";
        SEQ685.TYPE = "KEYWORD1";

        SEQ686.text = "\\hbar";
        SEQ686.TYPE = "KEYWORD1";

        SEQ687.text = "\\hang";
        SEQ687.TYPE = "KEYWORD1";

        SEQ688.text = "\\gets";
        SEQ688.TYPE = "KEYWORD1";

        SEQ689.text = "\\gdef";
        SEQ689.TYPE = "FUNCTION";

        SEQ690.text = "\\font";
        SEQ690.TYPE = "KEYWORD1";

        SEQ691.text = "\\flat";
        SEQ691.TYPE = "KEYWORD1";

        SEQ692.text = "\\eqno";
        SEQ692.TYPE = "KEYWORD1";

        SEQ693.text = "\\else";
        SEQ693.TYPE = "KEYWORD3";

        SEQ694.text = "\\edef";
        SEQ694.TYPE = "FUNCTION";

        SEQ695.text = "\\dump";
        SEQ695.TYPE = "KEYWORD1";

        SEQ696.text = "\\dots";
        SEQ696.TYPE = "KEYWORD1";

        SEQ697.text = "\\ddot";
        SEQ697.TYPE = "KEYWORD1";

        SEQ698.text = "\\ddag";
        SEQ698.TYPE = "KEYWORD1";

        SEQ699.text = "\\dbar";
        SEQ699.TYPE = "KEYWORD2";

        SEQ700.text = "\\Dbar";
        SEQ700.TYPE = "KEYWORD2";

        SEQ701.text = "\\crcr";
        SEQ701.TYPE = "KEYWORD1";

        SEQ702.text = "\\coth";
        SEQ702.TYPE = "KEYWORD1";

        SEQ703.text = "\\cosh";
        SEQ703.TYPE = "KEYWORD1";

        SEQ704.text = "\\copy";
        SEQ704.TYPE = "KEYWORD1";

        SEQ705.text = "\\cong";
        SEQ705.TYPE = "KEYWORD1";

        SEQ706.text = "\\circ";
        SEQ706.TYPE = "KEYWORD1";

        SEQ707.text = "\\char";
        SEQ707.TYPE = "KEYWORD2";

        SEQ708.text = "\\cfac";
        SEQ708.TYPE = "KEYWORD2";

        SEQ709.text = "\\cdot";
        SEQ709.TYPE = "KEYWORD1";

        SEQ710.text = "\\body";
        SEQ710.TYPE = "KEYWORD1";

        SEQ711.text = "\\bmod";
        SEQ711.TYPE = "KEYWORD1";

        SEQ712.text = "\\Bigr";
        SEQ712.TYPE = "KEYWORD1";

        SEQ713.text = "\\bigr";
        SEQ713.TYPE = "KEYWORD1";

        SEQ714.text = "\\Bigm";
        SEQ714.TYPE = "KEYWORD1";

        SEQ715.text = "\\bigm";
        SEQ715.TYPE = "KEYWORD1";

        SEQ716.text = "\\Bigl";
        SEQ716.TYPE = "KEYWORD1";

        SEQ717.text = "\\bigl";
        SEQ717.TYPE = "KEYWORD1";

        SEQ718.text = "\\Bigg";
        SEQ718.TYPE = "KEYWORD1";

        SEQ719.text = "\\bigg";
        SEQ719.TYPE = "KEYWORD1";

        SEQ720.text = "\\beta";
        SEQ720.TYPE = "KEYWORD1";

        SEQ721.text = "\\atop";
        SEQ721.TYPE = "KEYWORD1";

        SEQ_REGEXP46.text = "\\\\box[0-9]";
        SEQ_REGEXP46.HASH_CHARS = "\\";
        SEQ_REGEXP46.TYPE = "COMMENT4";

        SEQ722.text = "\\char";
        SEQ722.TYPE = "KEYWORD2";

        SEQ_REGEXP47.text = "(\\u005E|\\x5E)(\\u005E|\\x5E)([0-9a-f])([0-9a-f])";
        SEQ_REGEXP47.HASH_CHARS = "^";
        SEQ_REGEXP47.TYPE = "KEYWORD2";

        SEQ_REGEXP48.text = "\\\\[a-zA-Z@]{4}";
        SEQ_REGEXP48.HASH_CHARS = "\\";
        SEQ_REGEXP48.TYPE = "LABEL";

        SEQ723.text = "\\vss";
        SEQ723.TYPE = "KEYWORD1";

        SEQ724.text = "\\vee";
        SEQ724.TYPE = "KEYWORD1";

        SEQ725.text = "\\vec";
        SEQ725.TYPE = "KEYWORD1";

        SEQ726.text = "\\top";
        SEQ726.TYPE = "KEYWORD1";

        SEQ727.text = "\\the";
        SEQ727.TYPE = "KEYWORD1";

        SEQ728.text = "\\TeX";
        SEQ728.TYPE = "KEYWORD1";

        SEQ729.text = "\\tau";
        SEQ729.TYPE = "KEYWORD1";

        SEQ730.text = "\\tan";
        SEQ730.TYPE = "KEYWORD1";

        SEQ731.text = "\\sup";
        SEQ731.TYPE = "KEYWORD1";

        SEQ732.text = "\\sum";
        SEQ732.TYPE = "KEYWORD1";

        SEQ733.text = "\\sin";
        SEQ733.TYPE = "KEYWORD1";

        SEQ734.text = "\\sim";
        SEQ734.TYPE = "KEYWORD1";

        SEQ735.text = "\\sec";
        SEQ735.TYPE = "KEYWORD1";

        SEQ736.text = "\\rho";
        SEQ736.TYPE = "KEYWORD1";

        SEQ737.text = "\\Psi";
        SEQ737.TYPE = "KEYWORD1";

        SEQ738.text = "\\psi";
        SEQ738.TYPE = "KEYWORD1";

        SEQ739.text = "\\Phi";
        SEQ739.TYPE = "KEYWORD1";

        SEQ740.text = "\\phi";
        SEQ740.TYPE = "KEYWORD1";

        SEQ741.text = "\\par";
        SEQ741.TYPE = "LITERAL3";

        SEQ742.text = "\\not";
        SEQ742.TYPE = "KEYWORD1";

        SEQ743.text = "\\neq";
        SEQ743.TYPE = "KEYWORD1";

        SEQ744.text = "\\neg";
        SEQ744.TYPE = "KEYWORD1";

        SEQ745.text = "\\mit";
        SEQ745.TYPE = "KEYWORD1";

        SEQ746.text = "\\min";
        SEQ746.TYPE = "KEYWORD1";

        SEQ747.text = "\\mid";
        SEQ747.TYPE = "KEYWORD1";

        SEQ748.text = "\\max";
        SEQ748.TYPE = "KEYWORD1";

        SEQ749.text = "\\mag";
        SEQ749.TYPE = "KEYWORD4";

        SEQ750.text = "\\lor";
        SEQ750.TYPE = "KEYWORD1";

        SEQ751.text = "\\log";
        SEQ751.TYPE = "KEYWORD1";

        SEQ752.text = "\\lim";
        SEQ752.TYPE = "KEYWORD1";

        SEQ753.text = "\\let";
        SEQ753.TYPE = "COMMENT3";

        SEQ754.text = "\\leq";
        SEQ754.TYPE = "KEYWORD1";

        SEQ755.text = "\\ker";
        SEQ755.TYPE = "KEYWORD1";

        SEQ756.text = "\\jot";
        SEQ756.TYPE = "KEYWORD1";

        SEQ757.text = "\\int";
        SEQ757.TYPE = "KEYWORD1";

        SEQ758.text = "\\inf";
        SEQ758.TYPE = "KEYWORD1";

        SEQ759.text = "\\ifx";
        SEQ759.TYPE = "KEYWORD3";

        SEQ760.text = "\\iff";
        SEQ760.TYPE = "KEYWORD3";

        SEQ761.text = "\\hss";
        SEQ761.TYPE = "KEYWORD1";

        SEQ762.text = "\\hom";
        SEQ762.TYPE = "KEYWORD1";

        SEQ763.text = "\\hat";
        SEQ763.TYPE = "KEYWORD1";

        SEQ764.text = "\\geq";
        SEQ764.TYPE = "KEYWORD1";

        SEQ765.text = "\\gcd";
        SEQ765.TYPE = "KEYWORD1";

        SEQ766.text = "\\fam";
        SEQ766.TYPE = "KEYWORD4";

        SEQ767.text = "\\exp";
        SEQ767.TYPE = "KEYWORD1";

        SEQ768.text = "\\eth";
        SEQ768.TYPE = "KEYWORD2";

        SEQ769.text = "\\eta";
        SEQ769.TYPE = "KEYWORD1";

        SEQ770.text = "\\end";
        SEQ770.TYPE = "KEYWORD1";

        SEQ771.text = "\\ell";
        SEQ771.TYPE = "KEYWORD1";

        SEQ772.text = "\\dot";
        SEQ772.TYPE = "KEYWORD1";

        SEQ773.text = "\\div";
        SEQ773.TYPE = "KEYWORD1";

        SEQ774.text = "\\dim";
        SEQ774.TYPE = "KEYWORD1";

        SEQ775.text = "\\det";
        SEQ775.TYPE = "KEYWORD1";

        SEQ776.text = "\\deg";
        SEQ776.TYPE = "KEYWORD1";

        SEQ777.text = "\\def";
        SEQ777.TYPE = "FUNCTION";

        SEQ778.text = "\\day";
        SEQ778.TYPE = "KEYWORD4";

        SEQ779.text = "\\dag";
        SEQ779.TYPE = "KEYWORD1";

        SEQ780.text = "\\cup";
        SEQ780.TYPE = "KEYWORD1";

        SEQ781.text = "\\csc";
        SEQ781.TYPE = "KEYWORD1";

        SEQ782.text = "\\cot";
        SEQ782.TYPE = "KEYWORD1";

        SEQ783.text = "\\cos";
        SEQ783.TYPE = "KEYWORD1";

        SEQ784.text = "\\chi";
        SEQ784.TYPE = "KEYWORD1";

        SEQ785.text = "\\cap";
        SEQ785.TYPE = "KEYWORD1";

        SEQ786.text = "\\cal";
        SEQ786.TYPE = "KEYWORD1";

        SEQ787.text = "\\bye";
        SEQ787.TYPE = "KEYWORD1";

        SEQ788.text = "\\box";
        SEQ788.TYPE = "COMMENT4";

        SEQ789.text = "\\bot";
        SEQ789.TYPE = "KEYWORD1";

        SEQ790.text = "\\Big";
        SEQ790.TYPE = "KEYWORD1";

        SEQ791.text = "\\big";
        SEQ791.TYPE = "KEYWORD1";

        SEQ792.text = "\\bar";
        SEQ792.TYPE = "KEYWORD1";

        SEQ793.text = "\\ast";
        SEQ793.TYPE = "KEYWORD1";

        SEQ794.text = "\\arg";
        SEQ794.TYPE = "KEYWORD1";

        SEQ_REGEXP49.text = "(\\u005E|\\x5E)(\\u005E|\\x5E)(\\p{ASCII}|\\u0000-\\u007F)";
        SEQ_REGEXP49.HASH_CHARS = "^";
        SEQ_REGEXP49.TYPE = "KEYWORD2";

        SEQ_REGEXP50.text = "\\\\[a-zA-Z@]{3}";
        SEQ_REGEXP50.HASH_CHARS = "\\";
        SEQ_REGEXP50.TYPE = "LABEL";

        SEQ795.text = "\\Xi";
        SEQ795.TYPE = "KEYWORD1";

        SEQ796.text = "\\xi";
        SEQ796.TYPE = "KEYWORD1";

        SEQ797.text = "\\wr";
        SEQ797.TYPE = "KEYWORD1";

        SEQ798.text = "\\wp";
        SEQ798.TYPE = "KEYWORD1";

        SEQ799.text = "\\wd";
        SEQ799.TYPE = "KEYWORD1";

        SEQ800.text = "\\tt";
        SEQ800.TYPE = "KEYWORD1";

        SEQ801.text = "\\to";
        SEQ801.TYPE = "KEYWORD1";

        SEQ802.text = "\\sp";
        SEQ802.TYPE = "KEYWORD1";

        SEQ803.text = "\\sl";
        SEQ803.TYPE = "KEYWORD1";

        SEQ804.text = "\\sb";
        SEQ804.TYPE = "KEYWORD1";

        SEQ805.text = "\\rq";
        SEQ805.TYPE = "KEYWORD1";

        SEQ806.text = "\\rm";
        SEQ806.TYPE = "KEYWORD1";

        SEQ807.text = "\\Re";
        SEQ807.TYPE = "KEYWORD1";

        SEQ808.text = "\\Pr";
        SEQ808.TYPE = "KEYWORD1";

        SEQ809.text = "\\pm";
        SEQ809.TYPE = "KEYWORD1";

        SEQ810.text = "\\Pi";
        SEQ810.TYPE = "KEYWORD1";

        SEQ811.text = "\\pi";
        SEQ811.TYPE = "KEYWORD1";

        SEQ812.text = "\\or";
        SEQ812.TYPE = "KEYWORD3";

        SEQ813.text = "\\of";
        SEQ813.TYPE = "KEYWORD1";

        SEQ814.text = "\\nu";
        SEQ814.TYPE = "KEYWORD1";

        SEQ815.text = "\\ni";
        SEQ815.TYPE = "KEYWORD1";

        SEQ816.text = "\\ne";
        SEQ816.TYPE = "KEYWORD1";

        SEQ817.text = "\\mu";
        SEQ817.TYPE = "KEYWORD1";

        SEQ818.text = "\\mp";
        SEQ818.TYPE = "KEYWORD1";

        SEQ819.text = "\\lq";
        SEQ819.TYPE = "KEYWORD1";

        SEQ820.text = "\\ln";
        SEQ820.TYPE = "KEYWORD1";

        SEQ821.text = "\\ll";
        SEQ821.TYPE = "KEYWORD1";

        SEQ822.text = "\\lg";
        SEQ822.TYPE = "KEYWORD1";

        SEQ823.text = "\\le";
        SEQ823.TYPE = "KEYWORD1";

        SEQ824.text = "\\it";
        SEQ824.TYPE = "KEYWORD1";

        SEQ825.text = "\\in";
        SEQ825.TYPE = "KEYWORD1";

        SEQ826.text = "\\Im";
        SEQ826.TYPE = "KEYWORD1";

        SEQ827.text = "\\if";
        SEQ827.TYPE = "KEYWORD3";

        SEQ828.text = "\\ht";
        SEQ828.TYPE = "KEYWORD1";

        SEQ829.text = "\\gg";
        SEQ829.TYPE = "KEYWORD1";

        SEQ830.text = "\\ge";
        SEQ830.TYPE = "KEYWORD1";

        SEQ831.text = "\\fi";
        SEQ831.TYPE = "KEYWORD3";

        SEQ832.text = "\\dp";
        SEQ832.TYPE = "KEYWORD1";

        SEQ833.text = "\\do";
        SEQ833.TYPE = "KEYWORD1";

        SEQ834.text = "\\cr";
        SEQ834.TYPE = "KEYWORD1";

        SEQ835.text = "\\bf";
        SEQ835.TYPE = "KEYWORD1";

        SEQ836.text = "\\AE";
        SEQ836.TYPE = "KEYWORD2";

        SEQ837.text = "\\ae";
        SEQ837.TYPE = "KEYWORD2";

        SEQ838.text = "\\AA";
        SEQ838.TYPE = "KEYWORD2";

        SEQ839.text = "\\aa";
        SEQ839.TYPE = "KEYWORD2";

        SEQ840.text = "\\OE";
        SEQ840.TYPE = "KEYWORD2";

        SEQ841.text = "\\oe";
        SEQ841.TYPE = "KEYWORD2";

        SEQ842.text = "\\ss";
        SEQ842.TYPE = "KEYWORD2";

        SEQ_REGEXP51.text = "\\\\[a-zA-Z@]{2}";
        SEQ_REGEXP51.HASH_CHARS = "\\";
        SEQ_REGEXP51.TYPE = "LABEL";

        SEQ843.text = "\\S";
        SEQ843.TYPE = "KEYWORD1";

        SEQ844.text = "\\P";
        SEQ844.TYPE = "KEYWORD1";

        SEQ845.text = "\\=";
        SEQ845.TYPE = "KEYWORD2";

        SEQ846.text = "\\'";
        SEQ846.TYPE = "KEYWORD2";

        SEQ847.text = "\\\"";
        SEQ847.TYPE = "KEYWORD2";

        SEQ848.text = "\\~";
        SEQ848.TYPE = "KEYWORD2";

        SEQ849.text = "\\`";
        SEQ849.TYPE = "KEYWORD2";

        SEQ850.text = "\\^";
        SEQ850.TYPE = "KEYWORD2";

        SEQ851.text = "\\.";
        SEQ851.TYPE = "KEYWORD2";

        SEQ852.text = "\\H";
        SEQ852.TYPE = "KEYWORD2";

        SEQ853.text = "\\c";
        SEQ853.TYPE = "KEYWORD2";

        SEQ854.text = "\\d";
        SEQ854.TYPE = "KEYWORD2";

        SEQ855.text = "\\b";
        SEQ855.TYPE = "KEYWORD2";

        SEQ856.text = "\\v";
        SEQ856.TYPE = "KEYWORD2";

        SEQ857.text = "\\u";
        SEQ857.TYPE = "KEYWORD2";

        SEQ858.text = "\\t";
        SEQ858.TYPE = "KEYWORD2";

        SEQ859.text = "\\r";
        SEQ859.TYPE = "KEYWORD2";

        SEQ860.text = "\\k";
        SEQ860.TYPE = "KEYWORD2";

        SEQ861.text = "\\O";
        SEQ861.TYPE = "KEYWORD2";

        SEQ862.text = "\\o";
        SEQ862.TYPE = "KEYWORD2";

        SEQ863.text = "\\L";
        SEQ863.TYPE = "KEYWORD2";

        SEQ864.text = "\\l";
        SEQ864.TYPE = "KEYWORD2";

        SEQ865.text = "\\j";
        SEQ865.TYPE = "KEYWORD2";

        SEQ866.text = "\\i";
        SEQ866.TYPE = "KEYWORD2";

        SEQ867.text = "\\?";
        SEQ867.TYPE = "KEYWORD1";

        SEQ868.text = "\\>";
        SEQ868.TYPE = "KEYWORD1";

        SEQ869.text = "\\<";
        SEQ869.TYPE = "KEYWORD1";

        SEQ870.text = "\\;";
        SEQ870.TYPE = "KEYWORD1";

        SEQ871.text = "\\:";
        SEQ871.TYPE = "KEYWORD1";

        SEQ872.text = "\\/";
        SEQ872.TYPE = "KEYWORD1";

        SEQ873.text = "\\-";
        SEQ873.TYPE = "KEYWORD1";

        SEQ874.text = "\\,";
        SEQ874.TYPE = "KEYWORD1";

        SEQ875.text = "\\+";
        SEQ875.TYPE = "KEYWORD1";

        SEQ876.text = "\\*";
        SEQ876.TYPE = "KEYWORD1";

        SEQ877.text = "\\)";
        SEQ877.TYPE = "KEYWORD1";

        SEQ878.text = "\\(";
        SEQ878.TYPE = "KEYWORD1";

        SEQ879.text = "\\!";
        SEQ879.TYPE = "KEYWORD1";

        SEQ880.text = "\\|";
        SEQ880.TYPE = "KEYWORD1";

        SEQ881.text = "\\\\";
        SEQ881.TYPE = "KEYWORD1";

        SEQ882.text = "\\#";
        SEQ882.TYPE = "KEYWORD2";

        SEQ883.text = "\\$";
        SEQ883.TYPE = "KEYWORD2";

        SEQ884.text = "\\%";
        SEQ884.TYPE = "KEYWORD2";

        SEQ885.text = "\\&";
        SEQ885.TYPE = "KEYWORD2";

        SEQ886.text = "\\{";
        SEQ886.TYPE = "KEYWORD2";

        SEQ887.text = "\\}";
        SEQ887.TYPE = "KEYWORD2";

        SEQ888.text = "\\_";
        SEQ888.TYPE = "KEYWORD2";

        SEQ_REGEXP52.text = "`\\p{ASCII}";
        SEQ_REGEXP52.HASH_CHARS = "`";
        SEQ_REGEXP52.TYPE = "KEYWORD2";

        SEQ_REGEXP53.text = "#[1-9]";
        SEQ_REGEXP53.HASH_CHARS = "#";
        SEQ_REGEXP53.TYPE = "DIGIT";

        SEQ_REGEXP54.text = "\\\\[a-zA-Z@]{1}";
        SEQ_REGEXP54.HASH_CHARS = "\\";
        SEQ_REGEXP54.TYPE = "LABEL";

        SEQ889.text = "`";
        SEQ889.TYPE = "LITERAL3";

        SEQ890.text = "!";
        SEQ890.TYPE = "LITERAL3";

        SEQ891.text = ".";
        SEQ891.TYPE = "LITERAL3";

        SEQ892.text = ",";
        SEQ892.TYPE = "LITERAL3";

        SEQ893.text = ";";
        SEQ893.TYPE = "LITERAL3";

        SEQ894.text = "?";
        SEQ894.TYPE = "LITERAL3";

        SEQ895.text = ":";
        SEQ895.TYPE = "LITERAL3";

        SEQ896.text = "'";
        SEQ896.TYPE = "LITERAL3";

        SEQ897.text = "\"";
        SEQ897.TYPE = "LITERAL3";

        SEQ898.text = "\\";
        SEQ898.TYPE = "LITERAL3";

        SEQ899.text = "(";
        SEQ899.TYPE = "LITERAL4";

        SEQ900.text = ")";
        SEQ900.TYPE = "LITERAL4";

        SEQ901.text = "=";
        SEQ901.TYPE = "LITERAL4";

        SEQ902.text = "+";
        SEQ902.TYPE = "LITERAL4";

        SEQ903.text = "-";
        SEQ903.TYPE = "LITERAL4";

        SEQ904.text = ">";
        SEQ904.TYPE = "LITERAL4";

        SEQ905.text = "<";
        SEQ905.TYPE = "LITERAL4";

        SEQ906.text = "{";
        SEQ906.TYPE = "OPERATOR";

        SEQ907.text = "}";
        SEQ907.TYPE = "OPERATOR";

        SEQ908.text = "[";
        SEQ908.TYPE = "OPERATOR";

        SEQ909.text = "]";
        SEQ909.TYPE = "OPERATOR";

        SEQ910.text = "&";
        SEQ910.TYPE = "LITERAL1";

        SEQ911.text = "^";
        SEQ911.TYPE = "LITERAL1";

        SEQ912.text = "_";
        SEQ912.TYPE = "LITERAL1";

        SEQ913.text = "~";
        SEQ913.TYPE = "LITERAL1";

        SEQ_REGEXP55.text = "(\\d+?\\.\\d*pt|\\d*\\.\\d+?pt|\\d*pt)";
        SEQ_REGEXP55.HASH_CHARS = "0123456789.";
        SEQ_REGEXP55.TYPE = "LITERAL2";

        SEQ_REGEXP56.text = "(\\d+?\\.\\d*pc|\\d*\\.\\d+?pc|\\d*pc)";
        SEQ_REGEXP56.HASH_CHARS = "0123456789.";
        SEQ_REGEXP56.TYPE = "LITERAL2";

        SEQ_REGEXP57.text = "(\\d+?\\.\\d*in|\\d*\\.\\d+?in|\\d*in)";
        SEQ_REGEXP57.HASH_CHARS = "0123456789.";
        SEQ_REGEXP57.TYPE = "LITERAL2";

        SEQ_REGEXP58.text = "(\\d+?\\.\\d*bp|\\d*\\.\\d+?bp|\\d*bp)";
        SEQ_REGEXP58.HASH_CHARS = "0123456789.";
        SEQ_REGEXP58.TYPE = "LITERAL2";

        SEQ_REGEXP59.text = "(\\d+?\\.\\d*cm|\\d*\\.\\d+?cm|\\d*cm)";
        SEQ_REGEXP59.HASH_CHARS = "0123456789.";
        SEQ_REGEXP59.TYPE = "LITERAL2";

        SEQ_REGEXP60.text = "(\\d+?\\.\\d*mm|\\d*\\.\\d+?mm|\\d*mm)";
        SEQ_REGEXP60.HASH_CHARS = "0123456789.";
        SEQ_REGEXP60.TYPE = "LITERAL2";

        SEQ_REGEXP61.text = "(\\d+?\\.\\d*dd|\\d*\\.\\d+?dd|\\d*dd)";
        SEQ_REGEXP61.HASH_CHARS = "0123456789.";
        SEQ_REGEXP61.TYPE = "LITERAL2";

        SEQ_REGEXP62.text = "(\\d+?\\.\\d*cc|\\d*\\.\\d+?cc|\\d*cc)";
        SEQ_REGEXP62.HASH_CHARS = "0123456789.";
        SEQ_REGEXP62.TYPE = "LITERAL2";

        SEQ_REGEXP63.text = "(\\d+?\\.\\d*sp|\\d*\\.\\d+?sp|\\d*sp)";
        SEQ_REGEXP63.HASH_CHARS = "0123456789.";
        SEQ_REGEXP63.TYPE = "LITERAL2";

        SEQ_REGEXP64.text = "(\\d+?\\.\\d*ex|\\d*\\.\\d+?ex|\\d*ex)";
        SEQ_REGEXP64.HASH_CHARS = "0123456789.";
        SEQ_REGEXP64.TYPE = "LITERAL2";

        SEQ_REGEXP65.text = "(\\d+?\\.\\d*em|\\d*\\.\\d+?em|\\d*em)";
        SEQ_REGEXP65.HASH_CHARS = "0123456789.";
        SEQ_REGEXP65.TYPE = "LITERAL2";


        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, SEQ27, SEQ28, SEQ29, SEQ30, SEQ31, SEQ32, SEQ33, SEQ34, SEQ35, SEQ36, SEQ37, SEQ38, SEQ39, SEQ40, SEQ41, SEQ42, SEQ43, SEQ44, SEQ45, SEQ46, SEQ47, SEQ48, SEQ49, SEQ50, SEQ51, SEQ52, SEQ53, SEQ54, SEQ55, SEQ56, SEQ57, SEQ58, SEQ59, SEQ60, SEQ61, SEQ62, SEQ63, SEQ64, SEQ65, SEQ66, SEQ67, SEQ68, SEQ69, SEQ70, SEQ71, SEQ72, SEQ73, SEQ74, SEQ75, SEQ76, SEQ77, SEQ78, SEQ79, SEQ80, SEQ81, SEQ82, SEQ83, SEQ84, SEQ85, SEQ86, SEQ87, SEQ88, SEQ89, SEQ90, SEQ91, SEQ92, SEQ93, SEQ94, SEQ95, SEQ96, SEQ97, SEQ98, SEQ99, SEQ100, SEQ101, SEQ102, SEQ103, SEQ104, SEQ105, SEQ106, SEQ107, SEQ108, SEQ109, SEQ110, SEQ111, SEQ112, SEQ113, SEQ114, SEQ115, SEQ116, SEQ117, SEQ118, SEQ119, SEQ120, SEQ121, SEQ122, SEQ123, SEQ124, SEQ125, SEQ126, SEQ127, SEQ128, SEQ129, SEQ130, SEQ131, SEQ132, SEQ133, SEQ134, SEQ135, SEQ136, SEQ137, SEQ138, SEQ139, SEQ140, SEQ141, SEQ142, SEQ143, SEQ144, SEQ145, SEQ146, SEQ147, SEQ148, SEQ149, SEQ150, SEQ151, SEQ152, SEQ153, SEQ154, SEQ155, SEQ156, SEQ157, SEQ158, SEQ159, SEQ160, SEQ161, SEQ162, SEQ163, SEQ164, SEQ165, SEQ166, SEQ167, SEQ168, SEQ169, SEQ170, SEQ171, SEQ172, SEQ173, SEQ174, SEQ175, SEQ176, SEQ177, SEQ178, SEQ179, SEQ180, SEQ181, SEQ182, SEQ183, SEQ184, SEQ185, SEQ186, SEQ187, SEQ188, SEQ189, SEQ190, SEQ191, SEQ192, SEQ193, SEQ194, SEQ195, SEQ196, SEQ197, SEQ198, SEQ199, SEQ200, SEQ201, SEQ202, SEQ203, SEQ204, SEQ205, SEQ206, SEQ207, SEQ208, SEQ209, SEQ210, SEQ211, SEQ212, SEQ213, SEQ214, SEQ215, SEQ216, SEQ217, SEQ218, SEQ219, SEQ220, SEQ221, SEQ222, SEQ223, SEQ224, SEQ225, SEQ226, SEQ227, SEQ228, SEQ229, SEQ230, SEQ231, SEQ232, SEQ233, SEQ234, SEQ235, SEQ236, SEQ237, SEQ238, SEQ239, SEQ240, SEQ241, SEQ242, SEQ243, SEQ244, SEQ245, SEQ246, SEQ247, SEQ248, SEQ249, SEQ250, SEQ251, SEQ252, SEQ253, SEQ254, SEQ255, SEQ256, SEQ257, SEQ258, SEQ259, SEQ260, SEQ261, SEQ262, SEQ263, SEQ264, SEQ265, SEQ266, SEQ267, SEQ268, SEQ269, SEQ270, SEQ271, SEQ272, SEQ273, SEQ274, SEQ275, SEQ276, SEQ277, SEQ278, SEQ279, SEQ280, SEQ281, SEQ282, SEQ283, SEQ284, SEQ285, SEQ286, SEQ287, SEQ288, SEQ289, SEQ290, SEQ291, SEQ292, SEQ293, SEQ294, SEQ295, SEQ296, SEQ297, SEQ298, SEQ299, SEQ300, SEQ301, SEQ302, SEQ303, SEQ304, SEQ305, SEQ306, SEQ307, SEQ308, SEQ309, SEQ310, SEQ311, SEQ312, SEQ313, SEQ314, SEQ315, SEQ316, SEQ317, SEQ318, SEQ319, SEQ320, SEQ321, SEQ322, SEQ323, SEQ324, SEQ325, SEQ326, SEQ327, SEQ328, SEQ329, SEQ330, SEQ331, SEQ332, SEQ333, SEQ334, SEQ335, SEQ336, SEQ337, SEQ338, SEQ339, SEQ340, SEQ341, SEQ342, SEQ343, SEQ344, SEQ345, SEQ346, SEQ347, SEQ348, SEQ349, SEQ350, SEQ351, SEQ352, SEQ353, SEQ354, SEQ355, SEQ356, SEQ357, SEQ358, SEQ359, SEQ360, SEQ361, SEQ362, SEQ363, SEQ364, SEQ365, SEQ366, SEQ367, SEQ368, SEQ369, SEQ370, SEQ371, SEQ372, SEQ373, SEQ374, SEQ375, SEQ376, SEQ377, SEQ378, SEQ379, SEQ380, SEQ381, SEQ382, SEQ383, SEQ384, SEQ385, SEQ386, SEQ387, SEQ388, SEQ389, SEQ390, SEQ391, SEQ392, SEQ393, SEQ394, SEQ395, SEQ396, SEQ397, SEQ398, SEQ399, SEQ400, SEQ401, SEQ402, SEQ403, SEQ404, SEQ405, SEQ406, SEQ407, SEQ408, SEQ409, SEQ410, SEQ411, SEQ412, SEQ413, SEQ414, SEQ415, SEQ416, SEQ417, SEQ418, SEQ419, SEQ420, SEQ421, SEQ422, SEQ423, SEQ424, SEQ425, SEQ426, SEQ427, SEQ428, SEQ429, SEQ430, SEQ431, SEQ432, SEQ433, SEQ434, SEQ435, SEQ436, SEQ437, SEQ438, SEQ439, SEQ440, SEQ441, SEQ442, SEQ443, SEQ444, SEQ445, SEQ446, SEQ447, SEQ448, SEQ449, SEQ450, SEQ451, SEQ452, SEQ453, SEQ454, SEQ455, SEQ456, SEQ457, SEQ458, SEQ459, SEQ460, SEQ461, SEQ462, SEQ463, SEQ464, SEQ465, SEQ466, SEQ467, SEQ468, SEQ469, SEQ470, SEQ471, SEQ472, SEQ473, SEQ474, SEQ475, SEQ476, SEQ477, SEQ478, SEQ479, SEQ480, SEQ481, SEQ482, SEQ483, SEQ484, SEQ485, SEQ486, SEQ487, SEQ488, SEQ489, SEQ490, SEQ491, SEQ492, SEQ493, SEQ494, SEQ495, SEQ496, SEQ497, SEQ498, SEQ499, SEQ500, SEQ501, SEQ502, SEQ503, SEQ504, SEQ505, SEQ506, SEQ507, SEQ508, SEQ509, SEQ510, SEQ511, SEQ512, SEQ513, SEQ514, SEQ515, SEQ516, SEQ517, SEQ518, SEQ519, SEQ520, SEQ521, SEQ522, SEQ523, SEQ524, SEQ525, SEQ526, SEQ527, SEQ528, SEQ529, SEQ530, SEQ531, SEQ532, SEQ533, SEQ534, SEQ535, SEQ536, SEQ537, SEQ538, SEQ539, SEQ540, SEQ541, SEQ542, SEQ543, SEQ544, SEQ545, SEQ546, SEQ547, SEQ548, SEQ549, SEQ550, SEQ551, SEQ552, SEQ553, SEQ554, SEQ555, SEQ556, SEQ557, SEQ558, SEQ559, SEQ560, SEQ561, SEQ562, SEQ563, SEQ564, SEQ565, SEQ566, SEQ567, SEQ568, SEQ569, SEQ570, SEQ571, SEQ572, SEQ573, SEQ574, SEQ575, SEQ576, SEQ577, SEQ578, SEQ579, SEQ580, SEQ581, SEQ582, SEQ583, SEQ584, SEQ585, SEQ586, SEQ587, SEQ588, SEQ589, SEQ590, SEQ591, SEQ592, SEQ593, SEQ594, SEQ595, SEQ596, SEQ597, SEQ598, SEQ599, SEQ600, SEQ601, SEQ602, SEQ603, SEQ604, SEQ605, SEQ606, SEQ607, SEQ608, SEQ609, SEQ610, SEQ611, SEQ612, SEQ613, SEQ614, SEQ615, SEQ616, SEQ617, SEQ618, SEQ619, SEQ620, SEQ621, SEQ622, SEQ623, SEQ624, SEQ625, SEQ626, SEQ627, SEQ628, SEQ629, SEQ630, SEQ631, SEQ632, SEQ633, SEQ634, SEQ635, SEQ636, SEQ637, SEQ638, SEQ639, SEQ640, SEQ641, SEQ642, SEQ643, SEQ644, SEQ645, SEQ646, SEQ647, SEQ648, SEQ649, SEQ650, SEQ651, SEQ652, SEQ653, SEQ654, SEQ655, SEQ656, SEQ657, SEQ658, SEQ659, SEQ660, SEQ661, SEQ662, SEQ663, SEQ664, SEQ665, SEQ666, SEQ667, SEQ668, SEQ669, SEQ670, SEQ671, SEQ672, SEQ673, SEQ674, SEQ675, SEQ676, SEQ677, SEQ678, SEQ679, SEQ680, SEQ681, SEQ682, SEQ683, SEQ684, SEQ685, SEQ686, SEQ687, SEQ688, SEQ689, SEQ690, SEQ691, SEQ692, SEQ693, SEQ694, SEQ695, SEQ696, SEQ697, SEQ698, SEQ699, SEQ700, SEQ701, SEQ702, SEQ703, SEQ704, SEQ705, SEQ706, SEQ707, SEQ708, SEQ709, SEQ710, SEQ711, SEQ712, SEQ713, SEQ714, SEQ715, SEQ716, SEQ717, SEQ718, SEQ719, SEQ720, SEQ721, SEQ722, SEQ723, SEQ724, SEQ725, SEQ726, SEQ727, SEQ728, SEQ729, SEQ730, SEQ731, SEQ732, SEQ733, SEQ734, SEQ735, SEQ736, SEQ737, SEQ738, SEQ739, SEQ740, SEQ741, SEQ742, SEQ743, SEQ744, SEQ745, SEQ746, SEQ747, SEQ748, SEQ749, SEQ750, SEQ751, SEQ752, SEQ753, SEQ754, SEQ755, SEQ756, SEQ757, SEQ758, SEQ759, SEQ760, SEQ761, SEQ762, SEQ763, SEQ764, SEQ765, SEQ766, SEQ767, SEQ768, SEQ769, SEQ770, SEQ771, SEQ772, SEQ773, SEQ774, SEQ775, SEQ776, SEQ777, SEQ778, SEQ779, SEQ780, SEQ781, SEQ782, SEQ783, SEQ784, SEQ785, SEQ786, SEQ787, SEQ788, SEQ789, SEQ790, SEQ791, SEQ792, SEQ793, SEQ794, SEQ795, SEQ796, SEQ797, SEQ798, SEQ799, SEQ800, SEQ801, SEQ802, SEQ803, SEQ804, SEQ805, SEQ806, SEQ807, SEQ808, SEQ809, SEQ810, SEQ811, SEQ812, SEQ813, SEQ814, SEQ815, SEQ816, SEQ817, SEQ818, SEQ819, SEQ820, SEQ821, SEQ822, SEQ823, SEQ824, SEQ825, SEQ826, SEQ827, SEQ828, SEQ829, SEQ830, SEQ831, SEQ832, SEQ833, SEQ834, SEQ835, SEQ836, SEQ837, SEQ838, SEQ839, SEQ840, SEQ841, SEQ842, SEQ843, SEQ844, SEQ845, SEQ846, SEQ847, SEQ848, SEQ849, SEQ850, SEQ851, SEQ852, SEQ853, SEQ854, SEQ855, SEQ856, SEQ857, SEQ858, SEQ859, SEQ860, SEQ861, SEQ862, SEQ863, SEQ864, SEQ865, SEQ866, SEQ867, SEQ868, SEQ869, SEQ870, SEQ871, SEQ872, SEQ873, SEQ874, SEQ875, SEQ876, SEQ877, SEQ878, SEQ879, SEQ880, SEQ881, SEQ882, SEQ883, SEQ884, SEQ885, SEQ886, SEQ887, SEQ888, SEQ889, SEQ890, SEQ891, SEQ892, SEQ893, SEQ894, SEQ895, SEQ896, SEQ897, SEQ898, SEQ899, SEQ900, SEQ901, SEQ902, SEQ903, SEQ904, SEQ905, SEQ906, SEQ907, SEQ908, SEQ909, SEQ910, SEQ911, SEQ912, SEQ913, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "MATH";
        RULES1.DEFAULT = "MARKUP";

        EOL_SPAN1.text = "%";
        EOL_SPAN1.TYPE = "COMMENT1";

        SEQ_REGEXP1.text = "\\\\[a-zA-Z@]{25}[a-zA-Z@]*";
        SEQ_REGEXP1.HASH_CHARS = "\\";
        SEQ_REGEXP1.TYPE = "LABEL";

        SEQ1.text = "\\interfootnotelinepenalty";
        SEQ1.TYPE = "KEYWORD1";

        SEQ_REGEXP2.text = "\\\\[a-zA-Z@]{24}";
        SEQ_REGEXP2.HASH_CHARS = "\\";
        SEQ_REGEXP2.TYPE = "LABEL";

        SEQ2.text = "\\interdisplaylinepenalty";
        SEQ2.TYPE = "KEYWORD1";

        SEQ_REGEXP3.text = "\\\\[a-zA-Z@]{23}";
        SEQ_REGEXP3.HASH_CHARS = "\\";
        SEQ_REGEXP3.TYPE = "LABEL";

        SEQ_REGEXP4.text = "\\\\[a-zA-Z@]{22}";
        SEQ_REGEXP4.HASH_CHARS = "\\";
        SEQ_REGEXP4.TYPE = "LABEL";

        SEQ3.text = "\\belowdisplayshortskip";
        SEQ3.TYPE = "KEYWORD4";

        SEQ4.text = "\\abovedisplayshortskip";
        SEQ4.TYPE = "KEYWORD4";

        SEQ_REGEXP5.text = "\\\\[a-zA-Z@]{21}";
        SEQ_REGEXP5.HASH_CHARS = "\\";
        SEQ_REGEXP5.TYPE = "LABEL";

        SEQ5.text = "\\doublehyphendemerits";
        SEQ5.TYPE = "KEYWORD4";

        SEQ6.text = "\\abovedisplayshortskip";
        SEQ6.TYPE = "KEYWORD1";

        SEQ_REGEXP6.text = "\\\\[a-zA-Z@]{20}";
        SEQ_REGEXP6.HASH_CHARS = "\\";
        SEQ_REGEXP6.TYPE = "LABEL";

        SEQ7.text = "\\normallineskiplimit";
        SEQ7.TYPE = "KEYWORD1";

        SEQ8.text = "\\finalhyphendemerits";
        SEQ8.TYPE = "KEYWORD4";

        SEQ9.text = "\\displaywidowpenalty";
        SEQ9.TYPE = "KEYWORD4";

        SEQ_REGEXP7.text = "\\\\[a-zA-Z@]{19}";
        SEQ_REGEXP7.HASH_CHARS = "\\";
        SEQ_REGEXP7.TYPE = "LABEL";

        SEQ10.text = "\\postdisplaypenalty";
        SEQ10.TYPE = "KEYWORD4";

        SEQ11.text = "\\nulldelimiterspace";
        SEQ11.TYPE = "KEYWORD4";

        SEQ12.text = "\\normalbaselineskip";
        SEQ12.TYPE = "KEYWORD1";

        SEQ13.text = "\\Longleftrightarrow";
        SEQ13.TYPE = "KEYWORD1";

        SEQ14.text = "\\longleftrightarrow";
        SEQ14.TYPE = "KEYWORD1";

        SEQ15.text = "\\delimitershortfall";
        SEQ15.TYPE = "KEYWORD4";

        SEQ_REGEXP8.text = "\\\\[a-zA-Z@]{18}";
        SEQ_REGEXP8.HASH_CHARS = "\\";
        SEQ_REGEXP8.TYPE = "LABEL";

        SEQ16.text = "\\tracingparagraphs";
        SEQ16.TYPE = "KEYWORD4";

        SEQ17.text = "\\scriptscriptstyle";
        SEQ17.TYPE = "KEYWORD1";

        SEQ18.text = "\\rightleftharpoons";
        SEQ18.TYPE = "KEYWORD1";

        SEQ19.text = "\\predisplaypenalty";
        SEQ19.TYPE = "KEYWORD1";

        SEQ20.text = "\\errorcontextlines";
        SEQ20.TYPE = "KEYWORD4";

        SEQ21.text = "\\defaulthyphenchar";
        SEQ21.TYPE = "KEYWORD4";

        SEQ_REGEXP9.text = "\\\\[a-zA-Z@]{17}";
        SEQ_REGEXP9.HASH_CHARS = "\\";
        SEQ_REGEXP9.TYPE = "LABEL";

        SEQ22.text = "\\tracinglostchars";
        SEQ22.TYPE = "KEYWORD4";

        SEQ23.text = "\\scriptscriptfont";
        SEQ23.TYPE = "KEYWORD1";

        SEQ24.text = "\\rightharpoondown";
        SEQ24.TYPE = "KEYWORD1";

        SEQ25.text = "\\predisplaypenaty";
        SEQ25.TYPE = "KEYWORD4";

        SEQ26.text = "\\pagefilllstretch";
        SEQ26.TYPE = "KEYWORD1";

        SEQ27.text = "\\offinterlineskip";
        SEQ27.TYPE = "KEYWORD1";

        SEQ28.text = "\\nonfrenchspacing";
        SEQ28.TYPE = "KEYWORD1";

        SEQ29.text = "\\interlinepenalty";
        SEQ29.TYPE = "KEYWORD4";

        SEQ30.text = "\\emergencystretch";
        SEQ30.TYPE = "KEYWORD4";

        SEQ31.text = "\\belowdisplayskip";
        SEQ31.TYPE = "KEYWORD4";

        SEQ32.text = "\\allocationnumber";
        SEQ32.TYPE = "KEYWORD1";

        SEQ33.text = "\\abovedisplayskip";
        SEQ33.TYPE = "KEYWORD4";

        SEQ_REGEXP10.text = "\\\\[a-zA-Z@]{16}";
        SEQ_REGEXP10.HASH_CHARS = "\\";
        SEQ_REGEXP10.TYPE = "LABEL";

        SEQ34.text = "\\tracingrestores";
        SEQ34.TYPE = "KEYWORD4";

        SEQ35.text = "\\tracingcommands";
        SEQ35.TYPE = "KEYWORD4";

        SEQ36.text = "\\smallskipamount";
        SEQ36.TYPE = "KEYWORD1";

        SEQ37.text = "\\pagefillstretch";
        SEQ37.TYPE = "KEYWORD1";

        SEQ38.text = "\\normalbaselines";
        SEQ38.TYPE = "KEYWORD1";

        SEQ39.text = "\\nointerlineskip";
        SEQ39.TYPE = "KEYWORD1";

        SEQ40.text = "\\leftharpoondown";
        SEQ40.TYPE = "KEYWORD1";

        SEQ41.text = "\\insertpenalties";
        SEQ41.TYPE = "KEYWORD1";

        SEQ42.text = "\\floatingpenalty";
        SEQ42.TYPE = "KEYWORD4";

        SEQ43.text = "\\exhyphenpenalty";
        SEQ43.TYPE = "KEYWORD4";

        SEQ44.text = "\\delimiterfactor";
        SEQ44.TYPE = "KEYWORD4";

        SEQ45.text = "\\defaultskewchar";
        SEQ45.TYPE = "KEYWORD4";

        SEQ46.text = "\\bigtriangledown";
        SEQ46.TYPE = "KEYWORD1";

        SEQ47.text = "\\afterassignment";
        SEQ47.TYPE = "KEYWORD1";

        SEQ48.text = "\\abovewithdelims";
        SEQ48.TYPE = "KEYWORD1";

        SEQ_REGEXP11.text = "\\\\[a-zA-Z@]{15}";
        SEQ_REGEXP11.HASH_CHARS = "\\";
        SEQ_REGEXP11.TYPE = "LABEL";

        SEQ49.text = "\\splitfirstmark";
        SEQ49.TYPE = "KEYWORD1";

        SEQ50.text = "\\showboxbreadth";
        SEQ50.TYPE = "KEYWORD4";

        SEQ51.text = "\\righthyphenmin";
        SEQ51.TYPE = "KEYWORD4";

        SEQ52.text = "\\rightharpoonup";
        SEQ52.TYPE = "KEYWORD1";

        SEQ53.text = "\\rightarrowfill";
        SEQ53.TYPE = "KEYWORD1";

        SEQ54.text = "\\removelastskip";
        SEQ54.TYPE = "KEYWORD1";

        SEQ55.text = "\\predisplaysize";
        SEQ55.TYPE = "KEYWORD4";

        SEQ56.text = "\\pagefilstretch";
        SEQ56.TYPE = "KEYWORD1";

        SEQ57.text = "\\overwithdelims";
        SEQ57.TYPE = "KEYWORD1";

        SEQ58.text = "\\overrightarrow";
        SEQ58.TYPE = "KEYWORD1";

        SEQ59.text = "\\normallineskip";
        SEQ59.TYPE = "KEYWORD1";

        SEQ60.text = "\\longrightarrow";
        SEQ60.TYPE = "KEYWORD1";

        SEQ61.text = "\\Longrightarrow";
        SEQ61.TYPE = "KEYWORD1";

        SEQ62.text = "\\Leftrightarrow";
        SEQ62.TYPE = "KEYWORD1";

        SEQ63.text = "\\leftrightarrow";
        SEQ63.TYPE = "KEYWORD1";

        SEQ64.text = "\\hookrightarrow";
        SEQ64.TYPE = "KEYWORD1";

        SEQ65.text = "\\holdinginserts";
        SEQ65.TYPE = "KEYWORD4";

        SEQ66.text = "\\atopwithdelims";
        SEQ66.TYPE = "KEYWORD1";

        SEQ_REGEXP12.text = "\\\\[a-zA-Z@]{14}";
        SEQ_REGEXP12.HASH_CHARS = "\\";
        SEQ_REGEXP12.TYPE = "LABEL";

        SEQ67.text = "\\ttraggedright";
        SEQ67.TYPE = "KEYWORD1";

        SEQ68.text = "\\triangleright";
        SEQ68.TYPE = "KEYWORD1";

        SEQ69.text = "\\tracingoutput";
        SEQ69.TYPE = "KEYWORD4";

        SEQ70.text = "\\tracingonline";
        SEQ70.TYPE = "KEYWORD4";

        SEQ71.text = "\\tracingmacros";
        SEQ71.TYPE = "KEYWORD4";

        SEQ72.text = "\\splitmaxdepth";
        SEQ72.TYPE = "KEYWORD4";

        SEQ73.text = "\\overleftarrow";
        SEQ73.TYPE = "KEYWORD1";

        SEQ74.text = "\\outputpenalty";
        SEQ74.TYPE = "KEYWORD4";

        SEQ75.text = "\\nopagenumbers";
        SEQ75.TYPE = "KEYWORD1";

        SEQ76.text = "\\medskipamount";
        SEQ76.TYPE = "KEYWORD1";

        SEQ77.text = "\\maxdeadcycles";
        SEQ77.TYPE = "KEYWORD4";

        SEQ78.text = "\\magnification";
        SEQ78.TYPE = "KEYWORD1";

        SEQ79.text = "\\Longleftarrow";
        SEQ79.TYPE = "KEYWORD1";

        SEQ80.text = "\\longleftarrow";
        SEQ80.TYPE = "KEYWORD1";

        SEQ81.text = "\\lineskiplimit";
        SEQ81.TYPE = "KEYWORD4";

        SEQ82.text = "\\lefthyphenmin";
        SEQ82.TYPE = "KEYWORD4";

        SEQ83.text = "\\leftharpoonup";
        SEQ83.TYPE = "KEYWORD1";

        SEQ84.text = "\\leftarrowfill";
        SEQ84.TYPE = "KEYWORD1";

        SEQ85.text = "\\hyphenpenalty";
        SEQ85.TYPE = "KEYWORD4";

        SEQ86.text = "\\hookleftarrow";
        SEQ86.TYPE = "KEYWORD1";

        SEQ87.text = "\\frenchspacing";
        SEQ87.TYPE = "KEYWORD1";

        SEQ88.text = "\\errorstopmode";
        SEQ88.TYPE = "KEYWORD1";

        SEQ89.text = "\\downbracefill";
        SEQ89.TYPE = "KEYWORD1";

        SEQ90.text = "\\displaylimits";
        SEQ90.TYPE = "KEYWORD1";

        SEQ91.text = "\\displayindent";
        SEQ91.TYPE = "KEYWORD4";

        SEQ92.text = "\\discretionary";
        SEQ92.TYPE = "KEYWORD1";

        SEQ93.text = "\\brokenpenalty";
        SEQ93.TYPE = "KEYWORD4";

        SEQ94.text = "\\bigtriangleup";
        SEQ94.TYPE = "KEYWORD1";

        SEQ95.text = "\\bigskipamount";
        SEQ95.TYPE = "KEYWORD1";

        SEQ96.text = "\\advancepageno";
        SEQ96.TYPE = "KEYWORD1";

        SEQ_REGEXP13.text = "\\\\[a-zA-Z@]{13}";
        SEQ_REGEXP13.HASH_CHARS = "\\";
        SEQ_REGEXP13.TYPE = "LABEL";

        SEQ97.text = "\\widowpenalty";
        SEQ97.TYPE = "KEYWORD4";

        SEQ98.text = "\\triangleleft";
        SEQ98.TYPE = "KEYWORD1";

        SEQ99.text = "\\tracingstats";
        SEQ99.TYPE = "KEYWORD4";

        SEQ100.text = "\\tracingpages";
        SEQ100.TYPE = "KEYWORD4";

        SEQ101.text = "\\splittopskip";
        SEQ101.TYPE = "KEYWORD4";

        SEQ102.text = "\\splitbotmark";
        SEQ102.TYPE = "KEYWORD1";

        SEQ103.text = "\\showboxdepth";
        SEQ103.TYPE = "KEYWORD4";

        SEQ104.text = "\\romannumeral";
        SEQ104.TYPE = "KEYWORD1";

        SEQ105.text = "\\raggedbottom";
        SEQ105.TYPE = "KEYWORD1";

        SEQ106.text = "\\pretolerance";
        SEQ106.TYPE = "KEYWORD4";

        SEQ107.text = "\\pagecontents";
        SEQ107.TYPE = "KEYWORD1";

        SEQ108.text = "\\overfullrule";
        SEQ108.TYPE = "KEYWORD4";

        SEQ109.text = "\\normalbottom";
        SEQ109.TYPE = "KEYWORD1";

        SEQ110.text = "\\negthinspace";
        SEQ110.TYPE = "KEYWORD1";

        SEQ111.text = "\\mathsurround";
        SEQ111.TYPE = "KEYWORD4";

        SEQ112.text = "\\makeheadline";
        SEQ112.TYPE = "KEYWORD1";

        SEQ113.text = "\\makefootline";
        SEQ113.TYPE = "KEYWORD1";

        SEQ114.text = "\\ignorespaces";
        SEQ114.TYPE = "KEYWORD1";

        SEQ115.text = "\\footnoterule";
        SEQ115.TYPE = "KEYWORD1";

        SEQ116.text = "\\everydisplay";
        SEQ116.TYPE = "KEYWORD4";

        SEQ117.text = "\\dosupereject";
        SEQ117.TYPE = "KEYWORD1";

        SEQ118.text = "\\displaywidth";
        SEQ118.TYPE = "KEYWORD4";

        SEQ119.text = "\\displaystyle";
        SEQ119.TYPE = "KEYWORD1";

        SEQ120.text = "\\displaylines";
        SEQ120.TYPE = "KEYWORD1";

        SEQ121.text = "\\bordermatrix";
        SEQ121.TYPE = "KEYWORD1";

        SEQ122.text = "\\binoppenalty";
        SEQ122.TYPE = "KEYWORD4";

        SEQ123.text = "\\beginsection";
        SEQ123.TYPE = "KEYWORD1";

        SEQ124.text = "\\baselineskip";
        SEQ124.TYPE = "KEYWORD1";

        SEQ_REGEXP14.text = "\\\\[a-zA-Z@]{12}";
        SEQ_REGEXP14.HASH_CHARS = "\\";
        SEQ_REGEXP14.TYPE = "LABEL";

        SEQ125.text = "\\Updownarrow";
        SEQ125.TYPE = "KEYWORD1";

        SEQ126.text = "\\updownarrow";
        SEQ126.TYPE = "KEYWORD1";

        SEQ127.text = "\\upbracefill";
        SEQ127.TYPE = "KEYWORD1";

        SEQ128.text = "\\thickmuskip";
        SEQ128.TYPE = "KEYWORD4";

        SEQ129.text = "\\spacefactor";
        SEQ129.TYPE = "KEYWORD1";

        SEQ130.text = "\\showhyphens";
        SEQ130.TYPE = "KEYWORD1";

        SEQ131.text = "\\scriptstyle";
        SEQ131.TYPE = "KEYWORD1";

        SEQ132.text = "\\scriptspace";
        SEQ132.TYPE = "KEYWORD4";

        SEQ133.text = "\\raggedright";
        SEQ133.TYPE = "KEYWORD1";

        SEQ134.text = "\\plainoutput";
        SEQ134.TYPE = "KEYWORD1";

        SEQ135.text = "\\parfillskip";
        SEQ135.TYPE = "KEYWORD4";

        SEQ136.text = "\\pagestretch";
        SEQ136.TYPE = "KEYWORD1";

        SEQ137.text = "\\nonstopmode";
        SEQ137.TYPE = "KEYWORD1";

        SEQ138.text = "\\newlinechar";
        SEQ138.TYPE = "COMMENT2";

        SEQ139.text = "\\mathpalette";
        SEQ139.TYPE = "KEYWORD1";

        SEQ140.text = "\\mathchardef";
        SEQ140.TYPE = "FUNCTION";

        SEQ141.text = "\\magstephalf";
        SEQ141.TYPE = "KEYWORD1";

        SEQ142.text = "\\linepenalty";
        SEQ142.TYPE = "KEYWORD4";

        SEQ143.text = "\\lastpenalty";
        SEQ143.TYPE = "KEYWORD1";

        SEQ144.text = "\\hyphenation";
        SEQ144.TYPE = "KEYWORD1";

        SEQ145.text = "\\expandafter";
        SEQ145.TYPE = "KEYWORD1";

        SEQ146.text = "\\endlinechar";
        SEQ146.TYPE = "KEYWORD4";

        SEQ147.text = "\\diamondsuit";
        SEQ147.TYPE = "KEYWORD1";

        SEQ148.text = "\\clubpenalty";
        SEQ148.TYPE = "KEYWORD4";

        SEQ149.text = "\\boxmaxdepth";
        SEQ149.TYPE = "KEYWORD4";

        SEQ150.text = "\\adjdemerits";
        SEQ150.TYPE = "KEYWORD4";

        SEQ_REGEXP15.text = "\\\\[a-zA-Z@]{11}";
        SEQ_REGEXP15.HASH_CHARS = "\\";
        SEQ_REGEXP15.TYPE = "LABEL";

        SEQ151.text = "\\xspaceskip";
        SEQ151.TYPE = "KEYWORD4";

        SEQ152.text = "\\varepsilon";
        SEQ152.TYPE = "KEYWORD1";

        SEQ153.text = "\\underbrace";
        SEQ153.TYPE = "KEYWORD1";

        SEQ154.text = "\\tracingall";
        SEQ154.TYPE = "KEYWORD1";

        SEQ155.text = "\\thinmuskip";
        SEQ155.TYPE = "KEYWORD4";

        SEQ156.text = "\\textindent";
        SEQ156.TYPE = "KEYWORD1";

        SEQ157.text = "\\supereject";
        SEQ157.TYPE = "KEYWORD1";

        SEQ158.text = "\\sqsupseteq";
        SEQ158.TYPE = "KEYWORD1";

        SEQ159.text = "\\smallbreak";
        SEQ159.TYPE = "KEYWORD1";

        SEQ160.text = "\\scrollmode";
        SEQ160.TYPE = "KEYWORD1";

        SEQ161.text = "\\scriptfont";
        SEQ161.TYPE = "KEYWORD1";

        SEQ162.text = "\\rmoustache";
        SEQ162.TYPE = "KEYWORD1";

        SEQ163.text = "\\Rightarrow";
        SEQ163.TYPE = "KEYWORD1";

        SEQ164.text = "\\rightarrow";
        SEQ164.TYPE = "KEYWORD1";

        SEQ165.text = "\\relpenalty";
        SEQ165.TYPE = "KEYWORD4";

        SEQ166.text = "\\pageshrink";
        SEQ166.TYPE = "KEYWORD1";

        SEQ167.text = "\\pageinsert";
        SEQ167.TYPE = "KEYWORD1";

        SEQ168.text = "\\obeyspaces";
        SEQ168.TYPE = "KEYWORD1";

        SEQ169.text = "\\mathhexbox";
        SEQ169.TYPE = "KEYWORD1";

        SEQ170.text = "\\mathchoice";
        SEQ170.TYPE = "KEYWORD1";

        SEQ171.text = "\\mathaccent";
        SEQ171.TYPE = "KEYWORD1";

        SEQ172.text = "\\mapstochar";
        SEQ172.TYPE = "KEYWORD1";

        SEQ173.text = "\\longmapsto";
        SEQ173.TYPE = "KEYWORD1";

        SEQ174.text = "\\lmoustache";
        SEQ174.TYPE = "KEYWORD1";

        SEQ175.text = "\\leqalignno";
        SEQ175.TYPE = "KEYWORD1";

        SEQ176.text = "\\leavevmode";
        SEQ176.TYPE = "KEYWORD1";

        SEQ177.text = "\\hyphenchar";
        SEQ177.TYPE = "KEYWORD1";

        SEQ178.text = "\\hangindent";
        SEQ178.TYPE = "KEYWORD4";

        SEQ179.text = "\\globaldefs";
        SEQ179.TYPE = "KEYWORD4";

        SEQ180.text = "\\fmtversion";
        SEQ180.TYPE = "KEYWORD1";

        SEQ181.text = "\\escapechar";
        SEQ181.TYPE = "KEYWORD4";

        SEQ182.text = "\\errmessage";
        SEQ182.TYPE = "KEYWORD1";

        SEQ183.text = "\\dospecials";
        SEQ183.TYPE = "KEYWORD1";

        SEQ184.text = "\\deadcycles";
        SEQ184.TYPE = "KEYWORD1";

        SEQ185.text = "\\centerline";
        SEQ185.TYPE = "KEYWORD1";

        SEQ186.text = "\\begingroup";
        SEQ186.TYPE = "KEYWORD1";

        SEQ187.text = "\\allowbreak";
        SEQ187.TYPE = "KEYWORD1";

        SEQ188.text = "\\aftergroup";
        SEQ188.TYPE = "KEYWORD1";

        SEQ_REGEXP16.text = "\\\\[a-zA-Z@]{10}";
        SEQ_REGEXP16.HASH_CHARS = "\\";
        SEQ_REGEXP16.TYPE = "LABEL";

        SEQ189.text = "\\widetilde";
        SEQ189.TYPE = "KEYWORD1";

        SEQ190.text = "\\vfootnote";
        SEQ190.TYPE = "KEYWORD1";

        SEQ191.text = "\\uppercase";
        SEQ191.TYPE = "KEYWORD1";

        SEQ192.text = "\\unpenalty";
        SEQ192.TYPE = "KEYWORD1";

        SEQ193.text = "\\underline";
        SEQ193.TYPE = "KEYWORD1";

        SEQ194.text = "\\undefined";
        SEQ194.TYPE = "KEYWORD1";

        SEQ195.text = "\\topinsert";
        SEQ195.TYPE = "KEYWORD1";

        SEQ196.text = "\\tolerance";
        SEQ196.TYPE = "KEYWORD4";

        SEQ197.text = "\\thinspace";
        SEQ197.TYPE = "KEYWORD1";

        SEQ198.text = "\\textstyle";
        SEQ198.TYPE = "KEYWORD1";

        SEQ199.text = "\\spadesuit";
        SEQ199.TYPE = "KEYWORD1";

        SEQ200.text = "\\spaceskip";
        SEQ200.TYPE = "KEYWORD4";

        SEQ201.text = "\\smallskip";
        SEQ201.TYPE = "KEYWORD1";

        SEQ202.text = "\\showlists";
        SEQ202.TYPE = "KEYWORD1";

        SEQ203.text = "\\rightskip";
        SEQ203.TYPE = "KEYWORD4";

        SEQ204.text = "\\rightline";
        SEQ204.TYPE = "KEYWORD1";

        SEQ205.text = "\\prevdepth";
        SEQ205.TYPE = "KEYWORD1";

        SEQ206.text = "\\preloaded";
        SEQ206.TYPE = "KEYWORD1";

        SEQ207.text = "\\parindent";
        SEQ207.TYPE = "KEYWORD4";

        SEQ208.text = "\\pagetotal";
        SEQ208.TYPE = "KEYWORD1";

        SEQ209.text = "\\pagedepth";
        SEQ209.TYPE = "KEYWORD1";

        SEQ210.text = "\\overbrace";
        SEQ210.TYPE = "KEYWORD1";

        SEQ211.text = "\\obeylines";
        SEQ211.TYPE = "KEYWORD1";

        SEQ212.text = "\\nonscript";
        SEQ212.TYPE = "KEYWORD1";

        SEQ213.text = "\\newmuskip";
        SEQ213.TYPE = "FUNCTION";

        SEQ214.text = "\\newinsert";
        SEQ214.TYPE = "FUNCTION";

        SEQ215.text = "\\muskipdef";
        SEQ215.TYPE = "FUNCTION";

        SEQ216.text = "\\multispan";
        SEQ216.TYPE = "KEYWORD1";

        SEQ217.text = "\\moveright";
        SEQ217.TYPE = "KEYWORD1";

        SEQ218.text = "\\midinsert";
        SEQ218.TYPE = "KEYWORD1";

        SEQ219.text = "\\medmuskip";
        SEQ219.TYPE = "KEYWORD4";

        SEQ220.text = "\\mathstrut";
        SEQ220.TYPE = "KEYWORD1";

        SEQ221.text = "\\mathpunct";
        SEQ221.TYPE = "KEYWORD1";

        SEQ222.text = "\\mathinner";
        SEQ222.TYPE = "KEYWORD1";

        SEQ223.text = "\\mathclose";
        SEQ223.TYPE = "KEYWORD1";

        SEQ224.text = "\\lowercase";
        SEQ224.TYPE = "KEYWORD1";

        SEQ225.text = "\\looseness";
        SEQ225.TYPE = "KEYWORD4";

        SEQ226.text = "\\Leftarrow";
        SEQ226.TYPE = "KEYWORD1";

        SEQ227.text = "\\leftarrow";
        SEQ227.TYPE = "KEYWORD1";

        SEQ228.text = "\\immediate";
        SEQ228.TYPE = "KEYWORD1";

        SEQ229.text = "\\hrulefill";
        SEQ229.TYPE = "KEYWORD1";

        SEQ230.text = "\\hidewidth";
        SEQ230.TYPE = "KEYWORD1";

        SEQ231.text = "\\heartsuit";
        SEQ231.TYPE = "KEYWORD1";

        SEQ232.text = "\\hangafter";
        SEQ232.TYPE = "KEYWORD4";

        SEQ233.text = "\\goodbreak";
        SEQ233.TYPE = "KEYWORD1";

        SEQ234.text = "\\futurelet";
        SEQ234.TYPE = "COMMENT3";

        SEQ235.text = "\\footstrut";
        SEQ235.TYPE = "KEYWORD1";

        SEQ236.text = "\\fontdimen";
        SEQ236.TYPE = "KEYWORD1";

        SEQ237.text = "\\firstmark";
        SEQ237.TYPE = "KEYWORD1";

        SEQ238.text = "\\everyvbox";
        SEQ238.TYPE = "KEYWORD4";

        SEQ239.text = "\\everymath";
        SEQ239.TYPE = "KEYWORD4";

        SEQ240.text = "\\everyhbox";
        SEQ240.TYPE = "KEYWORD4";

        SEQ241.text = "\\eqalignno";
        SEQ241.TYPE = "KEYWORD1";

        SEQ242.text = "\\endinsert";
        SEQ242.TYPE = "KEYWORD1";

        SEQ243.text = "\\endcsname";
        SEQ243.TYPE = "FUNCTION";

        SEQ244.text = "\\Downarrow";
        SEQ244.TYPE = "KEYWORD1";

        SEQ245.text = "\\downarrow";
        SEQ245.TYPE = "KEYWORD1";

        SEQ246.text = "\\delimiter";
        SEQ246.TYPE = "KEYWORD1";

        SEQ247.text = "\\copyright";
        SEQ247.TYPE = "KEYWORD1";

        SEQ248.text = "\\cleartabs";
        SEQ248.TYPE = "KEYWORD1";

        SEQ249.text = "\\centering";
        SEQ249.TYPE = "KEYWORD1";

        SEQ250.text = "\\bracevert";
        SEQ250.TYPE = "KEYWORD1";

        SEQ251.text = "\\bigotimes";
        SEQ251.TYPE = "KEYWORD1";

        SEQ252.text = "\\batchmode";
        SEQ252.TYPE = "KEYWORD1";

        SEQ253.text = "\\backslash";
        SEQ253.TYPE = "KEYWORD2";

        SEQ254.text = "\\Arrowvert";
        SEQ254.TYPE = "KEYWORD1";

        SEQ255.text = "\\arrowvert";
        SEQ255.TYPE = "KEYWORD1";

        SEQ_REGEXP17.text = "\\\\muskip([0-1][0-9][0-9]|2([0-4][0-9]|5[0-5]))";
        SEQ_REGEXP17.HASH_CHARS = "\\";
        SEQ_REGEXP17.TYPE = "COMMENT4";

        SEQ_REGEXP18.text = "\\\\[a-zA-Z@]{9}";
        SEQ_REGEXP18.HASH_CHARS = "\\";
        SEQ_REGEXP18.TYPE = "LABEL";

        SEQ256.text = "\\xleaders";
        SEQ256.TYPE = "KEYWORD1";

        SEQ257.text = "\\vphantom";
        SEQ257.TYPE = "KEYWORD1";

        SEQ258.text = "\\vbadness";
        SEQ258.TYPE = "KEYWORD4";

        SEQ259.text = "\\vartheta";
        SEQ259.TYPE = "KEYWORD1";

        SEQ260.text = "\\varsigma";
        SEQ260.TYPE = "KEYWORD1";

        SEQ261.text = "\\underbar";
        SEQ261.TYPE = "KEYWORD1";

        SEQ262.text = "\\triangle";
        SEQ262.TYPE = "KEYWORD1";

        SEQ263.text = "\\textfont";
        SEQ263.TYPE = "KEYWORD1";

        SEQ264.text = "\\tabsdone";
        SEQ264.TYPE = "KEYWORD1";

        SEQ265.text = "\\tabalign";
        SEQ265.TYPE = "KEYWORD1";

        SEQ266.text = "\\supseteq";
        SEQ266.TYPE = "KEYWORD1";

        SEQ267.text = "\\subseteq";
        SEQ267.TYPE = "KEYWORD1";

        SEQ268.text = "\\strutbox";
        SEQ268.TYPE = "KEYWORD1";

        SEQ269.text = "\\smallint";
        SEQ269.TYPE = "KEYWORD1";

        SEQ270.text = "\\skewchar";
        SEQ270.TYPE = "KEYWORD1";

        SEQ271.text = "\\setminus";
        SEQ271.TYPE = "KEYWORD1";

        SEQ272.text = "\\proclaim";
        SEQ272.TYPE = "KEYWORD1";

        SEQ273.text = "\\prevgraf";
        SEQ273.TYPE = "KEYWORD1";

        SEQ274.text = "\\patterns";
        SEQ274.TYPE = "KEYWORD1";

        SEQ275.text = "\\parshape";
        SEQ275.TYPE = "KEYWORD1";

        SEQ276.text = "\\parallel";
        SEQ276.TYPE = "KEYWORD1";

        SEQ277.text = "\\pagegoal";
        SEQ277.TYPE = "KEYWORD1";

        SEQ278.text = "\\pagebody";
        SEQ278.TYPE = "KEYWORD1";

        SEQ279.text = "\\overline";
        SEQ279.TYPE = "KEYWORD1";

        SEQ280.text = "\\oldstyle";
        SEQ280.TYPE = "KEYWORD1";

        SEQ281.text = "\\nolimits";
        SEQ281.TYPE = "KEYWORD1";

        SEQ282.text = "\\noindent";
        SEQ282.TYPE = "KEYWORD1";

        SEQ283.text = "\\noexpand";
        SEQ283.TYPE = "KEYWORD1";

        SEQ284.text = "\\newwrite";
        SEQ284.TYPE = "COMMENT2";

        SEQ285.text = "\\newdimen";
        SEQ285.TYPE = "COMMENT2";

        SEQ286.text = "\\newcount";
        SEQ286.TYPE = "COMMENT2";

        SEQ287.text = "\\narrower";
        SEQ287.TYPE = "KEYWORD1";

        SEQ288.text = "\\moveleft";
        SEQ288.TYPE = "KEYWORD1";

        SEQ289.text = "\\medbreak";
        SEQ289.TYPE = "KEYWORD1";

        SEQ290.text = "\\maxdimen";
        SEQ290.TYPE = "KEYWORD1";

        SEQ291.text = "\\maxdepth";
        SEQ291.TYPE = "KEYWORD4";

        SEQ292.text = "\\mathopen";
        SEQ292.TYPE = "KEYWORD1";

        SEQ293.text = "\\mathcode";
        SEQ293.TYPE = "KEYWORD1";

        SEQ294.text = "\\mathchar";
        SEQ294.TYPE = "KEYWORD1";

        SEQ295.text = "\\lineskip";
        SEQ295.TYPE = "KEYWORD1";

        SEQ296.text = "\\leftskip";
        SEQ296.TYPE = "KEYWORD4";

        SEQ297.text = "\\leftline";
        SEQ297.TYPE = "KEYWORD4";

        SEQ298.text = "\\lastskip";
        SEQ298.TYPE = "KEYWORD1";

        SEQ299.text = "\\lastkern";
        SEQ299.TYPE = "KEYWORD1";

        SEQ300.text = "\\language";
        SEQ300.TYPE = "KEYWORD4";

        SEQ301.text = "\\itemitem";
        SEQ301.TYPE = "KEYWORD1";

        SEQ302.text = "\\hphantom";
        SEQ302.TYPE = "KEYWORD1";

        SEQ303.text = "\\hideskip";
        SEQ303.TYPE = "KEYWORD1";

        SEQ304.text = "\\headline";
        SEQ304.TYPE = "KEYWORD1";

        SEQ305.text = "\\hbadness";
        SEQ305.TYPE = "KEYWORD4";

        SEQ306.text = "\\footnote";
        SEQ306.TYPE = "KEYWORD1";

        SEQ307.text = "\\footline";
        SEQ307.TYPE = "KEYWORD1";

        SEQ308.text = "\\multiply";
        SEQ308.TYPE = "KEYWORD1";

        SEQ309.text = "\\fontname";
        SEQ309.TYPE = "KEYWORD1";

        SEQ310.text = "\\filbreak";
        SEQ310.TYPE = "KEYWORD1";

        SEQ311.text = "\\everypar";
        SEQ311.TYPE = "KEYWORD4";

        SEQ312.text = "\\everyjob";
        SEQ312.TYPE = "KEYWORD4";

        SEQ313.text = "\\endinput";
        SEQ313.TYPE = "KEYWORD1";

        SEQ314.text = "\\endgroup";
        SEQ314.TYPE = "KEYWORD1";

        SEQ315.text = "\\emptyset";
        SEQ315.TYPE = "KEYWORD1";

        SEQ316.text = "\\dimendef";
        SEQ316.TYPE = "FUNCTION";

        SEQ317.text = "\\countdef";
        SEQ317.TYPE = "FUNCTION";

        SEQ318.text = "\\clubsuit";
        SEQ318.TYPE = "KEYWORD1";

        SEQ319.text = "\\closeout";
        SEQ319.TYPE = "KEYWORD1";

        SEQ320.text = "\\cleaders";
        SEQ320.TYPE = "KEYWORD1";

        SEQ321.text = "\\buildrel";
        SEQ321.TYPE = "KEYWORD1";

        SEQ322.text = "\\bigwedge";
        SEQ322.TYPE = "KEYWORD1";

        SEQ323.text = "\\biguplus";
        SEQ323.TYPE = "KEYWORD1";

        SEQ324.text = "\\bigsqcup";
        SEQ324.TYPE = "KEYWORD1";

        SEQ325.text = "\\bigoplus";
        SEQ325.TYPE = "KEYWORD1";

        SEQ326.text = "\\bigbreak";
        SEQ326.TYPE = "KEYWORD1";

        SEQ_REGEXP19.text = "\\\\muskip[0-9][0-9]";
        SEQ_REGEXP19.HASH_CHARS = "\\";
        SEQ_REGEXP19.TYPE = "COMMENT4";

        SEQ_REGEXP20.text = "\\\\dimen([0-1][0-9][0-9]|2([0-4][0-9]|5[0-5]))";
        SEQ_REGEXP20.HASH_CHARS = "\\";
        SEQ_REGEXP20.TYPE = "COMMENT4";

        SEQ_REGEXP21.text = "\\\\count([0-1][0-9][0-9]|2([0-4][0-9]|5[0-5]))";
        SEQ_REGEXP21.HASH_CHARS = "\\";
        SEQ_REGEXP21.TYPE = "COMMENT4";

        SEQ_REGEXP22.text = "\\\\[a-zA-Z@]{8}";
        SEQ_REGEXP22.HASH_CHARS = "\\";
        SEQ_REGEXP22.TYPE = "LABEL";

        SEQ327.text = "\\widehat";
        SEQ327.TYPE = "KEYWORD1";

        SEQ328.text = "\\voffset";
        SEQ328.TYPE = "KEYWORD4";

        SEQ329.text = "\\vfilneg";
        SEQ329.TYPE = "KEYWORD1";

        SEQ330.text = "\\vcenter";
        SEQ330.TYPE = "KEYWORD1";

        SEQ331.text = "\\vadjust";
        SEQ331.TYPE = "KEYWORD1";

        SEQ332.text = "\\Upsilon";
        SEQ332.TYPE = "KEYWORD1";

        SEQ333.text = "\\upsilon";
        SEQ333.TYPE = "KEYWORD1";

        SEQ334.text = "\\Uparrow";
        SEQ334.TYPE = "KEYWORD1";

        SEQ335.text = "\\uparrow";
        SEQ335.TYPE = "KEYWORD1";

        SEQ336.text = "\\unvcopy";
        SEQ336.TYPE = "KEYWORD1";

        SEQ337.text = "\\unhcopy";
        SEQ337.TYPE = "KEYWORD1";

        SEQ338.text = "\\topskip";
        SEQ338.TYPE = "KEYWORD4";

        SEQ339.text = "\\topmark";
        SEQ339.TYPE = "KEYWORD1";

        SEQ340.text = "\\toksdef";
        SEQ340.TYPE = "FUNCTION";

        SEQ341.text = "\\tabsyet";
        SEQ341.TYPE = "KEYWORD1";

        SEQ342.text = "\\tabskip";
        SEQ342.TYPE = "KEYWORD4";

        SEQ343.text = "\\swarrow";
        SEQ343.TYPE = "KEYWORD1";

        SEQ344.text = "\\special";
        SEQ344.TYPE = "KEYWORD1";

        SEQ345.text = "\\skipdef";
        SEQ345.TYPE = "FUNCTION";

        SEQ346.text = "\\showthe";
        SEQ346.TYPE = "KEYWORD1";

        SEQ347.text = "\\showbox";
        SEQ347.TYPE = "KEYWORD1";

        SEQ348.text = "\\shipout";
        SEQ348.TYPE = "KEYWORD1";

        SEQ349.text = "\\sevensy";
        SEQ349.TYPE = "KEYWORD1";

        SEQ350.text = "\\sevenrm";
        SEQ350.TYPE = "KEYWORD1";

        SEQ351.text = "\\sevenbf";
        SEQ351.TYPE = "KEYWORD1";

        SEQ352.text = "\\settabs";
        SEQ352.TYPE = "KEYWORD1";

        SEQ353.text = "\\searrow";
        SEQ353.TYPE = "KEYWORD1";

        SEQ354.text = "\\rootbox";
        SEQ354.TYPE = "KEYWORD1";

        SEQ355.text = "\\radical";
        SEQ355.TYPE = "KEYWORD1";

        SEQ356.text = "\\pmatrix";
        SEQ356.TYPE = "KEYWORD1";

        SEQ357.text = "\\phantom";
        SEQ357.TYPE = "KEYWORD1";

        SEQ358.text = "\\penalty";
        SEQ358.TYPE = "KEYWORD1";

        SEQ359.text = "\\pausing";
        SEQ359.TYPE = "KEYWORD4";

        SEQ360.text = "\\partial";
        SEQ360.TYPE = "KEYWORD1";

        SEQ361.text = "\\parskip";
        SEQ361.TYPE = "KEYWORD4";

        SEQ362.text = "\\openout";
        SEQ362.TYPE = "KEYWORD1";

        SEQ363.text = "\\ooalign";
        SEQ363.TYPE = "KEYWORD1";

        SEQ364.text = "\\nwarrow";
        SEQ364.TYPE = "KEYWORD1";

        SEQ365.text = "\\nobreak";
        SEQ365.TYPE = "KEYWORD1";

        SEQ366.text = "\\noalign";
        SEQ366.TYPE = "KEYWORD1";

        SEQ367.text = "\\newtoks";
        SEQ367.TYPE = "COMMENT2";

        SEQ368.text = "\\newskip";
        SEQ368.TYPE = "COMMENT2";

        SEQ369.text = "\\newread";
        SEQ369.TYPE = "COMMENT2";

        SEQ370.text = "\\newhelp";
        SEQ370.TYPE = "COMMENT2";

        SEQ371.text = "\\nearrow";
        SEQ371.TYPE = "KEYWORD1";

        SEQ372.text = "\\natural";
        SEQ372.TYPE = "KEYWORD1";

        SEQ373.text = "\\mscount";
        SEQ373.TYPE = "KEYWORD1";

        SEQ374.text = "\\message";
        SEQ374.TYPE = "KEYWORD1";

        SEQ375.text = "\\medskip";
        SEQ375.TYPE = "KEYWORD1";

        SEQ376.text = "\\meaning";
        SEQ376.TYPE = "KEYWORD1";

        SEQ377.text = "\\mathrel";
        SEQ377.TYPE = "KEYWORD1";

        SEQ378.text = "\\mathord";
        SEQ378.TYPE = "KEYWORD1";

        SEQ379.text = "\\mathbin";
        SEQ379.TYPE = "KEYWORD1";

        SEQ380.text = "\\magstep";
        SEQ380.TYPE = "KEYWORD1";

        SEQ381.text = "\\leaders";
        SEQ381.TYPE = "KEYWORD1";

        SEQ382.text = "\\lastbox";
        SEQ382.TYPE = "KEYWORD1";

        SEQ383.text = "\\joinrel";
        SEQ383.TYPE = "KEYWORD1";

        SEQ384.text = "\\jobname";
        SEQ384.TYPE = "KEYWORD1";

        SEQ385.text = "\\iterate";
        SEQ385.TYPE = "KEYWORD1";

        SEQ386.text = "\\ifvmode";
        SEQ386.TYPE = "KEYWORD3";

        SEQ387.text = "\\ifmmode";
        SEQ387.TYPE = "KEYWORD3";

        SEQ388.text = "\\ifinner";
        SEQ388.TYPE = "KEYWORD3";

        SEQ389.text = "\\ifhmode";
        SEQ389.TYPE = "KEYWORD3";

        SEQ390.text = "\\iffalse";
        SEQ390.TYPE = "KEYWORD3";

        SEQ391.text = "\\hoffset";
        SEQ391.TYPE = "KEYWORD4";

        SEQ392.text = "\\hfilneg";
        SEQ392.TYPE = "KEYWORD1";

        SEQ393.text = "\\footins";
        SEQ393.TYPE = "KEYWORD1";

        SEQ394.text = "\\fmtname";
        SEQ394.TYPE = "KEYWORD1";

        SEQ395.text = "\\everycr";
        SEQ395.TYPE = "KEYWORD4";

        SEQ396.text = "\\errhelp";
        SEQ396.TYPE = "KEYWORD4";

        SEQ397.text = "\\eqalign";
        SEQ397.TYPE = "KEYWORD1";

        SEQ398.text = "\\epsilon";
        SEQ398.TYPE = "KEYWORD1";

        SEQ399.text = "\\enspace";
        SEQ399.TYPE = "KEYWORD1";

        SEQ400.text = "\\endline";
        SEQ400.TYPE = "KEYWORD1";

        SEQ401.text = "\\endgraf";
        SEQ401.TYPE = "KEYWORD1";

        SEQ402.text = "\\dotfill";
        SEQ402.TYPE = "KEYWORD1";

        SEQ403.text = "\\diamond";
        SEQ403.TYPE = "KEYWORD1";

        SEQ404.text = "\\delcode";
        SEQ404.TYPE = "KEYWORD1";

        SEQ405.text = "\\ddagger";
        SEQ405.TYPE = "KEYWORD1";

        SEQ406.text = "\\columns";
        SEQ406.TYPE = "KEYWORD1";

        SEQ407.text = "\\closein";
        SEQ407.TYPE = "KEYWORD1";

        SEQ408.text = "\\chardef";
        SEQ408.TYPE = "FUNCTION";

        SEQ409.text = "\\cdprime";
        SEQ409.TYPE = "KEYWORD2";

        SEQ410.text = "\\catcode";
        SEQ410.TYPE = "KEYWORD1";

        SEQ411.text = "\\braceru";
        SEQ411.TYPE = "KEYWORD1";

        SEQ412.text = "\\bracerd";
        SEQ412.TYPE = "KEYWORD1";

        SEQ413.text = "\\bracelu";
        SEQ413.TYPE = "KEYWORD1";

        SEQ414.text = "\\braceld";
        SEQ414.TYPE = "KEYWORD1";

        SEQ415.text = "\\botmark";
        SEQ415.TYPE = "KEYWORD1";

        SEQ416.text = "\\bigskip";
        SEQ416.TYPE = "KEYWORD1";

        SEQ417.text = "\\bigodot";
        SEQ417.TYPE = "KEYWORD1";

        SEQ418.text = "\\bigcirc";
        SEQ418.TYPE = "KEYWORD1";

        SEQ419.text = "\\advance";
        SEQ419.TYPE = "KEYWORD1";

        SEQ_REGEXP23.text = "\\\\muskip[0-9]";
        SEQ_REGEXP23.HASH_CHARS = "\\";
        SEQ_REGEXP23.TYPE = "COMMENT4";

        SEQ_REGEXP24.text = "\\\\dimen[0-9][0-9]";
        SEQ_REGEXP24.HASH_CHARS = "\\";
        SEQ_REGEXP24.TYPE = "COMMENT4";

        SEQ_REGEXP25.text = "\\\\count[0-9][0-9]";
        SEQ_REGEXP25.HASH_CHARS = "\\";
        SEQ_REGEXP25.TYPE = "COMMENT4";

        SEQ_REGEXP26.text = "\\\\toks([0-1][0-9][0-9]|2([0-4][0-9]|5[0-5]))";
        SEQ_REGEXP26.HASH_CHARS = "\\";
        SEQ_REGEXP26.TYPE = "COMMENT4";

        SEQ_REGEXP27.text = "\\\\skip([0-1][0-9][0-9]|2([0-4][0-9]|5[0-5]))";
        SEQ_REGEXP27.HASH_CHARS = "\\";
        SEQ_REGEXP27.TYPE = "COMMENT4";

        SEQ_REGEXP28.text = "\\\\char([0-1][0-9][0-9]|2([0-4][0-9]|5[0-5]))";
        SEQ_REGEXP28.HASH_CHARS = "\\";
        SEQ_REGEXP28.TYPE = "KEYWORD2";

        SEQ_REGEXP29.text = "\\\\char'[0-7][0-7]";
        SEQ_REGEXP29.HASH_CHARS = "\\";
        SEQ_REGEXP29.TYPE = "KEYWORD2";

        SEQ_REGEXP30.text = "\\\\char\"[0-9A-Fa-f][0-9A-Fa-f]";
        SEQ_REGEXP30.HASH_CHARS = "\\";
        SEQ_REGEXP30.TYPE = "KEYWORD2";

        SEQ_REGEXP31.text = "\\\\[a-zA-Z@]{7}";
        SEQ_REGEXP31.HASH_CHARS = "\\";
        SEQ_REGEXP31.TYPE = "LABEL";

        SEQ420.text = "\\vsplit";
        SEQ420.TYPE = "KEYWORD1";

        SEQ421.text = "\\varrho";
        SEQ421.TYPE = "KEYWORD1";

        SEQ422.text = "\\varphi";
        SEQ422.TYPE = "KEYWORD1";

        SEQ423.text = "\\valign";
        SEQ423.TYPE = "KEYWORD1";

        SEQ424.text = "\\utilde";
        SEQ424.TYPE = "KEYWORD2";

        SEQ425.text = "\\unvbox";
        SEQ425.TYPE = "KEYWORD1";

        SEQ426.text = "\\unskip";
        SEQ426.TYPE = "KEYWORD1";

        SEQ427.text = "\\unkern";
        SEQ427.TYPE = "KEYWORD1";

        SEQ428.text = "\\unhbox";
        SEQ428.TYPE = "KEYWORD1";

        SEQ429.text = "\\uchyph";
        SEQ429.TYPE = "KEYWORD4";

        SEQ430.text = "\\uccode";
        SEQ430.TYPE = "KEYWORD1";

        SEQ431.text = "\\topins";
        SEQ431.TYPE = "KEYWORD1";

        SEQ432.text = "\\supset";
        SEQ432.TYPE = "KEYWORD1";

        SEQ433.text = "\\succeq";
        SEQ433.TYPE = "KEYWORD1";

        SEQ434.text = "\\subset";
        SEQ434.TYPE = "KEYWORD1";

        SEQ435.text = "\\string";
        SEQ435.TYPE = "KEYWORD1";

        SEQ436.text = "\\sfcode";
        SEQ436.TYPE = "KEYWORD1";

        SEQ437.text = "\\seveni";
        SEQ437.TYPE = "KEYWORD1";

        SEQ438.text = "\\setbox";
        SEQ438.TYPE = "KEYWORD1";

        SEQ439.text = "\\rgroup";
        SEQ439.TYPE = "KEYWORD1";

        SEQ440.text = "\\rfloor";
        SEQ440.TYPE = "KEYWORD1";

        SEQ441.text = "\\repeat";
        SEQ441.TYPE = "KEYWORD1";

        SEQ442.text = "\\Relbar";
        SEQ442.TYPE = "KEYWORD1";

        SEQ443.text = "\\relbar";
        SEQ443.TYPE = "KEYWORD1";

        SEQ444.text = "\\rbrack";
        SEQ444.TYPE = "KEYWORD1";

        SEQ445.text = "\\rbrace";
        SEQ445.TYPE = "KEYWORD1";

        SEQ446.text = "\\rangle";
        SEQ446.TYPE = "KEYWORD1";

        SEQ447.text = "\\propto";
        SEQ447.TYPE = "KEYWORD1";

        SEQ448.text = "\\preceq";
        SEQ448.TYPE = "KEYWORD1";

        SEQ449.text = "\\pageno";
        SEQ449.TYPE = "KEYWORD1";

        SEQ450.text = "\\output";
        SEQ450.TYPE = "KEYWORD4";

        SEQ451.text = "\\otimes";
        SEQ451.TYPE = "KEYWORD1";

        SEQ452.text = "\\oslash";
        SEQ452.TYPE = "KEYWORD1";

        SEQ453.text = "\\openup";
        SEQ453.TYPE = "KEYWORD1";

        SEQ454.text = "\\openin";
        SEQ454.TYPE = "KEYWORD1";

        SEQ455.text = "\\ominus";
        SEQ455.TYPE = "KEYWORD1";

        SEQ456.text = "\\ointop";
        SEQ456.TYPE = "KEYWORD1";

        SEQ457.text = "\\oalign";
        SEQ457.TYPE = "KEYWORD1";

        SEQ458.text = "\\number";
        SEQ458.TYPE = "KEYWORD1";

        SEQ459.text = "\\newfam";
        SEQ459.TYPE = "COMMENT2";

        SEQ460.text = "\\newbox";
        SEQ460.TYPE = "COMMENT2";

        SEQ461.text = "\\muskip";
        SEQ461.TYPE = "COMMENT4";

        SEQ462.text = "\\models";
        SEQ462.TYPE = "KEYWORD1";

        SEQ463.text = "\\matrix";
        SEQ463.TYPE = "KEYWORD1";

        SEQ464.text = "\\mathop";
        SEQ464.TYPE = "KEYWORD1";

        SEQ465.text = "\\mapsto";
        SEQ465.TYPE = "KEYWORD1";

        SEQ466.text = "\\limsup";
        SEQ466.TYPE = "KEYWORD1";

        SEQ467.text = "\\limits";
        SEQ467.TYPE = "KEYWORD1";

        SEQ468.text = "\\liminf";
        SEQ468.TYPE = "KEYWORD1";

        SEQ469.text = "\\lgroup";
        SEQ469.TYPE = "KEYWORD1";

        SEQ470.text = "\\lfhook";
        SEQ470.TYPE = "KEYWORD2";

        SEQ471.text = "\\lfloor";
        SEQ471.TYPE = "KEYWORD1";

        SEQ472.text = "\\lccode";
        SEQ472.TYPE = "KEYWORD1";

        SEQ473.text = "\\lbrack";
        SEQ473.TYPE = "KEYWORD1";

        SEQ474.text = "\\lbrace";
        SEQ474.TYPE = "KEYWORD1";

        SEQ475.text = "\\langle";
        SEQ475.TYPE = "KEYWORD1";

        SEQ476.text = "\\Lambda";
        SEQ476.TYPE = "KEYWORD1";

        SEQ477.text = "\\lambda";
        SEQ477.TYPE = "KEYWORD1";

        SEQ478.text = "\\insert";
        SEQ478.TYPE = "KEYWORD1";

        SEQ479.text = "\\indent";
        SEQ479.TYPE = "KEYWORD1";

        SEQ480.text = "\\ifvoid";
        SEQ480.TYPE = "KEYWORD3";

        SEQ481.text = "\\ifvbox";
        SEQ481.TYPE = "KEYWORD3";

        SEQ482.text = "\\iftrue";
        SEQ482.TYPE = "KEYWORD3";

        SEQ483.text = "\\ifhbox";
        SEQ483.TYPE = "KEYWORD3";

        SEQ484.text = "\\ifcase";
        SEQ484.TYPE = "KEYWORD3";

        SEQ485.text = "\\ialign";
        SEQ485.TYPE = "KEYWORD1";

        SEQ486.text = "\\halign";
        SEQ486.TYPE = "KEYWORD1";

        SEQ487.text = "\\global";
        SEQ487.TYPE = "FUNCTION";

        SEQ488.text = "\\forall";
        SEQ488.TYPE = "KEYWORD1";

        SEQ489.text = "\\fivesy";
        SEQ489.TYPE = "KEYWORD1";

        SEQ490.text = "\\fiverm";
        SEQ490.TYPE = "KEYWORD1";

        SEQ491.text = "\\fivebf";
        SEQ491.TYPE = "KEYWORD1";

        SEQ492.text = "\\exists";
        SEQ492.TYPE = "KEYWORD1";

        SEQ493.text = "\\enskip";
        SEQ493.TYPE = "KEYWORD1";

        SEQ494.text = "\\egroup";
        SEQ494.TYPE = "KEYWORD1";

        SEQ495.text = "\\divide";
        SEQ495.TYPE = "KEYWORD1";

        SEQ496.text = "\\dagger";
        SEQ496.TYPE = "KEYWORD1";

        SEQ497.text = "\\csname";
        SEQ497.TYPE = "FUNCTION";

        SEQ498.text = "\\cprime";
        SEQ498.TYPE = "KEYWORD2";

        SEQ499.text = "\\coprod";
        SEQ499.TYPE = "KEYWORD1";

        SEQ500.text = "\\choose";
        SEQ500.TYPE = "KEYWORD1";

        SEQ501.text = "\\cfudot";
        SEQ501.TYPE = "KEYWORD2";

        SEQ502.text = "\\candra";
        SEQ502.TYPE = "KEYWORD2";

        SEQ503.text = "\\bullet";
        SEQ503.TYPE = "KEYWORD1";

        SEQ504.text = "\\bowtie";
        SEQ504.TYPE = "KEYWORD1";

        SEQ505.text = "\\bigvee";
        SEQ505.TYPE = "KEYWORD1";

        SEQ506.text = "\\bigcup";
        SEQ506.TYPE = "KEYWORD1";

        SEQ507.text = "\\bigcap";
        SEQ507.TYPE = "KEYWORD1";

        SEQ508.text = "\\bgroup";
        SEQ508.TYPE = "KEYWORD1";

        SEQ509.text = "\\arctan";
        SEQ509.TYPE = "KEYWORD1";

        SEQ510.text = "\\arcsin";
        SEQ510.TYPE = "KEYWORD1";

        SEQ511.text = "\\arccos";
        SEQ511.TYPE = "KEYWORD1";

        SEQ512.text = "\\approx";
        SEQ512.TYPE = "KEYWORD1";

        SEQ513.text = "\\acudot";
        SEQ513.TYPE = "KEYWORD2";

        SEQ514.text = "\\active";
        SEQ514.TYPE = "KEYWORD1";

        SEQ515.text = "\\accent";
        SEQ515.TYPE = "KEYWORD1";

        SEQ_REGEXP32.text = "\\\\dimen[0-9]";
        SEQ_REGEXP32.HASH_CHARS = "\\";
        SEQ_REGEXP32.TYPE = "COMMENT4";

        SEQ_REGEXP33.text = "\\\\count[0-9]";
        SEQ_REGEXP33.HASH_CHARS = "\\";
        SEQ_REGEXP33.TYPE = "COMMENT4";

        SEQ_REGEXP34.text = "\\\\toks[0-9][0-9]";
        SEQ_REGEXP34.HASH_CHARS = "\\";
        SEQ_REGEXP34.TYPE = "COMMENT4";

        SEQ_REGEXP35.text = "\\\\skip[0-9][0-9]";
        SEQ_REGEXP35.HASH_CHARS = "\\";
        SEQ_REGEXP35.TYPE = "COMMENT4";

        SEQ_REGEXP36.text = "\\\\box([0-1][0-9][0-9]|2([0-4][0-9]|5[0-5]))";
        SEQ_REGEXP36.HASH_CHARS = "\\";
        SEQ_REGEXP36.TYPE = "COMMENT4";

        SEQ_REGEXP37.text = "\\\\char[0-9][0-9]";
        SEQ_REGEXP37.HASH_CHARS = "\\";
        SEQ_REGEXP37.TYPE = "KEYWORD2";

        SEQ_REGEXP38.text = "\\\\char'[0-7]";
        SEQ_REGEXP38.HASH_CHARS = "\\";
        SEQ_REGEXP38.TYPE = "KEYWORD2";

        SEQ_REGEXP39.text = "\\\\char\"[0-9A-Fa-f]";
        SEQ_REGEXP39.HASH_CHARS = "\\";
        SEQ_REGEXP39.TYPE = "KEYWORD2";

        SEQ_REGEXP40.text = "\\\\[a-zA-Z@]{6}";
        SEQ_REGEXP40.HASH_CHARS = "\\";
        SEQ_REGEXP40.TYPE = "LABEL";

        SEQ516.text = "\\write";
        SEQ516.TYPE = "KEYWORD1";

        SEQ517.text = "\\wedge";
        SEQ517.TYPE = "KEYWORD1";

        SEQ518.text = "\\vskip";
        SEQ518.TYPE = "KEYWORD1";

        SEQ519.text = "\\vsize";
        SEQ519.TYPE = "KEYWORD4";

        SEQ520.text = "\\vrule";
        SEQ520.TYPE = "KEYWORD1";

        SEQ521.text = "\\vglue";
        SEQ521.TYPE = "KEYWORD1";

        SEQ522.text = "\\vfuzz";
        SEQ522.TYPE = "KEYWORD4";

        SEQ523.text = "\\vfill";
        SEQ523.TYPE = "KEYWORD1";

        SEQ524.text = "\\vdots";
        SEQ524.TYPE = "KEYWORD1";

        SEQ525.text = "\\vdash";
        SEQ525.TYPE = "KEYWORD1";

        SEQ526.text = "\\varpi";
        SEQ526.TYPE = "KEYWORD1";

        SEQ527.text = "\\uplus";
        SEQ527.TYPE = "KEYWORD1";

        SEQ528.text = "\\ttfam";
        SEQ528.TYPE = "KEYWORD1";

        SEQ529.text = "\\times";
        SEQ529.TYPE = "KEYWORD1";

        SEQ530.text = "\\tilde";
        SEQ530.TYPE = "KEYWORD1";

        SEQ531.text = "\\Theta";
        SEQ531.TYPE = "KEYWORD1";

        SEQ532.text = "\\theta";
        SEQ532.TYPE = "KEYWORD1";

        SEQ533.text = "\\tentt";
        SEQ533.TYPE = "KEYWORD1";

        SEQ534.text = "\\tensy";
        SEQ534.TYPE = "KEYWORD1";

        SEQ535.text = "\\tensl";
        SEQ535.TYPE = "KEYWORD1";

        SEQ536.text = "\\tenrm";
        SEQ536.TYPE = "KEYWORD1";

        SEQ537.text = "\\tenit";
        SEQ537.TYPE = "KEYWORD1";

        SEQ538.text = "\\tenex";
        SEQ538.TYPE = "KEYWORD1";

        SEQ539.text = "\\tenbf";
        SEQ539.TYPE = "KEYWORD1";

        SEQ540.text = "\\strut";
        SEQ540.TYPE = "KEYWORD1";

        SEQ541.text = "\\sqcup";
        SEQ541.TYPE = "KEYWORD1";

        SEQ542.text = "\\sqcap";
        SEQ542.TYPE = "KEYWORD1";

        SEQ543.text = "\\space";
        SEQ543.TYPE = "KEYWORD1";

        SEQ544.text = "\\smile";
        SEQ544.TYPE = "KEYWORD1";

        SEQ545.text = "\\smash";
        SEQ545.TYPE = "KEYWORD1";

        SEQ546.text = "\\slfam";
        SEQ546.TYPE = "KEYWORD1";

        SEQ547.text = "\\slash";
        SEQ547.TYPE = "KEYWORD1";

        SEQ548.text = "\\simeq";
        SEQ548.TYPE = "KEYWORD1";

        SEQ549.text = "\\Sigma";
        SEQ549.TYPE = "KEYWORD1";

        SEQ550.text = "\\sigma";
        SEQ550.TYPE = "KEYWORD1";

        SEQ551.text = "\\sharp";
        SEQ551.TYPE = "KEYWORD1";

        SEQ552.text = "\\right";
        SEQ552.TYPE = "KEYWORD1";

        SEQ553.text = "\\rhook";
        SEQ553.TYPE = "KEYWORD1";

        SEQ554.text = "\\relax";
        SEQ554.TYPE = "KEYWORD1";

        SEQ555.text = "\\rceil";
        SEQ555.TYPE = "KEYWORD1";

        SEQ556.text = "\\raise";
        SEQ556.TYPE = "KEYWORD1";

        SEQ557.text = "\\qquad";
        SEQ557.TYPE = "KEYWORD1";

        SEQ558.text = "\\prime";
        SEQ558.TYPE = "KEYWORD1";

        SEQ559.text = "\\outer";
        SEQ559.TYPE = "FUNCTION";

        SEQ560.text = "\\oplus";
        SEQ560.TYPE = "KEYWORD1";

        SEQ561.text = "\\Omega";
        SEQ561.TYPE = "KEYWORD1";

        SEQ562.text = "\\omega";
        SEQ562.TYPE = "KEYWORD1";

        SEQ563.text = "\\notin";
        SEQ563.TYPE = "KEYWORD1";

        SEQ564.text = "\\newif";
        SEQ564.TYPE = "COMMENT2";

        SEQ565.text = "\\nabla";
        SEQ565.TYPE = "KEYWORD1";

        SEQ566.text = "\\mskip";
        SEQ566.TYPE = "KEYWORD1";

        SEQ567.text = "\\month";
        SEQ567.TYPE = "KEYWORD4";

        SEQ568.text = "\\mkern";
        SEQ568.TYPE = "KEYWORD1";

        SEQ569.text = "\\lower";
        SEQ569.TYPE = "KEYWORD1";

        SEQ570.text = "\\lhook";
        SEQ570.TYPE = "KEYWORD1";

        SEQ571.text = "\\leqno";
        SEQ571.TYPE = "KEYWORD1";

        SEQ572.text = "\\ldots";
        SEQ572.TYPE = "KEYWORD1";

        SEQ573.text = "\\ldotp";
        SEQ573.TYPE = "KEYWORD1";

        SEQ574.text = "\\lceil";
        SEQ574.TYPE = "KEYWORD1";

        SEQ575.text = "\\kappa";
        SEQ575.TYPE = "KEYWORD1";

        SEQ576.text = "\\jmath";
        SEQ576.TYPE = "KEYWORD1";

        SEQ577.text = "\\itfam";
        SEQ577.TYPE = "KEYWORD1";

        SEQ578.text = "\\intop";
        SEQ578.TYPE = "KEYWORD1";

        SEQ579.text = "\\input";
        SEQ579.TYPE = "KEYWORD1";

        SEQ580.text = "\\infty";
        SEQ580.TYPE = "KEYWORD1";

        SEQ581.text = "\\imath";
        SEQ581.TYPE = "KEYWORD1";

        SEQ582.text = "\\ifodd";
        SEQ582.TYPE = "KEYWORD3";

        SEQ583.text = "\\ifnum";
        SEQ583.TYPE = "KEYWORD3";

        SEQ584.text = "\\ifeof";
        SEQ584.TYPE = "KEYWORD3";

        SEQ585.text = "\\ifdim";
        SEQ585.TYPE = "KEYWORD3";

        SEQ586.text = "\\ifcat";
        SEQ586.TYPE = "KEYWORD3";

        SEQ587.text = "\\hskip";
        SEQ587.TYPE = "KEYWORD1";

        SEQ588.text = "\\hsize";
        SEQ588.TYPE = "KEYWORD4";

        SEQ589.text = "\\hrule";
        SEQ589.TYPE = "KEYWORD1";

        SEQ590.text = "\\hglue";
        SEQ590.TYPE = "KEYWORD1";

        SEQ591.text = "\\hfuzz";
        SEQ591.TYPE = "KEYWORD4";

        SEQ592.text = "\\hfill";
        SEQ592.TYPE = "KEYWORD1";

        SEQ593.text = "\\grave";
        SEQ593.TYPE = "KEYWORD1";

        SEQ594.text = "\\Gamma";
        SEQ594.TYPE = "KEYWORD1";

        SEQ595.text = "\\gamma";
        SEQ595.TYPE = "KEYWORD1";

        SEQ596.text = "\\frown";
        SEQ596.TYPE = "KEYWORD1";

        SEQ597.text = "\\folio";
        SEQ597.TYPE = "KEYWORD1";

        SEQ598.text = "\\fivei";
        SEQ598.TYPE = "KEYWORD1";

        SEQ599.text = "\\equiv";
        SEQ599.TYPE = "KEYWORD1";

        SEQ600.text = "\\empty";
        SEQ600.TYPE = "KEYWORD1";

        SEQ601.text = "\\eject";
        SEQ601.TYPE = "KEYWORD1";

        SEQ602.text = "\\doteq";
        SEQ602.TYPE = "KEYWORD1";

        SEQ603.text = "\\dimen";
        SEQ603.TYPE = "COMMENT4";

        SEQ604.text = "\\Delta";
        SEQ604.TYPE = "KEYWORD1";

        SEQ605.text = "\\delta";
        SEQ605.TYPE = "KEYWORD1";

        SEQ606.text = "\\ddots";
        SEQ606.TYPE = "KEYWORD1";

        SEQ607.text = "\\dashv";
        SEQ607.TYPE = "KEYWORD1";

        SEQ608.text = "\\count";
        SEQ608.TYPE = "COMMENT4";

        SEQ609.text = "\\colon";
        SEQ609.TYPE = "KEYWORD1";

        SEQ610.text = "\\check";
        SEQ610.TYPE = "KEYWORD1";

        SEQ611.text = "\\cdots";
        SEQ611.TYPE = "KEYWORD1";

        SEQ612.text = "\\cdotp";
        SEQ612.TYPE = "KEYWORD1";

        SEQ613.text = "\\cases";
        SEQ613.TYPE = "KEYWORD1";

        SEQ614.text = "\\breve";
        SEQ614.TYPE = "KEYWORD1";

        SEQ615.text = "\\break";
        SEQ615.TYPE = "KEYWORD1";

        SEQ616.text = "\\brack";
        SEQ616.TYPE = "KEYWORD1";

        SEQ617.text = "\\brace";
        SEQ617.TYPE = "KEYWORD1";

        SEQ618.text = "\\Biggr";
        SEQ618.TYPE = "KEYWORD1";

        SEQ619.text = "\\biggr";
        SEQ619.TYPE = "KEYWORD1";

        SEQ620.text = "\\Biggm";
        SEQ620.TYPE = "KEYWORD1";

        SEQ621.text = "\\biggm";
        SEQ621.TYPE = "KEYWORD1";

        SEQ622.text = "\\Biggl";
        SEQ622.TYPE = "KEYWORD1";

        SEQ623.text = "\\biggl";
        SEQ623.TYPE = "KEYWORD1";

        SEQ624.text = "\\bffam";
        SEQ624.TYPE = "KEYWORD1";

        SEQ625.text = "\\asymp";
        SEQ625.TYPE = "KEYWORD1";

        SEQ626.text = "\\angle";
        SEQ626.TYPE = "KEYWORD1";

        SEQ627.text = "\\amalg";
        SEQ627.TYPE = "KEYWORD1";

        SEQ628.text = "\\alpha";
        SEQ628.TYPE = "KEYWORD1";

        SEQ629.text = "\\aleph";
        SEQ629.TYPE = "KEYWORD1";

        SEQ630.text = "\\acute";
        SEQ630.TYPE = "KEYWORD1";

        SEQ631.text = "\\above";
        SEQ631.TYPE = "KEYWORD1";

        SEQ_REGEXP41.text = "\\\\toks[0-9]";
        SEQ_REGEXP41.HASH_CHARS = "\\";
        SEQ_REGEXP41.TYPE = "COMMENT4";

        SEQ_REGEXP42.text = "\\\\skip[0-9]";
        SEQ_REGEXP42.HASH_CHARS = "\\";
        SEQ_REGEXP42.TYPE = "COMMENT4";

        SEQ_REGEXP43.text = "\\\\box[0-9][0-9]";
        SEQ_REGEXP43.HASH_CHARS = "\\";
        SEQ_REGEXP43.TYPE = "COMMENT4";

        SEQ_REGEXP44.text = "\\\\char[0-9]";
        SEQ_REGEXP44.HASH_CHARS = "\\";
        SEQ_REGEXP44.TYPE = "KEYWORD2";

        SEQ632.text = "\\char'";
        SEQ632.TYPE = "KEYWORD2";

        SEQ633.text = "\\char\"";
        SEQ633.TYPE = "KEYWORD2";

        SEQ_REGEXP45.text = "\\\\[a-zA-Z@]{5}";
        SEQ_REGEXP45.HASH_CHARS = "\\";
        SEQ_REGEXP45.TYPE = "LABEL";

        SEQ634.text = "\\zeta";
        SEQ634.TYPE = "KEYWORD1";

        SEQ635.text = "\\year";
        SEQ635.TYPE = "KEYWORD4";

        SEQ636.text = "\\xdef";
        SEQ636.TYPE = "FUNCTION";

        SEQ637.text = "\\wlog";
        SEQ637.TYPE = "KEYWORD1";

        SEQ638.text = "\\vtop";
        SEQ638.TYPE = "KEYWORD1";

        SEQ639.text = "\\vfil";
        SEQ639.TYPE = "KEYWORD1";

        SEQ640.text = "\\vert";
        SEQ640.TYPE = "KEYWORD1";

        SEQ641.text = "\\Vert";
        SEQ641.TYPE = "KEYWORD1";

        SEQ642.text = "\\vbox";
        SEQ642.TYPE = "KEYWORD1";

        SEQ643.text = "\\uarc";
        SEQ643.TYPE = "KEYWORD2";

        SEQ644.text = "\\toks";
        SEQ644.TYPE = "KEYWORD4";

        SEQ645.text = "\\time";
        SEQ645.TYPE = "KEYWORD4";

        SEQ646.text = "\\teni";
        SEQ646.TYPE = "KEYWORD1";

        SEQ647.text = "\\tanh";
        SEQ647.TYPE = "KEYWORD1";

        SEQ648.text = "\\tabs";
        SEQ648.TYPE = "KEYWORD1";

        SEQ649.text = "\\surd";
        SEQ649.TYPE = "KEYWORD1";

        SEQ650.text = "\\succ";
        SEQ650.TYPE = "KEYWORD1";

        SEQ651.text = "\\star";
        SEQ651.TYPE = "KEYWORD1";

        SEQ652.text = "\\sqrt";
        SEQ652.TYPE = "KEYWORD1";

        SEQ653.text = "\\span";
        SEQ653.TYPE = "KEYWORD1";

        SEQ654.text = "\\skip";
        SEQ654.TYPE = "KEYWORD4";

        SEQ655.text = "\\skew";
        SEQ655.TYPE = "KEYWORD1";

        SEQ656.text = "\\sinh";
        SEQ656.TYPE = "KEYWORD1";

        SEQ657.text = "\\show";
        SEQ657.TYPE = "KEYWORD1";

        SEQ658.text = "\\root";
        SEQ658.TYPE = "KEYWORD1";

        SEQ659.text = "\\rlap";
        SEQ659.TYPE = "KEYWORD1";

        SEQ660.text = "\\read";
        SEQ660.TYPE = "KEYWORD1";

        SEQ661.text = "\\quad";
        SEQ661.TYPE = "KEYWORD1";

        SEQ662.text = "\\prod";
        SEQ662.TYPE = "KEYWORD1";

        SEQ663.text = "\\prec";
        SEQ663.TYPE = "KEYWORD1";

        SEQ664.text = "\\pmod";
        SEQ664.TYPE = "KEYWORD1";

        SEQ665.text = "\\perp";
        SEQ665.TYPE = "KEYWORD1";

        SEQ666.text = "\\owns";
        SEQ666.TYPE = "KEYWORD1";

        SEQ667.text = "\\over";
        SEQ667.TYPE = "KEYWORD1";

        SEQ668.text = "\\omit";
        SEQ668.TYPE = "KEYWORD1";

        SEQ669.text = "\\oint";
        SEQ669.TYPE = "KEYWORD1";

        SEQ670.text = "\\odot";
        SEQ670.TYPE = "KEYWORD1";

        SEQ671.text = "\\null";
        SEQ671.TYPE = "KEYWORD1";

        SEQ672.text = "\\next";
        SEQ672.TYPE = "KEYWORD1";

        SEQ673.text = "\\mark";
        SEQ673.TYPE = "KEYWORD1";

        SEQ674.text = "\\loop";
        SEQ674.TYPE = "KEYWORD1";

        SEQ675.text = "\\long";
        SEQ675.TYPE = "FUNCTION";

        SEQ676.text = "\\lnot";
        SEQ676.TYPE = "KEYWORD1";

        SEQ677.text = "\\llap";
        SEQ677.TYPE = "KEYWORD1";

        SEQ678.text = "\\line";
        SEQ678.TYPE = "KEYWORD1";

        SEQ679.text = "\\left";
        SEQ679.TYPE = "KEYWORD1";

        SEQ680.text = "\\land";
        SEQ680.TYPE = "KEYWORD1";

        SEQ681.text = "\\kern";
        SEQ681.TYPE = "KEYWORD1";

        SEQ682.text = "\\item";
        SEQ682.TYPE = "KEYWORD1";

        SEQ683.text = "\\iota";
        SEQ683.TYPE = "KEYWORD1";

        SEQ684.text = "\\hfil";
        SEQ684.TYPE = "KEYWORD1";

        SEQ685.text = "\\hbox";
        SEQ685.TYPE = "KEYWORD1";

        SEQ686.text = "\\hbar";
        SEQ686.TYPE = "KEYWORD1";

        SEQ687.text = "\\hang";
        SEQ687.TYPE = "KEYWORD1";

        SEQ688.text = "\\gets";
        SEQ688.TYPE = "KEYWORD1";

        SEQ689.text = "\\gdef";
        SEQ689.TYPE = "FUNCTION";

        SEQ690.text = "\\font";
        SEQ690.TYPE = "KEYWORD1";

        SEQ691.text = "\\flat";
        SEQ691.TYPE = "KEYWORD1";

        SEQ692.text = "\\eqno";
        SEQ692.TYPE = "KEYWORD1";

        SEQ693.text = "\\else";
        SEQ693.TYPE = "KEYWORD3";

        SEQ694.text = "\\edef";
        SEQ694.TYPE = "FUNCTION";

        SEQ695.text = "\\dump";
        SEQ695.TYPE = "KEYWORD1";

        SEQ696.text = "\\dots";
        SEQ696.TYPE = "KEYWORD1";

        SEQ697.text = "\\ddot";
        SEQ697.TYPE = "KEYWORD1";

        SEQ698.text = "\\ddag";
        SEQ698.TYPE = "KEYWORD1";

        SEQ699.text = "\\dbar";
        SEQ699.TYPE = "KEYWORD2";

        SEQ700.text = "\\Dbar";
        SEQ700.TYPE = "KEYWORD2";

        SEQ701.text = "\\crcr";
        SEQ701.TYPE = "KEYWORD1";

        SEQ702.text = "\\coth";
        SEQ702.TYPE = "KEYWORD1";

        SEQ703.text = "\\cosh";
        SEQ703.TYPE = "KEYWORD1";

        SEQ704.text = "\\copy";
        SEQ704.TYPE = "KEYWORD1";

        SEQ705.text = "\\cong";
        SEQ705.TYPE = "KEYWORD1";

        SEQ706.text = "\\circ";
        SEQ706.TYPE = "KEYWORD1";

        SEQ707.text = "\\char";
        SEQ707.TYPE = "KEYWORD2";

        SEQ708.text = "\\cfac";
        SEQ708.TYPE = "KEYWORD2";

        SEQ709.text = "\\cdot";
        SEQ709.TYPE = "KEYWORD1";

        SEQ710.text = "\\body";
        SEQ710.TYPE = "KEYWORD1";

        SEQ711.text = "\\bmod";
        SEQ711.TYPE = "KEYWORD1";

        SEQ712.text = "\\Bigr";
        SEQ712.TYPE = "KEYWORD1";

        SEQ713.text = "\\bigr";
        SEQ713.TYPE = "KEYWORD1";

        SEQ714.text = "\\Bigm";
        SEQ714.TYPE = "KEYWORD1";

        SEQ715.text = "\\bigm";
        SEQ715.TYPE = "KEYWORD1";

        SEQ716.text = "\\Bigl";
        SEQ716.TYPE = "KEYWORD1";

        SEQ717.text = "\\bigl";
        SEQ717.TYPE = "KEYWORD1";

        SEQ718.text = "\\Bigg";
        SEQ718.TYPE = "KEYWORD1";

        SEQ719.text = "\\bigg";
        SEQ719.TYPE = "KEYWORD1";

        SEQ720.text = "\\beta";
        SEQ720.TYPE = "KEYWORD1";

        SEQ721.text = "\\atop";
        SEQ721.TYPE = "KEYWORD1";

        SEQ_REGEXP46.text = "\\\\box[0-9]";
        SEQ_REGEXP46.HASH_CHARS = "\\";
        SEQ_REGEXP46.TYPE = "COMMENT4";

        SEQ722.text = "\\char";
        SEQ722.TYPE = "KEYWORD2";

        SEQ_REGEXP47.text = "(\\u005E|\\x5E)(\\u005E|\\x5E)([0-9a-f])([0-9a-f])";
        SEQ_REGEXP47.HASH_CHARS = "^";
        SEQ_REGEXP47.TYPE = "KEYWORD2";

        SEQ_REGEXP48.text = "\\\\[a-zA-Z@]{4}";
        SEQ_REGEXP48.HASH_CHARS = "\\";
        SEQ_REGEXP48.TYPE = "LABEL";

        SEQ723.text = "\\vss";
        SEQ723.TYPE = "KEYWORD1";

        SEQ724.text = "\\vee";
        SEQ724.TYPE = "KEYWORD1";

        SEQ725.text = "\\vec";
        SEQ725.TYPE = "KEYWORD1";

        SEQ726.text = "\\top";
        SEQ726.TYPE = "KEYWORD1";

        SEQ727.text = "\\the";
        SEQ727.TYPE = "KEYWORD1";

        SEQ728.text = "\\TeX";
        SEQ728.TYPE = "KEYWORD1";

        SEQ729.text = "\\tau";
        SEQ729.TYPE = "KEYWORD1";

        SEQ730.text = "\\tan";
        SEQ730.TYPE = "KEYWORD1";

        SEQ731.text = "\\sup";
        SEQ731.TYPE = "KEYWORD1";

        SEQ732.text = "\\sum";
        SEQ732.TYPE = "KEYWORD1";

        SEQ733.text = "\\sin";
        SEQ733.TYPE = "KEYWORD1";

        SEQ734.text = "\\sim";
        SEQ734.TYPE = "KEYWORD1";

        SEQ735.text = "\\sec";
        SEQ735.TYPE = "KEYWORD1";

        SEQ736.text = "\\rho";
        SEQ736.TYPE = "KEYWORD1";

        SEQ737.text = "\\Psi";
        SEQ737.TYPE = "KEYWORD1";

        SEQ738.text = "\\psi";
        SEQ738.TYPE = "KEYWORD1";

        SEQ739.text = "\\Phi";
        SEQ739.TYPE = "KEYWORD1";

        SEQ740.text = "\\phi";
        SEQ740.TYPE = "KEYWORD1";

        SEQ741.text = "\\par";
        SEQ741.TYPE = "LITERAL3";

        SEQ742.text = "\\not";
        SEQ742.TYPE = "KEYWORD1";

        SEQ743.text = "\\neq";
        SEQ743.TYPE = "KEYWORD1";

        SEQ744.text = "\\neg";
        SEQ744.TYPE = "KEYWORD1";

        SEQ745.text = "\\mit";
        SEQ745.TYPE = "KEYWORD1";

        SEQ746.text = "\\min";
        SEQ746.TYPE = "KEYWORD1";

        SEQ747.text = "\\mid";
        SEQ747.TYPE = "KEYWORD1";

        SEQ748.text = "\\max";
        SEQ748.TYPE = "KEYWORD1";

        SEQ749.text = "\\mag";
        SEQ749.TYPE = "KEYWORD4";

        SEQ750.text = "\\lor";
        SEQ750.TYPE = "KEYWORD1";

        SEQ751.text = "\\log";
        SEQ751.TYPE = "KEYWORD1";

        SEQ752.text = "\\lim";
        SEQ752.TYPE = "KEYWORD1";

        SEQ753.text = "\\let";
        SEQ753.TYPE = "COMMENT3";

        SEQ754.text = "\\leq";
        SEQ754.TYPE = "KEYWORD1";

        SEQ755.text = "\\ker";
        SEQ755.TYPE = "KEYWORD1";

        SEQ756.text = "\\jot";
        SEQ756.TYPE = "KEYWORD1";

        SEQ757.text = "\\int";
        SEQ757.TYPE = "KEYWORD1";

        SEQ758.text = "\\inf";
        SEQ758.TYPE = "KEYWORD1";

        SEQ759.text = "\\ifx";
        SEQ759.TYPE = "KEYWORD3";

        SEQ760.text = "\\iff";
        SEQ760.TYPE = "KEYWORD3";

        SEQ761.text = "\\hss";
        SEQ761.TYPE = "KEYWORD1";

        SEQ762.text = "\\hom";
        SEQ762.TYPE = "KEYWORD1";

        SEQ763.text = "\\hat";
        SEQ763.TYPE = "KEYWORD1";

        SEQ764.text = "\\geq";
        SEQ764.TYPE = "KEYWORD1";

        SEQ765.text = "\\gcd";
        SEQ765.TYPE = "KEYWORD1";

        SEQ766.text = "\\fam";
        SEQ766.TYPE = "KEYWORD4";

        SEQ767.text = "\\exp";
        SEQ767.TYPE = "KEYWORD1";

        SEQ768.text = "\\eth";
        SEQ768.TYPE = "KEYWORD2";

        SEQ769.text = "\\eta";
        SEQ769.TYPE = "KEYWORD1";

        SEQ770.text = "\\end";
        SEQ770.TYPE = "KEYWORD1";

        SEQ771.text = "\\ell";
        SEQ771.TYPE = "KEYWORD1";

        SEQ772.text = "\\dot";
        SEQ772.TYPE = "KEYWORD1";

        SEQ773.text = "\\div";
        SEQ773.TYPE = "KEYWORD1";

        SEQ774.text = "\\dim";
        SEQ774.TYPE = "KEYWORD1";

        SEQ775.text = "\\det";
        SEQ775.TYPE = "KEYWORD1";

        SEQ776.text = "\\deg";
        SEQ776.TYPE = "KEYWORD1";

        SEQ777.text = "\\def";
        SEQ777.TYPE = "FUNCTION";

        SEQ778.text = "\\day";
        SEQ778.TYPE = "KEYWORD4";

        SEQ779.text = "\\dag";
        SEQ779.TYPE = "KEYWORD1";

        SEQ780.text = "\\cup";
        SEQ780.TYPE = "KEYWORD1";

        SEQ781.text = "\\csc";
        SEQ781.TYPE = "KEYWORD1";

        SEQ782.text = "\\cot";
        SEQ782.TYPE = "KEYWORD1";

        SEQ783.text = "\\cos";
        SEQ783.TYPE = "KEYWORD1";

        SEQ784.text = "\\chi";
        SEQ784.TYPE = "KEYWORD1";

        SEQ785.text = "\\cap";
        SEQ785.TYPE = "KEYWORD1";

        SEQ786.text = "\\cal";
        SEQ786.TYPE = "KEYWORD1";

        SEQ787.text = "\\bye";
        SEQ787.TYPE = "KEYWORD1";

        SEQ788.text = "\\box";
        SEQ788.TYPE = "COMMENT4";

        SEQ789.text = "\\bot";
        SEQ789.TYPE = "KEYWORD1";

        SEQ790.text = "\\Big";
        SEQ790.TYPE = "KEYWORD1";

        SEQ791.text = "\\big";
        SEQ791.TYPE = "KEYWORD1";

        SEQ792.text = "\\bar";
        SEQ792.TYPE = "KEYWORD1";

        SEQ793.text = "\\ast";
        SEQ793.TYPE = "KEYWORD1";

        SEQ794.text = "\\arg";
        SEQ794.TYPE = "KEYWORD1";

        SEQ_REGEXP49.text = "(\\u005E|\\x5E)(\\u005E|\\x5E)(\\p{ASCII}|\\u0000-\\u007F)";
        SEQ_REGEXP49.HASH_CHARS = "^";
        SEQ_REGEXP49.TYPE = "KEYWORD2";

        SEQ_REGEXP50.text = "\\\\[a-zA-Z@]{3}";
        SEQ_REGEXP50.HASH_CHARS = "\\";
        SEQ_REGEXP50.TYPE = "LABEL";

        SEQ795.text = "\\Xi";
        SEQ795.TYPE = "KEYWORD1";

        SEQ796.text = "\\xi";
        SEQ796.TYPE = "KEYWORD1";

        SEQ797.text = "\\wr";
        SEQ797.TYPE = "KEYWORD1";

        SEQ798.text = "\\wp";
        SEQ798.TYPE = "KEYWORD1";

        SEQ799.text = "\\wd";
        SEQ799.TYPE = "KEYWORD1";

        SEQ800.text = "\\tt";
        SEQ800.TYPE = "KEYWORD1";

        SEQ801.text = "\\to";
        SEQ801.TYPE = "KEYWORD1";

        SEQ802.text = "\\sp";
        SEQ802.TYPE = "KEYWORD1";

        SEQ803.text = "\\sl";
        SEQ803.TYPE = "KEYWORD1";

        SEQ804.text = "\\sb";
        SEQ804.TYPE = "KEYWORD1";

        SEQ805.text = "\\rq";
        SEQ805.TYPE = "KEYWORD1";

        SEQ806.text = "\\rm";
        SEQ806.TYPE = "KEYWORD1";

        SEQ807.text = "\\Re";
        SEQ807.TYPE = "KEYWORD1";

        SEQ808.text = "\\Pr";
        SEQ808.TYPE = "KEYWORD1";

        SEQ809.text = "\\pm";
        SEQ809.TYPE = "KEYWORD1";

        SEQ810.text = "\\Pi";
        SEQ810.TYPE = "KEYWORD1";

        SEQ811.text = "\\pi";
        SEQ811.TYPE = "KEYWORD1";

        SEQ812.text = "\\or";
        SEQ812.TYPE = "KEYWORD3";

        SEQ813.text = "\\of";
        SEQ813.TYPE = "KEYWORD1";

        SEQ814.text = "\\nu";
        SEQ814.TYPE = "KEYWORD1";

        SEQ815.text = "\\ni";
        SEQ815.TYPE = "KEYWORD1";

        SEQ816.text = "\\ne";
        SEQ816.TYPE = "KEYWORD1";

        SEQ817.text = "\\mu";
        SEQ817.TYPE = "KEYWORD1";

        SEQ818.text = "\\mp";
        SEQ818.TYPE = "KEYWORD1";

        SEQ819.text = "\\lq";
        SEQ819.TYPE = "KEYWORD1";

        SEQ820.text = "\\ln";
        SEQ820.TYPE = "KEYWORD1";

        SEQ821.text = "\\ll";
        SEQ821.TYPE = "KEYWORD1";

        SEQ822.text = "\\lg";
        SEQ822.TYPE = "KEYWORD1";

        SEQ823.text = "\\le";
        SEQ823.TYPE = "KEYWORD1";

        SEQ824.text = "\\it";
        SEQ824.TYPE = "KEYWORD1";

        SEQ825.text = "\\in";
        SEQ825.TYPE = "KEYWORD1";

        SEQ826.text = "\\Im";
        SEQ826.TYPE = "KEYWORD1";

        SEQ827.text = "\\if";
        SEQ827.TYPE = "KEYWORD3";

        SEQ828.text = "\\ht";
        SEQ828.TYPE = "KEYWORD1";

        SEQ829.text = "\\gg";
        SEQ829.TYPE = "KEYWORD1";

        SEQ830.text = "\\ge";
        SEQ830.TYPE = "KEYWORD1";

        SEQ831.text = "\\fi";
        SEQ831.TYPE = "KEYWORD3";

        SEQ832.text = "\\dp";
        SEQ832.TYPE = "KEYWORD1";

        SEQ833.text = "\\do";
        SEQ833.TYPE = "KEYWORD1";

        SEQ834.text = "\\cr";
        SEQ834.TYPE = "KEYWORD1";

        SEQ835.text = "\\bf";
        SEQ835.TYPE = "KEYWORD1";

        SEQ836.text = "\\AE";
        SEQ836.TYPE = "KEYWORD2";

        SEQ837.text = "\\ae";
        SEQ837.TYPE = "KEYWORD2";

        SEQ838.text = "\\AA";
        SEQ838.TYPE = "KEYWORD2";

        SEQ839.text = "\\aa";
        SEQ839.TYPE = "KEYWORD2";

        SEQ840.text = "\\OE";
        SEQ840.TYPE = "KEYWORD2";

        SEQ841.text = "\\oe";
        SEQ841.TYPE = "KEYWORD2";

        SEQ842.text = "\\ss";
        SEQ842.TYPE = "KEYWORD2";

        SEQ_REGEXP51.text = "\\\\[a-zA-Z@]{2}";
        SEQ_REGEXP51.HASH_CHARS = "\\";
        SEQ_REGEXP51.TYPE = "LABEL";

        SEQ843.text = "\\S";
        SEQ843.TYPE = "KEYWORD1";

        SEQ844.text = "\\P";
        SEQ844.TYPE = "KEYWORD1";

        SEQ845.text = "\\=";
        SEQ845.TYPE = "KEYWORD2";

        SEQ846.text = "\\'";
        SEQ846.TYPE = "KEYWORD2";

        SEQ847.text = "\\\"";
        SEQ847.TYPE = "KEYWORD2";

        SEQ848.text = "\\~";
        SEQ848.TYPE = "KEYWORD2";

        SEQ849.text = "\\`";
        SEQ849.TYPE = "KEYWORD2";

        SEQ850.text = "\\^";
        SEQ850.TYPE = "KEYWORD2";

        SEQ851.text = "\\.";
        SEQ851.TYPE = "KEYWORD2";

        SEQ852.text = "\\H";
        SEQ852.TYPE = "KEYWORD2";

        SEQ853.text = "\\c";
        SEQ853.TYPE = "KEYWORD2";

        SEQ854.text = "\\d";
        SEQ854.TYPE = "KEYWORD2";

        SEQ855.text = "\\b";
        SEQ855.TYPE = "KEYWORD2";

        SEQ856.text = "\\v";
        SEQ856.TYPE = "KEYWORD2";

        SEQ857.text = "\\u";
        SEQ857.TYPE = "KEYWORD2";

        SEQ858.text = "\\t";
        SEQ858.TYPE = "KEYWORD2";

        SEQ859.text = "\\r";
        SEQ859.TYPE = "KEYWORD2";

        SEQ860.text = "\\k";
        SEQ860.TYPE = "KEYWORD2";

        SEQ861.text = "\\O";
        SEQ861.TYPE = "KEYWORD2";

        SEQ862.text = "\\o";
        SEQ862.TYPE = "KEYWORD2";

        SEQ863.text = "\\L";
        SEQ863.TYPE = "KEYWORD2";

        SEQ864.text = "\\l";
        SEQ864.TYPE = "KEYWORD2";

        SEQ865.text = "\\j";
        SEQ865.TYPE = "KEYWORD2";

        SEQ866.text = "\\i";
        SEQ866.TYPE = "KEYWORD2";

        SEQ867.text = "\\?";
        SEQ867.TYPE = "KEYWORD1";

        SEQ868.text = "\\>";
        SEQ868.TYPE = "KEYWORD1";

        SEQ869.text = "\\<";
        SEQ869.TYPE = "KEYWORD1";

        SEQ870.text = "\\;";
        SEQ870.TYPE = "KEYWORD1";

        SEQ871.text = "\\:";
        SEQ871.TYPE = "KEYWORD1";

        SEQ872.text = "\\/";
        SEQ872.TYPE = "KEYWORD1";

        SEQ873.text = "\\-";
        SEQ873.TYPE = "KEYWORD1";

        SEQ874.text = "\\,";
        SEQ874.TYPE = "KEYWORD1";

        SEQ875.text = "\\+";
        SEQ875.TYPE = "KEYWORD1";

        SEQ876.text = "\\*";
        SEQ876.TYPE = "KEYWORD1";

        SEQ877.text = "\\)";
        SEQ877.TYPE = "KEYWORD1";

        SEQ878.text = "\\(";
        SEQ878.TYPE = "KEYWORD1";

        SEQ879.text = "\\!";
        SEQ879.TYPE = "KEYWORD1";

        SEQ880.text = "\\|";
        SEQ880.TYPE = "KEYWORD1";

        SEQ881.text = "\\\\";
        SEQ881.TYPE = "KEYWORD1";

        SEQ882.text = "\\#";
        SEQ882.TYPE = "KEYWORD2";

        SEQ883.text = "\\$";
        SEQ883.TYPE = "KEYWORD2";

        SEQ884.text = "\\%";
        SEQ884.TYPE = "KEYWORD2";

        SEQ885.text = "\\&";
        SEQ885.TYPE = "KEYWORD2";

        SEQ886.text = "\\{";
        SEQ886.TYPE = "KEYWORD2";

        SEQ887.text = "\\}";
        SEQ887.TYPE = "KEYWORD2";

        SEQ888.text = "\\_";
        SEQ888.TYPE = "KEYWORD2";

        SEQ_REGEXP52.text = "`\\p{ASCII}";
        SEQ_REGEXP52.HASH_CHARS = "`";
        SEQ_REGEXP52.TYPE = "KEYWORD2";

        SEQ_REGEXP53.text = "#[1-9]";
        SEQ_REGEXP53.HASH_CHARS = "#";
        SEQ_REGEXP53.TYPE = "DIGIT";

        SEQ_REGEXP54.text = "\\\\[a-zA-Z@]{1}";
        SEQ_REGEXP54.HASH_CHARS = "\\";
        SEQ_REGEXP54.TYPE = "LABEL";

        SEQ889.text = "`";
        SEQ889.TYPE = "LITERAL3";

        SEQ890.text = "!";
        SEQ890.TYPE = "LITERAL3";

        SEQ891.text = ".";
        SEQ891.TYPE = "LITERAL3";

        SEQ892.text = ",";
        SEQ892.TYPE = "LITERAL3";

        SEQ893.text = ";";
        SEQ893.TYPE = "LITERAL3";

        SEQ894.text = "?";
        SEQ894.TYPE = "LITERAL3";

        SEQ895.text = ":";
        SEQ895.TYPE = "LITERAL3";

        SEQ896.text = "'";
        SEQ896.TYPE = "LITERAL3";

        SEQ897.text = "\"";
        SEQ897.TYPE = "LITERAL3";

        SEQ898.text = "\\";
        SEQ898.TYPE = "LITERAL3";

        SEQ899.text = "(";
        SEQ899.TYPE = "LITERAL4";

        SEQ900.text = ")";
        SEQ900.TYPE = "LITERAL4";

        SEQ901.text = "=";
        SEQ901.TYPE = "LITERAL4";

        SEQ902.text = "+";
        SEQ902.TYPE = "LITERAL4";

        SEQ903.text = "-";
        SEQ903.TYPE = "LITERAL4";

        SEQ904.text = ">";
        SEQ904.TYPE = "LITERAL4";

        SEQ905.text = "<";
        SEQ905.TYPE = "LITERAL4";

        SEQ906.text = "{";
        SEQ906.TYPE = "OPERATOR";

        SEQ907.text = "}";
        SEQ907.TYPE = "OPERATOR";

        SEQ908.text = "[";
        SEQ908.TYPE = "OPERATOR";

        SEQ909.text = "]";
        SEQ909.TYPE = "OPERATOR";

        SEQ910.text = "&";
        SEQ910.TYPE = "LITERAL1";

        SEQ911.text = "^";
        SEQ911.TYPE = "LITERAL1";

        SEQ912.text = "_";
        SEQ912.TYPE = "LITERAL1";

        SEQ913.text = "~";
        SEQ913.TYPE = "LITERAL1";

        SEQ_REGEXP55.text = "(\\d+?\\.\\d*pt|\\d*\\.\\d+?pt|\\d*pt)";
        SEQ_REGEXP55.HASH_CHARS = "0123456789.";
        SEQ_REGEXP55.TYPE = "LITERAL2";

        SEQ_REGEXP56.text = "(\\d+?\\.\\d*pc|\\d*\\.\\d+?pc|\\d*pc)";
        SEQ_REGEXP56.HASH_CHARS = "0123456789.";
        SEQ_REGEXP56.TYPE = "LITERAL2";

        SEQ_REGEXP57.text = "(\\d+?\\.\\d*in|\\d*\\.\\d+?in|\\d*in)";
        SEQ_REGEXP57.HASH_CHARS = "0123456789.";
        SEQ_REGEXP57.TYPE = "LITERAL2";

        SEQ_REGEXP58.text = "(\\d+?\\.\\d*bp|\\d*\\.\\d+?bp|\\d*bp)";
        SEQ_REGEXP58.HASH_CHARS = "0123456789.";
        SEQ_REGEXP58.TYPE = "LITERAL2";

        SEQ_REGEXP59.text = "(\\d+?\\.\\d*cm|\\d*\\.\\d+?cm|\\d*cm)";
        SEQ_REGEXP59.HASH_CHARS = "0123456789.";
        SEQ_REGEXP59.TYPE = "LITERAL2";

        SEQ_REGEXP60.text = "(\\d+?\\.\\d*mm|\\d*\\.\\d+?mm|\\d*mm)";
        SEQ_REGEXP60.HASH_CHARS = "0123456789.";
        SEQ_REGEXP60.TYPE = "LITERAL2";

        SEQ_REGEXP61.text = "(\\d+?\\.\\d*dd|\\d*\\.\\d+?dd|\\d*dd)";
        SEQ_REGEXP61.HASH_CHARS = "0123456789.";
        SEQ_REGEXP61.TYPE = "LITERAL2";

        SEQ_REGEXP62.text = "(\\d+?\\.\\d*cc|\\d*\\.\\d+?cc|\\d*cc)";
        SEQ_REGEXP62.HASH_CHARS = "0123456789.";
        SEQ_REGEXP62.TYPE = "LITERAL2";

        SEQ_REGEXP63.text = "(\\d+?\\.\\d*sp|\\d*\\.\\d+?sp|\\d*sp)";
        SEQ_REGEXP63.HASH_CHARS = "0123456789.";
        SEQ_REGEXP63.TYPE = "LITERAL2";

        SEQ_REGEXP64.text = "(\\d+?\\.\\d*ex|\\d*\\.\\d+?ex|\\d*ex)";
        SEQ_REGEXP64.HASH_CHARS = "0123456789.";
        SEQ_REGEXP64.TYPE = "LITERAL2";

        SEQ_REGEXP65.text = "(\\d+?\\.\\d*em|\\d*\\.\\d+?em|\\d*em)";
        SEQ_REGEXP65.HASH_CHARS = "0123456789.";
        SEQ_REGEXP65.TYPE = "LITERAL2";


        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, SEQ27, SEQ28, SEQ29, SEQ30, SEQ31, SEQ32, SEQ33, SEQ34, SEQ35, SEQ36, SEQ37, SEQ38, SEQ39, SEQ40, SEQ41, SEQ42, SEQ43, SEQ44, SEQ45, SEQ46, SEQ47, SEQ48, SEQ49, SEQ50, SEQ51, SEQ52, SEQ53, SEQ54, SEQ55, SEQ56, SEQ57, SEQ58, SEQ59, SEQ60, SEQ61, SEQ62, SEQ63, SEQ64, SEQ65, SEQ66, SEQ67, SEQ68, SEQ69, SEQ70, SEQ71, SEQ72, SEQ73, SEQ74, SEQ75, SEQ76, SEQ77, SEQ78, SEQ79, SEQ80, SEQ81, SEQ82, SEQ83, SEQ84, SEQ85, SEQ86, SEQ87, SEQ88, SEQ89, SEQ90, SEQ91, SEQ92, SEQ93, SEQ94, SEQ95, SEQ96, SEQ97, SEQ98, SEQ99, SEQ100, SEQ101, SEQ102, SEQ103, SEQ104, SEQ105, SEQ106, SEQ107, SEQ108, SEQ109, SEQ110, SEQ111, SEQ112, SEQ113, SEQ114, SEQ115, SEQ116, SEQ117, SEQ118, SEQ119, SEQ120, SEQ121, SEQ122, SEQ123, SEQ124, SEQ125, SEQ126, SEQ127, SEQ128, SEQ129, SEQ130, SEQ131, SEQ132, SEQ133, SEQ134, SEQ135, SEQ136, SEQ137, SEQ138, SEQ139, SEQ140, SEQ141, SEQ142, SEQ143, SEQ144, SEQ145, SEQ146, SEQ147, SEQ148, SEQ149, SEQ150, SEQ151, SEQ152, SEQ153, SEQ154, SEQ155, SEQ156, SEQ157, SEQ158, SEQ159, SEQ160, SEQ161, SEQ162, SEQ163, SEQ164, SEQ165, SEQ166, SEQ167, SEQ168, SEQ169, SEQ170, SEQ171, SEQ172, SEQ173, SEQ174, SEQ175, SEQ176, SEQ177, SEQ178, SEQ179, SEQ180, SEQ181, SEQ182, SEQ183, SEQ184, SEQ185, SEQ186, SEQ187, SEQ188, SEQ189, SEQ190, SEQ191, SEQ192, SEQ193, SEQ194, SEQ195, SEQ196, SEQ197, SEQ198, SEQ199, SEQ200, SEQ201, SEQ202, SEQ203, SEQ204, SEQ205, SEQ206, SEQ207, SEQ208, SEQ209, SEQ210, SEQ211, SEQ212, SEQ213, SEQ214, SEQ215, SEQ216, SEQ217, SEQ218, SEQ219, SEQ220, SEQ221, SEQ222, SEQ223, SEQ224, SEQ225, SEQ226, SEQ227, SEQ228, SEQ229, SEQ230, SEQ231, SEQ232, SEQ233, SEQ234, SEQ235, SEQ236, SEQ237, SEQ238, SEQ239, SEQ240, SEQ241, SEQ242, SEQ243, SEQ244, SEQ245, SEQ246, SEQ247, SEQ248, SEQ249, SEQ250, SEQ251, SEQ252, SEQ253, SEQ254, SEQ255, SEQ256, SEQ257, SEQ258, SEQ259, SEQ260, SEQ261, SEQ262, SEQ263, SEQ264, SEQ265, SEQ266, SEQ267, SEQ268, SEQ269, SEQ270, SEQ271, SEQ272, SEQ273, SEQ274, SEQ275, SEQ276, SEQ277, SEQ278, SEQ279, SEQ280, SEQ281, SEQ282, SEQ283, SEQ284, SEQ285, SEQ286, SEQ287, SEQ288, SEQ289, SEQ290, SEQ291, SEQ292, SEQ293, SEQ294, SEQ295, SEQ296, SEQ297, SEQ298, SEQ299, SEQ300, SEQ301, SEQ302, SEQ303, SEQ304, SEQ305, SEQ306, SEQ307, SEQ308, SEQ309, SEQ310, SEQ311, SEQ312, SEQ313, SEQ314, SEQ315, SEQ316, SEQ317, SEQ318, SEQ319, SEQ320, SEQ321, SEQ322, SEQ323, SEQ324, SEQ325, SEQ326, SEQ327, SEQ328, SEQ329, SEQ330, SEQ331, SEQ332, SEQ333, SEQ334, SEQ335, SEQ336, SEQ337, SEQ338, SEQ339, SEQ340, SEQ341, SEQ342, SEQ343, SEQ344, SEQ345, SEQ346, SEQ347, SEQ348, SEQ349, SEQ350, SEQ351, SEQ352, SEQ353, SEQ354, SEQ355, SEQ356, SEQ357, SEQ358, SEQ359, SEQ360, SEQ361, SEQ362, SEQ363, SEQ364, SEQ365, SEQ366, SEQ367, SEQ368, SEQ369, SEQ370, SEQ371, SEQ372, SEQ373, SEQ374, SEQ375, SEQ376, SEQ377, SEQ378, SEQ379, SEQ380, SEQ381, SEQ382, SEQ383, SEQ384, SEQ385, SEQ386, SEQ387, SEQ388, SEQ389, SEQ390, SEQ391, SEQ392, SEQ393, SEQ394, SEQ395, SEQ396, SEQ397, SEQ398, SEQ399, SEQ400, SEQ401, SEQ402, SEQ403, SEQ404, SEQ405, SEQ406, SEQ407, SEQ408, SEQ409, SEQ410, SEQ411, SEQ412, SEQ413, SEQ414, SEQ415, SEQ416, SEQ417, SEQ418, SEQ419, SEQ420, SEQ421, SEQ422, SEQ423, SEQ424, SEQ425, SEQ426, SEQ427, SEQ428, SEQ429, SEQ430, SEQ431, SEQ432, SEQ433, SEQ434, SEQ435, SEQ436, SEQ437, SEQ438, SEQ439, SEQ440, SEQ441, SEQ442, SEQ443, SEQ444, SEQ445, SEQ446, SEQ447, SEQ448, SEQ449, SEQ450, SEQ451, SEQ452, SEQ453, SEQ454, SEQ455, SEQ456, SEQ457, SEQ458, SEQ459, SEQ460, SEQ461, SEQ462, SEQ463, SEQ464, SEQ465, SEQ466, SEQ467, SEQ468, SEQ469, SEQ470, SEQ471, SEQ472, SEQ473, SEQ474, SEQ475, SEQ476, SEQ477, SEQ478, SEQ479, SEQ480, SEQ481, SEQ482, SEQ483, SEQ484, SEQ485, SEQ486, SEQ487, SEQ488, SEQ489, SEQ490, SEQ491, SEQ492, SEQ493, SEQ494, SEQ495, SEQ496, SEQ497, SEQ498, SEQ499, SEQ500, SEQ501, SEQ502, SEQ503, SEQ504, SEQ505, SEQ506, SEQ507, SEQ508, SEQ509, SEQ510, SEQ511, SEQ512, SEQ513, SEQ514, SEQ515, SEQ516, SEQ517, SEQ518, SEQ519, SEQ520, SEQ521, SEQ522, SEQ523, SEQ524, SEQ525, SEQ526, SEQ527, SEQ528, SEQ529, SEQ530, SEQ531, SEQ532, SEQ533, SEQ534, SEQ535, SEQ536, SEQ537, SEQ538, SEQ539, SEQ540, SEQ541, SEQ542, SEQ543, SEQ544, SEQ545, SEQ546, SEQ547, SEQ548, SEQ549, SEQ550, SEQ551, SEQ552, SEQ553, SEQ554, SEQ555, SEQ556, SEQ557, SEQ558, SEQ559, SEQ560, SEQ561, SEQ562, SEQ563, SEQ564, SEQ565, SEQ566, SEQ567, SEQ568, SEQ569, SEQ570, SEQ571, SEQ572, SEQ573, SEQ574, SEQ575, SEQ576, SEQ577, SEQ578, SEQ579, SEQ580, SEQ581, SEQ582, SEQ583, SEQ584, SEQ585, SEQ586, SEQ587, SEQ588, SEQ589, SEQ590, SEQ591, SEQ592, SEQ593, SEQ594, SEQ595, SEQ596, SEQ597, SEQ598, SEQ599, SEQ600, SEQ601, SEQ602, SEQ603, SEQ604, SEQ605, SEQ606, SEQ607, SEQ608, SEQ609, SEQ610, SEQ611, SEQ612, SEQ613, SEQ614, SEQ615, SEQ616, SEQ617, SEQ618, SEQ619, SEQ620, SEQ621, SEQ622, SEQ623, SEQ624, SEQ625, SEQ626, SEQ627, SEQ628, SEQ629, SEQ630, SEQ631, SEQ632, SEQ633, SEQ634, SEQ635, SEQ636, SEQ637, SEQ638, SEQ639, SEQ640, SEQ641, SEQ642, SEQ643, SEQ644, SEQ645, SEQ646, SEQ647, SEQ648, SEQ649, SEQ650, SEQ651, SEQ652, SEQ653, SEQ654, SEQ655, SEQ656, SEQ657, SEQ658, SEQ659, SEQ660, SEQ661, SEQ662, SEQ663, SEQ664, SEQ665, SEQ666, SEQ667, SEQ668, SEQ669, SEQ670, SEQ671, SEQ672, SEQ673, SEQ674, SEQ675, SEQ676, SEQ677, SEQ678, SEQ679, SEQ680, SEQ681, SEQ682, SEQ683, SEQ684, SEQ685, SEQ686, SEQ687, SEQ688, SEQ689, SEQ690, SEQ691, SEQ692, SEQ693, SEQ694, SEQ695, SEQ696, SEQ697, SEQ698, SEQ699, SEQ700, SEQ701, SEQ702, SEQ703, SEQ704, SEQ705, SEQ706, SEQ707, SEQ708, SEQ709, SEQ710, SEQ711, SEQ712, SEQ713, SEQ714, SEQ715, SEQ716, SEQ717, SEQ718, SEQ719, SEQ720, SEQ721, SEQ722, SEQ723, SEQ724, SEQ725, SEQ726, SEQ727, SEQ728, SEQ729, SEQ730, SEQ731, SEQ732, SEQ733, SEQ734, SEQ735, SEQ736, SEQ737, SEQ738, SEQ739, SEQ740, SEQ741, SEQ742, SEQ743, SEQ744, SEQ745, SEQ746, SEQ747, SEQ748, SEQ749, SEQ750, SEQ751, SEQ752, SEQ753, SEQ754, SEQ755, SEQ756, SEQ757, SEQ758, SEQ759, SEQ760, SEQ761, SEQ762, SEQ763, SEQ764, SEQ765, SEQ766, SEQ767, SEQ768, SEQ769, SEQ770, SEQ771, SEQ772, SEQ773, SEQ774, SEQ775, SEQ776, SEQ777, SEQ778, SEQ779, SEQ780, SEQ781, SEQ782, SEQ783, SEQ784, SEQ785, SEQ786, SEQ787, SEQ788, SEQ789, SEQ790, SEQ791, SEQ792, SEQ793, SEQ794, SEQ795, SEQ796, SEQ797, SEQ798, SEQ799, SEQ800, SEQ801, SEQ802, SEQ803, SEQ804, SEQ805, SEQ806, SEQ807, SEQ808, SEQ809, SEQ810, SEQ811, SEQ812, SEQ813, SEQ814, SEQ815, SEQ816, SEQ817, SEQ818, SEQ819, SEQ820, SEQ821, SEQ822, SEQ823, SEQ824, SEQ825, SEQ826, SEQ827, SEQ828, SEQ829, SEQ830, SEQ831, SEQ832, SEQ833, SEQ834, SEQ835, SEQ836, SEQ837, SEQ838, SEQ839, SEQ840, SEQ841, SEQ842, SEQ843, SEQ844, SEQ845, SEQ846, SEQ847, SEQ848, SEQ849, SEQ850, SEQ851, SEQ852, SEQ853, SEQ854, SEQ855, SEQ856, SEQ857, SEQ858, SEQ859, SEQ860, SEQ861, SEQ862, SEQ863, SEQ864, SEQ865, SEQ866, SEQ867, SEQ868, SEQ869, SEQ870, SEQ871, SEQ872, SEQ873, SEQ874, SEQ875, SEQ876, SEQ877, SEQ878, SEQ879, SEQ880, SEQ881, SEQ882, SEQ883, SEQ884, SEQ885, SEQ886, SEQ887, SEQ888, SEQ889, SEQ890, SEQ891, SEQ892, SEQ893, SEQ894, SEQ895, SEQ896, SEQ897, SEQ898, SEQ899, SEQ900, SEQ901, SEQ902, SEQ903, SEQ904, SEQ905, SEQ906, SEQ907, SEQ908, SEQ909, SEQ910, SEQ911, SEQ912, SEQ913, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}