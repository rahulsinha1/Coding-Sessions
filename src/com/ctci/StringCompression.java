package com.ctci;

public class StringCompression {

    String stringCompression(String str)
    {
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int count = 0;
        for(int i=0;i<str.length();i++) {
            count++;
            currentChar = str.charAt(i);
            if (i + 1 >= str.length() || currentChar != str.charAt(i + 1) ) {
                sb.append(count);
                sb.append(currentChar);
                count = 0;
            }
        }
        return sb.toString();
    }

    public static void main(String [] args)
    {
        StringCompression sc = new StringCompression();
        System.out.println(sc.stringCompression("aabcccccaaad"));
    }
}
