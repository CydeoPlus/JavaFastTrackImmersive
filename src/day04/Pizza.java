package day04;

public class Pizza extends Food {
    public void prepare() {
        System.out.println("Preparing pizza");
    }

    public void cut(int pieces) {
        System.out.println("Cutting pizza to " + pieces +" pieces");
    }
}
