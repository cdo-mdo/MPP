package w3d6.part3;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import w3d6.part1.quizclasses.Employee;
import w3d6.part1.quizclasses.Pair;
import w3d6.part1.quizclasses.Transaction;


public class LambdaLibrary {
	public final static String IMPLEMENT = "implement!";
	
	//sample query
	public final static TriFunction<List<Employee>, Integer, Integer, List<Employee>> SAMPLE
	   = (list, namelength, year) -> list.stream()
	                                     .filter(e -> e.getName().length() > namelength)
	                                     .filter(e -> e.getYearOfBirth() > year)
	                                     .collect(Collectors.toList());
	   
	
    public final static Function<List<Employee>, List<Pair>> SALARY_COMPARE = 
            (list) -> list.stream()
            .filter(emp -> emp.getSalary() > 55000 && emp.getSalary() < 120000)
            .sorted(Comparator.comparing((Employee emp) -> emp.getName())
                    .thenComparing(Comparator.comparing((Employee emp) -> emp.getSalary()).reversed()))
            .map(emp -> new Pair(emp.getName(), emp.getSalary()))
            .collect(Collectors.toList());
            
    public final static Function<List<Transaction>, List<Transaction>> GET_BY_YEAR =
            (l) -> l.stream()
            .filter(trans -> trans.getYear() == 2011)
            .sorted(Comparator.comparing((Transaction trans) -> trans.getValue()))
            .collect.(Collectors.toList());
    }
}
