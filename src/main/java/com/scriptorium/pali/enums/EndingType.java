package com.scriptorium.pali.enums;

public enum EndingType {
    SHORT_A("a"),
    LONG_A("ā"),
    SHORT_I("i"),
    LONG_I("ī"),
    SHORT_U("u"),
    LONG_U("ū");

    private final String end;

    EndingType(String endings) {
        this.end = endings;
    }
}
