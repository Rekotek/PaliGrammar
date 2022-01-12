package com.scriptorium.pali.enums;

import com.scriptorium.pali.common.HtmlOutput;

public enum Gender implements HtmlOutput {
    MUSCLE("m"),
    NEUTRAL("n"),
    FEMALE("f");

    private final String symbol;

    Gender(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol + '.';
    }

    @Override
    public String toHtml() {
        return " <em>" + symbol + "</em>.";
    }
}
