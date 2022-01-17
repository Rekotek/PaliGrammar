package com.scriptorium.pali;

import com.scriptorium.pali.common.EndingDescription;
import com.scriptorium.pali.enums.NumberType;
import com.scriptorium.pali.enums.WordCase;
import com.scriptorium.pali.tables.*;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.List;
import java.util.Map;

import static com.scriptorium.pali.enums.EndingType.*;
import static com.scriptorium.pali.enums.Gender.*;

public class EndingFullFormsHelper {
    public static Map<EndingDescription, List<Map<WordCase, List<String>>>> FULL_CASES = Map.ofEntries(
            new SimpleImmutableEntry<>(
                    new EndingDescription(SHORT_A, MUSCLE), ShortAMaleConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(SHORT_A, NEUTRAL), ShortANeutralConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(LONG_A, FEMALE), LongAFemaleConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(SHORT_I, MUSCLE), ShortIMaleConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(SHORT_I, NEUTRAL), ShortINeutralConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(SHORT_I, FEMALE), ShortIFemaleConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(LONG_I, MUSCLE), LongIMaleConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(LONG_I, FEMALE), LongIFemaleConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(SHORT_U, MUSCLE), ShortUMaleConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(SHORT_U, NEUTRAL), ShortUNeutralConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(SHORT_U, FEMALE), ShortUFemaleConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(LONG_U, MUSCLE), LongUMaleConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(MANT, MUSCLE), MantMaleConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(MANT, NEUTRAL), MantNeutralConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(MANT, FEMALE), MantFemaleConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(VANT, MUSCLE), VantMaleConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(VANT, NEUTRAL), VantNeutralConstants.ALL_FORMS),
            new SimpleImmutableEntry<>(
                    new EndingDescription(VANT, FEMALE), VantFemaleConstants.ALL_FORMS)
            );

    public static List<Map<WordCase, List<String>>> getAllForms(EndingDescription endingDescription) {
        return FULL_CASES.get(endingDescription);
    }

    public static Map<WordCase, List<String>> getFormsOfNumberType(EndingDescription endingDescription, NumberType numberType) {
        return FULL_CASES.get(endingDescription).get(numberType.ordinal());
    }

    private EndingFullFormsHelper() { }
}
