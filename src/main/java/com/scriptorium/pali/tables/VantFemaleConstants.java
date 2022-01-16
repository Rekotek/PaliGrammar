package com.scriptorium.pali.tables;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class VantFemaleConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("vantī"),
            ACC, List.of("vantiṃ"),
            INS, List.of("vantiyā"),
            DAT, List.of("vantiyā"),
            ABL, List.of("vantiyā"),
            GEN, List.of("vantiyā"),
            LOC, List.of("vantiyā", "vantiyaṃ"),
            VOC, List.of("vanti"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("vantiyo", "vantī"),
            ACC, List.of("vantiyo", "vantī"),
            INS, List.of("vantīhi", "vantībhi"),
            DAT, List.of("vantīnaṃ"),
            ABL, List.of("vantīhi", "vantībhi"),
            GEN, List.of("vantīnaṃ"),
            LOC, List.of("vantīsu"),
            VOC, List.of("vantiyo", "vantī"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private VantFemaleConstants() { }
}
