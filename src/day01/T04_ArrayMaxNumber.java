package day01;

import java.util.Arrays;

public class T04_ArrayMaxNumber {
    public static void main(String[] args) {
        int[] nums  = {4,1,5,2, 33, 21};
        System.out.println("max number = " + maxNum(nums));
        System.out.println("max number = " + maxNumV2(nums));
    }

    public static int maxNum(int[] nums) {
        int max = nums[0];

        for(int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static int maxNumV2(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        return max;
    }
}
