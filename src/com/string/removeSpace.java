package com.string;

public class removeSpace {
	public static void main(String[] args) {
		String name=" t   u   s ha     r";
	String removespace=	name.replaceAll("\\s", "");
		System.out.println(removespace);
	}

}
