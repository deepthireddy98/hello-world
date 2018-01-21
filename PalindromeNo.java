import java.util.*;
class PalindromeNo {
    public static void main(String[] args) {
        System.out.println(isPalindrom(1));
        System.out.println(isPalindrom(12));
        System.out.println(isPalindrom(32123)); 
        System.out.println(isPalindrom(321123)); 
        System.out.println(isPalindrom(-1)); 
        System.out.println(isPalindrom(1234567));
        System.out.println(isPalindrom(1000000021));
    }
    
    /**
     * Clarify whether negative nums are palindrom first
     * Compare each digit
     */
    public static boolean isPalindrom(int num) {
        if (num < 0) return false;
        /*find the most significant digit*/
        int div = 1;
        while (num / div >= 10) div *= 10; // two digits
        
        while (num != 0) { // stop till num is 0, all digits compared
            int l = num / div; // left digit
            int r = num % 10; // right digit
            if (l != r) return false; // compare
            num = (num % div) / 10; // remove first and last digit
            div /= 100; // div should be smaller
        }
        return true;
    }
    
    /**
     * compare the reversed result, can go out of integer's range
     */
    public static int reverse(int num) {
        long rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return num < 0 ? -1 * (int)rev : (int)rev;
    }
}
