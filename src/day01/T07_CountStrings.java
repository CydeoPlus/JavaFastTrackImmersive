package day01;

public class T07_CountStrings {

    public static void main(String[] args) {
        System.out.println(countStrings("consistency", "c"));
        System.out.println(countStrings("java is not javascript, javascript is different", "java"));

        System.out.println(countStrings2("consistency", "c"));
        System.out.println(countStrings2("java is not javascript, javascript is different", "java"));
    }

    public static int countStrings(String str, String target) {
        if (str == null || !str.contains(target)) return 0;

        //replace method
        return (str.length() - str.replace(target, "").length()) / target.length();
    }

    public static int countStrings2(String str, String target) {
        if (str == null || !str.contains(target)) return 0;

        int count = 0;
        for (int i = 0; i < str.length()-target.length(); i++) {
            if (str.substring(i, i + target.length()).equals(target)) {
                count++;
            }
        }
        return count;
    }
}
