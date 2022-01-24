package com.scriptorium.pali.enums;

import com.scriptorium.pali.common.GrammarDefinitions;
import com.scriptorium.pali.common.HtmlOutput;

public enum NumberType implements HtmlOutput, GrammarDefinitions {
    SG("sg", "singular", "ед. число"),
    PL("pl", "plurals", "мн. число");

    private final String symbol;
    private final String longDefinition;
    private final String rusDefinition;

    NumberType(String smb, String lng, String rus) {
        this.symbol = smb;
        this.longDefinition = lng;
        this.rusDefinition = rus;
    }

    @Override
    public String getLongDefinition() {
        return this.longDefinition;
    }

    @Override
    public String getRusDefinition() {
        return this.rusDefinition;
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
