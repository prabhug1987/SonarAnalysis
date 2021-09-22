package com.sonar.analysis;

public class CyclomaticComplexity {

	public static void main(String[] args) {

	}

	int sumOfPrimes(int max) {
		int total = 0;
		OUT: for (int i = 1; i <= max; ++i) {
			for (int j = 2; j < i; ++j) {
				if (i % j == 0) {
					continue OUT;
				}
			}
			total += i;
		}
	}

	String getWords(int number) {
		switch (number) {
		case 1:
			return "one";
		case 2:
			return "a couple";
		case 3:
			return "a few";
		default:
			return "lots";
		}

	}
	
	public void congnitiveComplexity(){
		MyObj myObj = null;
		if(a != null) {
			myObj = a.myObj;
		}
		
		
	}
	
	public void operatorSequence() {
		if(a && b && c && d)
		a || b || c || d	
	}
	
	
}
