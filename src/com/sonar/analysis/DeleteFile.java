package com.sonar.analysis;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class DeleteFile {

	public void main(String args[]) {

	}

	public void cleanUp() {
		String path;
		File file = new File(path);

		if (!file.delete()) { // Non-complaint
			// ...
		}
	}

	public void cleanUp(Path path) throws NoSuchFileException, DirectoryNotEmptyException, IOException {
		Files.delete(path);
	}

}
