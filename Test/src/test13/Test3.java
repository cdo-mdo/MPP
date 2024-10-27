package test13;

import java.util.Arrays;
import java.util.List;

public class Test3<T> {
    List<? extends T> list;
//    List<? super T> list;
 
    T testGet() {
        return list.get(0);
    }
    
    void testPut(T item) {
        list.add(item);
    }
    
    
}
