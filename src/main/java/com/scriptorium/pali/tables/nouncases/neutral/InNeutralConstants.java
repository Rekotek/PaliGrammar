package com.scriptorium.pali.tables.nouncases.neutral;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class InNeutralConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("i", "iṃ"),
            ACC, List.of("i", "iṃ"),
            INS, List.of("inā", "imhā", "ismā"),
            DAT, List.of("ino", "issa"),
            ABL, List.of("inā", "imhā", "ismā"),
            GEN, List.of("ino", "issa"),
            LOC, List.of("ini", "ismiṃ", "imhi"),
            VOC, List.of("i", "iṃ"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("ī", "īni"),
            ACC, List.of("ī", "īni"),
            INS, List.of("īhi", "ībhi"),
            DAT, List.of("īnaṃ"),
            ABL, List.of("īhi", "ībhi"),
            GEN, List.of("īnaṃ"),
            LOC, List.of("īsu"),
            VOC, List.of("ī", "īni"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private InNeutralConstants() { }
}
