package lab08.assignment_8_6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
//	@SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
                "Everywhere you want to be");

        list.forEach(String::toUpperCase);
    }
}