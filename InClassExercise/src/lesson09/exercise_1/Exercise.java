package lesson09.exercise_1;

import java.util.stream.Stream;

public class Exercise {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, n -> n + 2)
            .skip(4);
            limit(4)
            .filter()
            .forEach(Syste,.out::println());
    }
}
