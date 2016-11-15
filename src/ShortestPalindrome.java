/**
 * Created by Computer on 11/12/2016.
 */
public class ShortestPalindrome {
    public static String shortestPalindrome(String s) {
        for (int i = s.length() - 1; i > 0; i--) {
            if (isPalindrome(s, i) && i < s.length()) {
                return new StringBuilder(s.substring(i + 1, s.length())).reverse().append(s).toString();
            }
        }
        if (s.length() > 1) return new StringBuilder(s.substring(1, s.length())).reverse().append(s).toString();
        else return s;
    }

    public static boolean isPalindrome(String s, int end) {
        int start = 0;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(shortestPalindrome("aacecaaa"));
        System.out.println(shortestPalindrome("abcd"));


    }
}
