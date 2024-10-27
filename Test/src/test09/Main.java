package test09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> squares = new ArrayList<>();
    
    class Square<Integer> implements Consumer<Integer> {
        @Override
        public void accept(Integer i) {
            squares.add((java.lang.Integer) i*i);
        }
    }
    
    Function<Integer, Integer> sqr = (i) -> {return i*i;};
    Consumer<Integer> consumer = (i) -> { squares.add(i*i); };
    
    nums.forEach(consumer);
}
