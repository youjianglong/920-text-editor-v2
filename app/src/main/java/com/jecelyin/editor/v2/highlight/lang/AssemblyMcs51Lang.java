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
public class AssemblyMcs51Lang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = ";";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = "true";
        PROPERTY2.NAME = "contextInsensitive";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "TRUE";

        EOL_SPAN1.text = ";";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL1";

        BEGIN1.text = "'";

        END1.text = "'";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "%%";
        MARK_FOLLOWING1.TYPE = "LABEL";
        MARK_FOLLOWING1.AT_LINE_START = "TRUE";
        MARK_FOLLOWING1.MATCH_TYPE = "OPERATOR";

        MARK_FOLLOWING2.text = "$";
        MARK_FOLLOWING2.TYPE = "KEYWORD2";
        MARK_FOLLOWING2.AT_LINE_START = "TRUE";

        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.TYPE = "LABEL";
        MARK_PREVIOUS1.AT_LINE_START = "TRUE";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ1.text = ",";
        SEQ1.TYPE = "NULL";

        SEQ2.text = ":";
        SEQ2.TYPE = "NULL";

        SEQ3.text = "(";
        SEQ3.TYPE = "NULL";

        SEQ4.text = ")";
        SEQ4.TYPE = "NULL";

        SEQ5.text = "]";
        SEQ5.TYPE = "NULL";

        SEQ6.text = "[";
        SEQ6.TYPE = "NULL";

        SEQ7.text = "$";
        SEQ7.TYPE = "NULL";

        SEQ8.text = "+";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "-";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "/";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "*";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "%";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "|";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "^";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "&";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "~";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "!";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "=";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "<";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = ">";
        SEQ20.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD2", new String[]{"$IF", "$ELSEIF", "$ELSE", "$ENDIF", "$MOD167", "$CASE", "$SEGMENTED", "$INCLUDE", "CODE", "XDATA", "DATA", "IDATA", "BIT", });
        KEYWORDS1.add("KEYWORD3", new String[]{"R0", "R1", "R2", "R3", "R4", "R5", "R6", "R7", "SP", "A", "C", "AB", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, MARK_FOLLOWING2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}