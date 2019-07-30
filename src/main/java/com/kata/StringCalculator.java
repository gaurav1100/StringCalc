package com.kata;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {

	public int add(String numbers) {
		int result = 0;
		if(numbers != null && !numbers.isEmpty()) {
			numbers = numbers.replace("\n", ",");
			numbers = numbers.replace("//", "");
			numbers = numbers.replace(";", ",");
			System.out.println(">> "+numbers);
			List<String> numberList = Arrays.asList(numbers.split(","));
			for (String string : numberList) {
				if(!string.isEmpty()) {
					result = result + Integer.parseInt(string);
				}
			}
		}
		return result;
	}
	
}
