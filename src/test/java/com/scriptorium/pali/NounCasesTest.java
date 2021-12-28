package com.scriptorium.pali;

import com.scriptorium.pali.enums.Gender;
import com.scriptorium.pali.enums.NumberType;
import com.scriptorium.pali.enums.WordCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.scriptorium.pali.enums.NumberType.*;
import static com.scriptorium.pali.enums.WordCase.*;
import static org.junit.jupiter.api.Assertions.*;

class NounCasesTest {

    @Test
    @DisplayName("All cases for dhamma: male '-a'")
    void getDhamma() {
        var dhamma = new NounCases("dhamma", Gender.MUSCLE);
        var dhammaNomSg = dhamma.getFormsFor(NOM, SG);
        assertLinesMatch(List.of("dhammo"), dhammaNomSg);
        var dhammaNomPl = dhamma.getFormsFor(NOM, PL);
        assertLinesMatch(List.of("dhammā"), dhammaNomPl);
        var dhammaDatSg = dhamma.getFormsFor(DAT, SG);
        assertLinesMatch(List.of("dhammāya", "dhammassa"), dhammaDatSg);
        var dhammaAblSg = dhamma.getFormsFor(ABL, SG);
        assertLinesMatch(List.of("dhammā", "dhammasmā", "dhammamhā"), dhammaAblSg);
    }
}