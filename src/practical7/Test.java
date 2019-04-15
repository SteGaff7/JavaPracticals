package practical7;

public class Test {
	public static void main (String[] args) {
		SavingsAccount sAcc1 = new SavingsAccount();
		SavingsAccount sAcc2 = new SavingsAccount(1, 100);
		
		CheckingAccount cAcc1 = new CheckingAccount(2,1400, 1000);
		//sAcc1.withdraw(10);
		//sAcc2.withdraw(10);
		System.out.println(cAcc1.toString());
		//cAcc1.withdraw(10000);
		System.out.println(cAcc1.getBalance());
		System.out.println(cAcc1.getMonthlyInterest());
		
	}

}
