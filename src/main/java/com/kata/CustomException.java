package com.kata;

public class CustomException extends Exception {

	private static final long serialVersionUID = 1L;
	final int id;
	public CustomException(int x) {
		      id = x;
		   }

	@Override
	public String toString() {
		return "negatives not allowed [" + id + "]";
	}

}
