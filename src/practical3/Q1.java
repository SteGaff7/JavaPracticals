package practical3;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String x = input.next();
		
		int vowelCount = 0;
		int conCount = 0;
		
		for ( int i = 0; i < x.length(); i++) {
			char y = x.charAt(i);
			
			if (!Character.isLetter(y)) {
				continue;
			}
			
			System.out.println(y);
			if (Character.isUpperCase(y)) {
				y = Character.toLowerCase(y);
			}
			
			System.out.println(y);
			
			if ( y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u') {
				vowelCount++;
			}
			else {
				conCount++;
			}
			
			/*System.out.println(x.charAt(i));*/
		}
		
		System.out.printf("Vowel count is %d and consonant count is %d", vowelCount, conCount);
		
		input.close();
	}

}
