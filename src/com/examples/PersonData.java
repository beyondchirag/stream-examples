package com.examples;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.examples.pojo.Person;

public class PersonData {

	public static List<Person> getPersons() {
		 return IntStream.range(1, 100).mapToObj(i -> {return new Person("fName_"+i,"lName_"+i,random5DigitPhoneNumber(),i);}).collect(Collectors.toList());
	}

	private static String random5DigitPhoneNumber() {
		Random ran = new Random();
		return ran.nextInt(100000)+"";
		
	}
	public static void main(String[] args) {
		getPersons().forEach(System.out::println);
	}
}
