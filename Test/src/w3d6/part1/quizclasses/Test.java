package w3d6.part1.quizclasses;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
//    static Function<Employee, String> getName = (Employee e) -> e.getName();
    
//    static Predicate<Employee> getJoe = (Employee e) -> {return e.getName().equals("Joe");};
    
    static Function<Employee, Employee> getJoe = (Employee e) -> {
        if (e.getName().equals("Joe")) {
            return e;
        }
        return null;
    };
    
//    @FunctionInterface
//    class FilterName implements BiFunction<Employee, String, Boolean> {
//        @Override
//        public Boolean apply(Employee e, String name) {
//            if (e.getName().equals(name)) {
//                return true;
//            }
//            return false;
//        }
//    }
    
    static class FilterName implements Predicate<Employee> {
        @Override
        public boolean test(Employee e) {
            if (e.getName().equals("Joe")) {
                return true;
            }
            return false;
        }
    }
    
    static class EmpToPair implements Function<Employee, Pair> {
        @Override
        public Pair apply(Employee e) {
            return new Pair(e.getName(), e.getSalary());
        }
    }
    
    static class FilterNameBi implements BiPredicate<Employee, String> {
        @Override
        public boolean test(Employee e, String name) {
            if (e.getName().equals(name)) {
                return true;
            }
            return false;
        }
    }


    
    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Joe", 100000, 1980, new Address("101 Main", "Fairfield", "IA", "52556"));
        
//        System.out.println(getName.apply(emp1));
        
//        EmployeeTestData.getList().stream()
//            .filter(e -> e.getName().equals("Joe"))
//            .forEach(System.out::println);
        
//        EmployeeTestData.getList().stream()
//            .filter(e -> e.getName().equals("Joe"))
//            .toList().forEach(System.out::println);
        
//        EmployeeTestData.getList().stream()
//            .filter(getJoe)
//            .forEach(System.out::println);
    
//        @FunctionInterface
//        class FilterName implements BiFunction<Employee, String, boolean> {
//            @Override
//            public boolean apply(Employee e, String name) {
//                if (e.getName().equals(name)) {
//                    return true;
//                }
//                return false;
//            }
//        }
        
//        EmployeeTestData.getList().stream()
//            .filter(new Predicate<>() {
//                @Override
//                public boolean test(Employee e) {
//                    return e.getName().equals("Joe");
//                }
//            })
//            .map(new EmpToPair())
//            .forEach(System.out::print);

      EmployeeTestData.getList().stream()
      .filter(new FilterName())
      .map(new EmpToPair())
      .forEach(System.out::print);

//      System.out.println("test filtername " + new FilterName().test(emp1));
        
        EmployeeTestData.getList().stream()
            .filter(new Predicate<Employee>() {
                @Override
                public boolean test(Employee e) {
                    return e.getName().equals("Joe");
                }
            })
            .map(new Function<Employee, Pair>() {
                @Override
                public Pair apply(Employee e) {
                    return new Pair(e.getName(), e.getSalary());
                }
            })
      .forEach(System.out::print);
    }
}
