package lab10.assignment_10_4.soln2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lab10.assignment_10_4.Employee;
import lab10.assignment_10_4.Main;

class TestAuxilaryMethod {

    @Test
    void testSalaryGreaterThan100000() {
        Employee emp1 = new Employee("Joe", "Davis", 120000);
        Employee emp2 = new Employee("Alice", "Richards", 99999); 
        
        Main main = new Main();
        assertTrue(main.salaryGreaterThan100000.test(emp1));
        assertFalse(main.salaryGreaterThan100000.test(emp2));
    }

    @Test
    void testlastNameAfterM() {
        Employee emp1 = new Employee("Joe", "Davis", 120000);
        Employee emp2 = new Employee("Alice", "Richards", 99999); 
        
        Main main = new Main();
        assertTrue(main.lastNameAfterM.test(emp2));
        assertFalse(main.lastNameAfterM.test(emp1));
    }
}
