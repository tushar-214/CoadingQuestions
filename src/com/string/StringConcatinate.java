package com.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcatinate {
	public static void main(String[] args) {
		List<String> list= Arrays.asList("tushar","bhosale","at","pune");
		String name= list.stream().collect(Collectors.joining(" "));
		
		System.out.println(name);
	}

}
