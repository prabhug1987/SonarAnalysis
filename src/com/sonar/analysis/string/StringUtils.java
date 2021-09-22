package com.sonar.analysis.string;

public class StringUtils { //Complaint

	private StringUtils() throws IllegalAccessException {
		throw new IllegalAccessException("Utility class");
	}
	
	public static String concatenate(String s1, String s2) {
		return s1 + s2;
	}

}
