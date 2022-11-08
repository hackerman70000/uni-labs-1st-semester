import java.util.*;

public class Palindrome {

    public static int index;

    public static void main (String[]arguments){
        String word = "abccba";
        index = word.length();
        String longestPalindrome = findLongestPalindrome(word);
        System.out.print(longestPalindrome);
    }

    public static String findLongestPalindrome(String word) {
        String subword, current, longestPalindrome = "";
        index = word.length();

        for (int i = 0; i < word.length(); i++) {
            current = "";
            subword = word.substring(i, word.length());
            index = subword.length(); //word

            current = analyzeSubstring(subword).substring(0,index);

            if(longestPalindrome.length() < current.length())
                longestPalindrome = current;

        }
        return longestPalindrome;
    }
    public static String analyzeSubstring(String subword) {
        String substring ="";
        while (index > 0)
        {
             substring = subword.substring(0, index);
            if (isPalindrome(substring))
                return substring;
        }
        return substring;
    }
    public static boolean isPalindrome(String substring){
        int i1 = 0, i2 = substring.length() - 1;
        boolean isPalindromeBool = true;

        while(i2 > i1)
        {
            if(substring.charAt(i1) != substring.charAt(i2))
            {
                isPalindromeBool = false;
                break;
            }
            i1 ++;
            i2 --;
        }
        if(!isPalindromeBool)
            index--;

        return isPalindromeBool;
    }
    }