package com.sonar.analysis;

import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		String filePath = "C:\\Users"; 
		String canonicalDestinationDirPath = new File(filePath).getCanonicalPath();
		File destinationFile = new File(filePath, e.getName());
		String canonicalDestinationFile = destinationFile.getCanonicalPath();
		
		if(!canonicalDestinationFile.startsWith(canonicalDestinationDirPath + File.separator)) {
			
		}
		
	}

}
