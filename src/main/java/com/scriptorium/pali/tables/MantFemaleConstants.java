package com.scriptorium.pali.tables;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class MantFemaleConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("mantī"),
            ACC, List.of("mantiṃ"),
            INS, List.of("mantiyā"),
            DAT, List.of("mantiyā"),
            ABL, List.of("mantiyā"),
            GEN, List.of("mantiyā"),
            LOC, List.of("mantiyā", "mantiyaṃ"),
            VOC, List.of("manti"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("mantiyo", "mantī"),
            ACC, List.of("mantiyo", "mantī"),
            INS, List.of("mantīhi", "mantībhi"),
            DAT, List.of("mantīnaṃ"),
            ABL, List.of("mantīhi", "mantībhi"),
            GEN, List.of("mantīnaṃ"),
            LOC, List.of("mantīsu"),
            VOC, List.of("mantiyo", "mantī"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private MantFemaleConstants() { }
}
