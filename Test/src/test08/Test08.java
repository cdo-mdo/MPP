package test08;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Test08 {
    public static void main(String[] args) {
        System.out.println(Stream.generate(() -> Math.random())
            .limit(100)
            .map(number -> (int)(number * 100))
            .filter(number -> number % 3 != 0)
            .count());
        
        System.out.println(BigIntStream.rangeClosed(256, 1024)
        .filter(n -> n % 2 == 0)
        .map(n -> n / 2)
        .reduce(1, (a, b) -> (a * b)));
        
        LongStream.rangeClosed(256, 1024)
        .filter(n -> n % 2 == 0)
        .map(n -> n / 2)
        .forEach(System.out::println);
            
    }
}
