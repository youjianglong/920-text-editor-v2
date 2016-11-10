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
public class InformLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "!";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = ",+-=<>/?^&*";
        PROPERTY2.NAME = "wordBreakChars";

        PROPERTY3.VALUE = "{[";
        PROPERTY3.NAME = "indentOpenBrackets";

        PROPERTY4.VALUE = "}]";
        PROPERTY4.NAME = "indentCloseBrackets";

        PROPERTY5.VALUE = "\\s*(((if|while)\\s*\\(|else\\s*|else\\s+if\\s*\\(|for\\s*\\(.*\\))[^{;]*)";
        PROPERTY5.NAME = "indentNextLine";

        PROPERTY6.VALUE = "false";
        PROPERTY6.NAME = "doubleBracketIndent";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(\\$[\\p{XDigit}]|[\\p{Digit}])";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN1.text = "!";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "InformInnerText";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL2";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        EOL_SPAN EOL_SPAN2 = new EOL_SPAN();
        EOL_SPAN2.text = "#";
        EOL_SPAN2.TYPE = "KEYWORD2";

        EOL_SPAN3.text = "!";
        EOL_SPAN3.TYPE = "COMMENT1";

        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "==";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = ">=";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "<=";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "~=";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "+";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "-";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "$";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "/";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "*";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = ">";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "<";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "%";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "&";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "|";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "^";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "~";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "}";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "{";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = "]";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "[";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = ".&";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = ".#";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = "-->";
        SEQ24.TYPE = "OPERATOR";

        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ25.text = ")";
        SEQ25.TYPE = "OPERATOR";

        MARK_PREVIOUS2.text = "::";
        MARK_PREVIOUS2.TYPE = "FUNCTION";
        MARK_PREVIOUS2.MATCH_TYPE = "OPERATOR";

        MARK_PREVIOUS3.text = ":";
        MARK_PREVIOUS3.AT_WHITESPACE_END = "FALSE";
        MARK_PREVIOUS3.TYPE = "LABEL";
        MARK_PREVIOUS3.MATCH_TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD1", new String[]{"has", "hasnt", "in", "notin", "ofclass", "provides", "or", "break", "continue", "do", "until", "for", "give", "if", "else", "inversion", "jump", "move", "objectloop", "remove", "return", "rfalse", "rtrue", "string", "switch", "while", "with", });
        KEYWORDS1.add("INVALID", new String[]{"this", });
        KEYWORDS1.add("KEYWORD2", new String[]{"to", "on", "off", "roman", "bold", "underline", "reverse", "fixed", });
        KEYWORDS1.add("FUNCTION", new String[]{"new_line", "print", "print_ret", "box", "font", "quit", "read", "restore", "save", "spaces", "style", "score", "time", });
        KEYWORDS1.add("KEYWORD3", new String[]{"Abbreviate", "Array", "Attribute", "Class", "Constant", "Default", "End", "Endif", "Extend", "Global", "Ifdef", "Ifndef", "Ifnot", "Iftrue", "Iffalse", "Import", "Include", "Link", "Lowstring", "Message", "Object", "Property", "Replace", "Serial", "Switches", "Statusline", "System_file", "Verb", "private", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, MARK_PREVIOUS2, MARK_PREVIOUS3, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, EOL_SPAN3, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "InformInnerText";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.IGNORE_CASE = "FALSE";

        SEQ1.text = "^";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "~";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "@";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "\\";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "@@";
        SEQ5.TYPE = "LITERAL2";


        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}