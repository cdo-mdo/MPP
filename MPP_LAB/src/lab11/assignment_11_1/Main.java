package lab11.assignment_11_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    void method1() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<Number> nums = ints; // compile error is here
        nums.add(3.14);
    }
    
    void method2() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        nums.add(3.14); // compile error is here
    }
    
    public static void main(String[] args) {
        
    }
}
