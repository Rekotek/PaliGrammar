package com.scriptorium.pali.tables.nouncases.neutral;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class MantNeutralConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("maṃ"),
            ACC, List.of("maṃ"),
            INS, List.of("matā", "mantena"),
            DAT, List.of("mato", "mantassa"),
            ABL, List.of("matā", "mantasmā", "mantamhā"),
            GEN, List.of("mato", "mantassa"),
            LOC, List.of("mati", "mante", "mantasmiṃ", "mantamhi"),
            VOC, List.of("mā"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("manti", "mantāni"),
            ACC, List.of("manti", "mantāni"),
            INS, List.of("mantehi", "mantebhi"),
            DAT, List.of("mataṃ", "mantānam"),
            ABL, List.of("mantehi", "mantebhi"),
            GEN, List.of("mataṃ", "mantānam"),
            LOC, List.of("mantesu"),
            VOC, List.of("manti", "mantāni"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private MantNeutralConstants() { }
}
