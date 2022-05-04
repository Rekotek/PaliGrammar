package com.scriptorium.pali;

import com.scriptorium.pali.common.EndingDescription;
import com.scriptorium.pali.enums.EndingType;
import com.scriptorium.pali.tables.EndingFullFormsHelper;

public class EndingTypeHelper {
    public static EndingType indentify(String word) {
        EndingType[] endingTypes = EndingType.values();
        for (EndingType endingType : endingTypes) {
            if(word.endsWith(endingType.toString())) return endingType;
        }
        throw new IllegalArgumentException(String.format("Неизвестное окончание слова %s", word));
    }

    public static boolean checkEndingWithGender(EndingDescription ending) {
        return EndingFullFormsHelper.FULL_CASES.containsKey(ending);
    }
    private EndingTypeHelper() { }
}
