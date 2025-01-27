package day01;

public class T01_StringReverse {
    public static void main(String[] args) {
        String word = "java";
        word = new StringBuilder(word).reverse().toString();
        System.out.println("word = " + word);

        String word2 = "apple";
        String reversedStr = "";
        for (int i = word2.length() - 1; i >= 0; i--) {
            reversedStr += word2.charAt(i);
        }
        System.out.println("reversedStr = " + reversedStr);
    }

    public static String reverseStr(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }

}
