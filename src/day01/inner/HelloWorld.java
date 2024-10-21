package day01.inner;

import java.util.ArrayList;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello world");

        String str1;
        str1 = "java";

        var str2 = "python";

        /*
        var list = new ArrayList<>();
        int i = 1;
        while(true) {
            list.add(i++);
        }
         */

        String str = "java";
        String word = "java";
        String another = new String("java");

        System.out.println(str == word);
        System.out.println(str == another);
        System.out.println(str.equals(another));

        String str3 = "";
        String str4 = null;
        System.out.println(str3.length());
        System.out.println(str4.length());
    }

    public static void m1() {
        m1();
    }
}
