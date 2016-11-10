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
public class ClojureLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = ";";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = ".*+!-_?/";
        PROPERTY2.NAME = "noWordSep";

        PROPERTY3.VALUE = "(";
        PROPERTY3.NAME = "unalignedOpenBrackets";

        PROPERTY4.VALUE = ")";
        PROPERTY4.NAME = "unalignedCloseBrackets";

        PROPERTY5.VALUE = "true";
        PROPERTY5.NAME = "multipleBracketIndent";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "([0-9]+)|(([0-9]*\\.[0-9]+)M?)|([0-9]+/[0-9]+)";
        RULES1.IGNORE_CASE = "FALSE";
        RULES1.NO_WORD_SEP = ".*+!-_?/";

        SPAN1.TYPE = "KEYWORD4";
        SPAN1.DELEGATE = "MAIN";

        BEGIN1.text = "*";

        END1.text = "*";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "MARKUP";
        SPAN2.DELEGATE = "MAIN";

        BEGIN2.text = "#^(";

        END2.text = ")";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL3";
        SPAN3.DELEGATE = "MAIN";

        BEGIN3.text = "@(";

        END3.text = ")";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "LITERAL3";
        SPAN4.DELEGATE = "MAIN";

        BEGIN4.text = "^(";

        END4.text = ")";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "LITERAL3";
        SPAN5.DELEGATE = "MAIN";

        BEGIN5.text = "`(";

        END5.text = ")";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "LITERAL3";
        SPAN6.DELEGATE = "MAIN";

        BEGIN6.text = "'(";

        END6.text = ")";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN7 = new SPAN();
        SPAN7.TYPE = "COMMENT3";
        SPAN7.DELEGATE = "MAIN";

        BEGIN7.text = "#_(";

        END7.text = ")";


        SPAN7.BEGIN = new BEGIN[] { BEGIN7, };

        SPAN SPAN8 = new SPAN();
        SPAN8.TYPE = "KEYWORD1";
        SPAN8.DELEGATE = "MAIN";

        BEGIN8.text = "#(";

        END8.text = ")";


        SPAN8.BEGIN = new BEGIN[] { BEGIN8, };

        SPAN SPAN9 = new SPAN();
        SPAN9.TYPE = "MARKUP";
        SPAN9.DELEGATE = "MAIN";

        BEGIN9.text = "(";

        END9.text = ")";


        SPAN9.BEGIN = new BEGIN[] { BEGIN9, };

        SPAN SPAN10 = new SPAN();
        SPAN10.TYPE = "MARKUP";
        SPAN10.DELEGATE = "MAIN";

        BEGIN10.text = "#^[";

        END10.text = "]";


        SPAN10.BEGIN = new BEGIN[] { BEGIN10, };

        SPAN SPAN11 = new SPAN();
        SPAN11.TYPE = "LITERAL3";
        SPAN11.DELEGATE = "MAIN";

        BEGIN11.text = "@[";

        END11.text = "]";


        SPAN11.BEGIN = new BEGIN[] { BEGIN11, };

        SPAN SPAN12 = new SPAN();
        SPAN12.TYPE = "LITERAL3";
        SPAN12.DELEGATE = "MAIN";

        BEGIN12.text = "^[";

        END12.text = "]";


        SPAN12.BEGIN = new BEGIN[] { BEGIN12, };

        SPAN SPAN13 = new SPAN();
        SPAN13.TYPE = "LITERAL3";
        SPAN13.DELEGATE = "MAIN";

        BEGIN13.text = "'[";

        END13.text = "]";


        SPAN13.BEGIN = new BEGIN[] { BEGIN13, };

        SPAN SPAN14 = new SPAN();
        SPAN14.TYPE = "LABEL";
        SPAN14.DELEGATE = "MAIN";

        BEGIN14.text = "[";

        END14.text = "]";


        SPAN14.BEGIN = new BEGIN[] { BEGIN14, };

        SPAN SPAN15 = new SPAN();
        SPAN15.TYPE = "MARKUP";
        SPAN15.DELEGATE = "MAIN";

        BEGIN15.text = "#^{";

        END15.text = "}";


        SPAN15.BEGIN = new BEGIN[] { BEGIN15, };

        SPAN SPAN16 = new SPAN();
        SPAN16.TYPE = "LITERAL3";
        SPAN16.DELEGATE = "MAIN";

        BEGIN16.text = "@{";

        END16.text = "}";


        SPAN16.BEGIN = new BEGIN[] { BEGIN16, };

        SPAN SPAN17 = new SPAN();
        SPAN17.TYPE = "LITERAL3";
        SPAN17.DELEGATE = "MAIN";

        BEGIN17.text = "^{";

        END17.text = "}";


        SPAN17.BEGIN = new BEGIN[] { BEGIN17, };

        SPAN SPAN18 = new SPAN();
        SPAN18.TYPE = "LITERAL3";
        SPAN18.DELEGATE = "MAIN";

        BEGIN18.text = "'{";

        END18.text = "}";


        SPAN18.BEGIN = new BEGIN[] { BEGIN18, };

        SPAN SPAN19 = new SPAN();
        SPAN19.TYPE = "LABEL";
        SPAN19.DELEGATE = "MAIN";

        BEGIN19.text = "{";

        END19.text = "}";


        SPAN19.BEGIN = new BEGIN[] { BEGIN19, };

        SPAN SPAN20 = new SPAN();
        SPAN20.TYPE = "MARKUP";
        SPAN20.DELEGATE = "MAIN";

        BEGIN20.text = "#^#{";

        END20.text = "}";


        SPAN20.BEGIN = new BEGIN[] { BEGIN20, };

        SPAN SPAN21 = new SPAN();
        SPAN21.TYPE = "LITERAL3";
        SPAN21.DELEGATE = "MAIN";

        BEGIN21.text = "@#{";

        END21.text = "}";


        SPAN21.BEGIN = new BEGIN[] { BEGIN21, };

        SPAN SPAN22 = new SPAN();
        SPAN22.TYPE = "LITERAL3";
        SPAN22.DELEGATE = "MAIN";

        BEGIN22.text = "^#{";

        END22.text = "}";


        SPAN22.BEGIN = new BEGIN[] { BEGIN22, };

        SPAN SPAN23 = new SPAN();
        SPAN23.TYPE = "LITERAL3";
        SPAN23.DELEGATE = "MAIN";

        BEGIN23.text = "'#{";

        END23.text = "}";


        SPAN23.BEGIN = new BEGIN[] { BEGIN23, };

        SPAN SPAN24 = new SPAN();
        SPAN24.TYPE = "LABEL";
        SPAN24.DELEGATE = "MAIN";

        BEGIN24.text = "#{";

        END24.text = "}";


        SPAN24.BEGIN = new BEGIN[] { BEGIN24, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "#'";
        SEQ1.AT_WORD_START = "TRUE";
        SEQ1.TYPE = "KEYWORD2";

        MARK_FOLLOWING1.text = "'";
        MARK_FOLLOWING1.AT_WORD_START = "TRUE";
        MARK_FOLLOWING1.TYPE = "LITERAL3";

        MARK_FOLLOWING2.text = "^";
        MARK_FOLLOWING2.AT_WORD_START = "TRUE";
        MARK_FOLLOWING2.TYPE = "LABEL";

        MARK_FOLLOWING3.text = "@";
        MARK_FOLLOWING3.AT_WORD_START = "TRUE";
        MARK_FOLLOWING3.TYPE = "LABEL";

        MARK_FOLLOWING4.text = ".";
        MARK_FOLLOWING4.AT_WORD_START = "TRUE";
        MARK_FOLLOWING4.TYPE = "LITERAL3";

        MARK_FOLLOWING5.text = "#^";
        MARK_FOLLOWING5.AT_WORD_START = "TRUE";
        MARK_FOLLOWING5.TYPE = "MARKUP";

        EOL_SPAN1.text = ";;;;";
        EOL_SPAN1.TYPE = "COMMENT4";

        EOL_SPAN2.text = ";;;";
        EOL_SPAN2.TYPE = "COMMENT3";

        EOL_SPAN3.text = ";;";
        EOL_SPAN3.TYPE = "COMMENT2";

        EOL_SPAN4.text = ";";
        EOL_SPAN4.TYPE = "COMMENT1";

        SPAN25.TYPE = "LITERAL2";
        SPAN25.DELEGATE = "REGEXPS";
        SPAN25.ESCAPE = "\\";

        BEGIN25.text = "#\"";

        END25.text = "\"";


        SPAN25.BEGIN = new BEGIN[] { BEGIN25, };

        SPAN SPAN26 = new SPAN();
        SPAN26.TYPE = "LITERAL1";
        SPAN26.DELEGATE = "STRINGS";
        SPAN26.ESCAPE = "\\";

        BEGIN26.text = "\"";

        END26.text = "\"";


        SPAN26.BEGIN = new BEGIN[] { BEGIN26, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "\\\\(.|newline|space|tab)";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "LITERAL2";
        SEQ_REGEXP1.HASH_CHAR = "\\";

        SEQ2.text = ".";
        SEQ2.AT_WORD_START = "TRUE";
        SEQ2.TYPE = "LITERAL4";

        MARK_FOLLOWING6.text = ":";
        MARK_FOLLOWING6.AT_WORD_START = "TRUE";
        MARK_FOLLOWING6.TYPE = "KEYWORD4";


        KEYWORDS1.add("KEYWORD1", new String[]{"assert", "binding", "bound-fn", "bound-fn*", "comment", "compile", "gen-class", "gen-interface", "declare", "def", "definline", "definterceptor", "definterceptorfn", "definterface", "defmacro", "defmethod", "defmulti", "defn", "defn-", "defon-request", "defonce", "defprotocol", "defrecord", "defstruct", "deftest", "deftest-", "deftype", "extend", "extenders", "extend-protocol", "extend-type", "get-method", "methods", "prefers", "prefer-method", "remove-all-methods", "remove-method", "eval", "fn", "partial", "ns", "import", "intern", "loaded-libs", "refer", "refer-clojure", "reify", "require", "the-ns", "use", "all-ns", "alias", "create-ns", "find-keyword", "find-ns", "in-ns", "ns-name", "ns-map", "ns-aliases", "ns-interns", "ns-publics", "ns-imports", "ns-refers", "ns-resolve", "ns-unmap", "ns-unalias", "remove-ns", });
        KEYWORDS1.add("LITERAL4", new String[]{"nil", "true", "false", });
        KEYWORDS1.add("KEYWORD2", new String[]{"case", "cond", "condp", "cond->", "cond->>", "destructure", "do", "doall", "dorun", "doseq", "dosync", "dotimes", "doto", "for", "if", "if-let", "if-not", "if-some", "let", "letfn", "loop", "recur", "sync", "trampoline", "try", "catch", "finally", "throw", "while", "when", "when-first", "when-let", "when-not", "when-some", });
        KEYWORDS1.add("FUNCTION", new String[]{"unchecked-add", "unchecked-add-int", "unchecked-byte", "unchecked-char", "unchecked-dec", "unchecked-dec-int", "unchecked-divide-int", "unchecked-double", "unchecked-float", "unchecked-inc", "unchecked-inc-int", "unchecked-int", "unchecked-long", "unchecked-multiply", "unchecked-negate", "unchecked-negate-int", "unchecked-remainder-int", "unchecked-short", "unchecked-subtract", "unchecked-subtract-int", "unsigned-bit-shift-right", "browse-url", "diff", "diff-similar", "parse-timestamp", "read-instant-calendar", "read-instant-date", "read-instant-timestamp", "validated", "as-file", "as-relative-path", "as-url", "copy", "delete-file", "file", "input-stream", "output-stream", "make-input-stream", "make-output-stream", "make-parents", "make-reader", "make-writer", "reader", "resource", "writer", "cl-format", "code-dispatch", "formatter", "formatter-out", "fresh-line", "get-pretty-writer", "pp", "pprint", "pprint-indent", "pprint-logical-block", "pprint-newline", "pprint-tab", "print-length-loop", "print-table", "set-pprint-dispatch", "simple-dispatch", "with-pprint-dispatch", "write", "write-out", "difference", "index", "intersection", "join", "map-invert", "project", "rename", "rename-keys", "select", "union", "e", "print-cause-trace", "print-stack-trace", "print-throwable", "print-trace-element", "root-cause", "capitalize", "escape", "join", "lower-case", "re-quote-replacement", "replace-first", "split", "split-lines", "trim", "trim-newline", "triml", "trimr", "upper-case", "are", "assert-any", "assert-expr", "assert-predicate", "compose-fixtures", "is", "join-fixtures", "testing", "try-expr", "use-fixtures", "keywordize-keys", "macroexpand-all", "postwalk", "postwalk-demo", "postwalk-replace", "prewalk", "prewalk-demo", "prewalk-replace", "stringify-keys", "walk", "attrs", "content", "content-handler", "element", "emit", "emit-element", "parse", "startparse-sax", "tag", "append-child", "children", "down", "edit", "insert-child", "insert-left", "insert-right", "left", "leftmost", "lefts", "make-node", "next", "node", "path", "prev", "remove", "replace", "right", "rightmost", "rights", "root", "seq-zip", "up", "vector-zip", "xml-zip", "zipper", });
        KEYWORDS1.add("LITERAL3", new String[]{"associative?", "atom?", "blank?", "bound?", "branch?", "char?", "class?", "contains?", "counted?", "decimal?", "delay?", "distinct?", "empty?", "end?", "even?", "every?", "false?", "float?", "fn?", "function?", "future?", "future-cancelled?", "future-done?", "extends?", "identical?", "ifn?", "instance?", "integer?", "isa?", "keyword?", "list?", "map?", "neg?", "nil?", "not-any?", "not-empty", "not-every?", "number?", "odd?", "pos?", "ratio?", "rational?", "realized?", "record?", "reduced?", "reversible?", "satisfies?", "seq?", "sequential?", "set?", "some?", "sorted?", "string?", "subset?", "successful?", "superset?", "symbol?", "true?", "var?", "vector?", "zero?", "quot", });
        KEYWORDS1.add("KEYWORD3", new String[]{"alter", "alter-meta!", "alter-var-root", "commute", "compare-and-set!", "ensure", "ref", "ref-history-count", "ref-max-history", "ref-min-history", "ref-set", "reset!", "reset-meta!", "set!", "swap!", "agent", "agent-error", "agent-errors", "add-watch", "await", "await-for", "clear-agent-errors", "error-handler", "error-mode", "get-validator", "release-pending-sends", "remove-watch", "restart-agent", "send", "send-off", "send-via", "set-agent-send-executor!", "set-agent-send-off-executor!", "set-error-handler!", "set-error-mode!", "set-validator!", "shutdown-agents", "future", "future-call", "future-cancel", "deliver", "deref", "locking", "pcalls", "pmap", "promise", "delay", "force", "amap", "map", "mapcat", "mapv", "map-indexed", "filter", "filterv", "sort", "sort-by", "get-thread-bindings", "gensym", "memoize", "meta", "vary-meta", "name", "namespace", "resolve", "quote", "unquote", "unquote-splicing", "var", "find-var", "var-get", "var-set", "empty", "new", "array-map", "atom", "bigdec", "bigint", "biginteger", "boolean", "boolean-array", "booleans", "byte", "byte-array", "bytes", "cast", "char", "char-array", "chars", "construct-proxy", "create-struct", "denominator", "double", "double-array", "doubles", "enumeration-seq", "float", "float-array", "floats", "get-proxy-class", "hash", "hash-combine", "hash-map", "hash-ordered-coll", "hash-set", "hash-unordered-coll", "init-proxy", "int", "int-array", "interpose", "ints", "list", "list*", "long", "long-array", "longs", "make-array", "num", "numerator", "partition", "partition-all", "partition-by", "proxy", "proxy-call-with-super", "proxy-mappings", "proxy-name", "proxy-super", "rationalize", "seq", "seque", "sequence", "set", "short", "short-array", "shorts", "sorted-map", "sorted-map-by", "sorted-set", "sorted-set-by", "struct", "struct-map", "str", "symbol", "tree-seq", "type", "update-proxy", "vec", "vector", "vector-of", "xml-seq", ".", "..", "aclone", "ancestors", "bases", "bean", "class", "derive", "descendants", "file-seq", "iterator-seq", "make-hierarchy", "namespace-munge", "object-array", "parents", "primitives-classnames", "supers", "underive", "memfn", "apply", "eval", "load", "load-file", "load-reader", "load-string", "read", "read-line", "read-string", "with-bindings", "with-bindings*", "with-in-str", "with-loading-context", "with-local-vars", "with-meta", "with-open", "with-out-str", "with-precision", "with-redefs", "with-redefs-fn", "with-test", "with-test-out", "aset-boolean", "aset-byte", "aset-char", "aset-double", "aset-float", "aset-int", "aset-long", "aset-short", "char-escape-string", "char-name-string", "clojure-version", "compare", "complement", "default-data-readers", "every-pred", "juxt", "ex-data", "ex-info", "identity", "keyword", "line-seq", "macroexpand-1", "macroexpand", "parse", "pr", "prn", "print", "printf", "println", "pr-str", "prn-str", "print-dup", "print-str", "println-str", "flush", "format", "io!", "newline", "rand", "rand-int", "rand-nth", "re-find", "re-groups", "re-matcher", "re-matches", "re-pattern", "re-seq", "slurp", "spit", "test", "time", "transient", "assoc!", "conj!", "disj!", "dissoc!", "persistent!", "pop!", "accessor", "aget", "alength", "areduce", "aset", "assoc", "assoc-in", "butlast", "comp", "comparator", "concat", "conj", "cons", "constantly", "count", "cycle", "disj", "dissoc", "distinct", "drop", "drop-last", "drop-while", "ffirst", "find", "first", "flatten", "fnext", "fnil", "frequencies", "frest", "get", "get-in", "group-by", "interleave", "into", "into-array", "iterate", "key", "keep", "keep-indexed", "keys", "last", "lazy-cat", "lazy-cons", "lazy-seq", "max", "max-key", "merge", "merge-with", "min", "min-key", "mix-collection-hash", "munge", "next", "nfirst", "nnext", "nth", "nthnext", "nthrest", "peek", "pop", "put", "pvalues", "range", "reduce", "reduced", "reduce-kv", "reductions", "remove", "repeat", "repeatedly", "replace", "replicate", "rest", "reverse", "rfirst", "rrest", "rseq", "rsubseq", "second", "select-keys", "shuffle", "some", "some->", "some->>", "some-fn", "split-at", "split-with", "subs", "subseq", "subvec", "take", "take-last", "take-nth", "take-while", "to-array", "to-array-2d", "update-in", "val", "vals", "resultset-seq", "zipmap", });
        KEYWORDS1.add("KEYWORD4", new String[]{"&", "*1", "*2", "*3", "*agent*", "*clojure-version*", "*command-line-args*", "*compile-files*", "*compile-path*", "*compiler-options*", "*data-readers*", "*default-data-reader-fn*", "*e", "*file*", "*flush-on-newline*", "*err*", "*in*", "*out*", "*ns*", "*open-url-script*", "*print-base*", "*print-dup*", "*print-length*", "*print-level*", "*print-miser-width*", "*print-meta*", "*print-pprint-dispatch*", "*print-pretty*", "*print-radix*", "*print-readably*", "*print-right-margin*", "*print-suppress-namespaces*", "*read-eval*", "*unchecked-math*", "*warn-on-reflection*", "*current*", "*sb*", "*stack*", "*state*", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, EOL_SPAN3, EOL_SPAN4, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, SPAN7, SPAN8, SPAN9, SPAN10, SPAN11, SPAN12, SPAN13, SPAN14, SPAN15, SPAN16, SPAN17, SPAN18, SPAN19, SPAN20, SPAN21, SPAN22, SPAN23, SPAN24, SPAN25, SPAN26, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, MARK_FOLLOWING2, MARK_FOLLOWING3, MARK_FOLLOWING4, MARK_FOLLOWING5, MARK_FOLLOWING6, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "STRINGS";
        RULES1.HIGHLIGHT_DIGITS = "FALSE";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.IGNORE_CASE = "TRUE";

        SEQ_REGEXP1.text = "\\\\.";
        SEQ_REGEXP1.AT_WORD_START = "FALSE";
        SEQ_REGEXP1.TYPE = "LABEL";
        SEQ_REGEXP1.HASH_CHAR = "\\";


        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "REGEXPS";
        RULES1.HIGHLIGHT_DIGITS = "FALSE";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.IGNORE_CASE = "TRUE";

        SEQ_REGEXP1.text = "\\\\.";
        SEQ_REGEXP1.AT_WORD_START = "FALSE";
        SEQ_REGEXP1.TYPE = "LABEL";
        SEQ_REGEXP1.HASH_CHAR = "\\";


        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}