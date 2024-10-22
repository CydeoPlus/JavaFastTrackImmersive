package day02;

import java.util.Arrays;

public class Ex03VarArgs {
    public static void main(String[] args) {
        readLetters('A','B','C'); //
        readLetters();
        readLetters('J','A','V','A');
        readLetters(new char[]{'h', 'e', 'l', 'l', 'o'});

        int[] myNums = {5,2,7};
        readNumbers(myNums);
        readNumbers2(34,234,5,45,67,3,56,77,4);
        readNumbers2(3);
        readNumbers2();
    }
    //Vargs parameter is created using ...
    public static void readLetters(char... letters) {
        System.out.println(Arrays.toString(letters));
    }

    public static void readNumbers(int[] nums) {
        System.out.println(Arrays.toString(nums));
    }

    public static void readNumbers2(int... nums) {
        System.out.println(Arrays.toString(nums));
    }
}
