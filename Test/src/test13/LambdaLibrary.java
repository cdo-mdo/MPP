package test13;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class LambdaLibrary {
    public static final Function<Integer, List<Long>> RANDOM_NUMBER_0_100 = 
        (amount) -> LongStream.range(0, 100).limit(amount).boxed().collect(Collectors.toList());
        
    public static final TriFunction<Integer, Double, Double, Double> AVERAGE_DOUBLE =
            (amount, lower, upper) ->
            (Stream.generate(Math::random)
                .map(d -> d * lower + (upper - lower))
                .limit(amount)
                .mapToDouble(Double::doubleValue))
                .average()
                .orElse(0.0);
    
    public static final TriFunction<Integer, Double, Double, Double> AVERAGE_DOUBLE_1 =
            (amount, lower, upper) ->
            DoubleStream.generate(Math::random)
                    .map(d -> d * lower + (upper - lower))
                    .limit(amount)
                    .average()
                    .orElse(0.0);
                    
            
            
//    public static final BiFunction<List<Order>, String, String> STRING_NAMES =
//            (orders, domain) ->
//            orders.stream()
//                .map(o -> o.getCustomer())
//                .filter(c -> c.getEmail().endWiths(domain))
//                .map(c -> c.getName())
//                .sorted().reversed()
//                .map(name -> name.charAt(0))
//                .collect(Collectors.joining(" "));
                
}

