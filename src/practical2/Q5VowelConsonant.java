package practical2;

import java.util.Scanner;

public class Q5VowelConsonant {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		char ch = input.next().charAt(0);
		
		//int x = (int)ch;
				
		//System.out.println(ch);
		//System.out.println(x);
		
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ) {
			if (ch == 'a' || ch == 'i' || ch== 'o' || ch == 'e' || ch == 'u' || ch == 'A' || ch == 'I' || ch== 'O' || ch == 'E' || ch == 'U') {
				System.out.println("Character " + ch + " is a vowel.");
			}
			
			else {
				System.out.println("Character is consonant.");
				}

		}
		
		else {
			System.out.println("Character is not a letter!");
		}
		
		input.close();
	}
}
