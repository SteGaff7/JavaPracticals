package practical1;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		double currentPop = 312032486;
		int days = 365;
		int hours = 24;
		int mins = 60;
		int secs = 60;
		int totalSecYear = days*hours*mins*secs;
		
		//System.out.println(totalSecYear);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many years would you like to calculate?");
		double years = input.nextDouble();
		
		double totalSec = years*totalSecYear;
		
		//System.out.println(totalSec);
		
		int birth = 7;
		int death = 13;
		int immigrant = 45;
		
		double newBirth = totalSec/birth;
		double newDeath = totalSec/death;
		double newImm = totalSec/immigrant;
		
		double newPop = currentPop + newBirth + newImm - newDeath;
		
		System.out.println("New pop:");
		System.out.println(newPop);
		
		input.close();
		
	}

}
