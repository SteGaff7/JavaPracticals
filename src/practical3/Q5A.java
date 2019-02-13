package practical3;

import java.util.Scanner;

public class Q5A {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of table: ");
		int n = input.nextInt();
		
		for ( int i = 1; i <= n; i++ ) {
			for ( int j = 1; j <= i; j++ ) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	input.close();
	}
}
