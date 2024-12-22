package BasicExample;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaxArrayElement {
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(10,20,30,40,90);
	int maxValue=	list.stream().mapToInt(Integer::intValue).max().orElseThrow();
	System.out.println("max value:: "+maxValue);
	/*
	 mapToInt -> it is convert into interger  integer to int value and chaeck the max method 
	  
	 
	
	If a value is present, returns the value,
	otherwise throws NoSuchElementException.
	Returns:the value described by this OptionalIntThrows:NoSuchElementException 
	- if no value is presentSince:10
	*/
	}

}
