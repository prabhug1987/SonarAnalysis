package com.sonar.analysis.deadlock;

public class Example1 {
	Object mon1 = new Object();
	Object mon2 = new Object();

	public static void main(String[] args) {
		
	}
	
	void method() throws InterruptedException { // thread B cant enter this block to request this mon2 lock & release threadA
		synchronized (this.mon1) {
			synchronized (this.mon2) {
				this.mon2.wait(); // Non-complaint; threadA is stuck here holding lock on this mail
			}
		}
	}

}
