package com.scriptorium.pali.tables.pronouns;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class RelativeNeutralConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("yaṃ", "yad"),
            ACC, List.of("yaṃ", "yad"),
            INS, List.of("yena"),
            DAT, List.of("yassa"),
            ABL, List.of("yamhā", "yasmā"),
            GEN, List.of("yassa"),
            LOC, List.of("yamhi", "yasmiṃ"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("yāni"),
            ACC, List.of("yāni"),
            INS, List.of("yehi", "yebhi"),
            DAT, List.of("yesaṃ", "yesānaṃ"),
            ABL, List.of("yehi", "yebhi"),
            GEN, List.of("yesaṃ", "yesānaṃ"),
            LOC, List.of("yesu"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private RelativeNeutralConstants() { }
}
