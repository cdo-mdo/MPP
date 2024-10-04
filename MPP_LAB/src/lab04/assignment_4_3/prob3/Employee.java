package lab04.assignment_4_3.prob3;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts;
	
	public String getName() {
		return name;
	}
	
	public void addAccount(Account acct) {
		accounts.add(acct);
	}
	
	public Employee(String name) {
		this.name = name;
		accounts = new ArrayList<>();
	}
	
	public double computeUpdatedBalanceSum() {
		double sum = 0;
		for (Account account: accounts) {
			sum += account.computeUpdatedBalance();
		}
		return sum;
	}
}
