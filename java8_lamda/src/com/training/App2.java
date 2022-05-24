package com.training;

import java.util.Arrays;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("India","cannada","indonesia","bhutan");
		
		//names.forEach(value->System.out.println(value));
		//method reference
		names.forEach(System.out::println);
	}

}
