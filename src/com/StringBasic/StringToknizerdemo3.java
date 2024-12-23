package com.StringBasic;

import java.util.StringTokenizer;

public class StringToknizerdemo3 {
public static void main(String[] args) {
	String name="tushar$vishal$ganesh$vijay";
	StringTokenizer  token=new StringTokenizer(name,"$");
	while(token.hasMoreTokens())
	{
		String tk=token.nextToken();
		System.out.println(tk);
	}
	
}

}
