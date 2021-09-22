package com.sonar.analysis;

import java.io.PrintWriter;

public class XssExample {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		String name = req.getParameter("name");
		PrintWriter out = res.getWriter();
		
		out.write("hello "+ name); //Non-Complaint
		
	}
	
	protected void doGet(HttpServletRequest req, HttpSevletResponse res) throws IOException{
		String name = req.getParameter("name");
		String encodedName = org.owasp.encoder.Encode.forHtml(name);
		PrintWriter out= resp.getWriter();
		out.write("Hello"+encodeName);
	}

}
