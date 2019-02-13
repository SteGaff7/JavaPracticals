package practical3;

import java.util.Scanner;

public class Q5C {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter size of table: ");
		int n = input.nextInt();

		for ( int i = 1; i <= n; i++ ) {
		
			if ( i < 10) {
				System.out.print(" ".repeat(n-9));
				System.out.print("  ".repeat(n-i));
			}
			else {
				System.out.print(" ".repeat(n-i));
				System.out.print("  ".repeat(n-i));
			}
			
			for ( int j = i; j > 0; j-- ) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		input.close();
	}
}
