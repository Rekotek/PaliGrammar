package com.scriptorium.pali.tables.nouncases.female;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class ArFemaleConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("ā"),
            ACC, List.of("araṃ"),
            INS, List.of("arā", "uyā"),
            DAT, List.of("u", "uyā"),
            ABL, List.of("arā", "uyā"),
            GEN, List.of("u", "uyā"),
            LOC, List.of("ari", "uyā", "uyaṃ"),
            VOC, List.of("a", "ā"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("aro"),
            ACC, List.of("aro"),
            INS, List.of("ūhi"),
            DAT, List.of("ūnaṃ"),
            ABL, List.of("ūhi"),
            GEN, List.of("ūnaṃ"),
            LOC, List.of("ūsu"),
            VOC, List.of("aro"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private ArFemaleConstants()  { }
}
