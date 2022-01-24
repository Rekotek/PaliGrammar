package com.scriptorium.pali.tables.pronouns;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class RelativeFemaleConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("yā"),
            ACC, List.of("yaṃ"),
            INS, List.of("yāna"),
            DAT, List.of("yāya", "yassā"),
            ABL, List.of("yāna"),
            GEN, List.of("yāya", "yassā"),
            LOC, List.of("yāyaṃ", "yassaṃ"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("yā", "yāyo"),
            ACC, List.of("yā", "yāyo"),
            INS, List.of("yāhi", "yābhi"),
            DAT, List.of("yāsaṃ", "yāsānaṃ"),
            ABL, List.of("yāhi", "yābhi"),
            GEN, List.of("yāsaṃ", "yāsānaṃ"),
            LOC, List.of("yāsu"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private RelativeFemaleConstants() { }
}
