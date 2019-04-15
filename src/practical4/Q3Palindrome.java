package practical4;

import java.util.Scanner;

public class Q3Palindrome {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter word to check (Case-Sensitive)");
		String str = input.next();
		
		
		if (isPalindrome(str)) {
			System.out.printf("%s is a Palindrome!", str); 
		}
		else {
			System.out.printf("%s is not a Palindrome!", str);
		}
		
		input.close();
	}
	
	public static boolean isPalindrome(String str) {
		String reverse = "";
		for ( int i = str.length() -1; i >=0; i-- ) {
			reverse += str.charAt(i) ;
		}
		boolean Palindrome = true;
		
		for ( int i = 0; i < (str.length()/2); i++ ) {
			/*System.out.print(str.charAt(i));
			System.out.print(reverse.charAt(i));*/
			if (str.charAt(i) != reverse.charAt(i)) {
				Palindrome = false;
			}
			
		}
	
		return Palindrome;
	}

}
