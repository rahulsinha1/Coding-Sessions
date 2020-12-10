package com.ctci;

public class OneAway {

    private static final int SIZE = 26;
    boolean checkOneAway(String str1, String str2)
    {
        boolean result = true;
        int [] freqFirstString = new int [SIZE];
        int [] freqSecondString = new int [SIZE];

        for (int i=0; i<str1.length();i++)
        {
            freqFirstString[str1.charAt(i)-'a']++;
        }

        for (int i=0; i<str2.length();i++)
        {
            freqSecondString[str2.charAt(i)-'a']++;
        }
        int stringLength = (str1.length() > str2.length()) ? str1.length(): str2.length();

        int count =0;
        for(int i=0;i<stringLength;i++)
        {
            if(freqFirstString[str1.charAt(i)-'a']!= freqSecondString[str1.charAt(i)-'a'])
            {
                count++;
                if(count>1)
                {
                    result = false;
                    break;
                }
            }
        }
        if(count == 0)
        {
            result = false;
        }
        return result;
    }

    public static void main(String [] args)
    {
        OneAway oneAway = new OneAway();
        boolean result = oneAway.checkOneAway("pale","palei ");
        System.out.println("Condition one away : "+ result);
    }
}
