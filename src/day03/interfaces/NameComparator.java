package day03.interfaces;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

class IDComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.id - e2.id;
    }
}

class Runner {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice"));
        employees.add(new Employee(1, "Zak"));
        employees.add(new Employee(2, "Charlie"));

        System.out.println(employees);
        Collections.sort(employees, new NameComparator());
        System.out.println(employees);

        Collections.sort(employees, new IDComparator());
        System.out.println(employees);

        Collections.sort(employees, (e1,e2) -> e1.name.length()-e2.name.length());

        Collections.sort(employees, Comparator.comparingInt(e -> e.name.length()));

        System.out.println(employees);

    }
}