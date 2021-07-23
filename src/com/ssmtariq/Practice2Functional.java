package com.ssmtariq;

import java.util.List;

public class Practice2Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,7,4,23,7,9);
		int sum = addListStructured(numbers);
		System.out.println(sum);
	}

	private static int addListStructured(List<Integer> numbers) {
		//Stream of number -> One result value
			//Combine them into one result => One value
			//0 and FP02Functional::sum
//		return numbers.stream().reduce(0, FP02Functional::sum);
//		return numbers.stream().reduce(0, (a,b) -> a+b);
		return numbers.stream().reduce(0, Integer::sum);
	}
	
	private static int sum(int a, int b) {
		return a+b;
	}
}
