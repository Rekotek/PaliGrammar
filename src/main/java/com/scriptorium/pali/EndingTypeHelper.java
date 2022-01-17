package com.scriptorium.pali;

import com.scriptorium.pali.enums.EndingType;

public class EndingTypeHelper {
    public static EndingType indentify(String word) {
        EndingType[] endingTypes = EndingType.values();
        for (EndingType endingType : endingTypes) {
            if(word.endsWith(endingType.toString())) return endingType;
        }
        throw new IllegalArgumentException(String.format("Неизвестное окончание слова %s", word));
    }
    private EndingTypeHelper() { }
}
