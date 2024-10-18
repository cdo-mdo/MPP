package lab09.assignment_9_12;

import java.util.Optional;

//Singleton with lazy initialization. Not threadsafe
public class MySingletonLazy {
    private static MySingletonLazy instance = null;

    private MySingletonLazy() {
    }

    public static MySingletonLazy getInstance() {
        Optional.ofNullable(instance).orElse(instance = new MySingletonLazy());
//        if (instance == null) {
//            instance = new MySingletonLazy();
//        }
        return instance;
    }
    
    public static void main(String[] args) {
        System.out.println(MySingletonLazy.getInstance().getClass().getName());
    }
}