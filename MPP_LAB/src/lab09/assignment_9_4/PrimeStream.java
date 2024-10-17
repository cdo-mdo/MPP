package lab09.assignment_9_4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeStream {
    
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= (int)Math.sqrt((double)n); ++i) {
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
    
    static void generatePrimes() {
        Stream<Integer> primes = Stream.iterate(1, n -> n + 1);
        primes.forEach(PrimeStream::printIfPrime);
    }
    
    static void printFirstNPrime(int count) {
        Stream.iterate(1, n -> n + 1)
            .filter(PrimeStream::isPrime).limit(count).forEach(System.out::println);
        
    }
    
    public static void main(String[] args) {
//        generatePrimes();
        
        printFirstNPrime(5);
        System.out.println("==========");
        printFirstNPrime(10);
    }
}
