package com.ssmtariq;

import java.util.List;

public class Practice1Structured {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,7,4,23,7,9);
		printAllNumberInListStructured(numbers);
		printEvenNumberInListStructured(numbers);
	}

	private static void printAllNumberInListStructured(List<Integer> numbers) {
		//How to loop the numbers
		//In traditional approach we focus on HOW
		for(int number : numbers) {
			System.out.println(number);
		}
	}

	private static void printEvenNumberInListStructured(List<Integer> numbers) {
		for(int number : numbers) {
			if(number%2==0)System.out.println(number);
		}
	}

}
