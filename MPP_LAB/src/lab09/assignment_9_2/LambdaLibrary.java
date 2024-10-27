package lab09.assignment_9_2;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final BiFunction<List<Customer>, String, List<Order>> ORDERS = 
            (list, email) ->
        list.stream()
            .filter(c -> c.getEmail().equals(email))
            .flatMap(c -> c.getOrder().stream())
            .collect(Collectors.toList());
                    

    public static final BiFunction<List<Customer>, String, OrderItem> NAME_OF_ORDER =
            (list, name) ->
        list.stream()
            .filter(c -> c.getName().equals(name))
            .flatMap(c -> c.getOrder().stream())
            .flatMap(o -> o.getOrderItems().stream())
            .sorted(Comparator.comparing((OrderItem i) -> i.getUnitPrice()))
            .findFirst().get();
            
            
//            .findFirst().get()
//            .map(i -> i.getProductId());
        
        
        
//            .map((OrderItem i) -> i.getPructId());
            
            
//            .findFirst().get();
        
//            .flatMap(c -> c.getOrder().stream())
//            .flatMap(o -> o.getOrderItems().stream())
//            .sorted(Comparator.comparing((OrderItem i) -> i.getUnitPrice()))
//            .findFirst()
//            .map(i -> i.getPructId());
}
