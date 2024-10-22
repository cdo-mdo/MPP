package lab11.assignment_11_5;

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
    
    static Integer secondSmallestInt(List<Integer> ints) {
        Integer min = ints.get(0);
        for (Integer i: ints) {
            if (i.compareTo(min) < 0) {
                min = i;
            }
        }
        
        Integer secondMin = ints.get(0);
        for (Integer i: ints) {
            if (!i.equals(min)) {
               secondMin = i;
               break;
            }
        }
        
        for (Integer i: ints) {
            if (i.equals(min)) {
                continue;
            }
            if (i.compareTo(secondMin) < 0) {
                secondMin = i;
            }
        }
        return secondMin;
    }
    
    static <T extends Comparable<T>> T secondSmallest(List<T> types) {
        T min = types.get(0);
        for (T t: types) {
            if (t.compareTo(min) < 0) {
                min = t;
            }
        }
        
        T secondMin = types.get(0);
        for (T t: types) {
            if (!t.equals(min)) {
                secondMin = t;
                break;
            }
        }
        
        for (T t: types) {
            if (t.equals(min)) {
                continue;
            }
            if (t.compareTo(secondMin) < 0) {
                secondMin = t;
            }
        }
        
        return secondMin;
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
        
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 3, 5, 8 , 21, 34, 6);
        System.out.println(max(ints));
        System.out.println(secondSmallest(ints));
        
        List<MyNumber> myNums = new ArrayList<>();
        myNums.add(new MyNumber());
        myNums.add(new MyNumber());
        myNums.add(new MyNumber());
        
        System.out.println(maxT(myNums));
    }
}
