package com.StringBasic;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String name = "programming";
        char[] ch = name.toCharArray();
        char[] test = new char[ch.length];
        int j = 0;

        for (int i = 0; i < ch.length; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (ch[i] == test[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                test[j] = ch[i];
                j++;
            }
        }

        // Convert the result array into a string
        String result = new String(test, 0, j);
        System.out.println("String after removing duplicates: " + result);
}
}