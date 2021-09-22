package com.sonar.analysis.catchblock;

public class TestDivide {
	
	public static void main(String[] args) {
		int z = 0;
		if(unknown()) {
			z = 3;
			// ..
		} else {
			// .. / z is not initialized again in the else block
		}
		
		z = 1 / z; // Non-complaint code possible division by zero
		
	}
	
	public void test_divide() {
		int z = 0;
		if(unknown()) {
			// ..
			z = 3;
		} else {
			// .. 
			z = 1; // z is reinitialize here so it is complaint code
		}
		
		z = 1/ z;
	}

	private static boolean unknown() {
		// TODO Auto-generated method stub
		return false;
	}

}
