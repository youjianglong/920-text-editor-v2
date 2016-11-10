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
public class DjangoLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "{% comment %}";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "{% endcomment %}";
        PROPERTY2.NAME = "commentEnd";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.IGNORE_CASE = "TRUE";

        IMPORT1.DELEGATE = "html::MAIN";

        IMPORT2.DELEGATE = "DJANGO";

        SPAN1.TYPE = "MARKUP";
        SPAN1.DELEGATE = "JAVASCRIPT_OPENTAG";

        BEGIN1.text = "<SCRIPT";

        END1.text = "</SCRIPT>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "MARKUP";
        SPAN2.DELEGATE = "CSS_OPENTAG";

        BEGIN2.text = "<STYLE";

        END2.text = "</STYLE>";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "</?\\w+";
        SEQ_REGEXP1.TYPE = "MARKUP";
        SEQ_REGEXP1.DELEGATE = "TAGS";
        SEQ_REGEXP1.HASH_CHAR = "<";


        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DJANGO";

        SPAN1.TYPE = "COMMENT3";

        BEGIN1.text = "{% comment %}";

        END1.text = "{% endcomment %}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "KEYWORD3";
        SPAN2.DELEGATE = "DJANGO_BLOCK";

        BEGIN2.text = "{%";

        END2.text = "%}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "KEYWORD3";
        SPAN3.DELEGATE = "DJANGO_VARIABLE";

        BEGIN3.text = "{{";

        END3.text = "}}";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "JAVASCRIPT_OPENTAG";
        RULES1.DEFAULT = "MARKUP";

        SEQ1.text = ">";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "JAVASCRIPT";

        IMPORT1.DELEGATE = "TAGS";

        IMPORT2.DELEGATE = "html::TAGS";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "JAVASCRIPT";
        RULES1.DEFAULT = "MARKUP";
        RULES1.ESCAPE = "\\";

        IMPORT1.DELEGATE = "TO_LITERAL+DJANGO";

        IMPORT2.DELEGATE = "DJANGO";

        IMPORT3.DELEGATE = "javascript::MAIN";


        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CSS_OPENTAG";
        RULES1.DEFAULT = "MARKUP";

        SEQ1.text = ">";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "CSS";

        IMPORT1.DELEGATE = "TO_LITERAL+DJANGO";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES6() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CSS";
        RULES1.DEFAULT = "MARKUP";


        PROPERTY1.VALUE = "";
        PROPERTY1.NAME = "lineComment";


        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "TO_LITERAL+DJANGO";

        IMPORT2.DELEGATE = "DJANGO";

        IMPORT3.DELEGATE = "css::MAIN";


        RULES1.PROPS = new PROPS[] { PROPS1, };

        return RULES1;
    }

    private RULES RULES7() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TAGS";
        RULES1.DEFAULT = "MARKUP";

        IMPORT1.DELEGATE = "TO_LITERAL+DJANGO";

        IMPORT2.DELEGATE = "html::TAGS";

        SEQ1.text = ">";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "MAIN";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES8() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TO_LITERAL+DJANGO";

        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "LITERAL1+DJANGO";

        BEGIN1.text = "'";

        END1.text = "'";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";
        SPAN2.DELEGATE = "LITERAL1+DJANGO";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "DJANGO";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        return RULES1;
    }

    private RULES RULES9() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LITERAL1+DJANGO";
        RULES1.DEFAULT = "LITERAL1";

        IMPORT1.DELEGATE = "DJANGO";


        return RULES1;
    }

    private RULES RULES10() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DJANGO_VARIABLE";
        RULES1.DEFAULT = "LITERAL4";

        IMPORT1.DELEGATE = "DJANGO_CORE";


        return RULES1;
    }

    private RULES RULES11() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DJANGO_BLOCK";
        RULES1.DEFAULT = "LITERAL4";

        IMPORT1.DELEGATE = "DJANGO_CORE";


        KEYWORDS1.add("KEYWORD1", new String[]{"in", "not", "and", "or", "as", "cache", "endcache", "autoescape", "block", "endblock", "csrf_token", "cycle", "debug", "extends", "filter", "endfilter", "firstof", "if", "else", "endif", "for", "endfor", "empty", "endifchanged", "endifequal", "ifnotequal", "endifnotequal", "include", "load", "now", "regroup", "spaceless", "endspaceless", "ssi", "templatetag", "url", "widthratio", "with", "endwith", "trans", "blocktrans", "endblocktrans", });
        RULES1.IMPORT = new IMPORT[] { IMPORT1, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES12() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DJANGO_CORE";

        SPAN1.TYPE = "LITERAL2";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL2";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = ":";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "|";
        SEQ3.TYPE = "OPERATOR";


        KEYWORDS1.add("FUNCTION", new String[]{"add", "addslashes", "capfirst", "center", "cut", "date", "default", "default_if_none", "dictsort", "dictsortreversed", "divisibleby", "escape", "escapejs", "filesizeformat", "first", "fix_ampersands", "floatformat", "force_escape", "get_digit", "iriencode", "join", "last", "length", "length_is", "linebreaks", "linebreaksbr", "linenumbers", "ljust", "lower", "make_list", "phone2numeric", "pluralize", "pprint", "random", "removetags", "rjust", "safe", "safeseq", "slice", "slugify", "stringformat", "striptags", "time", "timesince", "timeuntil", "title", "truncatewords", "truncatewords_html", "unordered_list", "upper", "urlencode", "urlize", "urlizetrunc", "wordcount", "wordwrap", "yesno", });
        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), RULES6(), RULES7(), RULES8(), RULES9(), RULES10(), RULES11(), RULES12(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}