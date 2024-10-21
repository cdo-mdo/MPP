package lesson11.exercise_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//public class CountStringOccurrences {
//	public static int countOccurrences(String[] arr, String target) {
//		int count = 0;
//		if (target == null) {
//			for (String item : arr) {
//				if (item == null) {
//					count++;
//				}
//			}
//		} else {
//			for (String item : arr) {
//				if (target.equals(item)) {
//					count++;
//				}
//			}
//		}
//		return count;
//	}
//}

public class CountStringOccurrences {
    public static <T> int countOccurrences(T[] arr, T target) {
        int count = 0;
        if (target == null) {
            for (T item : arr) {
                if (item == null) {
                    count++;
                }
            }
        } else {
            for (T item : arr) {
                if (target.equals(item)) {
                    count++;
                }
            }
        }
        
        Arrays.stream(arr).filter(e -> e == target).count();
        
        return count;
    }
    
    public static void main(String[] args) {
        List<Object> objs = Arrays.asList(2, 3.14, "four"); 
        List<Integer> ints = Arrays.asList(5, 6);
        //copy the narrow type (Integer) into the wider type (Object)
        Collections.copy(objs, ints);
        System.out.println(objs.toString()); 
    }
}
