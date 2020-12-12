package com.ctci;

public class OneAway {

<<<<<<< HEAD

    public static void main(String[] args) {
        OneAway oneAway = new OneAway();
        boolean result = oneAway.checkOneAway("pae", "pale");
        System.out.println("Condition one away : " + result);
        result = oneAway.checkOneAway("pale", "pake");
        System.out.println("Condition one away : " + result);
    }

    //Two differennt methods for replace & insertion/removal
    boolean checkOneAway(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return oneEditReplace(str1, str2);
        } else if (str1.length() + 1 == str2.length()) {
            return oneEditInsert(str1, str2);
        } else if (str2.length() + 1 == str1.length()) {
            return oneEditInsert(str2, str1);
        }
        return false;
    }

    boolean oneEditReplace(String str1, String str2) {
        boolean difference = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (difference) {
                    return false;
                }
                difference = true;
            }
        }
        return true;
    }

    //Another technique to solve the problem

    boolean oneEditInsert(String str1, String str2) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < str1.length() && index2 < str2.length()) {
            if (str1.charAt(index1) != str2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    boolean oneAway(String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false;
        }

        String s1 = str1.length() < str2.length() ? str1 : str2;
        String s2 = str1.length() < str2.length() ? str2 : str1;
        int index1 = 0, index2 = 0;
        boolean diff = false;
        while (index1<s1.length() && index2<s2.length())
        {
            if(s1.charAt(index1) != s2.charAt(index2))
            {
                if(diff)
                {
                    return false;
                }
                diff = true;
                if(s1.length() == s2.length())
                {
                    index1++;
                }
            }
            else
            {
                index1++;
            }
            index2++;
        }
        return true;
    }
}

=======
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
>>>>>>> d8ce0bb43369e0d2e52e9b363afe5b14e17be3de
