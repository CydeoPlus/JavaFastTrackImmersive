package day03.interfaces;

import java.util.*;

public class Employee implements Comparable<Employee> {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override  //3 - 1 -> 2
    public int compareTo(Employee other) {
        //return this.id - other.id;
        return this.name.length() - other.name.length();
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

class Main {

    static String word;

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice"));
        employees.add(new Employee(1, "Bob"));
        employees.add(new Employee(2, "Charlie"));

        System.out.println(employees);
        Collections.sort(employees); // Sort by id (Comparable)
        System.out.println(employees);

        System.gc();//suggesting JVM to call Garbage Collector, but no guarantee

        //LinkedList<Employee> ll = (LinkedList)employees;
        //System.out.println("ll = " + ll);
        //classCastException

        //System.out.println(word.length()); //NullPointerException
    }
}
