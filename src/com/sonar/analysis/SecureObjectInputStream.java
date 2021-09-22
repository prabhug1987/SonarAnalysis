package com.sonar.analysis;

import java.io.InvalidClassException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class SecureObjectInputStream extends ObjectOutputStream {

	@Override	
	protected Class<?> resolveClass(ObjectStreamClass osc) throws IOException, ClassNotFoundException{
		//Only deserialize instance of allowed class
		if(!osc.getName().equals(AllowedClass.class.getName())) {
			throw new InvalidClassException("Unauthorized deserialization",osc.getName());
		}
		return super.resolveClass(osc);
	}
	
	public class RequestProcessor{
		
		protected void processRequest(HttpServletRequest request) {
			ServletInputStream sis = request.getInputStream();
			SecureObjectInputStream sois = new SecureObjectInputStream(sis);
			Object obj = sois.readObject();
		}
	}
}
