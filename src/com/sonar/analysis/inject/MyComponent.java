package com.sonar.analysis.inject;

import javax.inject.Inject;

public class MyComponent { //Anyone can call the default constructor
	@Inject
	MyCollaborator collaborator; // Non-complaint
	
	
	public void myBusinessMethod() {
		collaborator.doSomething(); // this will fail in classes new-ed by a caller
	}
	

}
