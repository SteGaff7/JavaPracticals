package practical5;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of numbers to be entered:");
		int n = input.nextInt();
		
		int[] myArray = createArray(n);
		
		if (isConsecutiveFour(myArray)) {
			System.out.println("Contains four consecutive integers.");
		}
		
		else {
			System.out.println("Does not contain four consecutive integers.");
		}

		input.close();
	}
	
	public static int[] createArray(int n) {
		Scanner input = new Scanner(System.in);
		
		int [] numberArray = new int[n];
		
		for ( int i = 0; i < numberArray.length; i++ ) {
			
			System.out.println("Enter number:");
			int d = input.nextInt();
			
			numberArray[i] = d;
		}
		return numberArray;
	}
	
	public static boolean isConsecutiveFour(int[] array) {
		if (array.length < 4) {
			return false;
		}
		
		else {
			for (int i = 0; i< array.length -3 ; i++ ) {
				int x = array[i];
				if ( x== array[i] && x== array[i+1] && x== array[i+2] && x== array[i+3]) {
					return true;
				}
			}
			
			return false;
		}
	}
}
