package com.examples;

import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.examples.pojo.Person;
import static com.examples.utils.Utils.*;

public class StreamExamples {
	
	
	public static void main(String[] args) {
		
//		Stream personlist and filter
		getRandomPersons(10)
			.stream()
			.filter(person -> person.getAge()%2==0)
			.forEach(System.out::println);
		outputSeparator();
		
//		Stream parallel - un ordered output
		getRandomPersons(10)
			.parallelStream()
			.forEach(System.out::println);
		outputSeparator();
		
//		Stream parallel - ordered output
		getRandomPersons(10)
			.parallelStream()
			.forEachOrdered(System.out::println);
		outputSeparator();

	}
}
