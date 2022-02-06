package com.scriptorium.pali.enums;

import com.scriptorium.pali.common.HtmlOutput;

public enum EndingType implements HtmlOutput {
    SHORT_A("a"),
    LONG_A("ā"),
    SHORT_I("i"),
    LONG_I("ī"),
    SHORT_U("u"),
    LONG_U("ū"),
    VANT("vant"),
    MANT("mant"),
    AR("ar"),
    IN("in");

    private final String end;

    EndingType(String endings) {
        this.end = endings;
    }

    @Override
    public String toString() {
        return end;
    }

    @Override
    public String toHtml() {
        return "-<strong>" + end + "</strong> ";
    }
}
