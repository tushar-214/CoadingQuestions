package com.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("tushar", "vishal", "ganesh");

		List<String> li = list.stream().map(x -> new StringBuilder(x).reverse().toString())
				.collect(Collectors.toList());

		System.out.println(li);
	}

}
