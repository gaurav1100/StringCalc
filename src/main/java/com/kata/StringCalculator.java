package com.kata;

public class StringCalculator {

	public int Add(String numbers) {
		if(numbers == null || numbers.isEmpty()) {
			return 0;
		}
		return Integer.parseInt(numbers);
	}
	
}
