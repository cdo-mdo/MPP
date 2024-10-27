package test10.w3d6.part2.innerclass;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import test10.w3d6.part1.quizclasses.Employee;
import test10.w3d6.part1.quizclasses.Pair;
import test10.w3d6.part1.quizclasses.Trader;
import test10.w3d6.part1.quizclasses.EmployeeTestData;
import test10.w3d6.part1.quizclasses.TraderTransactTestData;
import test10.w3d6.part1.quizclasses.Transaction;

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
		
		class EmpToPair implements Function<Employee, Pair> {
		    @Override
		    public Pair apply(Employee e) {
		        return new Pair(e.getName(), e.getSalary());
		    }
		}
		
		class SalaryBetween implements Predicate<Pair> {
		    @Override
		    public boolean test(Pair p) {
		        return p.salary > 55000 && p.salary < 120000;
		    }
		}
		
		class NameCompare implements Function<Pair, String> {
		    @Override
		    public String apply(Pair p) {
		        return p.name;
		    }
		}
		
		class SalaryCompareReverse implements Function<Pair, Double> {
		    @Override
		    public Double apply(Pair p) {
		        return -p.salary;
		    }
		}
		
		class PrintInfo implements Consumer<Pair> {
		    @Override
		    public void accept(Pair p) {
		        System.out.println(p.toString());
		    }
		}
		
		list.stream()
		    .map(new EmpToPair())
		    .filter(new SalaryBetween())
		    .sorted(Comparator.comparing(new NameCompare()))
		    .sorted(Comparator.comparing(new SalaryCompareReverse()))
		    .forEach(new PrintInfo());
	}
	
	///Transform your pipeline solution to prob2 so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob2() {
		//use this list	
		List<Transaction> list = TraderTransactTestData.getTransactions();
		
		class YearAfter2011 implements Predicate<Transaction> {
		    @Override
		    public boolean test(Transaction t) {
		        return t.getYear() >= 2011;
		    }
		}
		
		class ValueCompare implements Function<Transaction, Integer> {
		    @Override
		    public Integer apply(Transaction t) {
		        return t.getValue();
		    }
		}
		
		class PrintTransactionInfo implements Consumer<Transaction> {
		    @Override
		    public void accept(Transaction t) {
		        System.out.println(t.toString());
		    }
		}
		
		list.stream()
		    .filter(new YearAfter2011())
		    .sorted(Comparator.comparing(new ValueCompare()))
		    .forEach(new PrintTransactionInfo());
	}
	
	//Transform your pipeline solution to prob3 so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob3() {
		//Use this list
		List<Transaction> list = TraderTransactTestData.getTransactions();  
		
	    class TransToTrader implements Function<Transaction, Trader> {
	        @Override
	        public Trader apply(Transaction t) {
	            return t.getTrader();
	        }
	    }
	    
	    class CityCambridge implements Predicate<Trader> {
	        @Override
	        public boolean test(Trader t) {
	            return t.getCity().equals("Cambridge");
	        }
	    }
	    
	    class PrintTraderInfo implements Consumer<Trader> {
	        @Override
	        public void accept(Trader t) {
	            System.out.println(t.toString());
	        }
	    }
	    
	    list.stream()
	        .map(new TransToTrader())
	        .filter(new CityCambridge())
	        .distinct()
	        .forEach(new PrintTraderInfo());
	    
	}
}