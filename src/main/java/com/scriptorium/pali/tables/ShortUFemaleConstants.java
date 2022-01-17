package com.scriptorium.pali.tables;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class ShortUFemaleConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("u"),
            ACC, List.of("uṃ"),
            INS, List.of("uyā"),
            DAT, List.of("uyā"),
            ABL, List.of("uyā"),
            GEN, List.of("uyā"),
            LOC, List.of("uyā", "uyaṃ"),
            VOC, List.of("u"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("uyo", "ū"),
            ACC, List.of("uyo", "ū"),
            INS, List.of("ūhi", "ūbhi"),
            DAT, List.of("ūnaṃ"),
            ABL, List.of("ūhi", "ūbhi"),
            GEN, List.of("ūnaṃ"),
            LOC, List.of("ūsu"),
            VOC, List.of("uyo", "ū"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private ShortUFemaleConstants() { }
}
