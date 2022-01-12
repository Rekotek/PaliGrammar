package com.scriptorium.pali.enums;

public enum WordCase {
    NOM("N", "Nominativus", "Именительный"),
    ACC("A", "Accusativus", "Винительный"),
    INS("I", "Instrumentalis", "Творительный"),
    DAT("D", "Dativus", "Дательный"),
    ABL("Abl", "Ablativus", "Отложительный"),
    GEN("G", "Genetivus", "Родительный"),
    LOC("L", "Locativus", "Местный"),
    VOC("Voc", "Vocativus", "Звательный");

    private final String symbol;

    WordCase(String symbol, String longDefinition, String rusDefinition) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
