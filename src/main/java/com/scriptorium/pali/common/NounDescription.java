package com.scriptorium.pali.common;

import com.scriptorium.pali.enums.NumberType;
import com.scriptorium.pali.enums.WordCase;

public record NounDescription(WordCase wordCase, NumberType numberType) {
    @Override
    public String toString() {
        return "[" + wordCase.getSymbol() +", " + numberType.toString() + "]";
    }
}
