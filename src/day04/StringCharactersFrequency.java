package day04;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringCharactersFrequency {
    public static void main(String[] args) {
        String word = "apple iphone 15";
        Map<Character, Integer> map = new LinkedHashMap<>(); //Key, Value

        for (int i = 0; i < word.length(); i++) {
            Character ch = word.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println(map);


        //stream:
        String input = "hello world";

        Map<Character, Long> frequencyMap = input.chars() // Convert string to IntStream
                .mapToObj(c -> (char) c) // Convert int to Character
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())); // Group by character and count

        System.out.println(frequencyMap);
    }
}
