package com.ctci;

import java.util.Arrays;
import java.util.HashMap;

/*
Implement an algorithm to determine if a string has unique characters (Using hashmap)
 */
public class UniqueCharacters {
    boolean hasUniqueChars(String string) {
        boolean flag = true;
        if (string.equals("") || (string == null)) {
            throw new IllegalArgumentException("String is null or empty");
        }
        char[] arr = string.replace(" ","").toCharArray();
        int arrlength = arr.length;
        HashMap<Character,Integer> hm = new HashMap<>();
        if(arrlength >1)
        {
            for (char c : arr) {
                if (hm.containsKey(c)) {
                    flag = false;
                    break;
                } else {
                    hm.put(c, 1);
                }
            }
        }
        return flag;
    }

    // When we cannot use any other data structure
    boolean uniqueChar2(String string)
    {
        boolean flag = true;
        if(string.length() > 128)
        {
            return false;
        }

        boolean[] existingChar = new boolean[128];
        char[] arr = string.replace(" ","").toCharArray();
        int val;
        for( char c: arr)
        {
          val = c;
          if(existingChar[val])
          {
              flag = false;
              break;
          }
          else
          {
              existingChar[val] = true;
          }
        }

        return flag;
    }

    // Without any limitations on string(o(n log n) time)

    boolean uniqueChar3(String string)
    {
        boolean result = true;
        char [] asciiArray = string.toCharArray();
        Arrays.sort(asciiArray);
        for(int i =0 ; i<asciiArray.length -1 ;i++)
        {
            if (asciiArray[i] == asciiArray[i+1])
            {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String args [])
    {
        UniqueCharacters uc = new UniqueCharacters();
        String testString ="y9yhg6";
        boolean result = uc.hasUniqueChars(testString);
        if(result)
        {
            System.out.println("It's unique");
        }
        else
        {
            System.out.println("Its not unique");
        }
        System.out.println("**************************************************\n");
        result = uc.uniqueChar2(testString);
        if(result)
        {
            System.out.println("It's unique");
        }
        else
        {
            System.out.println("Its not unique");
        }

        System.out.println("**************************************************\n");
        result = uc.uniqueChar3(testString);
        if(result)
        {
            System.out.println("It's unique");
        }
        else
        {
            System.out.println("Its not unique");
        }
    }
}
