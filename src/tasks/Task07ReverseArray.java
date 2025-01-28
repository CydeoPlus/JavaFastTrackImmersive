package tasks;

import java.util.Arrays;

public class Task07ReverseArray {
    public static void main(String[] args) {
        int[] nums = {10, 30, 40, 60, 4, 3};
        System.out.println(Arrays.toString(nums));
        nums = reverseArray(nums);
        System.out.println(Arrays.toString(nums));

    }
    //time complexity is O(n)
    //space complexity 0(1)
    public static int[] reverseArray(int[] nums) {
        for (int i = 0, j = nums.length-1; i < nums.length / 2; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }
    //time complexity is O(n)
    //space complexity 0(n)
    public static int[] reverseArrayV2(int[] nums) {
        int[] reversed = new int[nums.length];
        for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = nums[i];
        }
        return reversed;
    }

}
