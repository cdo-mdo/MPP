package test13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    static Integer max(List<Integer> ints) {
        Integer max = ints.get(0);
        for (Integer i: ints) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }
        return max;
    }
    
    static <T extends Comparable<T>> T maxT(List<T> types) {
        T max = types.get(0);
        for (T t: types) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }
        
    public static <T extends Comparable<T>> T min(List<T> types) {
        T min = types.get(0);
        for (T t: types) {
            if (t.compareTo(min) < 0) {
                min = t;
            }
        }
        return min;
    }

    
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 3, 5, 8 , 21, 34, 6);
        System.out.println(max(ints));
        System.out.println(min(ints));
        
        List<MyNumber> myNums = new ArrayList<>();
        myNums.add(new MyNumber());
        myNums.add(new MyNumber());
        myNums.add(new MyNumber());
        
        System.out.println(maxT(myNums));
    }
}
