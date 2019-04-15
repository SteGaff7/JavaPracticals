package practical6;

public class CheckAccount {
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		Account.setAnnualInterestRate(4.5);
		System.out.println(account.getAccountDetails());
		account.withdraw(2500);
		System.out.println(account.getAccountDetails());
		account.deposit(3000);
		System.out.println(account.getAccountDetails());
		System.out.println(account.getMonthlyInterest());
	}

}
