package lab09.assignment_9_11;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Integer, Character, List<String>> LIST_FULL_NAMES
        = (list, salaryLevel, letter) -> list.stream()
            .filter(emp -> emp.getSalary() > salaryLevel)
            .filter(emp -> emp.getLastName().charAt(0) > letter)
            .map(emp -> emp.getFirstName() + ' ' + emp.getLastName())
            .collect(Collectors.toList());
}
