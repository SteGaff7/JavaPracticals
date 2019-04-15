package practical6;
import java.util.Date;


public class Account {
	private int id; // Account ID
	private double balance; // Account balance
	private Date dateCreated; // Date account was created
	private static double annualInterestRate = 0; //Current interest rate
	
	// Default constructor method
	public Account() {
		this(0, 0);
	}
	
	// Constructor account with specified ID and account balance
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}
	
	// Get account details or toString method
	public String getAccountDetails() {
		return "ID: " + id + "\nBalance: " + balance + "\nDate Account Opened: " 
		+ dateCreated;
	}
	
	// Get ID
	public int getID() {
		return id;
	}
	
	// Get balance
	public double getBalance() {
		return balance;
	}
	
	// Get date created
	public String getDate() {
		return "Date Created: " + dateCreated;
	}
	
	// Set ID
	public void setID(int id) {
		this.id = id;
	}
	
	// Set balance privately. Call this using another method
	private void setBalance(double balance) {
		this.balance = balance;
	}
	
	// Set annual interest rate (Static)
	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}
	
	// Get monthly interest
	public double getMonthlyInterest() {
		return (balance * annualInterestRate)/12.0 ;
	}
	
	// Update balance and return money
	public String withdraw(double withdrawAmount) {
		setBalance(balance - withdrawAmount);
		return "You have withdrawn " + withdrawAmount +"e";
	}
	
	// Update balance and return amount deposited
	public String deposit(double depositAmount) {
		this.setBalance(balance + depositAmount);
		return "You have deposited " + depositAmount + "e";
	}
}
