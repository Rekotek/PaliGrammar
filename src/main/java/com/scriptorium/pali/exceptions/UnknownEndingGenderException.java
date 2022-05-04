package com.scriptorium.pali.exceptions;

import com.scriptorium.pali.common.EndingDescription;

public class UnknownEndingGenderException extends RuntimeException {

    public UnknownEndingGenderException(EndingDescription unknownType) {
        super(String.format("Неизвестное окончание %s для рода %s", unknownType.endingType(), unknownType.gender()));
    }
}
