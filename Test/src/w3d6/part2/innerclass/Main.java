package w3d6.part2.innerclass;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import w3d6.part1.quizclasses.Employee;
import w3d6.part1.quizclasses.EmployeeTestData;
import w3d6.part1.quizclasses.Pair;
import w3d6.part1.quizclasses.TraderTransactTestData;
import w3d6.part1.quizclasses.Transaction;

/** SOLVE THE PROBLEMS HERE BY REPLACING LAMBDA EXPRESSIONS IN YOUR PIPELINE SOLUTIONS 
 *  WITH LOCAL INNER CLASSES
 *
 */
public class Main {
	public static void main(String[] args) {
		
		// You need to use local inner classes to replace lambdas in your pipeline solution. 
		// Below is an example of what your code should look like.
		// This example has already been updated the to use local inner classes.

		// The example solves the problem:
		// Print all Employee records for which name has length > 5 and birth year is > 1970
		
		class NameLength implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getName().length() > 5;
			}
		}
		class BirthYear implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getYearOfBirth() > 1970;
			}
		}
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();
		
		List<Employee> result = sampleData.stream()
							        .filter(new NameLength())
							        .filter(new BirthYear())
							        .collect(Collectors.toList());
		System.out.println(result);
				
		prob1();
		prob2();
		prob3();
	}
	
	//Transform your pipeline solution to prob1 in the pipeline package so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob1() {
		//use this list 
		List<Employee> list = EmployeeTestData.getList();
		
		Function<Employee, Employee> salaryCompare = (Employee emp) -> {
		    if (emp.getSalary() > 55000 && emp.getSalary() < 120000) {
		        return emp;
		    }
		    return null;
		};
		
		Function<List<Employee>, List<Employee>> sort = (List<Employee> l) -> {
		    return l.stream()
		    .sorted(Comparator.comparing((Employee emp) -> emp.getName())
	                .thenComparing(Comparator.comparing((Employee emp) -> emp.getSalary()).reversed()))
		    .collect(Collectors.toList());
		};
		
		Function<Employee, Pair> makePair = (emp) -> {
		    return new Pair(emp.getName(), emp.getSalary());    
		};
		
		list.stream()
        .sorted(sort)
        .map(makePair)
        .forEach(pair -> System.out.println(pair.toString()));
		
	}
	
	///Transform your pipeline solution to prob2 so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob2() {
		//use this list	
		List<Transaction> list = TraderTransactTestData.getTransactions();
		
	}
	
	//Transform your pipeline solution to prob3 so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob3() {
		//Use this list
		List<Transaction> list = TraderTransactTestData.getTransactions();  
		
	                
	}
}
