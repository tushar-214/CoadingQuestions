package com.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortingEmployeeAsc {
	public static void main(String[] args) {
	List<String> list =Arrays.asList("Tushar","Akshay","Rohit","vishal");	
	List<String> list1=	list.stream().sorted()
			.collect(Collectors.toList());
	System.out.println(list1);
		
	}

}
