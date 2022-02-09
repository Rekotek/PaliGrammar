package com.scriptorium.pali;

import com.scriptorium.pali.common.EndingDescription;
import com.scriptorium.pali.common.HtmlOutput;
import com.scriptorium.pali.common.NounDescription;
import com.scriptorium.pali.enums.Gender;
import com.scriptorium.pali.enums.NumberType;
import com.scriptorium.pali.enums.WordCase;
import com.scriptorium.pali.tables.EndingFullFormsHelper;

import java.util.*;

import static com.scriptorium.pali.enums.NumberType.PL;
import static com.scriptorium.pali.enums.NumberType.SG;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class NounCases implements HtmlOutput {
    private final String simplifiedWord;
    private final EndingDescription endingDescription;

    public NounCases(String dhatu, Gender wordGender) {
        var endingType = EndingTypeHelper.indentify(dhatu);
        this.endingDescription = new EndingDescription(endingType, wordGender);
        var ending = endingType.toString();
        this.simplifiedWord = dhatu.substring(0, dhatu.length() - ending.length());
    }

    private static List<String> mergeLists(List<String> list1, List<String> list2) {
        list1.addAll(list2);
        return list1;
    }

    public List<String> getFormsFor(WordCase wordCase, NumberType numberType) {
        List<String> endings;
        endings = EndingFullFormsHelper
                .getFormsOfNumberType(endingDescription, numberType)
                .get(wordCase);
        return endings.stream().map(s -> simplifiedWord + s).collect(toList());
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

    public SortedMap<WordCase, List<String>> getAllCasesForNumber(final NumberType numberType) {
        var endings = EndingFullFormsHelper
                .getFormsOfNumberType(endingDescription, numberType);
        return endings.entrySet().stream()
                .collect(toMap(Map.Entry::getKey,
                        this::constructWord,
                        NounCases::mergeLists,
                        TreeMap::new));
    }

    private List<WordCase> retrieveCases(Map<WordCase, List<String>> wordForms, String givenForm) {
        return wordForms.entrySet()
                .stream()
                .filter(wordCaseListEntry -> checkPossibleCases(givenForm, wordCaseListEntry.getValue()))
                .map(Map.Entry::getKey)
                .sorted()
                .collect(toList());
    }

    private boolean checkPossibleCases(String givenForm, List<String> endingForms) {
        boolean found = false;
        for (var ending : endingForms) {
            if (givenForm.equals(simplifiedWord + ending)) {
                found = true;
                break;
            }
        }
        return found;
    }

    @Override
    public String toHtml() {
        var result = new StringBuilder(simplifiedWord.length() * 4);
        result.append("<code>=== Sg ===\n");
        final var casesForSingular = getAllCasesForNumber(SG);
        appendCases(result, casesForSingular);
        result.append("=== Pl ===\n");
        final var casesForPlural = getAllCasesForNumber(PL);
        appendCases(result, casesForPlural);
        result.append("</code>");
        return result.toString();
    }

    private void appendCases(StringBuilder result, SortedMap<WordCase, List<String>> casesForSingular) {
        casesForSingular.forEach((wordCase, list) -> {
            result.append(wordCase.toHtml());
            result.append(": ");
            String joinedString = list.toString();
            String oneLine = joinedString.substring(1, joinedString.length() - 1);
            result.append(oneLine);
            result.append("\n");
        });
    }

    private List<String> constructWord(Map.Entry<WordCase, List<String>> e) {
        return e.getValue().stream()
                .map(s -> simplifiedWord + s)
                .collect(toList());
    }
}