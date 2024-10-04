package lab04.assignment_4_3.prob3.launch;

import java.util.ArrayList;
import java.util.List;

import lab04.assignment_4_3.prob3.*;

/** This class tests the code package */
public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee("Joe");
		Employee e2 = new Employee("Ralph");
		Employee e3 = new Employee("Tom");

		e1.addCheckingAccount("231-471", 25.00, 100);
		e1.addSavingsAccount("44-8123", 0.03, 200);
		
		e2.addCheckingAccount("446-973", 25.00, 200);
		e2.addSavingsAccount("21-9672", 0.03, 200);
		
		e3.addSavingsAccount("68-0902", 0.04, 600);

		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);

		System.out.println(Admin.computeUpdatedBalanceSum(employees));

	}

}