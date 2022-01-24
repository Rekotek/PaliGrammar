package com.scriptorium.pali.enums;

import com.scriptorium.pali.common.GrammarDefinitions;

public enum WordForm implements GrammarDefinitions {
    NOUN("", "noun", "существительное"),
    ADJ("adj", "adjective", "прилагательное"),
    ADV("adv", "adverb", "наречие"),
    PRAEP("praep", "praeposition", "предлог"),
    CONJ("conj", "conjuction", "союз"),
    PCL("pcl", "particule", "частица"),
    IJ("ij", "interjection", "междометие"),
    PR("pr", "present", "настоящее время"),
    GER("ger", "gerund", "герундий"),
    INF("inf", "infinitive", "инфинитив"),
    FUT("fut", "future", "будущее время"),
    VERB("v", "verb", "глагол");

    private final String symbol;
    private final String longDefinition;
    private final String rusDefinition;

    WordForm(String smb, String lng, String rus) {
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
}
