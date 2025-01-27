package day01.inner;

public class T08_1stNotRepeatedChar {
    public static void main(String[] args) {
        System.out.println(firstNonRepeated("aabccdddqjj"));
        System.out.println(firstNonRepeated("aabbccdddqqjj"));
    }

    public static char firstNonRepeated(String str) {
        if (str == null) {
            throw new IllegalArgumentException("str is cannot be null");
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                return ch;
            }
        }

        return '\0';
    }
}
