package day01;

public class T02_ReverseSentence {
    public static void main(String[] args) {
        String str = "java coding interview"; // -> SDET am I
        String[] strArr = str.split(" ");
        String reversed = "";

        for (int i = strArr.length-1; i >= 0 ; i--) {
            reversed += strArr[i] +" ";
        }
        reversed = reversed.trim();
        System.out.println("reversed = " + reversed);

    }
}
