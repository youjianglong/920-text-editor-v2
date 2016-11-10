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
public class RviewLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "{";
        PROPERTY1.NAME = "indentOpenBrackets";

        PROPERTY2.VALUE = "}";
        PROPERTY2.NAME = "indentCloseBrackets";

        PROPERTY3.VALUE = "/*";
        PROPERTY3.NAME = "commentStart";

        PROPERTY4.VALUE = "*/";
        PROPERTY4.NAME = "commentEnd";

        PROPERTY5.VALUE = "//";
        PROPERTY5.NAME = "lineComment";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "FALSE";

        SEQ1.text = "/**/";
        SEQ1.TYPE = "COMMENT1";

        SPAN1.TYPE = "COMMENT2";
        SPAN1.DELEGATE = "java::JAVADOC";

        BEGIN1.text = "/**";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";

        BEGIN2.text = "/*";

        END2.text = "*/";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL1";
        SPAN3.DELEGATE = "RVIEWSTMT";

        BEGIN3.text = "\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ SEQ2 = new SEQ();
        SEQ2.text = "}";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "{";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "=";
        SEQ4.TYPE = "OPERATOR";

        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ5.text = ")";
        SEQ5.TYPE = "OPERATOR";

        EOL_SPAN1.text = "//";
        EOL_SPAN1.TYPE = "COMMENT2";


        KEYWORDS1.add("KEYWORD3", new String[]{"boolean", "byte", "char", "double", "float", "int", "long", "short", "CHAR", "VARCHAR", "LONGVARCHAR", "NUMERIC", "DECIMAL", "BIT", "TINYINT", "SMALLINT", "INTEGER", "BIGINT", "REAL", "FLOAT", "DOUBLE", "BINARY", "VARBINARY", "LONGVARBINARY", "DATE", "TIME", "TIMESTAMP", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "RVIEWSTMT";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.ESCAPE = "\\";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL1";

        BEGIN1.text = "'";

        END1.text = "'";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "+";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "-";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "/";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "*";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "=";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = ">=";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "<=";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = ">";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "<";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "}";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "{";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "::";
        SEQ12.TYPE = "NULL";

        MARK_FOLLOWING1.text = ":";
        MARK_FOLLOWING1.TYPE = "LABEL";

        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ13.text = ")";
        SEQ13.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD3", new String[]{"CHAR", "VARCHAR", "LONGVARCHAR", "NUMERIC", "DECIMAL", "BIT", "TINYINT", "SMALLINT", "INTEGER", "BIGINT", "REAL", "FLOAT", "DOUBLE", "BINARY", "VARBINARY", "LONGVARBINARY", "DATE", "TIME", "TIMESTAMP", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}