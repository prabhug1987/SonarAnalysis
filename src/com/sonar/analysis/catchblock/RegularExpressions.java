package com.sonar.analysis.catchblock;

import java.util.regex.Pattern;

public class RegularExpressions {
	
	public static void main(String[] args) {
		java.util.regex.Pattern.compile("(a+)+").matcher(
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+
				"aaaaaaaaaaaaaaa!").matches(); // Sensitive

				java.util.regex.Pattern.compile("(h|h|ih(((i|a|c|c|a|i|i|j|b|a|i|b|a|a|j))+h)ahbfhba|c|i)*").matcher(
				"hchcchicihcchciiicichhcichcihcchiihichiciiiihhcchi"+
				"cchhcihchcihiihciichhccciccichcichiihcchcihhicchcciicchcccihiiihhihihihi"+
				"chicihhcciccchihhhcchichchciihiicihciihcccciciccicciiiiiiiiicihhhiiiihchccch"+
				"chhhhiiihchihcccchhhiiiiiiiicicichicihcciciihichhhhchihciiihhiccccccciciihh"+
				"ichiccchhicchicihihccichicciihcichccihhiciccccccccichhhhihihhcchchihih"+
				"iihhihihihicichihiiiihhhhihhhchhichiicihhiiiiihchccccchichci").matches(); // Sensitive
	}
	
	public boolean validate(javax.servlet.http.HttpServletRequest request) {
		String regex = request.getParameter("regex");
		String input = request.getParameter("input");
		
		input.matches(regex); // non complaint
		
		
		
	}
	
	public boolean validate(javax.servlet.http.HttpServletRequest request) {
		String regex = request.getParameter("regex");
		String input = request.getParameter("input");
		
		input.matches(Pattern.quote(regex)); // non complaint
		
	}

}
