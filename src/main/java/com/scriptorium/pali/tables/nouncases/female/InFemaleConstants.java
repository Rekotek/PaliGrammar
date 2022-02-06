package com.scriptorium.pali.tables.nouncases.female;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class InFemaleConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("inī"),
            ACC, List.of("iniṃ"),
            INS, List.of("iniyā"),
            DAT, List.of("iniyā"),
            ABL, List.of("iniyā"),
            GEN, List.of("iniyā"),
            LOC, List.of("iniyā", "iniyaṃ"),
            VOC, List.of("ini"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("iniyo", "inī"),
            ACC, List.of("iniyo", "inī"),
            INS, List.of("inīhi", "inībhi"),
            DAT, List.of("inīnaṃ"),
            ABL, List.of("inīhi", "inībhi"),
            GEN, List.of("inīnaṃ"),
            LOC, List.of("inīsu"),
            VOC, List.of("iniyo", "inī"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private InFemaleConstants() { }
}
