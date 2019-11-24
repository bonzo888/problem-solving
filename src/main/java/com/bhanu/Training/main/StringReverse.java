package com.bhanu.Training.main;

public class StringReverse {
    public String reverseString(String inputString) {
        char[] inputChars = inputString.toCharArray();
        char[] outputChars = new char[inputString.length()];
        for (int i = inputString.length(); i > 0 ; i--) {
            outputChars[inputString.length()-i] = inputChars[i-1];
        }
        return new String(outputChars);
    }
}
