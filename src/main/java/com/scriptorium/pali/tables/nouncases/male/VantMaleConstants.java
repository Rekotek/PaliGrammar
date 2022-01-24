package com.scriptorium.pali.tables.nouncases.male;

import com.scriptorium.pali.enums.WordCase;

import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.WordCase.*;

public class VantMaleConstants {
    public static final Map<WordCase, List<String>> SINGULAR_FORM = Map.of(
            NOM, List.of("vā", "vanto"),
            ACC, List.of("vantaṃ", "vaṃ"),
            INS, List.of("vatā", "vantena"),
            DAT, List.of("vato", "vantassa"),
            ABL, List.of("vatā", "vantasmā", "vantamhā"),
            GEN, List.of("vato", "vantassa"),
            LOC, List.of("vati", "vante", "vantasmiṃ", "vantamhi"),
            VOC, List.of("vā", "va", "vanta"));

    public static final Map<WordCase, List<String>> PLURAL_FORM = Map.of(
            NOM, List.of("vanto", "vantā"),
            ACC, List.of("vanto", "vante"),
            INS, List.of("vantehi", "vantebhi"),
            DAT, List.of("vataṃ", "vantānam"),
            ABL, List.of("vantehi", "vantebhi"),
            GEN, List.of("vataṃ", "vantānam"),
            LOC, List.of("vantesu"),
            VOC, List.of("vanto", "vantā"));

    public static final List<Map<WordCase, List<String>>> ALL_FORMS = List.of(SINGULAR_FORM, PLURAL_FORM);

    private VantMaleConstants() { }
}
