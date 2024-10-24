package day04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0) // Filter even numbers
                .toList(); // Collect the results into a list

        System.out.println(evenNumbers); // Output: [2, 4, 6, 8, 10]

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers2.stream()
                .map(num -> num * num) // Square each number
                .toList(); // Collect the results into a list

        System.out.println(squaredNumbers); // Output: [1, 4, 9, 16, 25]
    }
}
