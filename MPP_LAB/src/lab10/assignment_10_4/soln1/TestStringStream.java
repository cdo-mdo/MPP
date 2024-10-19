package lab10.assignment_10_4.soln1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import lab10.assignment_10_4.Employee;
import lab10.assignment_10_4.Main;

class TestStringStream {

    @Test
    void test1() {
        List<Employee> emps = new ArrayList<>();        
        emps.add(new Employee("Joe", "Davis", 120000));
        emps.add(new Employee("John", "Sims", 110000));
        emps.add(new Employee("Joe", "Stevens", 200000));
        emps.add(new Employee("Andrew", "Reardon", 80000)); 
        emps.add(new Employee("Joe", "Cummings", 760000));
        emps.add(new Employee("Steven", "Walters", 135000)); 
        emps.add(new Employee("Thomas", "Blake", 111000));
        emps.add(new Employee("Alice", "Richards", 101000)); 
        emps.add(new Employee("Donald", "Trump", 100000));
        String expectedStr1 = "Alice Richards, Joe Stevens, John Sims, Steven Walters";

        Main main = new Main();
        assertTrue(expectedStr1.equals(main.asString(emps)));
    }
    
    @Test
    void test2() {
        List<Employee> emps = new ArrayList<>();        
        emps.add(new Employee("Joe", "Davis", 120000));
        emps.add(new Employee("John", "Sims", 110000));
        emps.add(new Employee("Joe", "Stevens", 200000));
        emps.add(new Employee("Andrew", "Reardon", 80000)); 
        emps.add(new Employee("Joe", "Cummings", 760000));
        emps.add(new Employee("Steven", "Walters", 13500)); 
        emps.add(new Employee("Thomas", "Blake", 111000));
        emps.add(new Employee("Alice", "Richards", 99999)); 
        emps.add(new Employee("Donald", "Trump", 100000));
        String expectedStr1 = "Joe Stevens, John Sims";

        Main main = new Main();
        assertTrue(expectedStr1.equals(main.asString(emps)));
    }

}
