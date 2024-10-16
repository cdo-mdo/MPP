package lab08.assignment_8_2;

public class Random<T> implements Supplier<T> {

    @Override
    public double random() {
        return Math.random() * 100;
    }

}
