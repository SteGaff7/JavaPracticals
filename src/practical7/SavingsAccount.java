package practical7;

import practical7.Account;

public class SavingsAccount extends Account {
	
	public SavingsAccount() {
		this(0,0);
	}
	
	public SavingsAccount(int id, int balance) {
		super(id, balance);
	}
	
	//Override the withdraw method for SavingsAccount defined in Account
	@Override
	public void withdraw(double amount) {
		if (amount > getBalance()) {
			System.out.printf("Your current balance is $%.2f. You have attempted to withdraw $%.2f.\n" + 
					"This transaction cannot be completed. Your balance is unchanged.\n", getBalance(), amount);
		}
		else {
			super.withdraw(amount);
			System.out.printf("You have withdrawn $%.2f\n", amount);
		}
	}
}
