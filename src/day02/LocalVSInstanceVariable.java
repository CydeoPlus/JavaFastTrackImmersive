package day02;

public class LocalVSInstanceVariable {
    //instance variable
    int myVariable;

    public void myMethod() {
        //local variable
        int num = 10;
        System.out.println("num = " + num);

        if (10 == 10) {
                //local
            String status = "Ok";
        }
        //System.out.println(status);
    }
}

class MyRestAssured {
    public static String URI;
}
