package com.sonar.analysis.controlstmt;

public class SwitchExample {

	public void testMethod() {
		int i = 1;

		switch (i) {
		case 1:
			doFirstThing();
			doSomething();
			break;
		case 2:
			doSomethingDifferent();
			break;
		case 3: // Non-complaint; duplicates case 1's implementation
			doFirstThing();
			doSomething();
			break;
		default:
			doTheRest();

		}

		int a = 5;
		if (a >= 0 && a < 10) {
			doFirstThing();
			doTheThing();
		} else if (a >= 10 && a < 20) {
			doTheOtherThing();
		} else if (a >= 20 && a < 50){
			doFirstThing();
			doTheThing(); // Non-complaint; duplicates the first condition
		}else {
			doSomething();
		}
		
		if(a  == 1) {
			doSomething(); // no issues usually this is done on purpose to increase the readability.
		}else  if (a == 2){
			doSomethingElse();
		}else
			doSomething();

	}

	private void doSomethingElse() {
		// TODO Auto-generated method stub
		
	}

	private void doFirstThing() {
		// TODO Auto-generated method stub

	}

	private void doSomething() {
		// TODO Auto-generated method stub

	}

	private void doSomethingDifferent() {
		// TODO Auto-generated method stub

	}

	private void doTheRest() {
		// TODO Auto-generated method stub

	}

	private void doTheThing() {
		// TODO Auto-generated method stub

	}

	private void doTheOtherThing() {
		// TODO Auto-generated method stub

	}

}
