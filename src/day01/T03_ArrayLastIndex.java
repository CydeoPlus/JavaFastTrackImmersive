package day01;

import java.util.ArrayList;
import java.util.List;

public class T03_ArrayLastIndex {
    public static void main(String[] args) {
        int[] nums  = {4,1,5,2,33};
        System.out.println("size = " + nums.length);

        System.out.println("last element = " + nums[nums.length - 1]);

        List<Integer> numsList = new ArrayList<>(List.of(43,554,13,54));
        System.out.println("last in list = " + numsList.get(numsList.size()-1));

        String str = "monitor";
        System.out.println(str.charAt(str.length()-1));
    }
}
