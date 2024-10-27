package test15;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        
        List<Number> nums = ints;
        nums.add(3.14);
        
    }
}
