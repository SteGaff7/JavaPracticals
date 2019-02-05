package practical2;

import java.util.Scanner;

public class Q4Hex {
	public static void main(String[] args) {
		
		System.out.println("Enter decimal number to convert to Hex: ");
		Scanner input = new Scanner(System.in);
		
		int decimal = input.nextInt();
		
		String hex = Integer.toHexString(decimal);
		
		System.out.println("The hexadecimal of "+decimal+" is "+hex);
		
		input.close();
	}
}
