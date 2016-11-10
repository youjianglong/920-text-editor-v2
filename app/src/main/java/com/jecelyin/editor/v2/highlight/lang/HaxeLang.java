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
public class HaxeLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "{";
        PROPERTY1.NAME = "indentOpenBrackets";

        PROPERTY2.VALUE = "}";
        PROPERTY2.NAME = "indentCloseBrackets";

        PROPERTY3.VALUE = "\\s*(if|while)\\s*(|else|case|default:)[^;]*|for\\s*\\(.*)";
        PROPERTY3.NAME = "indentPrevLine";

        PROPERTY4.VALUE = "false";
        PROPERTY4.NAME = "doubleBracketIndent";

        PROPERTY5.VALUE = "true";
        PROPERTY5.NAME = "lineUpClosingBracket";

        PROPERTY6.VALUE = "/*";
        PROPERTY6.NAME = "commentStart";

        PROPERTY7.VALUE = "*/";
        PROPERTY7.NAME = "commentEnd";

        PROPERTY8.VALUE = "//";
        PROPERTY8.NAME = "lineComment";

        PROPERTY9.VALUE = "+-.,=<>/?^&*";
        PROPERTY9.NAME = "wordBreakChars";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(0x[[:xdigit:]]+|[[:digit:]]+((E|e|)[[:digit:]]*)?)";
        RULES1.ESCAPE = "\\\\";
        RULES1.IGNORE_CASE = "FALSE";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "/*";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL1";

        BEGIN3.text = "'";

        END3.text = "'";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        MARK_PREVIOUS MARK_PREVIOUS1 = new MARK_PREVIOUS();
        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "CONTEXT";

        MARK_PREVIOUS2.text = "(";
        MARK_PREVIOUS2.TYPE = "FUNCTION";
        MARK_PREVIOUS2.MATCH_TYPE = "CONTEXT";

        EOL_SPAN1.text = "//";
        EOL_SPAN1.TYPE = "COMMENT1";

        EOL_SPAN2.text = "#";
        EOL_SPAN2.TYPE = "COMMENT3";

        SEQ_REGEXP1.text = "~([[:punct:]])(?:.*?[^\\\\])*?\\1[sgiexom]*";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "MARKUP";
        SEQ_REGEXP1.HASH_CHAR = "~";

        SEQ1.text = ")";
        SEQ1.TYPE = "NULL";

        SEQ2.text = "(";
        SEQ2.TYPE = "NULL";

        SEQ3.text = "=";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "!";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "+";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "-";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "/";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "*";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = ">";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "<";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "%";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "&";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "|";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "^";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "~";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = ".";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "}";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "{";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = ",";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = ";";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "]";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "[";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = "?";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = ":";
        SEQ24.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD1", new String[]{"break", "case", "catch", "continue", "default", "never", "do", "else", "for", "if", "in", "return", "switch", "throw", "try", "while", });
        KEYWORDS1.add("KEYWORD2", new String[]{"class", "enum", "extends", "extern", "function", "implements", "import", "using", "interface", "inline", "override", "package", "private", "public", "static", "typedef", "using", "var", "dynamic", });
        KEYWORDS1.add("KEYWORD3", new String[]{"ArrayAccess", "Array", "Bool", "Dynamic", "Float", "Int", "Iterator", "Iterable", "Null", "Object", "String", "UInt", "Void", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, MARK_PREVIOUS2, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, };

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