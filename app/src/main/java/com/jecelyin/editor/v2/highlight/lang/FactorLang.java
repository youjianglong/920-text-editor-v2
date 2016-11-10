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
public class FactorLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "[{";
        PROPERTY1.NAME = "indentOpenBrackets";

        PROPERTY2.VALUE = "]}";
        PROPERTY2.NAME = "indentCloseBrackets";

        PROPERTY3.VALUE = "^(:|M:|C:|PREDICATE:)[^;]*";
        PROPERTY3.NAME = "indentNextLines";

        PROPERTY4.VALUE = "^.*;.*$";
        PROPERTY4.NAME = "unindentNextLines";

        PROPERTY5.VALUE = "true";
        PROPERTY5.NAME = "doubleBracketIndent";

        PROPERTY6.VALUE = "(";
        PROPERTY6.NAME = "commentStart";

        PROPERTY7.VALUE = ")";
        PROPERTY7.NAME = "commentEnd";

        PROPERTY8.VALUE = "!";
        PROPERTY8.NAME = "lineComment";

        PROPERTY9.VALUE = "+-*=><;.?/'()%,_|";
        PROPERTY9.NAME = "noWordSep";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "-?\\d+([./]\\d+)?";
        RULES1.IGNORE_CASE = "FALSE";
        RULES1.NO_WORD_SEP = "+-*=><;.?/'()%,_";

        EOL_SPAN1.text = "#!";
        EOL_SPAN1.AT_WORD_START = "TRUE";
        EOL_SPAN1.TYPE = "COMMENT2";
        EOL_SPAN1.DELEGATE = "COMMENT";

        EOL_SPAN2.text = "!";
        EOL_SPAN2.AT_WORD_START = "TRUE";
        EOL_SPAN2.TYPE = "COMMENT1";
        EOL_SPAN2.DELEGATE = "COMMENT";

        SEQ_REGEXP1.text = "\\\\\\s+(\\S+)";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "MARKUP";
        SEQ_REGEXP1.HASH_CHAR = "\\";

        SEQ_REGEXP2.text = ":\\s+(\\S+)";
        SEQ_REGEXP2.AT_WORD_START = "TRUE";
        SEQ_REGEXP2.TYPE = "MARKUP";
        SEQ_REGEXP2.HASH_CHAR = ":";

        SEQ_REGEXP3.text = "IN:\\s+(\\S+)";
        SEQ_REGEXP3.AT_WORD_START = "TRUE";
        SEQ_REGEXP3.TYPE = "MARKUP";
        SEQ_REGEXP3.HASH_CHAR = "IN:";

        SEQ_REGEXP4.text = "USE:\\s+(\\S+)";
        SEQ_REGEXP4.AT_WORD_START = "TRUE";
        SEQ_REGEXP4.TYPE = "MARKUP";
        SEQ_REGEXP4.HASH_CHAR = "USE:";

        SEQ_REGEXP5.text = "CHAR:\\s+(\\S+)";
        SEQ_REGEXP5.AT_WORD_START = "TRUE";
        SEQ_REGEXP5.TYPE = "LITERAL2";
        SEQ_REGEXP5.HASH_CHAR = "CHAR:";

        SEQ_REGEXP6.text = "BIN:\\s+(\\S+)";
        SEQ_REGEXP6.AT_WORD_START = "TRUE";
        SEQ_REGEXP6.TYPE = "LITERAL2";
        SEQ_REGEXP6.HASH_CHAR = "BIN:";

        SEQ_REGEXP7.text = "OCT:\\s+(\\S+)";
        SEQ_REGEXP7.AT_WORD_START = "TRUE";
        SEQ_REGEXP7.TYPE = "LITERAL2";
        SEQ_REGEXP7.HASH_CHAR = "OCT:";

        SEQ_REGEXP8.text = "HEX:\\s+(\\S+)";
        SEQ_REGEXP8.AT_WORD_START = "TRUE";
        SEQ_REGEXP8.TYPE = "LITERAL2";
        SEQ_REGEXP8.HASH_CHAR = "HEX:";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "COMMENT3";
        SPAN1.DELEGATE = "STACK_EFFECT";

        BEGIN1.text = "\\s+(";

        END1.text = ")";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";
        SPAN2.DELEGATE = "LITERAL";
        SPAN2.ESCAPE = "\\";

        BEGIN2.text = "SBUF\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL1";
        SPAN3.DELEGATE = "LITERAL";
        SPAN3.ESCAPE = "\\";

        BEGIN3.text = "\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "MARKUP";
        SPAN4.DELEGATE = "USING";

        BEGIN4.text = "USING:";

        END4.text = ";";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "[";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "]";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "{";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "}";
        SEQ4.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD1", new String[]{">r", "r>", });
        KEYWORDS1.add("LITERAL4", new String[]{"f", });
        KEYWORDS1.add("LITERAL3", new String[]{"t", });
        KEYWORDS1.add("COMMENT2", new String[]{"#!", });
        KEYWORDS1.add("COMMENT1", new String[]{"!", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, SEQ_REGEXP2, SEQ_REGEXP3, SEQ_REGEXP4, SEQ_REGEXP5, SEQ_REGEXP6, SEQ_REGEXP7, SEQ_REGEXP8, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "STACK_EFFECT";
        RULES1.DEFAULT = "COMMENT4";

        SEQ1.text = "--";
        SEQ1.TYPE = "COMMENT3";


        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LITERAL";
        RULES1.DEFAULT = "LITERAL1";

    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "COMMENT";
        RULES1.DEFAULT = "COMMENT1";

    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "USING";
        RULES1.DEFAULT = "LITERAL2";

    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}