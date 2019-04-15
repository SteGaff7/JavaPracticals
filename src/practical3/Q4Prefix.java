package practical3;

import java.util.Scanner;

public class Q4Prefix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Flush");
		input.nextLine();
		System.out.println("First string");
		String s1 = input.nextLine();
		System.out.println("Flush");
		input.nextLine();
		System.out.println("Next string");
		String s2 = input.nextLine();
		
		String biggest = (s1.length() > s2.length()) ? s1 : s2;
		String smallest = (s1.length() > s2.length()) ? s2 : s1;
		String prefix = "";
		
		for ( int i =0; i < smallest.length(); i++ ) {
			if (smallest.charAt(i) == biggest.charAt(i)) {
				char y = smallest.charAt(i);
				prefix += y;
			}
			
			else {
				break;
			}
		}
		
		System.out.printf("Largest prefix is %s", prefix);
		
		
		
		
		
		
		
		input.close();
	}
}
