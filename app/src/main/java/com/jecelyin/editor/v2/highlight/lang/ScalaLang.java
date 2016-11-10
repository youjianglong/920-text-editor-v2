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
public class ScalaLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "{";
        PROPERTY1.NAME = "indentOpenBrackets";

        PROPERTY2.VALUE = "}";
        PROPERTY2.NAME = "indentCloseBrackets";

        PROPERTY3.VALUE = "true";
        PROPERTY3.NAME = "lineUpClosingBracket";

        PROPERTY4.VALUE = "(.*((if|while|else\\s+if|for)\\s*\\().*\\)|\\s*else|\\s*case.*=>|.*(def|val|var|type).*=)\\s*$";
        PROPERTY4.NAME = "indentNextLine";

        PROPERTY5.VALUE = "false";
        PROPERTY5.NAME = "doubleBracketIndent";

        PROPERTY6.VALUE = "/*";
        PROPERTY6.NAME = "commentStart";

        PROPERTY7.VALUE = "*/";
        PROPERTY7.NAME = "commentEnd";

        PROPERTY8.VALUE = "//";
        PROPERTY8.NAME = "lineComment";

        PROPERTY9.VALUE = "true";
        PROPERTY9.NAME = "noTabs";

        PROPERTY10.VALUE = "2";
        PROPERTY10.NAME = "tabSize";

        PROPERTY11.VALUE = "2";
        PROPERTY11.NAME = "indentSize";

        PROPERTY12.VALUE = ",+-=<>/?^&*";
        PROPERTY12.NAME = "wordBreakChars";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(0[lL]?|[1-9]\\d{0,9}(\\d{0,9}[lL])?|0[xX]\\p{XDigit}{1,8}(\\p{XDigit}{0,8}[lL])?|0[0-7]{1,11}([0-7]{0,11}[lL])?|([0-9]+\\.[0-9]*|\\.[0-9]+)([eE][+-]?[0-9]+)?[fFdD]?|[0-9]+([eE][+-]?[0-9]+[fFdD]?|([eE][+-]?[0-9]+)?[fFdD]))";
        RULES1.IGNORE_CASE = "FALSE";

        MARK_FOLLOWING1.text = "@";
        MARK_FOLLOWING1.TYPE = "LABEL";

        IMPORT1.DELEGATE = "PRIMARY";


        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "PRIMARY";

        SEQ1.text = "/**/";
        SEQ1.TYPE = "COMMENT1";

        EOL_SPAN1.text = "//";
        EOL_SPAN1.TYPE = "COMMENT2";

        SPAN1.TYPE = "COMMENT3";
        SPAN1.DELEGATE = "SCALADOC";

        BEGIN1.text = "/**";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";
        SPAN2.DELEGATE = "COMMENT_BLOCK";

        BEGIN2.text = "/*";

        END2.text = "*/";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.DELEGATE = "MAIN";
        SPAN3.MATCH_TYPE = "NULL";

        BEGIN3.text = "{";

        END3.text = "}";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "XML_SHARED";

        SPAN_REGEXP1.NO_LINE_BREAK = "FALSE";
        SPAN_REGEXP1.DELEGATE = "STRING";
        SPAN_REGEXP1.ESCAPE = "";
        SPAN_REGEXP1.MATCH_TYPE = "LITERAL1";

        BEGIN4.text = "[0-9a-zA-Z><=+]([0-9a-zA-Z><=+]|_[0-9a-zA-Z><=+])*\"\"\"";

        END4.text = "\"\"\"";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN_REGEXP SPAN_REGEXP2 = new SPAN_REGEXP();
        SPAN_REGEXP2.NO_LINE_BREAK = "FALSE";
        SPAN_REGEXP2.DELEGATE = "STRING";
        SPAN_REGEXP2.ESCAPE = "\\";
        SPAN_REGEXP2.MATCH_TYPE = "LITERAL1";

        BEGIN5.text = "[0-9a-zA-Z><=+]([0-9a-zA-Z><=+]|_[0-9a-zA-Z><=+])*\"";

        END5.text = "\"";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN4 = new SPAN();
        SPAN4.NO_LINE_BREAK = "FALSE";
        SPAN4.TYPE = "LITERAL1";
        SPAN4.ESCAPE = "";

        BEGIN6.text = "\"\"\"";

        END6.text = "\"\"\"";


        SPAN4.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN5 = new SPAN();
        SPAN5.NO_LINE_BREAK = "TRUE";
        SPAN5.TYPE = "LITERAL1";
        SPAN5.ESCAPE = "\\";

        BEGIN7.text = "\"";

        END7.text = "\"";


        SPAN5.BEGIN = new BEGIN[] { BEGIN7, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "'([^'\\\\]|\\\\.)'";
        SEQ_REGEXP1.TYPE = "LITERAL1";
        SEQ_REGEXP1.HASH_CHAR = "'";

        SEQ_REGEXP2.text = "'[0-9a-zA-Z><=+]([0-9a-zA-Z><=+]|_[0-9a-zA-Z><=+])*";
        SEQ_REGEXP2.TYPE = "LABEL";
        SEQ_REGEXP2.HASH_CHAR = "'";

        SPAN6.DELEGATE = "TYPE_PARAMS";
        SPAN6.MATCH_TYPE = "LITERAL3";

        BEGIN8.text = "[";

        END8.text = "]";


        SPAN6.BEGIN = new BEGIN[] { BEGIN8, };

        SPAN SPAN7 = new SPAN();
        SPAN7.MATCH_TYPE = "NULL";

        BEGIN9.text = "`";

        END9.text = "`";


        SPAN7.BEGIN = new BEGIN[] { BEGIN9, };

        SEQ SEQ2 = new SEQ();
        SEQ2.text = "(";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = ")";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "}";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "{";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = ".";
        SEQ6.TYPE = "NULL";

        SEQ7.text = ",";
        SEQ7.TYPE = "NULL";

        SEQ8.text = ";";
        SEQ8.TYPE = "NULL";

        SEQ9.text = ":";
        SEQ9.TYPE = "NULL";

        EOL_SPAN2.text = "import";
        EOL_SPAN2.DELEGATE = "TYPE";
        EOL_SPAN2.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING1.text = "def";
        MARK_FOLLOWING1.AT_WORD_START = "TRUE";
        MARK_FOLLOWING1.TYPE = "FUNCTION";
        MARK_FOLLOWING1.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING2.text = "def";
        MARK_FOLLOWING2.AT_WORD_START = "TRUE";
        MARK_FOLLOWING2.TYPE = "FUNCTION";
        MARK_FOLLOWING2.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING3.text = "def";
        MARK_FOLLOWING3.AT_WORD_START = "TRUE";
        MARK_FOLLOWING3.TYPE = "FUNCTION";
        MARK_FOLLOWING3.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING4.text = "def";
        MARK_FOLLOWING4.AT_WORD_START = "TRUE";
        MARK_FOLLOWING4.TYPE = "FUNCTION";
        MARK_FOLLOWING4.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING5.text = "def";
        MARK_FOLLOWING5.AT_WORD_START = "TRUE";
        MARK_FOLLOWING5.TYPE = "FUNCTION";
        MARK_FOLLOWING5.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING6.text = "def";
        MARK_FOLLOWING6.AT_WORD_START = "TRUE";
        MARK_FOLLOWING6.TYPE = "FUNCTION";
        MARK_FOLLOWING6.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING7.text = "def";
        MARK_FOLLOWING7.AT_WORD_START = "TRUE";
        MARK_FOLLOWING7.TYPE = "FUNCTION";
        MARK_FOLLOWING7.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING8.text = "class";
        MARK_FOLLOWING8.AT_WORD_START = "TRUE";
        MARK_FOLLOWING8.TYPE = "KEYWORD3";
        MARK_FOLLOWING8.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING9.text = "class";
        MARK_FOLLOWING9.AT_WORD_START = "TRUE";
        MARK_FOLLOWING9.TYPE = "KEYWORD3";
        MARK_FOLLOWING9.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING10.text = "class";
        MARK_FOLLOWING10.AT_WORD_START = "TRUE";
        MARK_FOLLOWING10.TYPE = "KEYWORD3";
        MARK_FOLLOWING10.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING11.text = "class";
        MARK_FOLLOWING11.AT_WORD_START = "TRUE";
        MARK_FOLLOWING11.TYPE = "KEYWORD3";
        MARK_FOLLOWING11.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING12.text = "class";
        MARK_FOLLOWING12.AT_WORD_START = "TRUE";
        MARK_FOLLOWING12.TYPE = "KEYWORD3";
        MARK_FOLLOWING12.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING13.text = "class";
        MARK_FOLLOWING13.AT_WORD_START = "TRUE";
        MARK_FOLLOWING13.TYPE = "KEYWORD3";
        MARK_FOLLOWING13.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING14.text = "class";
        MARK_FOLLOWING14.AT_WORD_START = "TRUE";
        MARK_FOLLOWING14.TYPE = "KEYWORD3";
        MARK_FOLLOWING14.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING15.text = "case class";
        MARK_FOLLOWING15.AT_WORD_START = "TRUE";
        MARK_FOLLOWING15.TYPE = "KEYWORD3";
        MARK_FOLLOWING15.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING16.text = "case class";
        MARK_FOLLOWING16.AT_WORD_START = "TRUE";
        MARK_FOLLOWING16.TYPE = "KEYWORD3";
        MARK_FOLLOWING16.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING17.text = "case class";
        MARK_FOLLOWING17.AT_WORD_START = "TRUE";
        MARK_FOLLOWING17.TYPE = "KEYWORD3";
        MARK_FOLLOWING17.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING18.text = "case class";
        MARK_FOLLOWING18.AT_WORD_START = "TRUE";
        MARK_FOLLOWING18.TYPE = "KEYWORD3";
        MARK_FOLLOWING18.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING19.text = "case class";
        MARK_FOLLOWING19.AT_WORD_START = "TRUE";
        MARK_FOLLOWING19.TYPE = "KEYWORD3";
        MARK_FOLLOWING19.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING20.text = "case class";
        MARK_FOLLOWING20.AT_WORD_START = "TRUE";
        MARK_FOLLOWING20.TYPE = "KEYWORD3";
        MARK_FOLLOWING20.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING21.text = "case class";
        MARK_FOLLOWING21.AT_WORD_START = "TRUE";
        MARK_FOLLOWING21.TYPE = "KEYWORD3";
        MARK_FOLLOWING21.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING22.text = "new";
        MARK_FOLLOWING22.AT_WORD_START = "TRUE";
        MARK_FOLLOWING22.TYPE = "KEYWORD3";
        MARK_FOLLOWING22.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING23.text = "new";
        MARK_FOLLOWING23.AT_WORD_START = "TRUE";
        MARK_FOLLOWING23.TYPE = "KEYWORD3";
        MARK_FOLLOWING23.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING24.text = "new";
        MARK_FOLLOWING24.AT_WORD_START = "TRUE";
        MARK_FOLLOWING24.TYPE = "KEYWORD3";
        MARK_FOLLOWING24.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING25.text = "new";
        MARK_FOLLOWING25.AT_WORD_START = "TRUE";
        MARK_FOLLOWING25.TYPE = "KEYWORD3";
        MARK_FOLLOWING25.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING26.text = "new";
        MARK_FOLLOWING26.AT_WORD_START = "TRUE";
        MARK_FOLLOWING26.TYPE = "KEYWORD3";
        MARK_FOLLOWING26.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING27.text = "new";
        MARK_FOLLOWING27.AT_WORD_START = "TRUE";
        MARK_FOLLOWING27.TYPE = "KEYWORD3";
        MARK_FOLLOWING27.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING28.text = "new";
        MARK_FOLLOWING28.AT_WORD_START = "TRUE";
        MARK_FOLLOWING28.TYPE = "KEYWORD3";
        MARK_FOLLOWING28.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING29.text = "object";
        MARK_FOLLOWING29.AT_WORD_START = "TRUE";
        MARK_FOLLOWING29.TYPE = "KEYWORD3";
        MARK_FOLLOWING29.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING30.text = "object";
        MARK_FOLLOWING30.AT_WORD_START = "TRUE";
        MARK_FOLLOWING30.TYPE = "KEYWORD3";
        MARK_FOLLOWING30.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING31.text = "object";
        MARK_FOLLOWING31.AT_WORD_START = "TRUE";
        MARK_FOLLOWING31.TYPE = "KEYWORD3";
        MARK_FOLLOWING31.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING32.text = "object";
        MARK_FOLLOWING32.AT_WORD_START = "TRUE";
        MARK_FOLLOWING32.TYPE = "KEYWORD3";
        MARK_FOLLOWING32.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING33.text = "object";
        MARK_FOLLOWING33.AT_WORD_START = "TRUE";
        MARK_FOLLOWING33.TYPE = "KEYWORD3";
        MARK_FOLLOWING33.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING34.text = "object";
        MARK_FOLLOWING34.AT_WORD_START = "TRUE";
        MARK_FOLLOWING34.TYPE = "KEYWORD3";
        MARK_FOLLOWING34.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING35.text = "object";
        MARK_FOLLOWING35.AT_WORD_START = "TRUE";
        MARK_FOLLOWING35.TYPE = "KEYWORD3";
        MARK_FOLLOWING35.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING36.text = "case object";
        MARK_FOLLOWING36.AT_WORD_START = "TRUE";
        MARK_FOLLOWING36.TYPE = "KEYWORD3";
        MARK_FOLLOWING36.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING37.text = "case object";
        MARK_FOLLOWING37.AT_WORD_START = "TRUE";
        MARK_FOLLOWING37.TYPE = "KEYWORD3";
        MARK_FOLLOWING37.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING38.text = "case object";
        MARK_FOLLOWING38.AT_WORD_START = "TRUE";
        MARK_FOLLOWING38.TYPE = "KEYWORD3";
        MARK_FOLLOWING38.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING39.text = "case object";
        MARK_FOLLOWING39.AT_WORD_START = "TRUE";
        MARK_FOLLOWING39.TYPE = "KEYWORD3";
        MARK_FOLLOWING39.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING40.text = "case object";
        MARK_FOLLOWING40.AT_WORD_START = "TRUE";
        MARK_FOLLOWING40.TYPE = "KEYWORD3";
        MARK_FOLLOWING40.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING41.text = "case object";
        MARK_FOLLOWING41.AT_WORD_START = "TRUE";
        MARK_FOLLOWING41.TYPE = "KEYWORD3";
        MARK_FOLLOWING41.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING42.text = "case object";
        MARK_FOLLOWING42.AT_WORD_START = "TRUE";
        MARK_FOLLOWING42.TYPE = "KEYWORD3";
        MARK_FOLLOWING42.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING43.text = "trait";
        MARK_FOLLOWING43.AT_WORD_START = "TRUE";
        MARK_FOLLOWING43.TYPE = "KEYWORD3";
        MARK_FOLLOWING43.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING44.text = "trait";
        MARK_FOLLOWING44.AT_WORD_START = "TRUE";
        MARK_FOLLOWING44.TYPE = "KEYWORD3";
        MARK_FOLLOWING44.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING45.text = "trait";
        MARK_FOLLOWING45.AT_WORD_START = "TRUE";
        MARK_FOLLOWING45.TYPE = "KEYWORD3";
        MARK_FOLLOWING45.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING46.text = "trait";
        MARK_FOLLOWING46.AT_WORD_START = "TRUE";
        MARK_FOLLOWING46.TYPE = "KEYWORD3";
        MARK_FOLLOWING46.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING47.text = "trait";
        MARK_FOLLOWING47.AT_WORD_START = "TRUE";
        MARK_FOLLOWING47.TYPE = "KEYWORD3";
        MARK_FOLLOWING47.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING48.text = "trait";
        MARK_FOLLOWING48.AT_WORD_START = "TRUE";
        MARK_FOLLOWING48.TYPE = "KEYWORD3";
        MARK_FOLLOWING48.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING49.text = "trait";
        MARK_FOLLOWING49.AT_WORD_START = "TRUE";
        MARK_FOLLOWING49.TYPE = "KEYWORD3";
        MARK_FOLLOWING49.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING50.text = "extends";
        MARK_FOLLOWING50.AT_WORD_START = "TRUE";
        MARK_FOLLOWING50.TYPE = "KEYWORD4";
        MARK_FOLLOWING50.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING51.text = "extends";
        MARK_FOLLOWING51.AT_WORD_START = "TRUE";
        MARK_FOLLOWING51.TYPE = "KEYWORD4";
        MARK_FOLLOWING51.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING52.text = "extends";
        MARK_FOLLOWING52.AT_WORD_START = "TRUE";
        MARK_FOLLOWING52.TYPE = "KEYWORD4";
        MARK_FOLLOWING52.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING53.text = "extends";
        MARK_FOLLOWING53.AT_WORD_START = "TRUE";
        MARK_FOLLOWING53.TYPE = "KEYWORD4";
        MARK_FOLLOWING53.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING54.text = "extends";
        MARK_FOLLOWING54.AT_WORD_START = "TRUE";
        MARK_FOLLOWING54.TYPE = "KEYWORD4";
        MARK_FOLLOWING54.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING55.text = "extends";
        MARK_FOLLOWING55.AT_WORD_START = "TRUE";
        MARK_FOLLOWING55.TYPE = "KEYWORD4";
        MARK_FOLLOWING55.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING56.text = "extends";
        MARK_FOLLOWING56.AT_WORD_START = "TRUE";
        MARK_FOLLOWING56.TYPE = "KEYWORD4";
        MARK_FOLLOWING56.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING57.text = "with";
        MARK_FOLLOWING57.AT_WORD_START = "TRUE";
        MARK_FOLLOWING57.TYPE = "KEYWORD4";
        MARK_FOLLOWING57.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING58.text = "with";
        MARK_FOLLOWING58.AT_WORD_START = "TRUE";
        MARK_FOLLOWING58.TYPE = "KEYWORD4";
        MARK_FOLLOWING58.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING59.text = "with";
        MARK_FOLLOWING59.AT_WORD_START = "TRUE";
        MARK_FOLLOWING59.TYPE = "KEYWORD4";
        MARK_FOLLOWING59.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING60.text = "with";
        MARK_FOLLOWING60.AT_WORD_START = "TRUE";
        MARK_FOLLOWING60.TYPE = "KEYWORD4";
        MARK_FOLLOWING60.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING61.text = "with";
        MARK_FOLLOWING61.AT_WORD_START = "TRUE";
        MARK_FOLLOWING61.TYPE = "KEYWORD4";
        MARK_FOLLOWING61.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING62.text = "with";
        MARK_FOLLOWING62.AT_WORD_START = "TRUE";
        MARK_FOLLOWING62.TYPE = "KEYWORD4";
        MARK_FOLLOWING62.MATCH_TYPE = "KEYWORD1";

        MARK_FOLLOWING63.text = "with";
        MARK_FOLLOWING63.AT_WORD_START = "TRUE";
        MARK_FOLLOWING63.TYPE = "KEYWORD4";
        MARK_FOLLOWING63.MATCH_TYPE = "KEYWORD1";

        SPAN8.AT_WORD_START = "TRUE";
        SPAN8.NO_LINE_BREAK = "FALSE";
        SPAN8.DELEGATE = "PATTERN";
        SPAN8.MATCH_TYPE = "KEYWORD1";

        BEGIN10.text = "case";

        END10.text = "=>";


        SPAN8.BEGIN = new BEGIN[] { BEGIN10, };

        SPAN SPAN9 = new SPAN();
        SPAN9.AT_WORD_START = "TRUE";
        SPAN9.NO_LINE_BREAK = "TRUE";
        SPAN9.DELEGATE = "PATTERN";
        SPAN9.MATCH_TYPE = "KEYWORD1";

        BEGIN11.text = "val";

        END11.text = "=";


        SPAN9.BEGIN = new BEGIN[] { BEGIN11, };

        KEYWORDS KEYWORDS1 = new KEYWORDS();

        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "case", "catch", "class", "def", "do", "else", "extends", "final", "finally", "for", "forSome", "if", "implicit", "import", "lazy", "macro", "match", "new", "object", "override", "package", "private", "protected", "requires", "return", "sealed", "throw", "trait", "try", "type", "val", "var", "with", "while", "yield", "=>", });
        KEYWORDS1.add("INVALID", new String[]{"???", "then", });
        KEYWORDS1.add("KEYWORD2", new String[]{"Character", "Integer", "Boolean", "Byte", "Char", "Double", "Float", "Int", "Long", "Short", "Unit", });
        KEYWORDS1.add("KEYWORD3", new String[]{"Any", "AnyRef", "Nothing", });
        RULES1.IMPORT = new IMPORT[] { IMPORT1, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, SEQ_REGEXP2, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, SPAN7, SPAN8, SPAN9, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, MARK_FOLLOWING2, MARK_FOLLOWING3, MARK_FOLLOWING4, MARK_FOLLOWING5, MARK_FOLLOWING6, MARK_FOLLOWING7, MARK_FOLLOWING8, MARK_FOLLOWING9, MARK_FOLLOWING10, MARK_FOLLOWING11, MARK_FOLLOWING12, MARK_FOLLOWING13, MARK_FOLLOWING14, MARK_FOLLOWING15, MARK_FOLLOWING16, MARK_FOLLOWING17, MARK_FOLLOWING18, MARK_FOLLOWING19, MARK_FOLLOWING20, MARK_FOLLOWING21, MARK_FOLLOWING22, MARK_FOLLOWING23, MARK_FOLLOWING24, MARK_FOLLOWING25, MARK_FOLLOWING26, MARK_FOLLOWING27, MARK_FOLLOWING28, MARK_FOLLOWING29, MARK_FOLLOWING30, MARK_FOLLOWING31, MARK_FOLLOWING32, MARK_FOLLOWING33, MARK_FOLLOWING34, MARK_FOLLOWING35, MARK_FOLLOWING36, MARK_FOLLOWING37, MARK_FOLLOWING38, MARK_FOLLOWING39, MARK_FOLLOWING40, MARK_FOLLOWING41, MARK_FOLLOWING42, MARK_FOLLOWING43, MARK_FOLLOWING44, MARK_FOLLOWING45, MARK_FOLLOWING46, MARK_FOLLOWING47, MARK_FOLLOWING48, MARK_FOLLOWING49, MARK_FOLLOWING50, MARK_FOLLOWING51, MARK_FOLLOWING52, MARK_FOLLOWING53, MARK_FOLLOWING54, MARK_FOLLOWING55, MARK_FOLLOWING56, MARK_FOLLOWING57, MARK_FOLLOWING58, MARK_FOLLOWING59, MARK_FOLLOWING60, MARK_FOLLOWING61, MARK_FOLLOWING62, MARK_FOLLOWING63, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TYPE_PARAMS";
        RULES1.DEFAULT = "LITERAL3";

        SPAN1.DELEGATE = "TYPE_PARAMS";
        SPAN1.MATCH_TYPE = "LITERAL3";

        BEGIN1.text = "[";

        END1.text = "]";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "PATTERN";
        RULES1.DEFAULT = "NULL";
        RULES1.DIGIT_RE = "(0[lL]?|[1-9]\\d{0,9}(\\d{0,9}[lL])?|0[xX]\\p{XDigit}{1,8}(\\p{XDigit}{0,8}[lL])?|0[0-7]{1,11}([0-7]{0,11}[lL])?|([0-9]+\\.[0-9]*|\\.[0-9]+)([eE][+-]?[0-9]+)?[fFdD]?|[0-9]+([eE][+-]?[0-9]+[fFdD]?|([eE][+-]?[0-9]+)?[fFdD]))";
        RULES1.IGNORE_CASE = "FALSE";

        IMPORT1.DELEGATE = "PRIMARY";

        SEQ1.text = "@";
        SEQ1.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "[A-Z][^(\\s:@)\\[\\]]*";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "KEYWORD4";


        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "COMMENT_BLOCK";
        RULES1.DEFAULT = "COMMENT1";

        SPAN1.TYPE = "COMMENT1";
        SPAN1.DELEGATE = "COMMENT_BLOCK";

        BEGIN1.text = "/*";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    private RULES RULES6() {
        RULES RULES1 = new RULES();
        RULES1.SET = "SCALADOC";
        RULES1.DEFAULT = "COMMENT3";
        RULES1.IGNORE_CASE = "TRUE";

        SEQ1.text = "{";
        SEQ1.TYPE = "COMMENT3";

        SEQ2.text = "*";
        SEQ2.TYPE = "COMMENT3";

        SPAN1.TYPE = "MARKUP";
        SPAN1.DELEGATE = "SCALADOC_PRE";

        BEGIN1.text = "<pre>";

        END1.text = "</pre>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";

        BEGIN2.text = "<!--";

        END2.text = "-->";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN_REGEXP SPAN_REGEXP1 = new SPAN_REGEXP();
        SPAN_REGEXP1.NO_LINE_BREAK = "TRUE";
        SPAN_REGEXP1.TYPE = "MARKUP";
        SPAN_REGEXP1.DELEGATE = "xml::TAGS";
        SPAN_REGEXP1.HASH_CHAR = "<";

        BEGIN3.text = "</?[\\da-zA-Z\\-]+";

        END3.text = ">";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ SEQ3 = new SEQ();
        SEQ3.text = "<";
        SEQ3.TYPE = "COMMENT3";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES7() {
        RULES RULES1 = new RULES();
        RULES1.SET = "SCALADOC_PRE";
        RULES1.DEFAULT = "COMMENT3";

    }

    private RULES RULES8() {
        RULES RULES1 = new RULES();
        RULES1.SET = "XML_SHARED";

        SPAN1.TYPE = "COMMENT2";

        BEGIN1.text = "<!--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN_REGEXP SPAN_REGEXP1 = new SPAN_REGEXP();
        SPAN_REGEXP1.HASH_CHARS = "<";
        SPAN_REGEXP1.TYPE = "LITERAL3";

        BEGIN2.text = "<\\?[^\\s]";

        END2.text = "?>";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT4";
        SPAN2.MATCH_TYPE = "LITERAL3";

        BEGIN3.text = "<![CDATA[";

        END3.text = "]]>";


        SPAN2.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "<([\\d\\w_\\-:.]+)(\\s+[\\d\\w_\\-:.]+=('[^']*'|\"[^\"]*\"))*\\s*/\\s*>";
        SEQ_REGEXP1.TYPE = "LITERAL3";
        SEQ_REGEXP1.HASH_CHAR = "<";

        SPAN_REGEXP2.TYPE = "NULL";
        SPAN_REGEXP2.DELEGATE = "XML_LITERAL";
        SPAN_REGEXP2.MATCH_TYPE = "LITERAL3";
        SPAN_REGEXP2.HASH_CHAR = "<";

        BEGIN4.text = "<([\\d\\w_\\-:.]+)(\\s+[\\d\\w_\\-:.]+=('[^']*'|\"[^\"]*\"))*\\s*>";

        END4.text = "</$1>";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN4, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, };

        return RULES1;
    }

    private RULES RULES9() {
        RULES RULES1 = new RULES();
        RULES1.SET = "XML_LITERAL";
        RULES1.DEFAULT = "COMMENT4";


        PROPERTY1.VALUE = "<!--";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "-->";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "";
        PROPERTY3.NAME = "lineComment";


        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "XML_SHARED";

        SPAN1.DELEGATE = "MAIN";

        BEGIN1.text = "{";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_WORD_BREAK = "TRUE";
        SPAN2.TYPE = "LABEL";

        BEGIN2.text = "&";

        END2.text = ";";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "</[\\d\\w_\\-:.]+>";
        SEQ_REGEXP1.TYPE = "INVALID";
        SEQ_REGEXP1.HASH_CHAR = "<";


        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.PROPS = new PROPS[] { PROPS1, };

        return RULES1;
    }

    private RULES RULES10() {
        RULES RULES1 = new RULES();
        RULES1.SET = "STRING";
        RULES1.DEFAULT = "LITERAL1";

        SEQ1.text = "$$";
        SEQ1.TYPE = "LITERAL1";

        SPAN1.DELEGATE = "MAIN";

        BEGIN1.text = "${";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "$";
        MARK_FOLLOWING1.TYPE = "NULL";
        MARK_FOLLOWING1.MATCH_TYPE = "NULL";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        return RULES1;
    }

    private RULES RULES11() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TYPE";
        RULES1.DEFAULT = "KEYWORD4";

        IMPORT1.DELEGATE = "MAIN";


        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), RULES6(), RULES7(), RULES8(), RULES9(), RULES10(), RULES11(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}