package com.scriptorium.pali;

import com.scriptorium.pali.common.NounDescription;
import com.scriptorium.pali.enums.Gender;
import com.scriptorium.pali.enums.WordCase;
import com.scriptorium.pali.exceptions.UnknownEndingGenderException;
import org.junit.jupiter.api.Assertions;
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
    @DisplayName("All cases for itthi: female '-i'")
    void getItthi() {
        var itthi = new NounCases("itthi", Gender.FEMALE);
        var itthiNomSg = itthi.getFormsFor(NOM, SG);
        assertLinesMatch(List.of("itthi"), itthiNomSg);
        var itthiNomPl = itthi.getFormsFor(NOM, PL);
        assertEquals(2, itthiNomPl.size());
        assertLinesMatch(List.of("itthiyo", "itthī"), itthiNomPl);
        var itthiDatSg = itthi.getFormsFor(DAT, SG);
        assertLinesMatch(List.of("itthiyā"), itthiDatSg);
        var ittthiLocSg = itthi.getFormsFor(LOC, SG);
        assertTrue(ittthiLocSg.containsAll(List.of("itthiyā", "itthiyaṃ")));
    }

    @Test
    @DisplayName("Search back for possible cases for dhamma: male '-a'")
    void searchBackDhamma() {
        final String DHAMMENA = "dhammena";
        var dhamma = new NounCases("dhamma", Gender.MUSCLE);
        var possibleInsCase = dhamma.getPossibleCasesFor(DHAMMENA);
        assertEquals(possibleInsCase.size(), 1);
        assertEquals(possibleInsCase.get(0), new NounDescription(INS, SG));
        final String DHAMMASSA = "dhammassa";
        var possibleAssaCases = dhamma.getPossibleCasesFor(DHAMMASSA);
        System.out.printf("========= %s ==========\n", DHAMMASSA);
        assertEquals(possibleAssaCases.size(), 2);
        assertEquals(possibleAssaCases.get(0).numberType(), SG);
        assertEquals(possibleAssaCases.get(1).numberType(), SG);
        possibleAssaCases.forEach(System.out::println);
        final String DHAMMAA = "dhammā";
        var possibleLongACases = dhamma.getPossibleCasesFor(DHAMMAA);
        System.out.printf("========= %s ==========\n", DHAMMAA);
        assertEquals(possibleLongACases.size(), 3);
        possibleLongACases.forEach(System.out::println);
    }

    @Test
    @DisplayName("Search back for possible cases for itthi: female '-i'")
    void searchBackItthi() {
        final String ITTHIYAA = "itthiyā";
        var itthi = new NounCases("itthi", Gender.FEMALE);
        var possibleYaCases = itthi.getPossibleCasesFor(ITTHIYAA);
        System.out.printf("========= %s ==========\n", ITTHIYAA);
        assertEquals(possibleYaCases.size(), 5);
        assertEquals(possibleYaCases.get(0), new NounDescription(INS, SG));
        possibleYaCases.forEach(System.out::println);
        final String ITTHINAM = "itthīnaṃ";
        var possibleInamCases = itthi.getPossibleCasesFor(ITTHINAM);
        System.out.printf("========= %s ==========\n", ITTHINAM);
        assertEquals(possibleInamCases.size(), 2);
        assertEquals(possibleInamCases.get(0).numberType(), PL);
        assertEquals(possibleInamCases.get(1).numberType(), PL);
        possibleInamCases.forEach(System.out::println);
        final String ITTHII = "itthī";
        var possibleLongICases = itthi.getPossibleCasesFor(ITTHII);
        System.out.printf("========= %s ==========\n", ITTHII);
        assertEquals(possibleLongICases.size(), 3);
        possibleLongICases.forEach(System.out::println);
    }

    @Test
    @DisplayName("Not found possible forms")
    public void notFoundPossibleForms() {
        var dhamma = new NounCases("dhamma", Gender.MUSCLE);
        List<NounDescription> impossible = dhamma.getPossibleCasesFor("impossible");
        assertNotNull(impossible);
        assertEquals(0, impossible.size());
    }

    @Test
    @DisplayName("Found bug when enter akusala and f")
    public void incorrectFemaleOnA() {
        var akusala = new NounCases("akusala", Gender.FEMALE);
        var mapOfCases = akusala.getAllCasesForNumber(SG);
        assertNotNull(mapOfCases);
        mapOfCases.forEach((wordCase, list) -> System.out.printf("%s -> %s\n", wordCase, list));
    }

    @Test
    @DisplayName("Forms for 'satthar'")
    public void getSatthar() {
        var satthar = new NounCases("satthar", Gender.MUSCLE);
        var mapOfCases = satthar.getAllCasesForNumber(SG);
        assertNotNull(mapOfCases);
        mapOfCases.forEach((wordCase, list) -> System.out.printf("%s -> %s\n", wordCase, list));
    }

    @Test
    @DisplayName("Impossible ending for given gender")
    public void impossibleForm() {
        var exception = Assertions.assertThrows(UnknownEndingGenderException.class, () -> new NounCases("satthar", Gender.NEUTRAL));
        System.out.println(exception.getMessage());
    }

    @Test
    @Disabled("Just for printing forms")
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

    @Test
    @Disabled("Just for printing forms")
    @DisplayName("Print all forms for 'itthi': female '-i'")
    void printItthi() {
        var itthi = new NounCases("itthi", Gender.FEMALE);
        Arrays.stream(WordCase.values()).forEach(wordCase -> {
            var sgForms = itthi.getFormsFor(wordCase, SG);
            assertNotNull(sgForms);
            var plForms = itthi.getFormsFor(wordCase, PL);
            assertNotNull(plForms);
            System.out.printf("%s\t", wordCase.getSymbol());
            sgForms.forEach(s -> System.out.printf("%s ", s));
            System.out.print("\t|\t");
            plForms.forEach(s -> System.out.printf("%s ", s));
            System.out.println();
        });
    }

    @Test
    @Disabled("Print forms")
    @DisplayName("Print all forms for 'maccharin': neutral '-in'")
    void printMaccharin() {
        var maccharin = new NounCases("maccharin", Gender.NEUTRAL);
        Arrays.stream(WordCase.values()).forEach(wordCase -> {
            var sgForms = maccharin.getFormsFor(wordCase, SG);
            assertNotNull(sgForms);
            var plForms = maccharin.getFormsFor(wordCase, PL);
            assertNotNull(plForms);
            System.out.printf("%s\t", wordCase.getSymbol());
            sgForms.forEach(s -> System.out.printf("%s ", s));
            System.out.print("\t|\t");
            plForms.forEach(s -> System.out.printf("%s ", s));
            System.out.println();
        });
    }

    @Test
    @Disabled
    void printAllForms() {
        var dhamma = new NounCases("dhamma", Gender.MUSCLE);
        System.out.println(dhamma.toHtml());
    }
}