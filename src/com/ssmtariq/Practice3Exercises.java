package com.ssmtariq;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Practice3Exercises {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		List<Integer> numbers = List.of(12,9,7,4,23,7,9);
		System.out.println(subListOfEvenNumbersInListFunctional(numbers));
		System.out.println(subListOfCourseLengthsInListFunctional(courses));
		System.out.println(createInterfaceImplAndFindSumInListFunctional(numbers));
	}

	/*Exercise 10*/
	private static List<Integer> subListOfEvenNumbersInListFunctional(List<Integer> numbers) {
		return numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
	}
	
	/*Exercise 11*/
	private static List<Integer> subListOfCourseLengthsInListFunctional(List<String> courses) {
		return courses.stream().map(c->c.length()).collect(Collectors.toList());
	}
	
	/*Exercise 12*/
	private static Integer createInterfaceImplAndFindSumInListFunctional(List<Integer> numbers) {
//		BinaryOperator<Integer> accumulator = Integer::sum;
		BinaryOperator<Integer> accumulator2 = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};
//		int sum = numbers.stream().reduce(0, Integer::sum);
		return numbers.stream().reduce(0, accumulator2);
	}

}
