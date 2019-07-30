package com.kata;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {

	public int add(String numbers) throws CustomException {
		int result = 0;
		if(numbers != null && !numbers.isEmpty()) {
			numbers = formatString(numbers);
			List<String> numberList = Arrays.asList(numbers.split(","));
			for (String string : numberList) {
				int parsedInt;
				if(!string.isEmpty()) {
					parsedInt = Integer.parseInt(string);
					if(parsedInt > 0) {
						result = result + parsedInt;
					}else {
						throw new CustomException(parsedInt);
					}
				}
			}
		}
		return result;
	}

	private String formatString(String numbers) {
		numbers = numbers.replace("\n", ",");
		numbers = numbers.replace("//", "");
		numbers = numbers.replace(";", ",");
		return numbers;
	}
	
}
