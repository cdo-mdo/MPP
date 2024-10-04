package lab04.assignment_4_3.prob3;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double sum = 0;
		for (Employee employee: list) {
			sum += employee.computeUpdatedBalanceSum();
		}
		return sum;
	}
}
