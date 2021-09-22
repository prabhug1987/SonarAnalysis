package com.sonar.analysis.string;

public class StringLiteral {

	private void execute(String string) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

	}

	@SuppressWarnings("all") // Complaint - annotations are excluded
	private void method1() {
		/* ... */

	}

	@SuppressWarnings("all")
	private void method2() {
		/* ... */
	}

	private String method3(String a) {
		System.out.println("'" + a + "'"); // Complaint - literal "'" has less than 5 characters and is excluded
		return ""; // Complaint - literal "" has less than 5 characters and is excluded
	}

	private void prepare(String string) {
		// TODO Auto-generated method stub

	}

	private void release(String string) {
		// TODO Auto-generated method stub

	}

	public void run() {
		prepare("action1"); // Noncomplaint - "action1 is duplicated 3 times"
		execute("action1");
		release("action1");
	}

}
