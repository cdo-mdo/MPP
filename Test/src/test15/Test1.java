package test15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = new ArrayList<>();
        
        nums.forEach(num -> squares.add(num * num));
        
        nums.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer num) {
                squares.add(num * num);
            }
        });
        
        nums.forEach(squares::add);
    }
}
