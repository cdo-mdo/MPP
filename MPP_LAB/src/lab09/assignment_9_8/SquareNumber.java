package lab09.assignment_9_8;

import java.util.stream.Stream;

public class SquareNumber {
    
    static boolean isSquareOfInt(int num) {
        int n = (int)Math.sqrt(num);
        if ((n * n) == num) {
            return true;
        } 
        return false;
    }
    
    public static void printSquares(int num) {
//        Stream.iterate(1, n -> n = n + 1)
//            .map(n -> n*n)
//            .limit(num).forEach(System.out::println);
        
//        Stream.iterate(1, n -> n + 1)
//            .filter(n -> isSquareOfInt(n))
//            .limit(num)
//            .forEach(System.out::println);
                
        Stream.iterate(1, n -> {
            while (!isSquareOfInt(n)) {
                n = n + 1;
            }
            return n;
        }).limit(num).forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        printSquares(4);
    }
}
