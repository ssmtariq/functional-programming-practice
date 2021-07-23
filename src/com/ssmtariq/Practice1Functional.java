package com.ssmtariq;

import java.util.List;

public class Practice1Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,7,4,23,7,9);
		printAllNumberInListFunctional(numbers);
		printEvenNumberInListFunctional(numbers);
		printOddNumberInListFunctional(numbers);
	}

	public static void print(int number) {
		System.out.println(number);
	}
	
	private static void printAllNumberInListFunctional(List<Integer> numbers) {
		//How to loop the numbers
		//In traditional approach we focus on HOW
//		for(int number : numbers) {
//			System.out.println(number);
//		}
		
		//In functional approach we focus on WHAT
		//What to do
		numbers.stream().forEach(Practice1Functional::print); //ClassName :: MethodName. This is called method reference
		
		//We can avoid using the print() method as below
		numbers.stream().forEach(System.out::println); //ClassName :: MethodName. This is called method reference
	}
	
	private static boolean isEven(int number) {
		return number%2==0;
	}
	
	private static void printEvenNumberInListFunctional(List<Integer> numbers) {
		//What to do
		numbers.stream()
		.filter(Practice1Functional::isEven) //Filter: Only allow even numbers
		.forEach(System.out::println); //ClassName :: MethodName. This is called method reference
		
		/**
		 * Lambda: A lambda is nothing but a method with simple syntax as below
		 * ARGUMENT -> ACTION;
		 * Lambda for the method isEven is below
		 * number -> number%2==0;
		 */
		numbers.stream()
		.filter(number->number%2==0) //Filter: Only allow even numbers
		.forEach(System.out::println); //ClassName :: MethodName. This is called method reference
	}

	private static void printOddNumberInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number->number%2!=0).forEach(System.out::println);
	}

}
