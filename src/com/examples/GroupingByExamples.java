package com.examples;

import static com.examples.utils.Utils.getPersons;
import static com.examples.utils.Utils.outputSeparator;

import java.util.stream.Collectors;

import com.examples.pojo.Person;

public class GroupingByExamples {
	public static void main(String[] args) {
//		Groups Person based on firstname - > output Map<Firstname, List<Person>>
		System.out.println(getPersons()
				.stream()
				.collect(Collectors.groupingBy(Person::getFirstName)));
		outputSeparator();

//		Groups Person based on firstname - > output Map<Firstname, List<Person> - size>
		System.out.println(getPersons()
				.stream()
				.collect(Collectors.groupingBy(Person::getFirstName, Collectors.counting())));
		outputSeparator();
		
		
//		Groups Person based on firstname - and then age> output Map<Firstname, Map<age, person>>
		System.out.println(getPersons()
				.stream()
				.collect(Collectors.groupingBy(Person::getFirstName, Collectors.groupingBy(Person::getAge))));
		outputSeparator();
	}

}
