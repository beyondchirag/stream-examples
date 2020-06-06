package com.examples;

public class StreamExamples {
	
	
	public static void main(String[] args) {
		PersonData.getPersons().stream().filter(person -> person.getAge()%2==0).forEach(System.out::println);
	}
}
