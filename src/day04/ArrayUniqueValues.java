package day04;

import java.util.*;

public class ArrayUniqueValues {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,4,5,4};
        Set<Integer> uniqueNums = new LinkedHashSet<>();
        for (Integer num : nums) {
            uniqueNums.add(num);
        }

        System.out.println(uniqueNums);

        List<Integer> numsList = new ArrayList<>(List.of(33,33,555,555,222,12,12,12,12,0,0));
        Set<Integer> numsSet = new LinkedHashSet<>(numsList);
        System.out.println("numsSet = " + numsSet);
    }
}
