package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
find elements that appear only once
 */
public class Task11FindUniqueValues {
    public static void main(String[] args) {
        //removeIf method
        List<Integer> nums = new ArrayList<>(List.of(8, 1,1,4,3,1,5,6,5,2, 2));

        nums.removeIf(e -> Collections.frequency(nums, e) > 1);

        System.out.println("nums = " + nums);

        //Loop and find that have frequency of 1
        List<Integer> nums2 = new ArrayList<>(List.of(8, 1,1,4,3,1,5,6,5,2, 2));
        List<Integer> unique = new ArrayList<>();

        for (int num : nums2) {
            if (Collections.frequency(nums2, num) == 1) {
                unique.add(num);
            }
        }

        System.out.println("unique = " + unique);

    }
}
