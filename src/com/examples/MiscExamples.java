package com.examples;

import static com.examples.utils.Utils.getRandomPersons;
import static com.examples.utils.Utils.outputSeparator;

import java.util.function.Function;

public class MiscExamples {
	public static void main(String[] args) {
//		Calculate average age
		System.out.println(getRandomPersons(10)
			.stream()
			.mapToInt(person -> person.getAge())
			.average());
		outputSeparator();
		
//		Any Match
		System.out.println(getRandomPersons(10)
				.stream()
				.anyMatch(person -> person.getAge()> 5));
		outputSeparator();
		
//		Reduce - accumulator
		System.out.println(getRandomPersons(10)
			.stream()
				.reduce((person1, person2) -> {
					if (person1.getAge() > person2.getAge()) {
						return person1;
					} else {
						return person2;
					}}));
		outputSeparator();
		
	}
}
