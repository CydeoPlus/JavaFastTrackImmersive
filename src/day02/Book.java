package day02;

public class Book {
    //instance variables
    int length;
    public String author;

    //static variable
    static String publisher;
    static int count;

    //instance block
    {
        System.out.println("Instance initializer block");
    }
    //static block
    static {
        System.out.println("static initializer block");
    }

    //no-args constructor
    public Book() {
//        length = 100;
//        author = "unknown";
        this(100, "unknown");
        System.out.println("Creating a book object");
    }

    public Book(int length, String author) {
        this.length = length;
        this.author = author;
    }

    //instance method
    public void read() {
        System.out.println("Reading book by = " + author);
    }

    public void read(int minutes) {
        System.out.println("Reading book by = " + author);
        int num = 10;//local
    }

    public static void addBooks(int count) {
        Book.count += count;
    }

    /*
    we can have static inner class
     */
    static class AudioBook {
        public static void listen() {
            System.out.println("Listening to AudioBook in Audible");
        }
    }

}
