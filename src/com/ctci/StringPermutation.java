package com.ctci;

import java.util.Arrays;
import java.util.HashMap;

public class StringPermutation {

    boolean isPermutation(String str1, String str2) {
        boolean flag = false;

        if (str1 == null || str1.equals("") || str2.equals("") || str2.equals(null)) {
            return flag;
        }
        if (str1.length() != str2.length())
            return flag;
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.toString(a).equals(Arrays.toString(b))) {
            flag = true;
        }

        return flag;
    }

    // Using hashMap in O(n) time

    public boolean isPermutation2(String str1, String str2) {
        boolean flag = true;
        if (str1 == null || str1.equals("") || str2.equals("") || str2.equals(null) ||
                str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        char currentCharacter;
        for (int i = 0; i < str1.length(); i++) {
            currentCharacter = str1.charAt(i);
            if (!hm1.containsKey(currentCharacter)) {
                hm1.put(currentCharacter, 1);
            } else {
                hm1.replace(currentCharacter, hm1.get(currentCharacter) + 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            currentCharacter = str2.charAt(i);
            if (!hm2.containsKey(currentCharacter)) {
                hm2.put(currentCharacter, 1);
            } else {
                hm2.replace(currentCharacter, hm2.get(currentCharacter) + 1);
            }
        }

            for(int i =0; i<str1.length(); i++)
            {
                currentCharacter = str1.charAt(i);
                if(!hm1.get(currentCharacter).equals(hm2.get(currentCharacter)))
                {
                    flag = false;
                    break;
                }
            }
        return flag;
        }



    public static void main(String [] args)
    {
        StringPermutation stringPermutation = new StringPermutation();
        System.out.println(stringPermutation.isPermutation("abcdddd","dcadddb"));
        System.out.println(stringPermutation.isPermutation2("aacb","baba"));
    }
}
