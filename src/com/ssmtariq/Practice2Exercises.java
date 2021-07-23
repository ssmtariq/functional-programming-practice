package com.ssmtariq;

import java.util.List;

public class Practice2Exercises {

	public static void main(String[] args) {
//		List<Integer> numbers = List.of(12,9,7,4,23,7,9);
		List<Integer> numbers = List.of(1,2,3);
		System.out.println(sumOfSquaresOfAllNumbersInList(numbers));
		System.out.println(sumOfCubeOfAllNumbersInList(numbers));
		System.out.println(sumOfOddNumbersInList(numbers));
	}

	/*Exercise 7*/
	private static int sumOfSquaresOfAllNumbersInList(List<Integer> numbers) {
		return numbers.stream().map(number->number*number).reduce(0,Integer::sum);
	}
	
	/*Exercise 8*/
	private static int sumOfCubeOfAllNumbersInList(List<Integer> numbers) {
		return numbers.stream().map(number->number*number*number).reduce(0, Integer::sum);
	}

	/*Exercise 9*/
	private static int sumOfOddNumbersInList(List<Integer> numbers) {
		return numbers.stream().filter(number->number%2!=0).reduce(0,Integer::sum);
	}
}
