package lab09.assignment_9_9;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Or {

    public static void main(String[] args) {
        List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
        System.out.println(someSimpleIsTrue(list));
        
        System.out.println(printStringStream());
        
        printMaxMin();
    }

//    public boolean someSimpleIsTrue(List<Simple> list) {
//        boolean accum = false;
//        for (Simple s : list) {
//            accum = accum || s.flag;
//        }
//        return accum;
//    }
    
    public static boolean someSimpleIsTrue(List<Simple> list) {
        Optional<Boolean> reduce = list.stream().map(simple -> simple.flag).reduce((a, b) -> a || b);
        return reduce.get();
    }

    public static String printStringStream() {
        Stream<String> strings = Stream.of("Bill", "Thomas", "Mary");
       
//        return strings.reduce("", (a, b) -> a + ", " + b);
        return strings.collect(Collectors.joining(", "));
    }
    
    public static void printMaxMin() {
        Stream<Integer> nums = Stream.of(1, 4, 6, 78, 343, 23, 3453, 343, 232, -1 , 2332 , -2334);
        IntSummaryStatistics summary = nums.collect(Collectors.summarizingInt((Integer i) -> i));
        
        System.out.println(summary.getMin());
        System.out.println(summary.getMax());
        
    }
}
