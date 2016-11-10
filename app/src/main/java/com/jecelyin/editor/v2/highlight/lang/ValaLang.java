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
public class ValaLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "/*";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "*/";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "//";
        PROPERTY3.NAME = "lineComment";

        PROPERTY4.VALUE = "{";
        PROPERTY4.NAME = "indentOpenBrackets";

        PROPERTY5.VALUE = "}";
        PROPERTY5.NAME = "indentCloseBrackets";

        PROPERTY6.VALUE = "(";
        PROPERTY6.NAME = "unalignedOpenBrackets";

        PROPERTY7.VALUE = ")";
        PROPERTY7.NAME = "unalignedCloseBrackets";

        PROPERTY8.VALUE = "\\s*(((if|while)\\s*\\(|else\\s*|else\\s+if\\s*\\(|for\\s*\\(.*\\))[^{;]*)";
        PROPERTY8.NAME = "indentNextLine";

        PROPERTY9.VALUE = "^.*(default:\\s*|case.*:.*)$";
        PROPERTY9.NAME = "unindentThisLine";

        PROPERTY10.VALUE = ":";
        PROPERTY10.NAME = "electricKeys";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(0x[\\p{XDigit}]+[lL]?|[\\p{Digit}]+(e[\\p{Digit}]*)?[lLdDfF]?)";
        RULES1.IGNORE_CASE = "FALSE";

        SPAN1.TYPE = "COMMENT3";
        SPAN1.DELEGATE = "VALADOC";

        BEGIN1.text = "/**";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";

        BEGIN2.text = "/*";

        END2.text = "*/";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "//";
        EOL_SPAN1.TYPE = "COMMENT2";

        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL2";

        BEGIN3.text = "@\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.NO_LINE_BREAK = "FALSE";
        SPAN4.TYPE = "LITERAL3";

        BEGIN4.text = "\"\"\"";

        END4.text = "\"\"\"";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.NO_LINE_BREAK = "TRUE";
        SPAN5.TYPE = "LITERAL1";
        SPAN5.ESCAPE = "\\";

        BEGIN5.text = "\"";

        END5.text = "\"";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.NO_LINE_BREAK = "TRUE";
        SPAN6.TYPE = "LITERAL1";
        SPAN6.ESCAPE = "\\";

        BEGIN6.text = "'";

        END6.text = "'";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        EOL_SPAN EOL_SPAN2 = new EOL_SPAN();
        EOL_SPAN2.text = "#if";
        EOL_SPAN2.TYPE = "KEYWORD2";

        EOL_SPAN3.text = "#else";
        EOL_SPAN3.TYPE = "KEYWORD2";

        EOL_SPAN4.text = "#elif";
        EOL_SPAN4.TYPE = "KEYWORD2";

        EOL_SPAN5.text = "#endif";
        EOL_SPAN5.TYPE = "KEYWORD2";

        SEQ1.text = "~";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "!";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = ":";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = ";";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "{";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "}";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = ",";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = ".";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "!";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "[";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "]";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "+";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "-";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = ">";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "<";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "=";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "*";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "/";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "\\";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = "^";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "|";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "&";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = "%";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = "?";
        SEQ24.TYPE = "OPERATOR";

        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ25.text = ")";
        SEQ25.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "as", "async", "base", "break", "case", "catch", "const", "construct", "continue", "default", "delegate", "delete", "do", "dynamic", "else", "ensures", "extern", "finally", "for", "foreach", "get", "global", "if", "in", "inline", "internal", "is", "lock", "new", "out", "override", "owned", "private", "protected", "public", "ref", "requires", "return", "set", "signal", "sizeof", "static", "switch", "throw", "throws", "try", "typeof", "unowned", "value", "virtual", "weak", "while", "yield", });
        KEYWORDS1.add("KEYWORD2", new String[]{"using", "namespace", });
        KEYWORDS1.add("KEYWORD3", new String[]{"bool", "char", "class", "delegate", "double", "dynamic", "enum", "errordomain", "float", "int", "int8", "int16", "int32", "int64", "interface", "long", "short", "string", "struct", "uchar", "uint", "uint8", "uint16", "uint32", "uint64", "ulong", "unichar", "ushort", "var", "void", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, EOL_SPAN3, EOL_SPAN4, EOL_SPAN5, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "VALADOC";
        RULES1.DEFAULT = "COMMENT3";
        RULES1.IGNORE_CASE = "TRUE";

        SEQ1.text = "*";
        SEQ1.TYPE = "COMMENT3";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<!--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ SEQ2 = new SEQ();
        SEQ2.text = "<<";
        SEQ2.TYPE = "COMMENT3";

        SEQ3.text = "<=";
        SEQ3.TYPE = "COMMENT3";

        SEQ4.text = "<";
        SEQ4.TYPE = "COMMENT3";

        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";
        SPAN2.ESCAPE = "\\";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "MARKUP";
        SPAN3.DELEGATE = "xml::TAGS";

        BEGIN3.text = "<";

        END3.text = ">";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN_REGEXP SPAN_REGEXP1 = new SPAN_REGEXP();
        SPAN_REGEXP1.NO_WORD_BREAK = "FALSE";
        SPAN_REGEXP1.TYPE = "LABEL";
        SPAN_REGEXP1.DELEGATE = "VALADOC_PARAM";
        SPAN_REGEXP1.HASH_CHAR = "{@";

        BEGIN4.text = "\\{@(link|linkplain|docRoot|code|literal)\\s";

        END4.text = "}";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN_REGEXP SPAN_REGEXP2 = new SPAN_REGEXP();
        SPAN_REGEXP2.NO_WORD_BREAK = "FALSE";
        SPAN_REGEXP2.TYPE = "LABEL";
        SPAN_REGEXP2.DELEGATE = "VALADOC_PARAM";
        SPAN_REGEXP2.HASH_CHAR = "@version";

        BEGIN5.text = "@version\\s+\\$";

        END5.text = "$";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN_REGEXP SPAN_REGEXP3 = new SPAN_REGEXP();
        SPAN_REGEXP3.NO_WORD_BREAK = "FALSE";
        SPAN_REGEXP3.TYPE = "LABEL";
        SPAN_REGEXP3.DELEGATE = "VALADOC_PARAM";
        SPAN_REGEXP3.HASH_CHAR = "@";

        BEGIN6.text = "@(?:param|throws|exception|serialField)(\\s)";

        END6.text = "$1";


        SPAN_REGEXP3.BEGIN = new BEGIN[] { BEGIN6, };

        KEYWORDS KEYWORDS1 = new KEYWORDS();

        KEYWORDS1.add("KEYWORD2", new String[]{"@category", "@example", "@exclude", "@index", "@internal", "@obsolete", "@threadsafety", "@tutorial", "@todo", });
        KEYWORDS1.add("KEYWORD4", new String[]{"@access", "@beaninfo", "@bon", "@bug", "@complexity", "@design", "@ensures", "@equivalent", "@generates", "@guard", "@hides", "@history", "@idea", "@invariant", "@modifies", "@overrides", "@post", "@pre", "@references", "@requires", "@review", "@spec", "@uses", "@values", });
        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, SPAN_REGEXP3, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "VALADOC_PARAM";
        RULES1.DEFAULT = "COMMENT4";
        RULES1.IGNORE_CASE = "TRUE";

    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}