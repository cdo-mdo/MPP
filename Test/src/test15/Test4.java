package test15;

import java.util.stream.IntStream;

public class Test4 {
    public static void main(String[] args) {
        IntStream ints = IntStream.of(1, 2, 3, 4);
        System.out.println(ints.average());
    }
}
