package test13;

import java.util.Arrays;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
//        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        List<Number> ints = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        List<? super Integer> nums = ints;
        System.out.println(nums.get(1));
    }
}
