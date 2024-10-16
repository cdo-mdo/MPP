package lab08.assignment_8_7;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Example {
    
    Function<String, String> toUpper1 = (String x) -> x.toUpperCase();
    Function<String, String> toUpper2 = String::toUpperCase;
    
    // A. (Employee e) -> e.getName()
    Function<Employee, String> getName1 = (Employee e) -> e.getName();
    Function<Employee, String> getName2 = Employee::getName;
    
    // B. (Employee e,String s) -> e.setName(s)
    BiConsumer<Employee, String> setName1 = (Employee e, String name) -> e.setName(name);
    BiConsumer<Employee, String> setName2 = Employee::setName;
    
    // C. (String s1,String s2) -> s1.compareTo(s2)
    BiFunction<String, String, Integer> compare1 = (String s1, String s2) -> s1.compareTo(s2);
    BiFunction<String, String, Integer> compare2 = String::compareTo;
    
    // D. (Integer x,Integer y) -> Math.pow(x,y)
    BiFunction<Integer, Integer, Double> pow1 = (Integer x, Integer y) -> Math.pow(x, y);
    BiFunction<Integer, Integer, Double> pow2 = Math::pow;
    
    // E. (Apple a) -> a.getWeight()
    Function<Apple, Integer> getWeight1 = (Apple a) -> a.getWeight();
    Function<Apple, Integer> getWeight2 = Apple::getWeight;
    
    // F. (String x) -> Integer.parseInt(x);
    Function<String, Integer> parse1 = (String s) -> Integer.parseInt(s);
    Function<String, Integer> parse2 = Integer::parseInt;
    
    // G. EmployeeNameComparator comp = new EmployeeNameComparator();
    // (Employee e1, Employee e2) -> comp.compare(e1,e2)
    BiFunction<Employee, Employee, Integer> comp1 = (Employee e1, Employee e2) -> new EmployeeNameComparator().compare(e1, e2);
//    BiFunction<Employee, Employee, Integer> comp2 = new employeeNameComparator::compare;
    
    
    void evaluator() {
        System.out.println(toUpper1.apply("hello1"));
        System.out.println(toUpper2.apply("hello2"));
        
        Employee employee = new Employee("Frank", 500000);
        System.out.println(getName1.apply(employee));
        System.out.println(getName2.apply(employee));
        
        setName1.accept(employee, "Gajen");
        setName2.accept(employee, "Gajen");
        
        System.out.println(compare1.apply("Frank", "Frank"));
        System.out.println(compare2.apply("Frank", "Gajen"));
        
        System.out.println(pow1.apply(2, 3));
        System.out.println(pow2.apply(2, 3));
        
        Apple apple = new Apple(5);
        System.out.println(getWeight1.apply(apple));
        System.out.println(getWeight2.apply(apple));
        
        System.out.println(parse1.apply("1"));
        System.out.println(parse2.apply("A"));
        
        Employee e1 = new Employee("Frank", 500000);
        Employee e2 = new Employee("Gajen", 1000000);
        
        System.out.println(comp1.apply(e1, e2));
        
        
        
    }
    
    public static void main(String[] args) {
        Example example = new Example();
        example.evaluator();
        
        
        
        
//        A. (Employee e) -> e.getName()
//        B. (Employee e,String s) -> e.setName(s)
//        C. (String s1,String s2) -> s1.compareTo(s2)
//        D. (Integer x,Integer y) -> Math.pow(x,y)
//        E. (Apple a) -> a.getWeight()
//        F. (String x) -> Integer.parseInt(x);
//        G. EmployeeNameComparator comp = new EmployeeNameComparator();
//        (Employee e1, Employee e2) -> comp.compare(e1,e2)

    }
}
