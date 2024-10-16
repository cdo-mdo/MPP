package lab08.assignment_8_4;

import java.util.function.BiFunction;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class Functional {
    public static void main(String[] args) {
        BiFunction<Double, Double, List> f = (x,y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add(x * y);
            return list;
        };
        
        List<Double> list = f.apply(2.0, 3.0);
        System.out.println(list.toString());
    }
}
