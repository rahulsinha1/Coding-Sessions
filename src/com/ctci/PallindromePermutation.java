package com.ctci;

import java.util.HashMap;

public class PallindromePermutation {

    // Check if string is a permutation of a pallinfrome
    boolean PallindromePermutation(String str)
    {
        boolean isPallindrome = true;
        HashMap<Character,Integer> frequency = new HashMap<>();
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            char current_character = str.charAt(i);
            if(frequency.containsKey(current_character))
            {
                frequency.replace(current_character,frequency.get(current_character)+1);
            }
            else {
                frequency.put(current_character,1);
            }
        }

        int count=0;
        for(char key : frequency.keySet())
        {
            if(frequency.get(key)%2 !=0 && key!=' ')
            {
                count ++;
            }
            if(count > 1)
            {
                isPallindrome = false;
                break;
            }
        }
        return isPallindrome;
    }

    public static void main(String [] args)
    {
        PallindromePermutation pm = new PallindromePermutation();
        System.out.println(pm.PallindromePermutation("Tact coa"));
    }
}
