package com.StringBasic;

public class StringLength {
	public static void main(String[] args) {
		String name ="tushar";
		// find length 
		System.out.println("length of String is :: "+name.length());
		System.out.println("---------------------------------------");
		
		// find charAt()
		System.out.println("Char At index i want charcter from String :: "+name.charAt(3));
		
		System.out.println("---------------------------------------");
		
		// cheking the string is empty or not
		System.out.println("check the string is empty or not =" +name.isEmpty());
		System.out.println("---------------------------------------");

		// contains  checking 
		System.out.println("contains checking :: "+name.contains("sh"));
		
		System.out.println("---------------------------------------");
        // equals
		System.out.println("equality check  : "+name.equals("tushar"));
		System.out.println("---------------------------------------");

		// equalIgnoreCase 
		System.out.println("checking the case :: "+name.equalsIgnoreCase("Tushar"));
		System.out.println("---------------------------------------");
		// charcter compare kart ahe 
		System.out.println("compare to method "+name.compareTo("tushar"));
		
		System.out.println("------------------------------------------");
		System.out.println("index of :: "+name.indexOf("r"));
		

	}

}
