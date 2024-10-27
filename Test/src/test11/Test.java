package test11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = new ArrayList<>();
        
//        class DoSquare implements Consumer<Integer> {
//            @Override
//            public void accept(Integer i) {
//                squares.add(i * i);
//            }
//        }
//        
//        nums.forEach(new DoSquare());
//        
        nums.forEach(squares::add);
        
        System.out.println(squares.toString());
    }
}
