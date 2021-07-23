package com.ssmtariq;

import java.util.List;

public class Practice2Structured {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,7,4,23,7,9);
		int sum = addListStructured(numbers);
		System.out.println(sum);
	}

	private static int addListStructured(List<Integer> numbers) {
		int sum =0;
		for(int number : numbers) {
			sum += number;
		}
		return sum;
	}
}
