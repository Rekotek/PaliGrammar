package com.scriptorium.pali.tables.nouncases.male;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class ArMaleConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("ā"),
            ACC, List.of("āraṃ"),
            INS, List.of("ārā", "unā"),
            DAT, List.of("u", "ussa", "uno"),
            ABL, List.of("ārā", "arā"),
            GEN, List.of("u", "ussa", "uno"),
            LOC, List.of("ari"),
            VOC, List.of("a", "ā", "e"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("āro"),
            ACC, List.of("āre", "āro"),
            INS, List.of("ehi", "ebhi", "ūhi"),
            DAT, List.of("ūnaṃ", "ārānaṃ", "ānaṃ"),
            ABL, List.of("ehi", "ebhi", "ūhi"),
            GEN, List.of("ūnaṃ", "ārānaṃ", "ānaṃ"),
            LOC, List.of("ūsu", "āresu"),
            VOC, List.of("āro"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private ArMaleConstants() {
    }
}
