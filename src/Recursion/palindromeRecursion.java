package Recursion;

public class palindromeRecursion {
    public static void main(String[] args) {
        System.out.println(palin("naman"));
    }
    static boolean  palin(String str) {
        // Base case: empty string or single char is palindrome
        if (str.length() <= 1) {
            return true;
        }
        // If first and last don't match → not palindrome
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        // Recurse on the middle part
        return palin(str.substring(1, str.length() - 1));
    }
}

