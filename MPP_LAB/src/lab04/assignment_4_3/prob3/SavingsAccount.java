package lab04.assignment_4_3.prob3;

public class SavingsAccount extends Account {
	private String accId;
	private double balance;
	private double interestRate;

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
		balance = balance + interestRate*balance;
		return balance;
	}
	
	public SavingsAccount(String accId, double interestRate, double startBalance) {
		this.accId = accId;
		this.interestRate = interestRate;
		this.balance = startBalance;	
	}
	
	public SavingsAccount(Employee employee, String accId, double interestRate, double startBalance) {
		this.employee = employee;
		this.accId = accId;
		this.interestRate = interestRate;
		this.balance = startBalance;	
	}

}
