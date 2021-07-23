package com.ssmtariq;

import java.util.ArrayList;
import java.util.List;

public class Practice5Functional {

	public static void main(String[] args) {
		List<Course> courses = List.of(
				new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000),
				new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000),
				new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000),
				new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000)
		);
		
		System.out.println(courses.stream().filter(c->c.getName().length()>11).map(c->c.getName().toUpperCase()).findFirst());
		
		List<String> courseList = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		/*remove all*/
		List<String> modifiableList = new ArrayList<>(courseList);
		modifiableList.replaceAll(s->s.toUpperCase());
		System.out.println(modifiableList);
		
		/*remove if*/
		modifiableList.removeIf(c->c.length()<6);
		System.out.println(modifiableList);
	}

}
