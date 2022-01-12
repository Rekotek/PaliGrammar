package com.scriptorium.pali.tables;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class SimpleANeutralConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("aṃ"),
            ACC, List.of("aṃ"),
            INS, List.of("ena"),
            DAT, List.of("āya", "assa"),
            ABL, List.of("ā", "asmā", "amhā"),
            GEN, List.of("assa"),
            LOC, List.of("e", "asmiṃ", "amhi"),
            VOC, List.of("a", "aṃ"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("āni"),
            ACC, List.of("āni"),
            INS, List.of("ehi", "ebhi"),
            DAT, List.of("ānaṃ"),
            ABL, List.of("ehi", "ebhi"),
            GEN, List.of("ānaṃ"),
            LOC, List.of("esu"),
            VOC, List.of("āni"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private SimpleANeutralConstants() { }
}
