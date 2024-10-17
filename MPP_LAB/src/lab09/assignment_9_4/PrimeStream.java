package lab09.assignment_9_4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeStream {
    
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < (int)Math.sqrt((double)n); ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    static void printIfPrime(int n) {
        if (isPrime(n)) {
            System.out.println(n);
        }
    }
    
    public static void main(String[] args) {
        isPrime(5);
        Stream<Integer> primes = Stream.iterate(1, n -> n + 1);
        primes.limit(100).forEach(PrimeStream::printIfPrime);
    }
}
