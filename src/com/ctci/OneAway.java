package com.ctci;

public class OneAway {


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
        while (s1.length() < index1 && s2.length() <index2)
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

