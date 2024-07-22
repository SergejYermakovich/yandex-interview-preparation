package top75.week1;

import java.util.Locale;

public class ValidPalindrome {
    /*
    A phrase is a palindrome if,
    after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
    it reads the same forward and backward.
    Alphanumeric characters include letters and numbers.

    * */
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome2("A man, a plan, a canal: Panama"));

    }

    private static boolean isPalindrome2(String checkString) {
        int left = 0, right = checkString.length() - 1;
        while (left <= right) {
            char currentLeft = checkString.charAt(left);
            char currentRight = checkString.charAt(right);
            if (!Character.isLetterOrDigit(currentLeft)) {
                left++;
            } else if (!Character.isLetterOrDigit(currentRight)) {
                right--;
            } else if (Character.toLowerCase(checkString.charAt(left)) == Character.toLowerCase(checkString.charAt(right))){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String checkString) {
        if (checkString.isEmpty()) {
            return true;
        }

        StringBuilder builder = new StringBuilder();
        for (Character character : checkString.toLowerCase(Locale.ROOT).toCharArray()) {
            if (Character.isLetterOrDigit(character)) {
                builder.append(character);
            }
        }
        char[] resultCharArray = builder.toString().toCharArray();
        int length = resultCharArray.length;
        for (int i = 0; i < length; i++) {
            if (resultCharArray[i] != resultCharArray[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
