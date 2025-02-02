package tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task05PalindromeString {


    public static void main(String[] args) {
        String str ="saippuakivikauppias";
        //shortest using stringbuilder reverse method
        //boolean isPalindrome = new StringBuilder(str).reverse().toString().equals(str);
        boolean isPalindrome = isPalindromeStringV1(str);
        System.out.println("isPalindrome = " + isPalindrome);

        //Solution Using loops
        //boolean isPalindrome2 ;
        str = "javaqj";
//        System.out.println(str.charAt(str.length()-1));
//        int i = 1;
//        i++;
//        System.out.println(str.charAt(str.length()-1-i));

        boolean flag = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                System.out.println("NOT PALINDROME");
                flag = false;
                break;
            }
        }

        System.out.println("palindrome flag = " + flag);
        
        //reverse first then compare.
        String reversed = "";
        str = "dad";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("reversed = " + reversed);
        boolean isPalndrome3 = str.equals(reversed);
        System.out.println("isPalndrome3 = " + isPalndrome3);

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

        System.out.println(isPalindrome("Ci,vi@c%"));


    }
//"A man, a plan, a canal: Panama"
    public static boolean isPalindromeStringV1(String str) {
       return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static boolean isPalindrome(String str) {
        //remove spaces and special characters
        //Regex -> Regular expression to remove anything except numbers and letters
        str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        //two pointer technique
        for (int i = 0, j = str.length()-1; i < str.length()/2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;
    }


    //unit test for isPalindromeStringV1() method
    @DisplayName("Palindrome valid test")
    @Test
    public void palindromeTest1() {
        String str = "racecar";
        assertTrue(isPalindromeStringV1(str));
    }

    @DisplayName("Palindrome invalid test")
    @Test
    public void palindromeTest2() {
        String str = "java";
        assertFalse(isPalindromeStringV1(str));
    }
}
