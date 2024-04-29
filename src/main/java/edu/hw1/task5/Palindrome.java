package edu.hw1.task5;

@SuppressWarnings({"MagicNumber", "ParameterAssignment"})
public class Palindrome {

    public boolean isPalindromeDescendant(long s) {
        while (s > 9) {
            if (isPalindrome(s)) {
                return true;
            }
            s = newNumber(s);
        }
        return false;
    }

    private long newNumber(long num) {
        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i += 2) {
            sb.append((str.charAt(i) - '0') + (str.charAt(i + 1) - '0')); // mb char append
        }
        if (str.length() % 2 == 1) {
            sb.append(str.charAt(str.length() - 1));
        }
        return Long.parseLong(sb.toString());
    }

    private boolean isPalindrome(long s) {
        String str = String.valueOf(s);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
