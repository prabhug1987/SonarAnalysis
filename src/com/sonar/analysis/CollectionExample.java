package com.sonar.analysis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample {
	
	public void printSize(ArrayList<Object> list) { // Collection can be used instead
		System.out.println(list.size());
	}
	
	public void loop(List<Object> list) { // java.lang.Iterable can be used instead
		System.out.println(list.size());
	}
	
	public void printSize(Collection<?> list) {
		for(Object o: list) {
			o.toString();
		}
	}
	
	public static void loop(Iterable<?> list) {
		for(Object o:list) {
			o.toString();
		}
	}

}
