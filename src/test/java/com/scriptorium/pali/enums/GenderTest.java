package com.scriptorium.pali.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class GenderTest {
    @Test
    public void knownSymbolMuscle() {
        Gender gender = Gender.from("m");
        assertEquals(Gender.MUSCLE, gender);
    }

    @Test
    public void knownSymbolNeutral() {
        Gender gender = Gender.from("N");
        assertEquals(Gender.NEUTRAL, gender);
    }

    @Test
    public void knownSymbolFemale() {
        Gender gender = Gender.from("f");
        assertEquals(Gender.FEMALE, gender);
    }

    @Test
    public void unknownSymbol() {
        Gender gender = Gender.from("l");
        assertNull(gender);
    }



}