package com.calmis.util;

import com.calmis.common.Constant;

public class Validations implements Constant {

	/**
	 * Validate the inputs
	 * 
	 * @param input
	 * @return
	 */
	public static String isValidUser(String input) {
		String output = "";
		if (input == null) {
			output = EMPTY_FIELD;
		} else if (input.startsWith(NO) && input.length() != 14) {
			output = INCORRECT_ID;
		} else if (input.startsWith(L) && input.length() != 9) {
			output = INCORRECT_FORCE_NUMBER;
		}
		return output;
	}
}
