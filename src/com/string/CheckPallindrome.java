package com.string;

import java.util.stream.IntStream;

public class CheckPallindrome {
	
	
	

	public static boolean checkPallindrome(String name) {
		if(name=="" || name.isEmpty())
		{
			return false ;
			
		}
		return IntStream.range(0, name.length() / 2)
                .allMatch(i -> name.charAt(i) == name.charAt(name.length() - i - 1));
		
	}
	
	
	
	public static void main(String[] args) {
		
		String name ="madam";
		boolean res=checkPallindrome( name);
		if(res)
		{
			System.out.println("its pallindrome");
		}else {
			
			System.out.println("its not pallindrome");
		}
	}

	//IntStream is a part of Java 8's Stream API that specifically deals with primitive integer streams (int). It is a specialized stream for working with integers, 
	//avoiding the overhead of boxing and unboxing between int and Integer.

}
