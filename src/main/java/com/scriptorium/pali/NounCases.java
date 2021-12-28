package com.scriptorium.pali;

import com.scriptorium.pali.enums.Gender;
import com.scriptorium.pali.enums.NumberType;
import com.scriptorium.pali.enums.WordCase;
import com.scriptorium.pali.tables.SimpleAMaleCases;

import java.util.List;
import java.util.stream.Collectors;

public class NounCases {
    private final String givenWord;
    private final Gender gender;
    private final String simplifiedWord;
    private final String ending;

    public NounCases(String dhatu, Gender wordGender) {
        this.givenWord = dhatu;
        this.gender = wordGender;
        if (dhatu.endsWith("a")) {
            ending = "a";
            simplifiedWord = dhatu.substring(0, dhatu.length() - 1);
        } else {
            throw new IllegalArgumentException("No Ending forms found");
        }
    }

    public List<String> getFormsFor(WordCase wordCase, NumberType numberType) {
        List<String> endings;
        if (numberType == NumberType.SG) {
            endings = SimpleAMaleCases.SINGULAR_FORM.get(wordCase);
        } else {
            endings = SimpleAMaleCases.PLURAL_FORM.get(wordCase);
        }

        return endings.stream().map(s ->
                simplifiedWord + s
        ).collect(Collectors.toList());
    }
}
