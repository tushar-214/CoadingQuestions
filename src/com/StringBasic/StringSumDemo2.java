package com.StringBasic;

import java.util.Iterator;

public class StringSumDemo2 {
	public static void main(String[] args) {
		String name = "1,2,3";
		String[] name1 = name.split(",");
		int sum=0;
	for(int i=0;i<name1.length;i++)
	{
		 sum += Integer.parseInt(name1[i]);
	}
	
	System.out.println("sum :: "+sum);
	}
}
