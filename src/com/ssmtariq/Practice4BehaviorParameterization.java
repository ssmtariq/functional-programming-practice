package com.ssmtariq;

import java.util.List;
import java.util.function.Predicate;

public class Practice4BehaviorParameterization {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,7,4,23,7,9);
		
		Predicate<Integer> oddPredicate = n->n%2!=0;
		filterAndPrint(numbers, oddPredicate);
		
		Predicate<Integer> evenPredicate = n->n%2==0;
		filterAndPrint(numbers, evenPredicate);
	}
	
	private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}
}
