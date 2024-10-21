package day04;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayUniqueValues {
    public static void main(StringCharactersFrequency[] args) {
        int[] nums = {1,2,2,1,4,5,4};
        Set<Integer> uniqueNums = new LinkedHashSet<>();
        for (Integer num : nums) {
            uniqueNums.add(num);
        }

        System.out.println(uniqueNums);
    }
}
