package com.ssmtariq;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practice3Functional {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		printAllCoursesSortedByCourseLengthInListFunctional(courses);
		List<Integer> numbers = List.of(12,9,7,4,23,7,9);
		printNumbersInListSortedByDesc(numbers);
		System.out.println(squaresOfNumbersInListFunctional(numbers));
		System.out.println(subListOfEvenNumbersInListFunctional(numbers));
		System.out.println(subListOfCourseLengthsInListFunctional(courses));
	}

	/*Exercise 10*/
	private static List<Integer> subListOfEvenNumbersInListFunctional(List<Integer> numbers) {
		return numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
	}
	
	/*Exercise 11*/
	private static List<Integer> subListOfCourseLengthsInListFunctional(List<String> courses) {
		return courses.stream().map(c->c.length()).collect(Collectors.toList());
	}

	private static List<Integer> squaresOfNumbersInListFunctional(List<Integer> numbers) {
		return numbers.stream().map(n->n*n).collect(Collectors.toList());
	}

	private static void printNumbersInListSortedByDesc(List<Integer> numbers) {
		numbers.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);		
	}

	private static void printAllCoursesSortedByCourseLengthInListFunctional(List<String> courses) {
		courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
	}

}
