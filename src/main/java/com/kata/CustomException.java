package com.kata;

public class CustomException extends Exception {

	private static final long serialVersionUID = 1L;
	final String values;
	public CustomException(String strNegativeValues) {
		      values = strNegativeValues;
		   }

	@Override
	public String toString() {
		return "negatives not allowed [" + values + "]";
	}

}
