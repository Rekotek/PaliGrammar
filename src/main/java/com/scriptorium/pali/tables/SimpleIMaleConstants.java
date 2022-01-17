package com.scriptorium.pali.tables;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;
import static com.scriptorium.pali.enums.WordCase.VOC;

public class SimpleIMaleConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("i"),
            ACC, List.of("iṃ"),
            INS, List.of("inā"),
            DAT, List.of("ino", "issa"),
            ABL, List.of("inā", "ismā", "imhā"),
            GEN, List.of("ino", "issa"),
            LOC, List.of("ismiṃ", "imhi"),
            VOC, List.of("i"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("ī", "ayo"),
            ACC, List.of("ī", "ayo"),
            INS, List.of("īhi", "ībhi"),
            DAT, List.of("īnaṃ"),
            ABL, List.of("īhi", "ībhi"),
            GEN, List.of("īnaṃ"),
            LOC, List.of("īsu"),
            VOC, List.of("ī", "ayo"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private SimpleIMaleConstants() { }
}
