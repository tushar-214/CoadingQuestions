package com.string;

public class RemoveDuplicate {
	public static void main(String[] args) {
	String name="programming";
	StringBuilder sb=new StringBuilder();
		name.chars().distinct().forEach(x->sb.append((char)x));
		System.out.println(sb);	
	}

}
/*
 chars() in Java
 
The chars() method is a part of the String class in Java. It returns an IntStream representing the sequence of Unicode code points (or ASCII values for standard characters) in the given string.

How It Works:
When you call chars() on a String, it:

Converts each character in the string into its integer representation (Unicode or ASCII value).
Returns the result as an IntStream.*/