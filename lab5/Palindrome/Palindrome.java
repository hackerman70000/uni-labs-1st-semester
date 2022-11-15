/**
 * Finds the longest palindrome from word.
 *
 * @author Bartłomiej Dmitruk
 * @version 2
 */

import java.util.*;

import static java.lang.Character.isLetter;

public class Palindrome {
    /**
     * Text of this palindrome.
     */
    private String palindrome = null;

    /**
     * Text of 'raw' palindrome, with no spaces and no punctuation.
     */
    private String rawPalindrome = null;

    /**
     * @return Gets palindrome.
     */
    public String getPalindrome() {
        return palindrome;
    }

    /**
     * @return Gets 'raw' palindrome.
     */
    public String getRawPalindrome() {
        return rawPalindrome;
    }

    /**
     * @return Transforms palindrome into raw version.
     */
    public static String makeRawPalindrome(String palindromeToRaw) {
        String tempString = "";

        for (int i = 0; i < palindromeToRaw.length(); i++)
            if (isLetter(palindromeToRaw.charAt(i)))
                tempString += palindromeToRaw.charAt(i);

        return tempString;
    }

    /**
     * Construct Palindrome object
     */
    public Palindrome (String text)
    {
        text = "name";
    }


    /**
     * @return Gets number of letters in text.
     */
    public int numLetters(String text) { //remove static
        int characterCounter = 0;

        for (int i = 0; i < text.length(); i++)
            if (isLetter(text.charAt(i)))
                characterCounter++;

        return characterCounter;
    }

    // trzeba napisać
    @Override
    public String toString() {
        return getClass().getName() + Integer.toHexString(hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palindrome);
    }

    public static int index;


    public static String findLongestPalindrome(String word) {
        String subword, current, longestPalindrome = "";
        index = word.length();

        for (int i = 0; i < word.length(); i++) {
            current = "";
            subword = word.substring(i, word.length());
            index = subword.length(); //word

            current = analyzeSubstring(subword).substring(0, index);

            if (longestPalindrome.length() < current.length())
                longestPalindrome = current;

        }
        return longestPalindrome;
    }

    public static String analyzeSubstring(String subword) {
        String substring = "";
        while (index > 0) {
            substring = subword.substring(0, index);
            if (isPalindrome(substring))
                return substring;
        }
        return substring;
    }

    public static boolean isPalindrome(String substring) {
        int i1 = 0, i2 = substring.length() - 1;
        boolean isPalindromeBool = true;

        while (i2 > i1) {
            if (substring.charAt(i1) != substring.charAt(i2)) {
                isPalindromeBool = false;
                break;
            }
            i1++;
            i2--;
        }
        if (!isPalindromeBool)
            index--;

        return isPalindromeBool;
    }

    public static void main(String[] arguments) {
        //String longestPalindrome = findLongestPalindrome(word);
        //System.out.print(longestPalindrome);

        Palindrome p1 = new Palindrome("kobyłamamałybok");
        Palindrome p2 = new Palindrome("kobyła ma mały bok!");
        Palindrome p3 = new Palindrome("elf układał kufle");
        System.out.println("p1 == p2 : " + (p1 == p2));
        System.out.println("p1.equals(p2) : " + p1.equals(p2));

        Hashtable<Palindrome, String> ps = new Hashtable<>();
        ps.put(new Palindrome("a car boso kokos obraca"), "Andrzej Pacierpnik");
        ps.put(p2, "autor nieznany");
        ps.put(new Palindrome("muzo, raz daj jad za rozum"), "Julian Tuwim");
        ps.put(p3, "Tadeusz Morawski");
        System.out.println("Autorem palindromu " + p3 + " jest " + ps.get(p3));
        String word = "rrrrr abccba kobyłamamałybok";
        String longestPalindrome = findLongestPalindrome(word);
        System.out.println("longestPalindrome: " + longestPalindrome);
    }
}