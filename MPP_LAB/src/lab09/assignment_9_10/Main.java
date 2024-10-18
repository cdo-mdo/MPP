package lab09.assignment_9_10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import old.lesson9.labsolns.prob7b.Employee;
//import old.lesson9.labsolns.prob7b.TriFunction;

public class Main {

    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        System.out.println(emps.stream()
                .filter(emp -> emp.getSalary() > 100000)
                .filter(emp -> emp.lastName.charAt(0) > 'M')
                .map(emp -> emp.firstName + " " + emp.lastName)
                .sorted().collect(Collectors.toList()));

        emps.stream()
            .filter(emp -> emp.getSalary() > 100000)
            .filter(emp -> emp.lastName.charAt(0) > 'M')
            .map(emp -> emp.firstName + " " + emp.lastName)
            .sorted().collect(Collectors.toList());
    }

}
