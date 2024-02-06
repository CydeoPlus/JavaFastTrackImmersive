package day01;

public class T05_ArraySecondLargestValue {
    public static void main(String[] args) {
        int[] nums  = {5,21,3, 33 , 9};
        System.out.println(getSecondLargestVal(nums));
    }

    public static int getSecondLargestVal(int[] nums) {
        int max = nums[0];
        int secondMax = nums[0];

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
