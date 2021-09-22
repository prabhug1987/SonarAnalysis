package com.sonar.analysis.test;



public class PercentageTest {

	@Test(successPercentage = 80, invocationCount = 10) // Non-complaint the test is allowed to fail 2 times
	public void flakyTest() {

	}

}
