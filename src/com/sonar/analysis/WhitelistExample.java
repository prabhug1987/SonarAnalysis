package com.sonar.analysis;

import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class WhitelistExample {

	public static void main(String[] args) {
		String blackList = "[^A-Za-z0-9-!@#$_]";
		String str = "This is a string";
		str = str.replaceAll(blackList, " ");

		boolean result = str.matches(blackList);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String input = req.getParameter("input");

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		engine.eval(input); // Noncompliant
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String input = req.getParameter("input");

		// Match the input against a whitelist
		if (!whiteList.contains(input))
			throw new IOException();

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		engine.eval(input);
	}

}
