package tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task10_CountOfEachCharacter {
    public static void main(String[] args) {
        String str = "aabbbcdd";

        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] strArr = str.toCharArray();

        for (char ch : strArr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println("map = " + map);

    }
}
