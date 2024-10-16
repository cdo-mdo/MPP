package lab08.assignment_8_7;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
	    if (e1.name.compareTo(e2.name) == 0) {
	        new EmployeeSalaryComparator().compare(e1, e2);
	    }
		return e1.name.compareTo(e2.name);
	}
}
