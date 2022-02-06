package com.scriptorium.pali.enums;

import com.scriptorium.pali.common.HtmlOutput;

import java.util.HashMap;
import java.util.Map;

public enum Gender implements HtmlOutput {
    MUSCLE("m"),
    NEUTRAL("n"),
    FEMALE("f");

    private final String symbol;
    private static final Map<String, Gender> ENUM_MAP;

    Gender(String symbol) {
        this.symbol = symbol;
    }

    static {
        var map = new HashMap<String, Gender>(3);
        for (Gender gender : Gender.values()) {
            map.put(gender.symbol, gender);
        }
        ENUM_MAP = Map.copyOf(map);
    }

    public static Gender from(String smb) {
        return ENUM_MAP.getOrDefault(smb.toLowerCase(), null);
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
