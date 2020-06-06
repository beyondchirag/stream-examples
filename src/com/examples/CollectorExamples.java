package com.examples;

import static com.examples.utils.Utils.getPersons;
import static com.examples.utils.Utils.getRandomPersons;
import static com.examples.utils.Utils.outputSeparator;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.examples.pojo.Person;

public class CollectorExamples {
	public static void main(String[] args) {
//		Collect List as Map - Funtion.Identity refers to this
		System.out.println(getRandomPersons(10)
			.stream()
			.collect(Collectors.toMap(Person::getFirstName, Function.identity())));
		outputSeparator();
		
//		Collect and filter List as Map - Funtion.Identity refers to this
		System.out.println(getRandomPersons(10)
			.stream()
			.filter(person -> person.getAge()%2==0)
			.collect(Collectors.toMap(Person::getFirstName, Function.identity())));
		outputSeparator();
		
		
//		Collect and filter List as TreeMap - 		
		System.out.println(getPersons()
	            .stream()
	            .collect(Collectors.groupingBy(Person::getAge,TreeMap::new, Collectors.toList())));
		outputSeparator();
		
//		Collect and filter List as TreeMap - 		
		System.out.println(getPersons()
	            .stream()
	            .collect(Collectors.groupingBy(Person::getFirstName,() -> new LinkedHashMap(), Collectors.counting())));
		outputSeparator();
		
	}

}
