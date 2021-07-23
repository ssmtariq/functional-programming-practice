package com.ssmtariq;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice4Exercises {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,7,4,23,7,9);
		System.out.println(subListOfSquaredNumbersInListFunctional(numbers, n->n*n));
		
		System.out.println(numbers.stream().reduce(0, Integer::sum));
	}

	/*Exercise 13*/
	private static List<Integer> subListOfSquaredNumbersInListFunctional(List<Integer> numbers, Function<Integer, Integer> function) {
		return numbers.stream().map(function).collect(Collectors.toList());
	}

}
