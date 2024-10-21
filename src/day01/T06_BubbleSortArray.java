package day01;

import java.util.Arrays;

public class T06_BubbleSortArray {
    public static void main(String[] args) {
        int[] nums  = {5,21,3, 33 , 9};
        //Arrays.sort(nums);
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }

    public static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }
}
