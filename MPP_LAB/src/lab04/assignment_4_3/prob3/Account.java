package lab04.assignment_4_3.prob3;

public abstract class Account {
	protected Employee employee;
	
	protected abstract String getAccountID();
	
	protected abstract double getBalance();
	
	protected abstract double computeUpdatedBalance();

}
