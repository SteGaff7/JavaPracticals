package practical3;

import java.util.Scanner;

public class Q2StringReverse {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter input");
		
		String word = input.next();
		
		String reverseWord = "";

		for (int i = word.length()-1; i >= 0; i--) {
			reverseWord += word.charAt(i);
		}
		
		System.out.printf("Input reversed is %s", reverseWord);
		
		input.close();
	}

}
