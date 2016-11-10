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
public class BibtexLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "%";
        PROPERTY1.NAME = "lineComment";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.IGNORE_CASE = "TRUE";

        EOL_SPAN1.text = "%";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.TYPE = "FUNCTION";
        SPAN1.DELEGATE = "article";

        BEGIN1.text = "@article{";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "FUNCTION";
        SPAN2.DELEGATE = "article";

        BEGIN2.text = "@article(";

        END2.text = ")";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "FUNCTION";
        SPAN3.DELEGATE = "book";

        BEGIN3.text = "@book{";

        END3.text = "}";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "FUNCTION";
        SPAN4.DELEGATE = "book";

        BEGIN4.text = "@book(";

        END4.text = ")";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "FUNCTION";
        SPAN5.DELEGATE = "booklet";

        BEGIN5.text = "@booklet{";

        END5.text = "}";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "FUNCTION";
        SPAN6.DELEGATE = "booklet";

        BEGIN6.text = "@booklet(";

        END6.text = ")";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN7 = new SPAN();
        SPAN7.TYPE = "FUNCTION";
        SPAN7.DELEGATE = "conference";

        BEGIN7.text = "@conference{";

        END7.text = "}";


        SPAN7.BEGIN = new BEGIN[] { BEGIN7, };

        SPAN SPAN8 = new SPAN();
        SPAN8.TYPE = "FUNCTION";
        SPAN8.DELEGATE = "conference";

        BEGIN8.text = "@conference(";

        END8.text = ")";


        SPAN8.BEGIN = new BEGIN[] { BEGIN8, };

        SPAN SPAN9 = new SPAN();
        SPAN9.TYPE = "FUNCTION";
        SPAN9.DELEGATE = "inbook";

        BEGIN9.text = "@inbook{";

        END9.text = "}";


        SPAN9.BEGIN = new BEGIN[] { BEGIN9, };

        SPAN SPAN10 = new SPAN();
        SPAN10.TYPE = "FUNCTION";
        SPAN10.DELEGATE = "inbook";

        BEGIN10.text = "@inbook(";

        END10.text = ")";


        SPAN10.BEGIN = new BEGIN[] { BEGIN10, };

        SPAN SPAN11 = new SPAN();
        SPAN11.TYPE = "FUNCTION";
        SPAN11.DELEGATE = "incollection";

        BEGIN11.text = "@incollection{";

        END11.text = "}";


        SPAN11.BEGIN = new BEGIN[] { BEGIN11, };

        SPAN SPAN12 = new SPAN();
        SPAN12.TYPE = "FUNCTION";
        SPAN12.DELEGATE = "incollection";

        BEGIN12.text = "@incollection(";

        END12.text = ")";


        SPAN12.BEGIN = new BEGIN[] { BEGIN12, };

        SPAN SPAN13 = new SPAN();
        SPAN13.TYPE = "FUNCTION";
        SPAN13.DELEGATE = "inproceedings";

        BEGIN13.text = "@inproceedings{";

        END13.text = "}";


        SPAN13.BEGIN = new BEGIN[] { BEGIN13, };

        SPAN SPAN14 = new SPAN();
        SPAN14.TYPE = "FUNCTION";
        SPAN14.DELEGATE = "inproceedings";

        BEGIN14.text = "@inproceedings(";

        END14.text = ")";


        SPAN14.BEGIN = new BEGIN[] { BEGIN14, };

        SPAN SPAN15 = new SPAN();
        SPAN15.TYPE = "FUNCTION";
        SPAN15.DELEGATE = "manual";

        BEGIN15.text = "@manual{";

        END15.text = "}";


        SPAN15.BEGIN = new BEGIN[] { BEGIN15, };

        SPAN SPAN16 = new SPAN();
        SPAN16.TYPE = "FUNCTION";
        SPAN16.DELEGATE = "manual";

        BEGIN16.text = "@manual(";

        END16.text = ")";


        SPAN16.BEGIN = new BEGIN[] { BEGIN16, };

        SPAN SPAN17 = new SPAN();
        SPAN17.TYPE = "FUNCTION";
        SPAN17.DELEGATE = "mastersthesis";

        BEGIN17.text = "@mastersthesis{";

        END17.text = "}";


        SPAN17.BEGIN = new BEGIN[] { BEGIN17, };

        SPAN SPAN18 = new SPAN();
        SPAN18.TYPE = "FUNCTION";
        SPAN18.DELEGATE = "mastersthesis";

        BEGIN18.text = "@mastersthesis(";

        END18.text = ")";


        SPAN18.BEGIN = new BEGIN[] { BEGIN18, };

        SPAN SPAN19 = new SPAN();
        SPAN19.TYPE = "FUNCTION";
        SPAN19.DELEGATE = "misc";

        BEGIN19.text = "@misc{";

        END19.text = "}";


        SPAN19.BEGIN = new BEGIN[] { BEGIN19, };

        SPAN SPAN20 = new SPAN();
        SPAN20.TYPE = "FUNCTION";
        SPAN20.DELEGATE = "misc";

        BEGIN20.text = "@misc(";

        END20.text = ")";


        SPAN20.BEGIN = new BEGIN[] { BEGIN20, };

        SPAN SPAN21 = new SPAN();
        SPAN21.TYPE = "FUNCTION";
        SPAN21.DELEGATE = "phdthesis";

        BEGIN21.text = "@phdthesis{";

        END21.text = "}";


        SPAN21.BEGIN = new BEGIN[] { BEGIN21, };

        SPAN SPAN22 = new SPAN();
        SPAN22.TYPE = "FUNCTION";
        SPAN22.DELEGATE = "phdthesis";

        BEGIN22.text = "@phdthesis(";

        END22.text = ")";


        SPAN22.BEGIN = new BEGIN[] { BEGIN22, };

        SPAN SPAN23 = new SPAN();
        SPAN23.TYPE = "FUNCTION";
        SPAN23.DELEGATE = "proceedings";

        BEGIN23.text = "@proceedings{";

        END23.text = "}";


        SPAN23.BEGIN = new BEGIN[] { BEGIN23, };

        SPAN SPAN24 = new SPAN();
        SPAN24.TYPE = "FUNCTION";
        SPAN24.DELEGATE = "proceedings";

        BEGIN24.text = "@proceedings(";

        END24.text = ")";


        SPAN24.BEGIN = new BEGIN[] { BEGIN24, };

        SPAN SPAN25 = new SPAN();
        SPAN25.TYPE = "FUNCTION";
        SPAN25.DELEGATE = "techreport";

        BEGIN25.text = "@techreport{";

        END25.text = "}";


        SPAN25.BEGIN = new BEGIN[] { BEGIN25, };

        SPAN SPAN26 = new SPAN();
        SPAN26.TYPE = "FUNCTION";
        SPAN26.DELEGATE = "techreport";

        BEGIN26.text = "@techreport(";

        END26.text = ")";


        SPAN26.BEGIN = new BEGIN[] { BEGIN26, };

        SPAN SPAN27 = new SPAN();
        SPAN27.TYPE = "FUNCTION";
        SPAN27.DELEGATE = "unpublished";

        BEGIN27.text = "@unpublished{";

        END27.text = "}";


        SPAN27.BEGIN = new BEGIN[] { BEGIN27, };

        SPAN SPAN28 = new SPAN();
        SPAN28.TYPE = "FUNCTION";
        SPAN28.DELEGATE = "unpublished";

        BEGIN28.text = "@unpublished(";

        END28.text = ")";


        SPAN28.BEGIN = new BEGIN[] { BEGIN28, };

        SPAN SPAN29 = new SPAN();
        SPAN29.TYPE = "FUNCTION";
        SPAN29.DELEGATE = "string";

        BEGIN29.text = "@string{";

        END29.text = "}";


        SPAN29.BEGIN = new BEGIN[] { BEGIN29, };

        SPAN SPAN30 = new SPAN();
        SPAN30.TYPE = "FUNCTION";
        SPAN30.DELEGATE = "string";

        BEGIN30.text = "@string(";

        END30.text = ")";


        SPAN30.BEGIN = new BEGIN[] { BEGIN30, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, SPAN7, SPAN8, SPAN9, SPAN10, SPAN11, SPAN12, SPAN13, SPAN14, SPAN15, SPAN16, SPAN17, SPAN18, SPAN19, SPAN20, SPAN21, SPAN22, SPAN23, SPAN24, SPAN25, SPAN26, SPAN27, SPAN28, SPAN29, SPAN30, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "article";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "textquoted";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "[1-9][0-9]*";
        SEQ_REGEXP1.HASH_CHARS = "123456789";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "LITERAL1";


        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "annotation", "day", "keywords", "lccn", "location", "references", "url", });
        KEYWORDS1.add("KEYWORD2", new String[]{"address", "annote", "booktitle", "chapter", "crossref", "edition", "editor", "howpublished", "institution", "key", "organization", "publisher", "school", "series", "type", });
        KEYWORDS1.add("KEYWORD3", new String[]{"month", "note", "number", "pages", "volume", });
        KEYWORDS1.add("KEYWORD4", new String[]{"author", "journal", "title", "year", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "book";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "textquoted";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "[1-9][0-9]*";
        SEQ_REGEXP1.HASH_CHARS = "123456789";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "LITERAL1";


        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "annotation", "day", "keywords", "lccn", "location", "references", "url", });
        KEYWORDS1.add("KEYWORD2", new String[]{"annote", "booktitle", "chapter", "crossref", "howpublished", "institution", "journal", "key", "organization", "pages", "school", "type", });
        KEYWORDS1.add("KEYWORD3", new String[]{"address", "edition", "month", "note", "number", "series", "volume", });
        KEYWORDS1.add("KEYWORD4", new String[]{"author", "editor", "publisher", "title", "year", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "booklet";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "textquoted";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "[1-9][0-9]*";
        SEQ_REGEXP1.HASH_CHARS = "123456789";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "LITERAL1";


        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "annotation", "day", "keywords", "lccn", "location", "references", "url", });
        KEYWORDS1.add("KEYWORD2", new String[]{"annote", "booktitle", "chapter", "crossref", "edition", "editor", "institution", "journal", "key", "number", "organization", "pages", "publisher", "school", "series", "type", "volume", });
        KEYWORDS1.add("KEYWORD3", new String[]{"address", "author", "howpublished", "month", "note", "year", });
        KEYWORDS1.add("KEYWORD4", new String[]{"title", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "conference";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "textquoted";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "[1-9][0-9]*";
        SEQ_REGEXP1.HASH_CHARS = "123456789";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "LITERAL1";


        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "annotation", "day", "keywords", "lccn", "location", "references", "url", });
        KEYWORDS1.add("KEYWORD2", new String[]{"annote", "chapter", "crossref", "edition", "howpublished", "institution", "journal", "key", "school", "type", });
        KEYWORDS1.add("KEYWORD3", new String[]{"address", "editor", "month", "note", "number", "organization", "pages", "publisher", "series", "volume", });
        KEYWORDS1.add("KEYWORD4", new String[]{"author", "booktitle", "title", "year", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES6() {
        RULES RULES1 = new RULES();
        RULES1.SET = "inbook";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "textquoted";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "[1-9][0-9]*";
        SEQ_REGEXP1.HASH_CHARS = "123456789";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "LITERAL1";


        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "annotation", "day", "keywords", "lccn", "location", "references", "url", });
        KEYWORDS1.add("KEYWORD2", new String[]{"annote", "booktitle", "crossref", "howpublished", "institution", "journal", "key", "organization", "school", });
        KEYWORDS1.add("KEYWORD3", new String[]{"address", "edition", "month", "note", "number", "series", "type", "volume", });
        KEYWORDS1.add("KEYWORD4", new String[]{"author", "chapter", "editor", "pages", "publisher", "title", "year", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES7() {
        RULES RULES1 = new RULES();
        RULES1.SET = "incollection";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "textquoted";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "[1-9][0-9]*";
        SEQ_REGEXP1.HASH_CHARS = "123456789";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "LITERAL1";


        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "annotation", "day", "keywords", "lccn", "location", "references", "url", });
        KEYWORDS1.add("KEYWORD2", new String[]{"annote", "crossref", "howpublished", "institution", "journal", "key", "organization", "school", });
        KEYWORDS1.add("KEYWORD3", new String[]{"address", "chapter", "edition", "editor", "month", "note", "number", "pages", "series", "type", "volume", });
        KEYWORDS1.add("KEYWORD4", new String[]{"author", "booktitle", "publisher", "title", "year", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES8() {
        RULES RULES1 = new RULES();
        RULES1.SET = "inproceedings";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "textquoted";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "[1-9][0-9]*";
        SEQ_REGEXP1.HASH_CHARS = "123456789";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "LITERAL1";


        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "annotation", "day", "keywords", "lccn", "location", "references", "url", });
        KEYWORDS1.add("KEYWORD2", new String[]{"annote", "chapter", "crossref", "edition", "howpublished", "institution", "journal", "key", "school", "type", });
        KEYWORDS1.add("KEYWORD3", new String[]{"address", "editor", "month", "note", "number", "organization", "pages", "publisher", "series", "volume", });
        KEYWORDS1.add("KEYWORD4", new String[]{"author", "booktitle", "title", "year", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES9() {
        RULES RULES1 = new RULES();
        RULES1.SET = "manual";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "textquoted";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "[1-9][0-9]*";
        SEQ_REGEXP1.HASH_CHARS = "123456789";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "LITERAL1";


        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "annotation", "day", "keywords", "lccn", "location", "references", "url", });
        KEYWORDS1.add("KEYWORD2", new String[]{"annote", "booktitle", "chapter", "crossref", "editor", "howpublished", "institution", "journal", "key", "number", "pages", "publisher", "school", "series", "type", "volume", });
        KEYWORDS1.add("KEYWORD3", new String[]{"address", "author", "edition", "month", "note", "organization", "year", });
        KEYWORDS1.add("KEYWORD4", new String[]{"title", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES10() {
        RULES RULES1 = new RULES();
        RULES1.SET = "mastersthesis";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "textquoted";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "[1-9][0-9]*";
        SEQ_REGEXP1.HASH_CHARS = "123456789";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "LITERAL1";


        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "annotation", "day", "keywords", "lccn", "location", "references", "url", });
        KEYWORDS1.add("KEYWORD2", new String[]{"annote", "booktitle", "chapter", "crossref", "edition", "editor", "howpublished", "institution", "journal", "key", "number", "organization", "pages", "publisher", "series", "volume", });
        KEYWORDS1.add("KEYWORD3", new String[]{"address", "month", "note", "type", });
        KEYWORDS1.add("KEYWORD4", new String[]{"author", "school", "title", "year", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES11() {
        RULES RULES1 = new RULES();
        RULES1.SET = "misc";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "textquoted";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "[1-9][0-9]*";
        SEQ_REGEXP1.HASH_CHARS = "123456789";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "LITERAL1";


        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "annotation", "day", "keywords", "lccn", "location", "references", "url", });
        KEYWORDS1.add("KEYWORD2", new String[]{"address", "annote", "booktitle", "chapter", "crossref", "edition", "editor", "institution", "journal", "key", "number", "organization", "pages", "publisher", "school", "series", "type", "volume", });
        KEYWORDS1.add("KEYWORD3", new String[]{"author", "howpublished", "month", "note", "title", "year", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES12() {
        RULES RULES1 = new RULES();
        RULES1.SET = "phdthesis";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "textquoted";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "[1-9][0-9]*";
        SEQ_REGEXP1.HASH_CHARS = "123456789";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "LITERAL1";


        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "annotation", "day", "keywords", "lccn", "location", "references", "url", });
        KEYWORDS1.add("KEYWORD2", new String[]{"annote", "booktitle", "chapter", "crossref", "edition", "editor", "howpublished", "institution", "journal", "key", "number", "organization", "pages", "publisher", "series", "volume", });
        KEYWORDS1.add("KEYWORD3", new String[]{"address", "month", "note", "type", });
        KEYWORDS1.add("KEYWORD4", new String[]{"author", "school", "title", "year", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES13() {
        RULES RULES1 = new RULES();
        RULES1.SET = "proceedings";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "textquoted";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "[1-9][0-9]*";
        SEQ_REGEXP1.HASH_CHARS = "123456789";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "LITERAL1";


        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "annotation", "day", "keywords", "lccn", "location", "references", "url", });
        KEYWORDS1.add("KEYWORD2", new String[]{"annote", "author", "booktitle", "chapter", "crossref", "edition", "howpublished", "institution", "journal", "key", "pages", "school", "type", });
        KEYWORDS1.add("KEYWORD3", new String[]{"address", "editor", "month", "note", "number", "organization", "publisher", "series", "volume", });
        KEYWORDS1.add("KEYWORD4", new String[]{"title", "year", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES14() {
        RULES RULES1 = new RULES();
        RULES1.SET = "techreport";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "textquoted";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "[1-9][0-9]*";
        SEQ_REGEXP1.HASH_CHARS = "123456789";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "LITERAL1";


        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "annotation", "day", "keywords", "lccn", "location", "references", "url", });
        KEYWORDS1.add("KEYWORD2", new String[]{"annote", "booktitle", "chapter", "crossref", "edition", "editor", "howpublished", "journal", "key", "organization", "pages", "publisher", "school", "series", "volume", });
        KEYWORDS1.add("KEYWORD3", new String[]{"address", "month", "note", "number", "type", });
        KEYWORDS1.add("KEYWORD4", new String[]{"author", "institution", "title", "year", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES15() {
        RULES RULES1 = new RULES();
        RULES1.SET = "unpublished";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "textquoted";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "[1-9][0-9]*";
        SEQ_REGEXP1.HASH_CHARS = "123456789";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "LITERAL1";


        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "annotation", "day", "keywords", "lccn", "location", "references", "url", });
        KEYWORDS1.add("KEYWORD2", new String[]{"address", "annote", "booktitle", "chapter", "crossref", "edition", "editor", "howpublished", "institution", "journal", "key", "number", "organization", "pages", "publisher", "school", "series", "type", "volume", });
        KEYWORDS1.add("KEYWORD3", new String[]{"month", "year", });
        KEYWORDS1.add("KEYWORD4", new String[]{"author", "note", "title", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES16() {
        RULES RULES1 = new RULES();
        RULES1.SET = "textbraced";
        RULES1.DEFAULT = "LITERAL2";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL3";

        BEGIN1.text = "\\{";

        END1.text = "\\}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "FALSE";
        SPAN3.TYPE = "LITERAL1";
        SPAN3.DELEGATE = "textquoted";

        BEGIN3.text = "\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "\\\"";
        SEQ1.TYPE = "LITERAL3";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES17() {
        RULES RULES1 = new RULES();
        RULES1.SET = "textquoted";
        RULES1.DEFAULT = "LITERAL1";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL3";

        BEGIN1.text = "\\{";

        END1.text = "\\}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "\\\"";
        SEQ1.TYPE = "LITERAL3";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES18() {
        RULES RULES1 = new RULES();
        RULES1.SET = "string";
        RULES1.DEFAULT = "LITERAL1";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "textquoted";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "textbraced";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "FALSE";
        SPAN3.TYPE = "LITERAL3";

        BEGIN3.text = "\\{";

        END3.text = "\\}";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "\\\"";
        SEQ3.TYPE = "LITERAL3";


        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), RULES6(), RULES7(), RULES8(), RULES9(), RULES10(), RULES11(), RULES12(), RULES13(), RULES14(), RULES15(), RULES16(), RULES17(), RULES18(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}