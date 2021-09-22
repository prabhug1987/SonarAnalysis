package com.sonar.analysis;

import java.io.File;
import java.util.Collection;

public class HardCodedFilePath {
	
	private Configuration config;
	
	public static void main(String[] args) {
		
	}
	
	public Collection<User> listUsers(){
		File userList = new File("/home/myLogin/dev/users.txt");// Non-complaint
		Collection<User> users = parse(userList);
		
		return users;
	}
	
	

}
