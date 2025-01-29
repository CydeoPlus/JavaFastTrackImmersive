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
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice"));
        employees.add(new Employee(1, "Bob"));
        employees.add(new Employee(2, "Charlie"));

        System.out.println(employees);
        Collections.sort(employees); // Sort by id (Comparable)
        System.out.println(employees);
    }
}


