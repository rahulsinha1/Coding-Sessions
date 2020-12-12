[1mdiff --git a/out/production/Data Structures and Coding Practice/com/ctci/OneAway.class b/out/production/Data Structures and Coding Practice/com/ctci/OneAway.class[m
[1mindex e37bd1d..7351059 100644[m
Binary files a/out/production/Data Structures and Coding Practice/com/ctci/OneAway.class and b/out/production/Data Structures and Coding Practice/com/ctci/OneAway.class differ
[1mdiff --git a/out/production/Data Structures and Coding Practice/com/ctci/PallindromePermutation.class b/out/production/Data Structures and Coding Practice/com/ctci/PallindromePermutation.class[m
[1mindex f9bbb61..0940efd 100644[m
Binary files a/out/production/Data Structures and Coding Practice/com/ctci/PallindromePermutation.class and b/out/production/Data Structures and Coding Practice/com/ctci/PallindromePermutation.class differ
[1mdiff --git a/out/production/Data Structures and Coding Practice/com/ctci/URLify.class b/out/production/Data Structures and Coding Practice/com/ctci/URLify.class[m
[1mindex 8260ca9..6fa814e 100644[m
Binary files a/out/production/Data Structures and Coding Practice/com/ctci/URLify.class and b/out/production/Data Structures and Coding Practice/com/ctci/URLify.class differ
[1mdiff --git a/out/production/Data Structures and Coding Practice/com/ctci/UniqueCharacters.class b/out/production/Data Structures and Coding Practice/com/ctci/UniqueCharacters.class[m
[1mindex 536a999..260cb82 100644[m
Binary files a/out/production/Data Structures and Coding Practice/com/ctci/UniqueCharacters.class and b/out/production/Data Structures and Coding Practice/com/ctci/UniqueCharacters.class differ
[1mdiff --git a/src/com/ctci/OneAway.java b/src/com/ctci/OneAway.java[m
[1mindex 41a07c8..7377aab 100644[m
[1m--- a/src/com/ctci/OneAway.java[m
[1m+++ b/src/com/ctci/OneAway.java[m
[36m@@ -2,8 +2,6 @@[m [mpackage com.ctci;[m
 [m
 public class OneAway {[m
 [m
[31m-<<<<<<< HEAD[m
[31m-[m
     public static void main(String[] args) {[m
         OneAway oneAway = new OneAway();[m
         boolean result = oneAway.checkOneAway("pae", "pale");[m
[36m@@ -87,52 +85,4 @@[m [mpublic class OneAway {[m
         }[m
         return true;[m
     }[m
[31m-}[m
[31m-[m
[31m-=======[m
[31m-    private static final int SIZE = 26;[m
[31m-    boolean checkOneAway(String str1, String str2)[m
[31m-    {[m
[31m-        boolean result = true;[m
[31m-        int [] freqFirstString = new int [SIZE];[m
[31m-        int [] freqSecondString = new int [SIZE];[m
[31m-[m
[31m-        for (int i=0; i<str1.length();i++)[m
[31m-        {[m
[31m-            freqFirstString[str1.charAt(i)-'a']++;[m
[31m-        }[m
[31m-[m
[31m-        for (int i=0; i<str2.length();i++)[m
[31m-        {[m
[31m-            freqSecondString[str2.charAt(i)-'a']++;[m
[31m-        }[m
[31m-        int stringLength = (str1.length() > str2.length()) ? str1.length(): str2.length();[m
[31m-[m
[31m-        int count =0;[m
[31m-        for(int i=0;i<stringLength;i++)[m
[31m-        {[m
[31m-            if(freqFirstString[str1.charAt(i)-'a']!= freqSecondString[str1.charAt(i)-'a'])[m
[31m-            {[m
[31m-                count++;[m
[31m-                if(count>1)[m
[31m-                {[m
[31m-                    result = false;[m
[31m-                    break;[m
[31m-                }[m
[31m-            }[m
[31m-        }[m
[31m-        if(count == 0)[m
[31m-        {[m
[31m-            result = false;[m
[31m-        }[m
[31m-        return result;[m
[31m-    }[m
[31m-[m
[31m-    public static void main(String [] args)[m
[31m-    {[m
[31m-        OneAway oneAway = new OneAway();[m
[31m-        boolean result = oneAway.checkOneAway("pale","palei ");[m
[31m-        System.out.println("Condition one away : "+ result);[m
[31m-    }[m
[31m-}[m
[31m->>>>>>> d8ce0bb43369e0d2e52e9b363afe5b14e17be3de[m
[32m+[m[32m}[m
\ No newline at end of file[m
