package com.sonar.analysis;

public class RequestProcessor {
	protected void processRequest(HttpServletRequest request) {
		ServletInputStream sis = request.getInputStream();
		SecureObjectInputStream sois = new SecureObjectInputStream(sis);
		Object object = sois.readObject();
		
	}

}
