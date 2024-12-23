package com.StringBasic;

public class StringPallindrome4 {
    public static void main(String[] args) {
        String name = "madam";
        char st[] = name.toCharArray();
        char a[] = new char[st.length];

        // Reverse the characters in the array
        for (int i = 0; i < st.length; i++) {
            a[i] = st[st.length - 1 - i];
        }

        // Create a new string from the reversed character array
        String newStr = new String(a);

        // Compare the original and reversed strings
        if (newStr.equals(name)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
