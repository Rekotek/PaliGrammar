package com.scriptorium.pali.enums;

import com.scriptorium.pali.common.HtmlOutput;

public enum NumberType  implements HtmlOutput {
    SG("sg", "singular", "ед. число"),
    PL("pl", "plurals", "мн. число");

    private final String symbol;

    NumberType(String smb, String longDefinition, String rusDefinition) {
        this.symbol = smb;
    }

    @Override
    public String toString() {
        return symbol;
    }

    @Override
    public String toHtml() {
        return String.format("<i>%s.</i>", symbol);
    }
}
