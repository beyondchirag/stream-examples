package com.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.examples.pojo.Person;

public class PersonData {

	public static List<Person> getRandomPersons(int noOfPersons) {
		 return IntStream.rangeClosed(1, noOfPersons).parallel().mapToObj(i -> {return new Person("fName_"+i,"lName_"+i,random5DigitPhoneNumber(),i);}).collect(Collectors.toList());
	}

	public static List<Person> getPersons() {

		List<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("First0","Last0","123-456-7890",1));
		persons.add(new Person("First0","Last1","123-456-7891",2));
		persons.add(new Person("First1","Last1","123-456-7890",3));
		persons.add(new Person("First1","Last0","123-456-7891",3));
		return persons;
		
	}
	
	
	private static String random5DigitPhoneNumber() {
		Random ran = new Random();
		return ran.nextInt(100000)+"";
		
	}
}
