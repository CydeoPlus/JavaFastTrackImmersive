package day02;

public class StringAndStringBuilder {
    public static void main(String[] args) {
        //String is immutable
        //StringBuilder is mutable
        
        String str = "abc";
        str = str + "def";
        System.out.println("str = " + str);//3 objects are created
        
        StringBuilder stb = new StringBuilder("abc");
        stb.append("def");
        System.out.println("stb = " + stb);
        
        String str2 = "";
        StringBuilder stb2 = new StringBuilder();
        for (int i = 0; i <= 1000 ; i++) {
            str2 += i;
            stb2.append(i);
        }
        System.out.println("str2 = " + str2);
        System.out.println("stb2 = " + stb2);
        
    }
}
