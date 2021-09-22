package com.sonar.analysis;

import java.io.ObjectInputStream;

public class SerializationExample {
	
	protected void processRequest(HttpServletRequest request) {
		ServletInputStream sis = request.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(sis);
		Object obj = ois.readObject(); // Noncompliant
		
		
	}

}
