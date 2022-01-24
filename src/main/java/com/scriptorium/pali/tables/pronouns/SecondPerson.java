package com.scriptorium.pali.tables.pronouns;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class SecondPerson {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("tvaṃ"),
            ACC, List.of("taṃ", "tvaṃ", "tuvaṃ", "tavaṃ"),
            INS, List.of("tayā", "tvayā", "te"),
            DAT, List.of("tava", "tuyhaṃ", "tavaṃ", "tumhaṃ", "te"),
            ABL, List.of("tayā", "tvayā"),
            GEN, List.of("tava", "tuyhaṃ", "tavaṃ", "tumhaṃ", "te"),
            LOC, List.of("tayi", "tvayi"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("tumhe"),
            ACC, List.of("tumhe", "tumhākaṃ", "vo"),
            INS, List.of("tumhehi", "tumhebhi", "vo"),
            DAT, List.of("tumhaṃ", "tumhākaṃ", "vo"),
            ABL, List.of("tumhehi", "tumhebhi"),
            GEN, List.of("tumhaṃ", "tumhākaṃ", "vo"),
            LOC, List.of("tumhesu"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private SecondPerson() { }
}
