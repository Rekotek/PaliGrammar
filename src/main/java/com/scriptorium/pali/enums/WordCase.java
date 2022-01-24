package com.scriptorium.pali.enums;

import com.scriptorium.pali.common.GrammarDefinitions;
import com.scriptorium.pali.common.HtmlOutput;

public enum WordCase implements HtmlOutput, GrammarDefinitions {
    NOM("N", "Nominativus", "Именительный"),
    ACC("A", "Accusativus", "Винительный"),
    INS("I", "Instrumentalis", "Творительный"),
    DAT("D", "Dativus", "Дательный"),
    ABL("Abl", "Ablativus", "Отложительный"),
    GEN("G", "Genetivus", "Родительный"),
    LOC("L", "Locativus", "Местный"),
    VOC("Voc", "Vocativus", "Звательный");

    private final String symbol;
    private final String longDefinition;
    private final String rusDefinition;

    WordCase(String smb, String lng, String rus) {
        this.symbol = smb;
        this.longDefinition = lng;
        this.rusDefinition = rus;
    }

    public String getSymbol() {
        return symbol;
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
    public String toHtml() {
        return symbol;
    }
}
