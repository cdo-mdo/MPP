package test13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test2 {
    
    public static <T extends Comparable<? super T>> Optional<T> secondSmallest(List<T> list) {
        return list.stream()
                .sorted()
                .distinct()
                .skip(1)
                .findFirst();
    }
    
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        
        List<? super Integer> nums = ints;
        System.out.println(nums.get(0));
        
        System.out.println(secondSmallest(ints).get());
    }
}
