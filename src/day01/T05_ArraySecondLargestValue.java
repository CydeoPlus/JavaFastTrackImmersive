package day01;

public class T05_ArraySecondLargestValue {

    public static void main(String[] args) {
        int[] nums  = {1, 55, 21, 3, 33, 9, 48};
        System.out.println(getSecondLargestVal(nums));
    }

    public static int getSecondLargestVal(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return secondMax;
    }

}
