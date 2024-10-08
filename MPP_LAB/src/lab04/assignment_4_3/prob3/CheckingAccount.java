package lab04.assignment_4_3.prob3;

public class CheckingAccount extends Account {
	private String accId;
	private double balance;
	private double monthlyFee;
	
	@Override
	protected String getAccountID() {
		return accId;
	}

	@Override
	protected double getBalance() {
		return balance;
	}

	@Override
	protected double computeUpdatedBalance() {
		balance = balance - monthlyFee;
		return balance;
	}

	private CheckingAccount(String accId, double fee, double startBalance) {
		this.accId = accId;
		this.monthlyFee = fee;
		this.balance = startBalance;
	}
	
	CheckingAccount(Employee employee, String accId, double fee, double startBalance) {
		this(accId, fee, startBalance);
		this.employee = employee;
	}
}
