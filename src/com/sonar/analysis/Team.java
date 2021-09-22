package com.sonar.analysis;

import java.util.List;

public class Team implements Cloneable {	
	private Person coach;
	private List<Person> players;

	public void addPlayer(Person p) {

	}

	public Person getCoach() {
		return new Person();
	}
	

	@Override
	public Object clone() throws CloneNotSupportedException {
		Team clone = (Team) super.clone();
		return clone;
	}

}
