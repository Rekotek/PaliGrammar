package com.scriptorium.pali.tables;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class ShortUMaleConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("u"),
            ACC, List.of("uṃ"),
            INS, List.of("unā"),
            DAT, List.of("uno", "ussa"),
            ABL, List.of("unā"),
            GEN, List.of("uno", "ussa"),
            LOC, List.of("umhi", "usmiṃ"),
            VOC, List.of("u"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("ū"),
            ACC, List.of("avo"),
            INS, List.of("ūhi", "ūbhi"),
            DAT, List.of("ūnaṃ"),
            ABL, List.of("ūhi", "ūbhi"),
            GEN, List.of("ūnaṃ"),
            LOC, List.of("ūsu"),
            VOC, List.of("ū", "avo"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private ShortUMaleConstants() { }
}
