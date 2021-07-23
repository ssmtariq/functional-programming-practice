package com.ssmtariq;

import java.util.Comparator;
import java.util.List;

public class Practice4MethodReferences {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		courses.stream().sorted(Comparator.comparing(x -> x.length())).map(String::toUpperCase).forEach(System.out::println);
	}
}
