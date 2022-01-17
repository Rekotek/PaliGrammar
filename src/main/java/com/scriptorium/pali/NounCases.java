package com.scriptorium.pali;

import com.scriptorium.pali.common.EndingDescription;
import com.scriptorium.pali.common.NounDescription;
import com.scriptorium.pali.enums.Gender;
import com.scriptorium.pali.enums.NumberType;
import com.scriptorium.pali.enums.WordCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.scriptorium.pali.enums.NumberType.PL;
import static com.scriptorium.pali.enums.NumberType.SG;

public class NounCases {
    private final String simplifiedWord;
    private final EndingDescription endingDescription;

    public NounCases(String dhatu, Gender wordGender) {
        var endingType = EndingTypeHelper.indentify(dhatu);
        this.endingDescription = new EndingDescription(endingType, wordGender);
        var ending = endingType.toString();
        this.simplifiedWord = dhatu.substring(0, dhatu.length() - ending.length());
    }

    public List<String> getFormsFor(WordCase wordCase, NumberType numberType) {
        List<String> endings;
        endings = EndingFullFormsHelper
                .getFormsOfNumberType(endingDescription, numberType)
                .get(wordCase);

        return endings.stream().map(s -> simplifiedWord + s).collect(Collectors.toList());
    }

    public List<NounDescription> getPossibleCasesFor(String givenForm) {
        var resultSgList =
                retrieveCases(
                        EndingFullFormsHelper.getFormsOfNumberType(endingDescription, SG), givenForm
                );
        var resultPlList =
                retrieveCases(
                        EndingFullFormsHelper.getFormsOfNumberType(endingDescription, PL), givenForm
                );

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
