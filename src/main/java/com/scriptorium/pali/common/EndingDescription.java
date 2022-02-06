package com.scriptorium.pali.common;

import com.scriptorium.pali.enums.EndingType;
import com.scriptorium.pali.enums.Gender;

/**
 * @param endingType defines type of declension (-a, -i, etc.)
 * @param gender enum type for gender
 *
 */
public record EndingDescription(EndingType endingType, Gender gender) {
}
