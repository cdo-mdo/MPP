package w3d6.part3;
import java.util.List;

import w3d6.part1.quizclasses.Employee;
import w3d6.part1.quizclasses.EmployeeTestData;
import w3d6.part1.quizclasses.TraderTransactTestData;
import w3d6.part1.quizclasses.Transaction;

/** SOLVE THE PROBLEMS HERE USING A LAMBDA LIBRARY */
public class Main {
	public static void main(String[] args) {
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();

		// This example has already been updated to use a Lambda Library
		// You need to update your code in a similar manner 

		// The example solves: Create a Lambda Library entry that prints
		// all Employee records for which name has length > 5 and birth year is > 1970
		System.out.println(LambdaLibrary.SAMPLE.apply(sampleData, 5, 1970));
		
		prob1();
		prob2();
		prob3();
	}
	
		//Create a Lambda Library entry that does the following:
	    //Create a stream pipeline that obtains a list of
		//all name/salary pairs extracted from a list of Employees
		//for which salary > 55000 and less than 120000, in ascending
		//order of name, then descending order of salary
		//Then call your Lambda Library entry to print the list to the console
		public static void prob1() {
			//use this list 
			List<Employee> list = EmployeeTestData.getList();
			System.out.println(LambdaLibrary.IMPLEMENT);
			
		}
		//Create a Lambda Library entry that does the following:
		//Obtain a list of all transactions from year 2011 and 
		//sort them by value (small to high).
		//(Note: there is an instance variable "value" in Transaction)
		//Then call your Lambda Library entry to print the list to console
		public static void prob2() {
			//use this list	
			List<Transaction> list = TraderTransactTestData.getTransactions();
			System.out.println(LambdaLibrary.IMPLEMENT);
		}
		// Create a Lambda Library entry that does the following:
		// Obtain a list of all traders from Cambridge, 
		// sort them by name. Then call your Lambda Library entry
		// to print to console
		public static void prob3() {
			//Use this list
			List<Transaction> list = TraderTransactTestData.getTransactions();  
			System.out.println(LambdaLibrary.IMPLEMENT);
		                
		}
	
}
