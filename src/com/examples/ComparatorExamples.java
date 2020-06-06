package com.examples;

import static com.examples.utils.Utils.getRandomPersons;
import static com.examples.utils.Utils.outputSeparator;

import java.util.Comparator;
import java.util.stream.Collectors;

import com.examples.pojo.Person;

public class ComparatorExamples {

	public static void main(String[] args) {
//		Stream and pass comparators - comparing on two fields age and then phones numbers
		System.out.println(getRandomPersons(10)
				.stream()
				.sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getPhoneNumber))
				.collect(Collectors.toList()));
		outputSeparator();
	}
}
