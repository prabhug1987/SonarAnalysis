package com.sonar.analysis.uuid;

import java.util.Random;
import java.util.UUID;

public class UUIDExample {
	
	public static void main(String[] args) {
		int userAge = new Random().nextInt(); //Non-complaint code
		UUID userId = UUID.randomUUID(); // Non-complaint code

		userAge = 31;
		userId = UUID.fromString("000000000-000-0000-000000000001"); // complaint code 
	}
		
	

}
