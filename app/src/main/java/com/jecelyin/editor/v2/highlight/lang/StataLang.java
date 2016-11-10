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
public class StataLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "/*";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "*/";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "* ";
        PROPERTY3.NAME = "lineComment";

        PROPERTY4.VALUE = "{";
        PROPERTY4.NAME = "indentOpenBrackets";

        PROPERTY5.VALUE = "}";
        PROPERTY5.NAME = "indentCloseBrackets";

        PROPERTY6.VALUE = "false";
        PROPERTY6.NAME = "doubleBracketIndent";

        PROPERTY7.VALUE = ",+-=<>/?^&*";
        PROPERTY7.NAME = "wordBreakChars";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(([\\.]?[0-9]+)([eE]?)([-+]*)([0-9]*)) | (([0-9]+\\.*[0-9]*|\\.[0-9]+)([+-]?[eE]?[0-9]+)) | ((([0-9]+\\.[0-9]*|\\.[0-9]+))[Ee]?)";
        RULES1.IGNORE_CASE = "FALSE";
        RULES1.NO_WORD_SEP = "`'_?";

        SPAN_REGEXP1.TYPE = "KEYWORD4";
        SPAN_REGEXP1.DELEGATE = "SEMICOLON_ENV";
        SPAN_REGEXP1.HASH_CHAR = "#d";

        BEGIN1.text = "#d[\\s]*[;]";

        END1.text = "#d cr";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN_REGEXP SPAN_REGEXP2 = new SPAN_REGEXP();
        SPAN_REGEXP2.TYPE = "KEYWORD4";
        SPAN_REGEXP2.DELEGATE = "SEMICOLON_ENV";
        SPAN_REGEXP2.HASH_CHAR = "#del";

        BEGIN2.text = "#del[\\s]*[;]";

        END2.text = "#del cr";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN_REGEXP SPAN_REGEXP3 = new SPAN_REGEXP();
        SPAN_REGEXP3.TYPE = "KEYWORD4";
        SPAN_REGEXP3.DELEGATE = "SEMICOLON_ENV";
        SPAN_REGEXP3.HASH_CHAR = "#del";

        BEGIN3.text = "#deli?m?i?t?[\\s]*[;]";

        END3.text = "#delimit cr";


        SPAN_REGEXP3.BEGIN = new BEGIN[] { BEGIN3, };

        EOL_SPAN_REGEXP EOL_SPAN_REGEXP1 = new EOL_SPAN_REGEXP();
        EOL_SPAN_REGEXP1.text = "mata[\\s]*[:]*[\\s]*(?=[\\w]+)";
        EOL_SPAN_REGEXP1.AT_WHITESPACE_END = "TRUE";
        EOL_SPAN_REGEXP1.TYPE = "KEYWORD1";
        EOL_SPAN_REGEXP1.DELEGATE = "MATA_ENV";
        EOL_SPAN_REGEXP1.HASH_CHAR = "mata";

        SPAN_REGEXP4.AT_WHITESPACE_END = "TRUE";
        SPAN_REGEXP4.TYPE = "KEYWORD3";
        SPAN_REGEXP4.DELEGATE = "MATA_ENV";
        SPAN_REGEXP4.HASH_CHAR = "mata";

        BEGIN4.text = "mata[\\s]*([:]|$)";

        END4.text = "end";


        SPAN_REGEXP4.BEGIN = new BEGIN[] { BEGIN4, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "*";
        EOL_SPAN1.AT_WHITESPACE_END = "TRUE";
        EOL_SPAN1.TYPE = "COMMENT1";

        IMPORT1.DELEGATE = "UNIVERSAL";

        IMPORT2.DELEGATE = "KEYWORDLIST";


        RULES1.EOL_SPAN_REGEXP = new EOL_SPAN_REGEXP[] { EOL_SPAN_REGEXP1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, SPAN_REGEXP3, SPAN_REGEXP4, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "UNIVERSAL";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(([\\.]?[0-9]+)([eE]?)([-+]*)([0-9]*)) | (([0-9]+\\.*[0-9]*|\\.[0-9]+)([+-]?[eE]?[0-9]+)) | ((([0-9]+\\.[0-9]*|\\.[0-9]+))[Ee]?)";
        RULES1.IGNORE_CASE = "FALSE";
        RULES1.NO_WORD_SEP = "`'_?";

        EOL_SPAN1.text = "//";
        EOL_SPAN1.AT_WHITESPACE_END = "TRUE";
        EOL_SPAN1.TYPE = "COMMENT1";

        EOL_SPAN_REGEXP1.text = "[\\s]///";
        EOL_SPAN_REGEXP1.TYPE = "COMMENT1";

        EOL_SPAN_REGEXP2.text = "[\\s]//";
        EOL_SPAN_REGEXP2.TYPE = "COMMENT1";

        SPAN1.TYPE = "COMMENT2";

        BEGIN1.text = "/*";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = ".ado";
        SEQ1.TYPE = "NULL";

        SEQ2.text = ".dct";
        SEQ2.TYPE = "NULL";

        SEQ3.text = ".do";
        SEQ3.TYPE = "NULL";

        SEQ4.text = ".dta";
        SEQ4.TYPE = "NULL";

        SEQ5.text = ".gph";
        SEQ5.TYPE = "NULL";

        SEQ6.text = ".grec";
        SEQ6.TYPE = "NULL";

        SEQ7.text = ".log";
        SEQ7.TYPE = "NULL";

        SEQ8.text = ".mata";
        SEQ8.TYPE = "NULL";

        SEQ9.text = ".mlib";
        SEQ9.TYPE = "NULL";

        SEQ10.text = ".mmat";
        SEQ10.TYPE = "NULL";

        SEQ11.text = ".mo";
        SEQ11.TYPE = "NULL";

        SEQ12.text = ".out";
        SEQ12.TYPE = "NULL";

        SEQ13.text = ".raw";
        SEQ13.TYPE = "NULL";

        SEQ14.text = ".mo";
        SEQ14.TYPE = "NULL";

        SEQ15.text = ".smcl";
        SEQ15.TYPE = "NULL";

        SEQ16.text = ".sthlp";
        SEQ16.TYPE = "NULL";

        SEQ17.text = ".ster";
        SEQ17.TYPE = "NULL";

        SEQ18.text = ".";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "=";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = "!";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = ">=";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "<=";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = "+";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = "-";
        SEQ24.TYPE = "OPERATOR";

        SEQ25.text = "/";
        SEQ25.TYPE = "OPERATOR";

        SEQ26.text = ">";
        SEQ26.TYPE = "OPERATOR";

        SEQ27.text = "<";
        SEQ27.TYPE = "OPERATOR";

        SEQ28.text = "&";
        SEQ28.TYPE = "OPERATOR";

        SEQ29.text = "|";
        SEQ29.TYPE = "OPERATOR";

        SEQ30.text = "^";
        SEQ30.TYPE = "OPERATOR";

        SEQ31.text = "~";
        SEQ31.TYPE = "OPERATOR";

        SEQ32.text = "*";
        SEQ32.TYPE = "OPERATOR";

        SEQ33.text = ";";
        SEQ33.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "%[^ )]+";
        SEQ_REGEXP1.TYPE = "OPERATOR";
        SEQ_REGEXP1.HASH_CHAR = "%";

        SEQ34.text = ",";
        SEQ34.TYPE = "NULL";

        SEQ35.text = "]";
        SEQ35.TYPE = "NULL";

        SEQ36.text = "[";
        SEQ36.TYPE = "NULL";

        SEQ37.text = "?";
        SEQ37.TYPE = "NULL";

        SEQ_REGEXP2.text = "L(([\\d]*[.])|([(][\\d]+/[\\d]+[)][.]))";
        SEQ_REGEXP2.AT_WORD_START = "TRUE";
        SEQ_REGEXP2.TYPE = "OPERATOR";
        SEQ_REGEXP2.HASH_CHAR = "L";

        SEQ_REGEXP3.text = "F(([\\d]*[.])|([(][\\d]+/[\\d]+[)][.]))";
        SEQ_REGEXP3.AT_WORD_START = "TRUE";
        SEQ_REGEXP3.TYPE = "OPERATOR";
        SEQ_REGEXP3.HASH_CHAR = "F";

        SEQ_REGEXP4.text = "D(([\\d]*[.])|([(][\\d]+/[\\d]+[)][.]))";
        SEQ_REGEXP4.AT_WORD_START = "TRUE";
        SEQ_REGEXP4.TYPE = "OPERATOR";
        SEQ_REGEXP4.HASH_CHAR = "D";

        SEQ_REGEXP5.text = "S(([\\d]*[.])|([(][\\d]+/[\\d]+[)][.]))";
        SEQ_REGEXP5.AT_WORD_START = "TRUE";
        SEQ_REGEXP5.TYPE = "OPERATOR";
        SEQ_REGEXP5.HASH_CHAR = "S";

        SEQ_REGEXP6.text = "loca?l?((\\s+\\w+)|$)";
        SEQ_REGEXP6.AT_WORD_START = "TRUE";
        SEQ_REGEXP6.TYPE = "LITERAL4";
        SEQ_REGEXP6.HASH_CHAR = "loc";

        SEQ_REGEXP7.text = "glo?b?a?l?((\\s+\\w+)|$)";
        SEQ_REGEXP7.AT_WORD_START = "TRUE";
        SEQ_REGEXP7.TYPE = "LITERAL4";
        SEQ_REGEXP7.HASH_CHAR = "gl";

        MARK_FOLLOWING1.text = "foreach";
        MARK_FOLLOWING1.TYPE = "LITERAL4";
        MARK_FOLLOWING1.MATCH_TYPE = "KEYWORD2";

        MARK_FOLLOWING2.text = "foreach";
        MARK_FOLLOWING2.TYPE = "LITERAL4";
        MARK_FOLLOWING2.MATCH_TYPE = "KEYWORD2";

        MARK_FOLLOWING3.text = "forv";
        MARK_FOLLOWING3.TYPE = "LITERAL4";
        MARK_FOLLOWING3.MATCH_TYPE = "KEYWORD2";

        MARK_FOLLOWING4.text = "forv";
        MARK_FOLLOWING4.TYPE = "LITERAL4";
        MARK_FOLLOWING4.MATCH_TYPE = "KEYWORD2";

        MARK_FOLLOWING5.text = "forvalues";
        MARK_FOLLOWING5.TYPE = "LITERAL4";
        MARK_FOLLOWING5.MATCH_TYPE = "KEYWORD2";

        MARK_FOLLOWING6.text = "forvalues";
        MARK_FOLLOWING6.TYPE = "LITERAL4";
        MARK_FOLLOWING6.MATCH_TYPE = "KEYWORD2";

        SEQ_REGEXP8.text = "tempvar((\\s+\\w+)+|$)";
        SEQ_REGEXP8.AT_WHITESPACE_END = "TRUE";
        SEQ_REGEXP8.TYPE = "LITERAL4";
        SEQ_REGEXP8.HASH_CHAR = "tempvar";

        SEQ_REGEXP9.text = "tempname((\\s+\\w+)+|$)";
        SEQ_REGEXP9.AT_WHITESPACE_END = "TRUE";
        SEQ_REGEXP9.TYPE = "LITERAL4";
        SEQ_REGEXP9.HASH_CHAR = "tempname";

        SPAN2.TYPE = "LITERAL4";

        BEGIN2.text = "${";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        MARK_FOLLOWING MARK_FOLLOWING7 = new MARK_FOLLOWING();
        MARK_FOLLOWING7.text = "$";
        MARK_FOLLOWING7.TYPE = "LITERAL4";
        MARK_FOLLOWING7.MATCH_TYPE = "RULE";

        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "NULL";

        SEQ38.text = ")";
        SEQ38.TYPE = "NULL";

        SEQ_REGEXP10.text = "capt?u?r?e?[\\s]+log([\\s]+|$)";
        SEQ_REGEXP10.AT_WHITESPACE_END = "TRUE";
        SEQ_REGEXP10.TYPE = "KEYWORD3";
        SEQ_REGEXP10.HASH_CHAR = "cap";

        SEQ_REGEXP11.text = "run?([\\s]+|$)";
        SEQ_REGEXP11.AT_WHITESPACE_END = "TRUE";
        SEQ_REGEXP11.TYPE = "KEYWORD3";
        SEQ_REGEXP11.HASH_CHAR = "ru";

        SEQ_REGEXP12.text = "log([\\s]+|$)";
        SEQ_REGEXP12.AT_WORD_START = "TRUE";
        SEQ_REGEXP12.TYPE = "KEYWORD3";
        SEQ_REGEXP12.HASH_CHAR = "log";

        SEQ_REGEXP13.text = "do([\\s]+|$)";
        SEQ_REGEXP13.AT_WORD_START = "TRUE";
        SEQ_REGEXP13.TYPE = "KEYWORD3";
        SEQ_REGEXP13.HASH_CHAR = "do";

        SEQ_REGEXP14.text = "set[\\s]+(obs)(([\\s]+(?![\\D]+))|$)";
        SEQ_REGEXP14.AT_WORD_START = "TRUE";
        SEQ_REGEXP14.TYPE = "KEYWORD3";
        SEQ_REGEXP14.HASH_CHAR = "set";

        SEQ_REGEXP15.text = "label([\\s]+(drop)([\\s]+|$))";
        SEQ_REGEXP15.AT_WORD_START = "TRUE";
        SEQ_REGEXP15.TYPE = "KEYWORD2";
        SEQ_REGEXP15.HASH_CHAR = "label";

        SEQ_REGEXP16.text = "macro([\\s]+(drop)([\\s]+|$))";
        SEQ_REGEXP16.AT_WORD_START = "TRUE";
        SEQ_REGEXP16.TYPE = "KEYWORD1";
        SEQ_REGEXP16.HASH_CHAR = "macro";

        SEQ_REGEXP17.text = "drop([\\s]+(?!if|[=])|$)";
        SEQ_REGEXP17.AT_WORD_START = "TRUE";
        SEQ_REGEXP17.TYPE = "KEYWORD3";
        SEQ_REGEXP17.HASH_CHAR = "drop";

        SEQ_REGEXP18.text = "keep([\\s]+(?!if|[=])|$)";
        SEQ_REGEXP18.AT_WORD_START = "TRUE";
        SEQ_REGEXP18.TYPE = "KEYWORD3";
        SEQ_REGEXP18.HASH_CHAR = "keep";

        SEQ_REGEXP19.text = "set(?!([\\s]+[\\w]+[\\s]*[=]))";
        SEQ_REGEXP19.AT_WHITESPACE_END = "TRUE";
        SEQ_REGEXP19.TYPE = "KEYWORD4";
        SEQ_REGEXP19.HASH_CHAR = "set";

        SEQ_REGEXP20.text = "mata[\\s]+set([\\s]+|$)";
        SEQ_REGEXP20.AT_WHITESPACE_END = "TRUE";
        SEQ_REGEXP20.TYPE = "KEYWORD4";
        SEQ_REGEXP20.HASH_CHAR = "mata";

        SEQ_REGEXP21.text = "shell([\\s]+|$)";
        SEQ_REGEXP21.AT_WHITESPACE_END = "TRUE";
        SEQ_REGEXP21.TYPE = "KEYWORD4";
        SEQ_REGEXP21.HASH_CHAR = "shell";

        SEQ_REGEXP22.text = "sysdir([\\s]+|$)";
        SEQ_REGEXP22.AT_WHITESPACE_END = "TRUE";
        SEQ_REGEXP22.TYPE = "KEYWORD4";
        SEQ_REGEXP22.HASH_CHAR = "sysdir";

        SEQ_REGEXP23.text = "c\\((\\w+)\\)";
        SEQ_REGEXP23.AT_WORD_START = "TRUE";
        SEQ_REGEXP23.TYPE = "KEYWORD2";
        SEQ_REGEXP23.HASH_CHAR = "c";

        SEQ_REGEXP24.text = "str(\\d+)";
        SEQ_REGEXP24.AT_WORD_START = "TRUE";
        SEQ_REGEXP24.TYPE = "KEYWORD2";
        SEQ_REGEXP24.HASH_CHAR = "str";

        IMPORT1.DELEGATE = "STRINGMACRO";


        RULES1.IMPORT = new IMPORT[] { IMPORT1, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, SEQ_REGEXP2, SEQ_REGEXP3, SEQ_REGEXP4, SEQ_REGEXP5, SEQ_REGEXP6, SEQ_REGEXP7, SEQ_REGEXP8, SEQ_REGEXP9, SEQ_REGEXP10, SEQ_REGEXP11, SEQ_REGEXP12, SEQ_REGEXP13, SEQ_REGEXP14, SEQ_REGEXP15, SEQ_REGEXP16, SEQ_REGEXP17, SEQ_REGEXP18, SEQ_REGEXP19, SEQ_REGEXP20, SEQ_REGEXP21, SEQ_REGEXP22, SEQ_REGEXP23, SEQ_REGEXP24, };

        RULES1.EOL_SPAN_REGEXP = new EOL_SPAN_REGEXP[] { EOL_SPAN_REGEXP1, EOL_SPAN_REGEXP2, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, SEQ27, SEQ28, SEQ29, SEQ30, SEQ31, SEQ32, SEQ33, SEQ34, SEQ35, SEQ36, SEQ37, SEQ38, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, MARK_FOLLOWING2, MARK_FOLLOWING3, MARK_FOLLOWING4, MARK_FOLLOWING5, MARK_FOLLOWING6, MARK_FOLLOWING7, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "SEMICOLON_ENV";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(([\\.]?[0-9]+)([eE]?)([-+]*)([0-9]*)) | (([0-9]+\\.*[0-9]*|\\.[0-9]+)([+-]?[eE]?[0-9]+)) | ((([0-9]+\\.[0-9]*|\\.[0-9]+))[Ee]?)";
        RULES1.IGNORE_CASE = "FALSE";
        RULES1.NO_WORD_SEP = "`'_?";

        SPAN1.AT_WHITESPACE_END = "TRUE";
        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "*";

        END1.text = ";";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        EOL_SPAN_REGEXP EOL_SPAN_REGEXP1 = new EOL_SPAN_REGEXP();
        EOL_SPAN_REGEXP1.text = "[\\s]///";
        EOL_SPAN_REGEXP1.TYPE = "COMMENT1";

        EOL_SPAN_REGEXP2.text = "[\\s]//";
        EOL_SPAN_REGEXP2.TYPE = "COMMENT1";

        IMPORT1.DELEGATE = "UNIVERSAL";

        IMPORT2.DELEGATE = "KEYWORDLIST";


        RULES1.EOL_SPAN_REGEXP = new EOL_SPAN_REGEXP[] { EOL_SPAN_REGEXP1, EOL_SPAN_REGEXP2, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "MATA_ENV";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(([\\.]?[0-9]+)([eE]?)([-+]*)([0-9]*)) | (([0-9]+\\.*[0-9]*|\\.[0-9]+)([+-]?[eE]?[0-9]+)) | ((([0-9]+\\.[0-9]*|\\.[0-9]+))[Ee]?)";
        RULES1.IGNORE_CASE = "FALSE";
        RULES1.NO_WORD_SEP = "`'_?";

        SEQ_REGEXP1.text = "do([\\s]+|$)";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "KEYWORD2";
        SEQ_REGEXP1.HASH_CHAR = "do";

        IMPORT1.DELEGATE = "UNIVERSAL";


        KEYWORDS1.add("KEYWORD2", new String[]{"if", "else", "for", "goto", "while", "this", "do", "return", "break", "continue", "add", "create", "index", "replace", "using", "byte", "int", "long", "float", "double", "quad", "short", "boolean", "complex", "const", "aggregate", "case", "catch", "class", "default", "delegate", "case", "eltypedef", "enum", "explicit", "export", "external", "friend", "function", "inline", "namespace", "new", "NULL", "numeric", "operator", "orgtypedef", "pointer", "polymorphic", "pragma", "private", "protected", "public", "signed", "static", "super", "switch", "template", "throw", "transmorphic", "try", "typedef", "typename", "union", "unsigned", "virtual", "volatile", });
        RULES1.IMPORT = new IMPORT[] { IMPORT1, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "KEYWORDLIST";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(([\\.]?[0-9]+)([eE]?)([-+]*)([0-9]*)) | (([0-9]+\\.*[0-9]*|\\.[0-9]+)([+-]?[eE]?[0-9]+)) | ((([0-9]+\\.[0-9]*|\\.[0-9]+))[Ee]?)";
        RULES1.IGNORE_CASE = "FALSE";
        RULES1.NO_WORD_SEP = "`'_?";


        KEYWORDS1.add("KEYWORD2", new String[]{"_estimates", "_return", "accum", "adopath", "args", "break", "by", "byable", "bys", "bysort", "class", "cap", "capture", "char", "class", "classutil", "comments", "compare", "compress", "confirm", "continue", "creturn", "define", "discard", "dissimilarity", "drop", "eigenvalues", "else", "end", "ereturn", "expand", "file", "findfile", "for", "foreach", "forvalues", "get", "if", "in", "keep", "lab", "labe", "label", "loc", "loca", "local", "odbc", "outfix", "program", "properties", "recode", "replace", "return", "rmsg", "rownames", "serset", "so", "sor", "sort", "sortpreserve", "svd", "symeigen", "trace", "unabcmd", "utility", "while", "runtest", "byte", "int", "long", "float", "double", });
        KEYWORDS1.add("LITERAL3", new String[]{"dir", "chdir", "mkdir", "rmdir", "pwd", "fileexists", "cat", "unlink", "ls", });
        KEYWORDS1.add("KEYWORD3", new String[]{"ap", "app", "appe", "appen", "append", "erase", "mer", "merg", "merge", "preserve", "restore", "rm", "using", "use", "save", "sav", "xmlsave", "xmluse", });
        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES6() {
        RULES RULES1 = new RULES();
        RULES1.SET = "STRINGMACRO";

        SPAN1.TYPE = "LITERAL3";
        SPAN1.DELEGATE = "COM-QUOTE";

        BEGIN1.text = "`\"";

        END1.text = "\"'";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";
        SPAN2.DELEGATE = "DUB-QUOTE";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "MACROS";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        return RULES1;
    }

    private RULES RULES7() {
        RULES RULES1 = new RULES();
        RULES1.SET = "COM-QUOTE";
        RULES1.DEFAULT = "LITERAL3";

        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "FUNCTION";

        SEQ1.text = ")";
        SEQ1.TYPE = "FUNCTION";

        IMPORT1.DELEGATE = "MACROS";


        RULES1.IMPORT = new IMPORT[] { IMPORT1, };

        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES8() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DUB-QUOTE";
        RULES1.DEFAULT = "LITERAL1";

        IMPORT1.DELEGATE = "MACROS";


        return RULES1;
    }

    private RULES RULES9() {
        RULES RULES1 = new RULES();
        RULES1.SET = "MACROS";
        RULES1.DEFAULT = "LITERAL4";

        SPAN1.TYPE = "LITERAL4";
        SPAN1.DELEGATE = "EXPRESSION";

        BEGIN1.text = "`=";

        END1.text = "'";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL4";
        SPAN2.DELEGATE = "GIVEUP";

        BEGIN2.text = "`:";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL4";
        SPAN3.DELEGATE = "MACROS";

        BEGIN3.text = "`";

        END3.text = "'";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "\\$[a-zA-Z]\\w*";
        SEQ_REGEXP1.TYPE = "LITERAL4";
        SEQ_REGEXP1.HASH_CHAR = "$";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        return RULES1;
    }

    private RULES RULES10() {
        RULES RULES1 = new RULES();
        RULES1.SET = "EXPRESSION";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DEFAULT = "NULL";

        SPAN_REGEXP1.HASH_CHARS = "abcdefghijklmnopqrstuvwxyz_";
        SPAN_REGEXP1.TYPE = "FUNCTION";
        SPAN_REGEXP1.DELEGATE = "EXPRESSION";

        BEGIN1.text = "\\w*\\(";

        END1.text = ")";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN1, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "STRINGMACRO";


        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, };

        return RULES1;
    }

    private RULES RULES11() {
        RULES RULES1 = new RULES();
        RULES1.SET = "GIVEUP";
        RULES1.DEFAULT = "NULL";

        IMPORT1.DELEGATE = "STRINGMACRO";


        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), RULES6(), RULES7(), RULES8(), RULES9(), RULES10(), RULES11(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}