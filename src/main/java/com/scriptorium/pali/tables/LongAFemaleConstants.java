package com.scriptorium.pali.tables;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;
import static com.scriptorium.pali.enums.WordCase.VOC;

public class LongAFemaleConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("ā"),
            ACC, List.of("aṃ"),
            INS, List.of("āya"),
            DAT, List.of("āya"),
            ABL, List.of("āya"),
            GEN, List.of("āya"),
            LOC, List.of("āya", "āyaṃ"),
            VOC, List.of("e"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("āyo", "ā"),
            ACC, List.of("āyo", "ā"),
            INS, List.of("āhi", "ābhi"),
            DAT, List.of("ānaṃ"),
            ABL, List.of("āhi", "ābhi"),
            GEN, List.of("ānaṃ"),
            LOC, List.of("āsu"),
            VOC, List.of("āyo", "ā"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private LongAFemaleConstants() { }
}
