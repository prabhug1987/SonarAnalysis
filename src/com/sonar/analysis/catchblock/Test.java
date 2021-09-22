package com.sonar.analysis.catchblock;

public class Test {
	
	public static void main(String[] args) {
		
	}
	
	public void trymethod() {
		try {
			
		}catch(Exception  e) {
			e.printStackTrace(); //Sensitive
		}
		
		try {
			
		}catch(Exception e) {
			logger.info(); //Complaint
		}
		
	}

}
