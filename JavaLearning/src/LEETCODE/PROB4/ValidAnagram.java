package LEETCODE.PROB4;
import java.util.*;
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] args) {
        ValidAnagram sol = new ValidAnagram();

        System.out.println("anagram & nagaram "+sol.isAnagram("anagram", "nagaram"));
        System.out.println("win & lose "+sol.isAnagram("win", "lose"));
    }
}