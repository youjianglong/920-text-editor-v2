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
public class TyposcriptLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "#";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = "/";
        PROPERTY2.NAME = "lineComment";

        PROPERTY3.VALUE = "/*";
        PROPERTY3.NAME = "commentStart";

        PROPERTY4.VALUE = "*/";
        PROPERTY4.NAME = "commentEnd";

        PROPERTY5.VALUE = "({";
        PROPERTY5.NAME = "indentOpenBrackets";

        PROPERTY6.VALUE = ")}";
        PROPERTY6.NAME = "indentCloseBrackets";

        PROPERTY7.VALUE = "true";
        PROPERTY7.NAME = "lineUpClosingBracket";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "FALSE";
        RULES1.DEFAULT = "MARKUP";
        RULES1.IGNORE_CASE = "FALSE";
        RULES1.NO_WORD_SEP = ":";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "KEYWORD4";
        SPAN1.AT_LINE_START = "TRUE";

        BEGIN1.text = "<INCLUDE";

        END1.text = ">";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "=";
        EOL_SPAN1.AT_WHITESPACE_END = "FALSE";
        EOL_SPAN1.TYPE = "OPERATOR";
        EOL_SPAN1.AT_LINE_START = "FALSE";
        EOL_SPAN1.DELEGATE = "typoscript::assignment";

        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "OPERATOR";
        SPAN2.AT_LINE_START = "FALSE";
        SPAN2.DELEGATE = "typoscript::assignment";

        BEGIN2.text = "(";

        END2.text = ")";
        END2.AT_WHITESPACE_END = "TRUE";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        EOL_SPAN EOL_SPAN2 = new EOL_SPAN();
        EOL_SPAN2.text = "<";
        EOL_SPAN2.TYPE = "OPERATOR";
        EOL_SPAN2.AT_LINE_START = "FALSE";
        EOL_SPAN2.DELEGATE = "typoscript::copy";

        EOL_SPAN3.text = "#";
        EOL_SPAN3.AT_WORD_START = "TRUE";
        EOL_SPAN3.TYPE = "COMMENT4";

        SPAN3.NO_LINE_BREAK = "FALSE";
        SPAN3.TYPE = "COMMENT1";
        SPAN3.AT_LINE_START = "TRUE";

        BEGIN3.text = "/*";

        END3.text = "*/";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        EOL_SPAN EOL_SPAN4 = new EOL_SPAN();
        EOL_SPAN4.text = "/";
        EOL_SPAN4.AT_WORD_START = "TRUE";
        EOL_SPAN4.TYPE = "COMMENT2";

        SPAN4.AT_WORD_START = "TRUE";
        SPAN4.NO_LINE_BREAK = "TRUE";
        SPAN4.TYPE = "KEYWORD1";

        BEGIN4.text = "[";

        END4.text = "]";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "{";
        SEQ1.TYPE = "NULL";

        SEQ2.text = "}";
        SEQ2.TYPE = "NULL";

        SEQ3.text = "(";
        SEQ3.TYPE = "NULL";

        SEQ4.text = ")";
        SEQ4.TYPE = "NULL";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "assignment";
        RULES1.HIGHLIGHT_DIGITS = "FALSE";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.IGNORE_CASE = "FALSE";

        SPAN1.AT_WORD_START = "FALSE";
        SPAN1.TYPE = "LABEL";
        SPAN1.AT_LINE_START = "FALSE";

        BEGIN1.text = "{$";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "copy";
        RULES1.HIGHLIGHT_DIGITS = "FALSE";
        RULES1.DEFAULT = "KEYWORD2";
        RULES1.IGNORE_CASE = "FALSE";

    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}