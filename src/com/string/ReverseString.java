package com.string;

public class ReverseString {

	public static void main(String[] args) {
		String name = "hello";
		// reverse the strung
		// string class provide the toCharArray(); method for return charcter array
		char[] ch = name.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

			System.out.print(ch[i]);
		}
	}

}
