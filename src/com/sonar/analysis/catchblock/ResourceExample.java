package com.sonar.analysis.catchblock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ResourceExample {
	String charset = "";
	String fileName = "";
	List<String> propertyList = new ArrayList<>();
	
	public static void main(String[] args) {
       
	}

	public void readFile() throws IOException {
		propertyList.add("Prabhu");
		propertyList.add("Nagu");
		URI uri = new URI("");
		File file = new File(this.fileName);
		Path path = new Paths.get(uri);
		BufferedReader reader = Files.newBufferedReader(path, this.charset); // Mon-complaint code

		reader.close(); //Non complaint

		Files.lines(path).forEach(System.out::println); // The stream need to be closed
	}
	
	private void doSomething() {
	    
		OutputStream stream = null;
		try {
			for(String property: propertyList) {
				stream = new FileOutputStream("myfile.txt"); //Non complaint
			}
		}catch(Exception e) {
			
		} finally {
			stream.close();// multiple streams were opened but only last one is closed
		}
	}
	
	
	private void readFile1() throws IOException{
		Path path = Paths.get(fileName);
		try(BufferedReader reader = Files.newBufferedReader(path,StandardCharsets.UTF_8)){
			reader.readLine();
		}
		
		try(Stream<String> input = Files.lines("input.txt")){
			input.forEach(System.out::println);
		}
	}
	
	private void doSomething1() {
		OutputStream stream = null;
		try {
			stream = new FileOutputStream("myfile.txt");
			for(String property : propertyList) {
				// ...
			}
		}catch(Exception e) {
			
		}finally {
			stream.close();
		}
	}
}
