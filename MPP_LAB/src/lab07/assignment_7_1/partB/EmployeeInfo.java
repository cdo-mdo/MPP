package lab07.assignment_7_1.partB;

import java.util.ArrayList;
import java.util.List;

public class EmployeeInfo {

	/**
	 * Removes all duplicate Employee instances from input list (only a copy is
	 * modified) An Employee instance is considered to be a duplicate of another
	 * Employee instance if the two instances have the same name and salary.
	 */
	public static List<Employee> removeDuplicates(List<Employee> employees) {
		List<Employee> noDupsList = new ArrayList<>();
		noDupsList.add(employees.get(0));
		for (int i = 1; i < employees.size(); ++i) {
			if (!inList(employees.get(i), noDupsList)) {
				noDupsList.add(employees.get(i));
			}
		}
		return noDupsList;
	}

	/** Returns true if e is in the list emps, false otherwise */
	private static boolean inList(Employee e, List<Employee> emps) {
		for (Employee emp : emps) {
			if (e.equals(emp)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Tests to see if solution is correct What's wrong here?
	 */
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>() {
			{
				add(new Employee("Richard", 55000));
				add(new Employee("Richard", 55000));
				add(new Employee("John", 30000));
				add(new Employee("Steve", 30000));
				add(new Employee("Zeke", 50000));
				add(new Employee("Reggie", 50000));
				add(new Employee("Steve", 30000));
				add(new Employee("John", 70000));
				add(new Employee("Harold", 55000));
				add(new Employee("Richard", 55000));
				add(new Employee("Richard", 55000));
				add(new Employee("Richard", 60000));
				add(new Employee("Dennis", 80000));
				add(new Employee("Adam", 80000));
				add(new Employee("John", 70000));
				add(new Employee("Charles", 25000));
				add(new Employee("Bill", 60000));
				add(new Employee("Bob", 60000));
				add(new Employee("Bill", 70000));
				add(new Employee("Bob", 60000));
			}
		};

		// List with duplicates removed - correctly computed
		List<Employee> dupsRemoved = new ArrayList<Employee>() {
			{
				add(new Employee("Richard", 55000));
				add(new Employee("John", 30000));
				add(new Employee("Steve", 30000));
				add(new Employee("Zeke", 50000));
				add(new Employee("Reggie", 50000));
				add(new Employee("John", 70000));
				add(new Employee("Harold", 55000));
				add(new Employee("Richard", 60000));
				add(new Employee("Dennis", 80000));
				add(new Employee("Adam", 80000));
				add(new Employee("Charles", 25000));
				add(new Employee("Bill", 60000));
				add(new Employee("Bill", 70000));
				add(new Employee("Bob", 60000));
			}
		};

		List<Employee> answer = removeDuplicates(list);
		System.out.println("Is answer correct? " + listsAreEqual(answer, dupsRemoved));
		
//		Employee e1 = new Employee("Richard", 55000);
//		Employee e2 = new Employee("Richard", 55000);
		
//		System.out.println("e1.equals(e2) = " + e1.equals(e2));
//		System.out.println("e1 == e2 = " + (e1 == e2));
//		System.out.println("e1.hashCode() == e2.hashCode() = " + (e1.hashCode() == e2.hashCode()));
		
//		List<Employee> l1 = new ArrayList<>();
//		l1.add(e1);
//		List<Employee> l2 = new ArrayList<>();
//		l2.add(e2);
//		
//		System.out.println(l1.contains(e2));
		
//		String str1 = "Richard";
//		String str2 = "Richard";
//		
//		System.out.println("hasCode str1 = " + str1.hashCode());
//		System.out.println("hasCode str2 = " + str2.hashCode());
	}

	/**
	 * Returns true if the two lists have the same size and contain exactly the same
	 * elements (this is just set equality)
	 */
	public static boolean listsAreEqual(List<Employee> l1, List<Employee> l2) {
		if (l1.size() != l2.size()) {
			return false;
		}
//		for (Employee e1: l1) {
//			System.out.println("(" + e1.getName() + ", " + e1.getSalary() + ") " + e1.hashCode());
//		}
//		System.out.println("---------------------------------");
//		for (Employee e2: l2) {
//			System.out.println("(" + e2.getName() + ", " + e2.getSalary() + ") " + e2.hashCode());
//		}
//		
//		System.out.println("---------------------------------");
		for (Employee e : l1) {
			if (!l2.contains(e)) {
//				System.out.println("(" + e.getName() + ", " + e.getSalary() + ") " + e.hashCode());
				return false;
			}
		}
		return true;
	}

}
