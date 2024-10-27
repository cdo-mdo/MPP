package test15;

import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 1)
            .filter(i -> i % 2 != 0)
            .limit(8)
            .skip(4)
            .forEach(System.out::println);
        
        Stream.iterate(1, n)
            .forEach(System.out::println);
    }
}
