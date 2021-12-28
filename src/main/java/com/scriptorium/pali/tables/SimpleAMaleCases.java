package com.scriptorium.pali.tables;

import com.scriptorium.pali.enums.WordCase;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class SimpleAMaleCases {
    private SimpleAMaleCases() {
    }

    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.ofEntries(
            new SimpleImmutableEntry<>(NOM, List.of("o")),
            new SimpleImmutableEntry<>(ACC, List.of("aṃ")),
            new SimpleImmutableEntry<>(INS, List.of("ena")),
            new SimpleImmutableEntry<>(DAT, List.of("āya", "assa")),
            new SimpleImmutableEntry<>(ABL, List.of("ā", "asmā", "amhā")),
            new SimpleImmutableEntry<>(GEN, List.of("assa")),
            new SimpleImmutableEntry<>(LOC, List.of("e", "asmiṃ", "amhi")),
            new SimpleImmutableEntry<>(VOC, List.of("a"))
    );

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.ofEntries(
            new SimpleImmutableEntry<>(NOM, List.of("ā")),
            new SimpleImmutableEntry<>(ACC, List.of("e")),
            new SimpleImmutableEntry<>(INS, List.of("ehi", "ebhi")),
            new SimpleImmutableEntry<>(DAT, List.of("ānaṃ")),
            new SimpleImmutableEntry<>(ABL, List.of("ehi", "ebhi")),
            new SimpleImmutableEntry<>(GEN, List.of("ānaṃ")),
            new SimpleImmutableEntry<>(LOC, List.of("esu")),
            new SimpleImmutableEntry<>(VOC, List.of("ā"))
    );

}
