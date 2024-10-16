package lab08.assignment_8_2;

public class Main {
    Random<Double> random = new Random<Double>();
    
    class Random<T> implements Supplier<Double> {
        @Override
        public double random() {
            return Math.random() * 100;
        }        
    }
    
    public static void main(String[] args) {
        Supplier<Double> supplier = () -> {
            return Math.random() * 100;
        };
        System.out.println(supplier.random());
        
        Main main = new Main();
        System.out.println(main.random.random());
    }
}
