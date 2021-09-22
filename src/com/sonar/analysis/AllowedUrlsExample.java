package com.sonar.analysis;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class AllowedUrlsExample {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String location = req.getParameter("url");
		resp.sendRedirect(location); // Noncompliant
	}
	
	protected void doGet1(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		  String location = req.getParameter("url");
		  List<String> allowedHosts = new ArrayList<String>();
		  allowedHosts.add("https://www.domain1.com/");
		  allowedHosts.add("https://www.domain2.com/");

		  if (allowedHosts.contains(location))
		    resp.sendRedirect(location); // Compliant
		}

}
