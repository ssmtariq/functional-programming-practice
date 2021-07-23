package com.ssmtariq;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice4Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,7,4,23,7,9);
		System.out.println(numbers.stream().reduce(0, Integer::sum));
		
		int[] array = {12,9,7,4,23,7,9};
		System.out.println(Arrays.stream(array).sum());
		
		System.out.println(IntStream.range(1, 10).sum());
		System.out.println(IntStream.rangeClosed(1, 10).sum());
		
		System.out.println(IntStream.iterate(1, e->e+2).limit(10).peek(System.out::println).sum());
		System.out.println(IntStream.iterate(1, e->e+2).limit(10).boxed().collect(Collectors.toList()));
		
		System.out.println(IntStream.rangeClosed(1, 5).reduce(0, Integer::sum));
		
		/*Big Number Calculation*/
		System.out.println(IntStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::add));
		System.out.println(IntStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply));
	}

}
