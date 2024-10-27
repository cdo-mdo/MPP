package test11;

import java.util.Arrays;
import java.util.List;

public class Test12 {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(4, 6, 8, 2);
        List<? super Integer> nums = ints;
        System.out.println(nums.get(1));
        }

}
