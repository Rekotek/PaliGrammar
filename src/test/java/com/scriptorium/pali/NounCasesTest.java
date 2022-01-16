package com.scriptorium.pali;

import com.scriptorium.pali.enums.Gender;
import com.scriptorium.pali.enums.WordCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.scriptorium.pali.enums.NumberType.PL;
import static com.scriptorium.pali.enums.NumberType.SG;
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

    @Test
    @DisplayName("Search back for possible cases for dhamma: male '-a'")
    void searchBackDhamma() {
        var dhamma = new NounCases("dhamma", Gender.MUSCLE);
        var possibleInsCase = dhamma.getPossibleCasesFor("dhammena");
        assertEquals(possibleInsCase.size(), 1);
        assertEquals(possibleInsCase.get(0), new NounDescription(INS, SG));
        var possibleAssaCases = dhamma.getPossibleCasesFor("dhammassa");
        assertEquals(possibleAssaCases.size(), 2);
        assertEquals(possibleAssaCases.get(0).numberType(), SG);
        assertEquals(possibleAssaCases.get(1).numberType(), SG);
        possibleAssaCases.forEach(System.out::println);
        var possibleLongACases = dhamma.getPossibleCasesFor("dhammā");
        assertEquals(possibleLongACases.size(), 3);
        possibleLongACases.forEach(System.out::println);
    }

    @Test
    @Disabled
    @DisplayName("Print all forms for 'purisa': male '-a'")
    void printPurisa() {
        var purisa = new NounCases("purisa", Gender.MUSCLE);
        Arrays.stream(WordCase.values()).forEach(wordCase -> {
            var sgForms = purisa.getFormsFor(wordCase, SG);
            assertNotNull(sgForms);
            var plForms = purisa.getFormsFor(wordCase, PL);
            assertNotNull(plForms);
            System.out.printf("%s\t", wordCase.getSymbol());
            sgForms.forEach(s -> System.out.printf("%s ", s));
            System.out.print("\t|\t");
            plForms.forEach(s -> System.out.printf("%s ", s));
            System.out.println();
        });
    }
}