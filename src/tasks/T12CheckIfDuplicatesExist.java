package tasks;

import java.util.*;

public class T12CheckIfDuplicatesExist {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(8, 1,1,4,3,1,5,6,5,2, 2));
        System.out.println(hasDuplicates(nums));

        System.out.println(hasDuplicates(List.of(4,3,2)));

        System.out.println(hasDuplicates2(nums));

        List<Integer> nums2 = new ArrayList<>(List.of(4,3,2));

        System.out.println(hasDuplicates2(nums2));

        System.out.println(hasDuplicatesArray(new int[]{3,3,5,4}));

        System.out.println(hasDuplicatesArray(new int[]{1,2,3}));
    }

    public static boolean hasDuplicates(List<Integer> nums) {
        return nums.size() == new HashSet<>(nums).size();
    }

    public static boolean hasDuplicates2(List<Integer> nums) {
        Collections.sort(nums);

        for (int i = 0; i < nums.size()-1; i++) {
            if (nums.get(i) == nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasDuplicatesArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    return false;
                }
            }
        }

        return true;
    }

}
