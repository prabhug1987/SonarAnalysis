package com.sonar.analysis.inject;

import javax.inject.Inject;

public class MyComponent2 { //Anyone can call the default constructor
	
	MyCollaborator collaborator; // Non-complaint
	
	@Inject
	public MyComponent2(){
		//Assert.notNull(collaborator, "My Collaborator must not be null");
	}
	
	public void myBusinessMethod() {
		collaborator.doSomething(); // this will fail in classes new-ed by a caller
	}
	

}
