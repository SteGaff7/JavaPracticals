package practical1;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer between 0 and 999 (Inclusive)");
		int myInt = input.nextInt();
		
		int first = myInt % 10;
		int second = (myInt / 10) % 10;
		int third = (myInt /100);
		
		int sum = first + second + third;
		System.out.println("Sum is");
		System.out.println(sum);
		
		input.close();
		
	}

}
