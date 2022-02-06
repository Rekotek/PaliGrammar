package com.scriptorium.pali.tables.nouncases.male;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class InMaleConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("ī"),
            ACC, List.of("inaṃ", "iṃ"),
            INS, List.of("inā", "imhā", "ismā"),
            DAT, List.of("ino", "issa"),
            ABL, List.of("inā", "imhā", "ismā"),
            GEN, List.of("ino", "issa"),
            LOC, List.of("ini", "ismiṃ", "imhi"),
            VOC, List.of("i"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("ino", "ī"),
            ACC, List.of("ino", "ī"),
            INS, List.of("īhi", "ībhi"),
            DAT, List.of("īnaṃ"),
            ABL, List.of("īhi", "ībhi"),
            GEN, List.of("īnaṃ"),
            LOC, List.of("īsu"),
            VOC, List.of("ino", "ī"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private InMaleConstants() { }
}
