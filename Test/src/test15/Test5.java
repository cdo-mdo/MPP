package test15;

import java.util.Arrays;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4);
        
        int sum = ints.stream().reduce(0, (a, b) -> a + b);
        
        System.out.println(sum);
        
    }
}
