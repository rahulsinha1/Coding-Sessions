package com.ctci;

import java.util.Arrays;

public class URLify {
    public String urlify(String string, int trueLength)
    {
        char [] str = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<trueLength;i++)
        {
            if (str[i] == ' ')
            {
                sb.append("%20");
            }
            else
            {
                sb.append(str[i]);
            }
        }
        sb.getChars(0,sb.length(),str,0);

        return sb.toString();
    }


    //Without using stringBuilder . It runs in o(n) time as well.

    public String urlify2(String string, int trueLength)
    {
        int noOfSpaces = 0;
        char [] str = string.toCharArray();
        for(int i =0 ;i<trueLength;i++) {
            if (str[i] == ' ') {
                noOfSpaces++;
            }
        }
        if(noOfSpaces ==0)
        {
            return string;
        }

        int index = str.length;

        for(int i = trueLength-1; i>=0;i--)
        {
            if (str[i] == ' ')
            {
                str[index -1 ] ='0';
                str[index -2 ] ='2';
                str[index -3 ] ='%';
                index -= 3;
            }
            else
            {
                str[index-1] = str[i];
                index--;
            }
        }
        return Arrays.toString(str);

    }

    public static void main(String [] args)
    {
        URLify obj = new URLify();
        System.out.println(obj.urlify("Mr John Smith    ", 13));
        System.out.println(obj.urlify2("Mr John Smith    ", 13));
    }
}
 