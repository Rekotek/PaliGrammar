package com.scriptorium.pali.tables.pronouns;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class ThirdFemalePerson {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("sā"),
            ACC, List.of("taṃ"),
            INS, List.of("tāya"),
            DAT, List.of("tāya", "tassā", "tassāya", "tissā", "tissāya"),
            ABL, List.of("tāya"),
            GEN, List.of("tāya", "tassā", "tassāya", "tissā", "tissāya"),
            LOC, List.of("tāyaṃ", "tāsaṃ", "tassaṃ", "tissaṃ"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("tā", "tāyo"),
            ACC, List.of("tā", "tāyo"),
            INS, List.of("tāhi", "tābhi"),
            DAT, List.of("tāsaṃ", "tāsānaṃ"),
            ABL, List.of("tāhi", "tābhi"),
            GEN, List.of("tāsaṃ", "tāsānaṃ"),
            LOC, List.of("tāsu"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private ThirdFemalePerson() { }
}
