package com.string;

public class RemoveDuplicate2 {
	public static void main(String[] args) {
		String name="programming";
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<name.length();i++)
		{
		char ch=name.charAt(i);
		System.out.println(ch);
		int index=name.indexOf(ch,i+1);
		System.out.println(index);
		
		if(index==-1)
		{
			sb.append(ch);
		}
			
		}
		
		System.out.println(sb);
	}
	/*
	 First iteration (i = 0):
		
		ch = name.charAt(0) → ch = 'p'.
		index = name.indexOf('p', 1) → index = -1 (no 'p' after position 0).
		Since index == -1, append 'p' to sb → sb = "p".
		Second iteration (i = 1):
		
		ch = name.charAt(1) → ch = 'r'.
		index = name.indexOf('r', 2) → index = -1 (no 'r' after position 1).
		Since index == -1, append 'r' to sb → sb = "pr".
		Third iteration (i = 2):
		
		ch = name.charAt(2) → ch = 'o'.
		index = name.indexOf('o', 3) → index = -1 (no 'o' after position 2).
		Since index == -1, append 'o' to sb → sb = "pro".
		Fourth iteration (i = 3):
		
		ch = name.charAt(3) → ch = 'g'.
		index = name.indexOf('g', 4) → index = 8 (there's another 'g' at position 8).
		Since index != -1, skip appending 'g' to sb.
		Fifth iteration (i = 4):
		
		ch = name.charAt(4) → ch = 'r'.
		index = name.indexOf('r', 5) → index = -1 (no 'r' after position 4).
		Since index != -1, skip appending 'r'.
		Sixth iteration (i = 5):
		
		ch = name.charAt(5) → ch = 'a'.
		index = name.indexOf('a', 6) → index = -1 (no 'a' after position 5).
		Since index == -1, append 'a' to sb → sb = "proa".
		Seventh iteration (i = 6):
		
		ch = name.charAt(6) → ch = 'm'.
		index = name.indexOf('m', 7) → index = 7 (another 'm' at position 7).
		Since index != -1, skip appending 'm'.
		Eighth iteration (i = 7):
		
		ch = name.charAt(7) → ch = 'm'.
		index = name.indexOf('m', 8) → index = -1 (no 'm' after position 7).
		Since index == -1, append 'm' to sb → sb = "proam".
		Ninth iteration (i = 8):
		
		ch = name.charAt(8) → ch = 'i'.
		index = name.indexOf('i', 9) → index = -1 (no 'i' after position 8).
		Since index == -1, append 'i' to sb → sb = "proami".
		Tenth iteration (i = 9):
		
		ch = name.charAt(9) → ch = 'n'.
		index = name.indexOf('n', 10) → index = -1 (no 'n' after position 9).
		Since index == -1, append 'n' to sb → sb = "proamin".
		Eleventh iteration (i = 10):
		
		ch = name.charAt(10) → ch = 'g'.
		index = name.indexOf('g', 11) → index = -1 (no 'g' after position 10).
		Since index == -1, append 'g' to sb → sb = "proaming".
		
		
		
		
		
		
Let me break it down further to make it absolutely clear!

We are analyzing the first iteration of the loop where i = 0. The string is:

makefile
Copy code
name = "programming"
Step-by-step breakdown:
Get the character at position i = 0:

java
Copy code
char ch = name.charAt(0);
ch will be the character at index 0 of name, which is 'p'.
So now:

arduino
Copy code
ch = 'p'
Search for the next occurrence of ch ('p') starting from position i + 1 = 1:

java
Copy code
int index = name.indexOf('p', 1);
The indexOf(char, fromIndex) method starts looking for the character 'p' in the substring of name that starts from index 1.

The substring of name starting from index 1 is:

arduino
Copy code
"rogramming"
The method looks for 'p' in "rogramming":

'p' is not present in this substring.
Therefore, the method returns -1 (which means 'p' is not found after position 0).
	 */

}
