package com.scriptorium.pali;

import com.scriptorium.pali.enums.EndingType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NounEndingTypeTest {
    @Test
    @DisplayName("Define ending type by given dhatu -a")
    public void testSimpleA() {
        var givenWord = "dhamma";
        var resultType =EndingTypeHelper.indentify(givenWord);
        assertEquals(EndingType.SHORT_A, resultType);
    }

    @Test
    @DisplayName("Define ending type by given dhatu -ā")
    public void testLongA() {
        var givenWord = "sitā";
        var resultType =EndingTypeHelper.indentify(givenWord);
        assertEquals(EndingType.LONG_A, resultType);
    }

    @Test
    @DisplayName("Define ending type by given dhatu -i")
    public void testSimpleI() {
        var givenWord = "itthi";
        var resultType =EndingTypeHelper.indentify(givenWord);
        assertEquals(EndingType.SHORT_I, resultType);
    }

    @Test
    @DisplayName("Define ending type by given dhatu -ī")
    public void testLongI() {
        var givenWord = "middhī";
        var resultType =EndingTypeHelper.indentify(givenWord);
        assertEquals(EndingType.LONG_I, resultType);
    }

    @Test
    @DisplayName("Define ending type by given dhatu -u")
    public void testSimpleU() {
        var givenWord = "bhikkhu";
        var resultType =EndingTypeHelper.indentify(givenWord);
        assertEquals(EndingType.SHORT_U, resultType);
    }

    @Test
    @DisplayName("Define ending type by given dhatu -ū")
    public void testLongU() {
        var givenWord = "akataññū";
        var resultType =EndingTypeHelper.indentify(givenWord);
        assertEquals(EndingType.LONG_U, resultType);
    }

    @Test
    @DisplayName("Define ending type by given dhatu -vant")
    public void testVant() {
        var givenWord = "bhagavant";
        var resultType =EndingTypeHelper.indentify(givenWord);
        assertEquals(EndingType.VANT, resultType);
    }

    @Test
    @DisplayName("Define ending type by given dhatu -mant")
    public void testMant() {
        var givenWord = "chakkhumant";
        var resultType =EndingTypeHelper.indentify(givenWord);
        assertEquals(EndingType.MANT, resultType);
    }

}
