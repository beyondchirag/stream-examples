package com.examples;

import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.examples.pojo.Person;

public class StreamExamples {
	
	
	private static void printSeparatorLine() {
		System.out.println("-----------------------\n\n");
	}
	
	
	public static void main(String[] args) {
		
//		Stream personlist and filter
		PersonData.getRandomPersons(10)
			.stream()
			.filter(person -> person.getAge()%2==0)
			.forEach(System.out::println);
		printSeparatorLine();
		
//		Stream parallel - un ordered output
		PersonData.getRandomPersons(10)
			.parallelStream()
			.forEach(System.out::println);
		printSeparatorLine();
		
//		Stream parallel - ordered output
		PersonData.getRandomPersons(10)
			.parallelStream()
			.forEachOrdered(System.out::println);
		printSeparatorLine();
		
//		Stream and pass comparators - comparing on two fields age and then phones numbers
		System.out.println(PersonData.getRandomPersons(10)
				.stream()
				.sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getPhoneNumber))
				.collect(Collectors.toList()));
		printSeparatorLine();
		
//		Calculate average age
		System.out.println(PersonData.getRandomPersons(10)
			.stream()
			.mapToInt(person -> person.getAge())
			.average());
		printSeparatorLine();
		
//		Collect List as Map - Funtion.Identity refers to this
		System.out.println(PersonData.getRandomPersons(10)
			.stream()
			.collect(Collectors.toMap(Person::getFirstName, Function.identity())));
		printSeparatorLine();
		
//		Collect and filter List as Map - Funtion.Identity refers to this
		System.out.println(PersonData.getRandomPersons(10)
			.stream()
			.filter(person -> person.getAge()%2==0)
			.collect(Collectors.toMap(Person::getFirstName, Function.identity())));
		printSeparatorLine();
		
//		Groups Person based on firstname - > output Map<Firstname, List<Person>>
		System.out.println(PersonData.getPersons()
				.stream()
				.collect(Collectors.groupingBy(Person::getFirstName)));
		printSeparatorLine();

//		Groups Person based on firstname - > output Map<Firstname, List<Person> - size>
		System.out.println(PersonData.getPersons()
				.stream()
				.collect(Collectors.groupingBy(Person::getFirstName, Collectors.counting())));
		printSeparatorLine();
	}
}
