package com.sonar.analysis;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipSlip {

	public static void main(String[] args) {

	}

	public static List<String> zipSlipNonComplaint(ZipFile zipFile) throws IOException {
		Enumeration<? extends ZipEntry> entries = zipFile.entries();
		List<String> fileContent = new ArrayList<>();

		while (entries.hasMoreElements()) {
			ZipEntry entry = entries.nextElement();
			File file = new File(entry.getName());
			String content = FileUtils.readFileToString(file, StandardCharsets.UTF_8);// non complaint
			fileContent.add(content);
		}

		return filesContent;
	}

	public static List<String> zipSlipComplaint(ZipFile zipFile, String targetDirectory) throws IOException {
		Enumeration<? extends ZipEntry> entries = zipFile.entries();
		List<String> filesContent = new ArrayList<>();

		while (entries.hasMoreElements()) {
			ZipEntry entry = entries.nextElement();
			File file = new File(entry.getName());
			String canonicalDestinationPath = file.getCanonicalPath();

			//checking added
			if (!canonicalDestinationPath.startsWith(targetDirectory)) {
				throw new IOException("Entry is outside of the target directory");
			}
			
			String content = FileUtils.readFileToString(file,StandardCharsets.UTF_8); //OK
		}

		return filesContent;
	}
}
