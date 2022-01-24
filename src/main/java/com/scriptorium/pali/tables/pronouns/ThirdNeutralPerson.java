package com.scriptorium.pali.tables.pronouns;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class ThirdNeutralPerson {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("taṃ", "tad"),
            ACC, List.of("taṃ", "tad"),
            INS, List.of("tena"),
            DAT, List.of("tassa"),
            ABL, List.of("tamhā", "tasmā"),
            GEN, List.of("tassa"),
            LOC, List.of("tamhi", "tasmiṃ"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("tāni"),
            ACC, List.of("tāni"),
            INS, List.of("tehi", "tebhi"),
            DAT, List.of("tesaṃ", "tesānaṃ"),
            ABL, List.of("tehi", "tebhi"),
            GEN, List.of("tesaṃ", "tesānaṃ"),
            LOC, List.of("tesu"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

}
