package com.ssmtariq;

import java.util.List;

public class Practice1Exercises {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,7,4,23,7,9);
		printOddNumberInListFunctional(numbers);
		printCubesOfOddNumberInListFunctional(numbers);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		printAllCoursesInListFunctional(courses);
		printCoursesContainsSpringInListFunctional(courses);
		printCoursesHavingFourLettersInListFunctional(courses);
		printCourseLengthsInListFunctional(courses);
	}

	/*Exercise 1*/
	private static void printOddNumberInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number->number%2!=0).forEach(System.out::println);
	}
	
	/*Exercise 2*/
	private static void printAllCoursesInListFunctional(List<String> courses) {
		courses.stream().forEach(System.out::println);
	}

	/*Exercise 3*/
	private static void printCoursesContainsSpringInListFunctional(List<String> courses) {
		courses.stream().filter(course-> course.contains("Spring")).forEach(System.out::println);
	}
	
	/*Exercise 4*/
	private static void printCoursesHavingFourLettersInListFunctional(List<String> courses) {
		courses.stream().filter(course->course.length()>4).forEach(System.out::println);
	}

	/*Exercise 5*/
	private static void printCubesOfOddNumberInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number -> number%2!=0).map(number -> number*number*number).forEach(System.out::println);
	}
	
	/*Exercise 6*/
	private static void printCourseLengthsInListFunctional(List<String> courses) {
		courses.stream().map(course -> course +": "+ course.length()).forEach(System.out::println);
	}

}
