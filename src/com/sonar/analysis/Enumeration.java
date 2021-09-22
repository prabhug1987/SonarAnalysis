package com.sonar.analysis;

import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Enumeration {

	public static void main(String[] args) {
		try {
			ZipFile zipFile = new ZipFile("f:\\file.zip");
			ZipEntry entry = zipFile.getEntry("enmeration.java");

			
			System.out.println("Name : " + entry.getName());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
