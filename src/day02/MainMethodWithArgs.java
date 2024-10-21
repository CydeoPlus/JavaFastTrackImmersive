package day02;

public class MainMethodWithArgs {
    static public void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    //overloaded main method with different parameter. but JVM will
    // not use this one for starting execution
    public static void main(String args) {
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
    }
}

class Second {
    public static void main(String[] args) {
        String[] strs = {"java", "apple", "google"};
        //call main method by passing arguments
        MainMethodWithArgs.main(strs);
    }
}