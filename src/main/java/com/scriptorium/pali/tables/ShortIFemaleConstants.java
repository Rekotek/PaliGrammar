package com.scriptorium.pali.tables;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class ShortIFemaleConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("i"),
            ACC, List.of("iṃ"),
            INS, List.of("iyā"),
            DAT, List.of("iyā"),
            ABL, List.of("iyā"),
            GEN, List.of("iyā"),
            LOC, List.of("iyā", "iyaṃ"),
            VOC, List.of("i"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("iyo", "ī"),
            ACC, List.of("iyo", "ī"),
            INS, List.of("īhi", "ībhi"),
            DAT, List.of("īnaṃ"),
            ABL, List.of("īhi", "ībhi"),
            GEN, List.of("īnaṃ"),
            LOC, List.of("īsu"),
            VOC, List.of("iyo", "ī"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private ShortIFemaleConstants() { }
}
