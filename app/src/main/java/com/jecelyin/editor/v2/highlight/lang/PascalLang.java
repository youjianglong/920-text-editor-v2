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
public class PascalLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "{";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "}";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "//";
        PROPERTY3.NAME = "lineComment";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT3";

        BEGIN1.text = "{$";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT3";

        BEGIN2.text = "(*$";

        END2.text = "*)";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "COMMENT1";

        BEGIN3.text = "{";

        END3.text = "}";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "COMMENT1";

        BEGIN4.text = "(*";

        END4.text = "*)";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "//";
        EOL_SPAN1.TYPE = "COMMENT2";

        SPAN5.NO_LINE_BREAK = "TRUE";
        SPAN5.TYPE = "LITERAL1";

        BEGIN5.text = "'";

        END5.text = "'";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = ")";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "(";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "]";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "[";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = ".";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = ",";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = ";";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "^";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "@";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = ":=";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = ":";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "=";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "<>";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = ">";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "<";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = ">=";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "<=";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "+";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "-";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = "/";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "*";
        SEQ21.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD1", new String[]{"and", "array", "as", "at", "asm", "begin", "case", "class", "const", "constructor", "destructor", "dispinterface", "div", "do", "downto", "else", "end", "except", "exports", "file", "final", "finalization", "finally", "for", "function", "goto", "if", "implementation", "in", "inherited", "initialization", "inline", "interface", "is", "label", "mod", "not", "object", "of", "on", "or", "out", "packed", "procedure", "program", "property", "raise", "record", "repeat", "resourcestring", "set", "sealed", "shl", "shr", "static", "string", "then", "threadvar", "to", "try", "type", "unit", "unsafe", "until", "uses", "var", "while", "with", "xor", });
        KEYWORDS1.add("KEYWORD2", new String[]{"absolute", "abstract", "assembler", "automated", "cdecl", "contains", "default", "deprecated", "dispid", "dynamic", "export", "external", "far", "forward", "implements", "index", "library", "local", "message", "name", "namespaces", "near", "nodefault", "overload", "override", "package", "pascal", "platform", "private", "protected", "public", "published", "read", "readonly", "register", "reintroduce", "requires", "resident", "safecall", "stdcall", "stored", "varargs", "virtual", "write", "writeonly", });
        KEYWORDS1.add("KEYWORD3", new String[]{"shortint", "byte", "char", "smallint", "integer", "word", "longint", "cardinal", "boolean", "bytebool", "wordbool", "longbool", "real", "single", "double", "extended", "comp", "currency", "pointer", });
        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, };

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