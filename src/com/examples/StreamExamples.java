package com.examples;

import static com.examples.utils.Utils.getRandomPersons;
import static com.examples.utils.Utils.outputSeparator;

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
