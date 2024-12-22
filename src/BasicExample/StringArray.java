package BasicExample;

import java.util.Arrays;
import java.util.List;

public class StringArray {
	public static void main(String[] args) {
		//Write a program to find the sum of all elements in a list using Java Stream API
		
		List<Integer> list =Arrays.asList(10,20,10,50,10);
		int sum=list.stream().mapToInt(Integer:: intValue).sum();
		System.out.println(sum);
		
		/*1. list.stream()
		list is a List<Integer> (or similar collection of Integer objects).
		The .stream() method creates a stream from the list, allowing you to perform operations like filtering, mapping, and reducing.
		2. .mapToInt(Integer::intValue)
		This converts the elements of the stream (which are Integer objects) into their primitive int values.
		Integer::intValue is a method reference that calls the intValue() method on each Integer object, returning its int value.
		For example:

		If the list contains [Integer(1), Integer(2), Integer(3)], this step produces the stream [1, 2, 3] (as primitive integers).
		3. .sum()
		This terminal operation calculates the sum of all the int values in the stream.
		For example:

		If the stream is [1, 2, 3], the sum() operation returns 6.	
	*/
		}

}
