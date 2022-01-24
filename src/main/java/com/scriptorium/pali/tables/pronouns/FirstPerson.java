package com.scriptorium.pali.tables.pronouns;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class FirstPerson {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("ahaṃ"),
            ACC, List.of("maṃ", "mamaṃ"),
            INS, List.of("mayā", "me"),
            DAT, List.of("mama", "mayhaṃ", "mamaṃ", "amhaṃ", "me"),
            ABL, List.of("mayā"),
            GEN, List.of("mama", "mayhaṃ", "mamaṃ", "amhaṃ", "me"),
            LOC, List.of("mayi"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("mayaṃ", "amhe"),
            ACC, List.of("amhe", "asme", "amhākaṃ", "asmākaṃ", "no"),
            INS, List.of("amhehi", "amhebhi", "no"),
            DAT, List.of("amhākaṃ", "asmākaṃ", "amhaṃ", "no"),
            ABL, List.of("amhehi", "amhebhi"),
            GEN, List.of("amhākaṃ", "asmākaṃ", "amhaṃ", "no"),
            LOC, List.of("amhesu"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private FirstPerson() { }
}
