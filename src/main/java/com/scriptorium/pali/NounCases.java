package com.scriptorium.pali;

import com.scriptorium.pali.enums.Gender;
import com.scriptorium.pali.enums.NumberType;
import com.scriptorium.pali.enums.WordCase;
import com.scriptorium.pali.tables.SimpleAMaleConstants;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.scriptorium.pali.enums.NumberType.PL;
import static com.scriptorium.pali.enums.NumberType.SG;

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

        if (numberType == SG) {
            endings = SimpleAMaleConstants.SINGULAR_FORM.get(wordCase);
        } else {
            endings = SimpleAMaleConstants.PLURAL_FORM.get(wordCase);
        }

        return endings.stream().map(s ->
                simplifiedWord + s
        ).collect(Collectors.toList());
    }

    public List<NounDescription> getPossibleCasesFor(String givenForm) {
        var resultSgList =
                retrieveCases(SimpleAMaleConstants.SINGULAR_FORM, givenForm);

        var resultPlList =
                retrieveCases(SimpleAMaleConstants.PLURAL_FORM, givenForm);

        var resultAllCases = new ArrayList<NounDescription>();
        resultSgList.forEach(wordCase -> resultAllCases.add(new NounDescription(wordCase, SG)));
        resultPlList.forEach(wordCase -> resultAllCases.add(new NounDescription(wordCase, PL)));
        return resultAllCases;
    }

    private List<WordCase> retrieveCases(Map<WordCase, List<String>> wordForms, String givenForm) {
        return wordForms.entrySet()
                .stream().filter(wordCaseListEntry -> checkPossibleCases(givenForm, wordCaseListEntry))
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());
    }

    private boolean checkPossibleCases(String givenForm, Map.Entry<WordCase, List<String>> wordCaseListEntry) {
        List<String> endingForms = wordCaseListEntry.getValue();
        boolean found = false;
        for (var ending : endingForms) {
            if (givenForm.equals(simplifiedWord + ending)) {
                found = true;
                break;
            }
        }
        return found;
    }
}
