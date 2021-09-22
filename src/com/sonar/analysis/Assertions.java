package com.sonar.analysis;

import java.util.List;

public class Assertions {
	
	public static void main(String[] args) {
		//Fest Non complaint
		boolean result = performAction();
		//lets now check that result values is true
		assertThat(result); //Non-complaint; nothing is actually checked, the test passes whether "result" is true or false
		
		//Mockito
		List mockedList = Mockito.mock(List.class);
		mockedList.add("one");
		mockedList.clear();
		
		//Let's check that "add" and clear methods are acutally called
		Mockito.verify(mockedList); //Non-complaint nothing is checked here, oups no call is chained to verify
		
		//Complaint solution
		boolean result = performAction();
		//lets now check that result value is true
		assertThat(result).isTrue();
		
		//Mockito
		List mockedList = Mockito.mock(List.class);
		Mockito.verify(mockedList).add("one");
		Mockito.verify(mockedList).clear();
	
		
	}
	
	private BooleanAssert check(String filename,String key) {
		String fileContent = readFileContent(filename);
		performReplacements(fileContent);
		return assertThat(fileContent.contains(key)); //No issue is raised here
	}

	@Test
	public void test() {
		check("foo.txt","key1").isTrue();
		check("foo.txt","key2").isTrue();
	}
}
