package practical7;

import practical7.Account;

public class CheckingAccount extends Account {
	private double overdraftLimit;
	
	
	public CheckingAccount() {
		this(0,0,1000);
	}
	
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public String toString() {
		return super.toString() + " overdraft Limit is= " + overdraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if (amount > (getOverdraftLimit() + getBalance())) {
			System.out.printf("Your current balance is $%.2f. Your overdraft limit is $%.2f.\n" + 
					"You have attempted to withdraw $%.2f.\n" + 
					"This transaction cannot be completed. Your balance is unchanged\n", getBalance(), getOverdraftLimit(), amount);
		}
		else {
			super.withdraw(amount);
			System.out.printf("You have withdrawn $%.2f\n", amount);
		}
	}
	
	@Override
	public double getMonthlyInterest() {
		if (getBalance() <= 0) {
			return 0.0;
		}
		
		else {
			return super.getMonthlyInterest();
		}
	}
}
