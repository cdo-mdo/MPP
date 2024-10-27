package test13;

public class MyNumber<T> implements Comparable<T> {

    @Override
    public int compareTo(T o) {
        return hashCode() - o.hashCode();
    }

}
