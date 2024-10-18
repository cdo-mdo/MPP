package lesson10.exercise_1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;

public class TestLambda extends TestCase {
    @Test
    public void testLambda() {
        Customer customer1 = new Customer("1", "Roger", "Lvin");
        Customer customer2 = new Customer("2", "Gajen", "Kandjia");
        Account account1 = new Account(1000000, customer1);
        Account account2 = new Account(2000000, customer2);
        
        List<Customer> list = new ArrayList<>();
        list.add(customer1);
        list.add(customer2);
        
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Kandjia");
        expectedResult.add("Lvin");
        
        assertEquals(expectedResult, Problem1.);
    };
}
