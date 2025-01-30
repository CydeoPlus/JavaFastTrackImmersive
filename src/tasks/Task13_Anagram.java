package tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
java -> vaja
 */
public class Task13_Anagram {

    public static void main(String[] args) {
        System.out.println(anagram("java", "vaja"));
        System.out.println(anagram("car", "cat"));

        System.out.println(anagram2("java", "vaja"));
        System.out.println(anagram2("car", "cat"));

        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('a', 3);
        map1.put('b', 1);

        System.out.println(map1.get('a'));
        System.out.println(map1.get('c'));
        System.out.println(map1.getOrDefault('c', 0));
        System.out.println(map1.getOrDefault('b', 0));

        System.out.println(anagram3("java", "vaja"));
        System.out.println(anagram3("car", "cat"));
    }

    //Convert both to char array and sort, then compare match
    public static boolean anagram(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    /*create 2 hashmaps, put each character and count in maps. compare maps match
    "java", "vaja"
    [j=1, a=2, v=1] === [j=1, a=2, v=1]
    "car", "cat"
    [c=1, a=1, r=1] === [c=1, a=1, t=1]

     */
    public static boolean anagram2(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char each : s1.toCharArray()) {
            map1.put(each, map1.getOrDefault(each, 0) + 1);
        }

        for(char each : s2.toCharArray()) {
            map2.put(each, map2.getOrDefault(each, 0) + 1);
        }

//        for (int i = 0; i < s1.length(); i++) {
//            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
//            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
//        }

        return map1.equals(map2);

    }

    public static boolean anagram3(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] alp = new int[26];
        for (char ch : s.toCharArray()) {
            alp[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            alp[ch - 'a']--;
        }

        for (int j : alp) {
            if (j != 0) return false;
        }

        return true;

    }

}
