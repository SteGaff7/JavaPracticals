package practical2;

import java.util.Scanner;


public class Q3Rectangle {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give X coordinate:");
		double x = input.nextDouble();
		
		System.out.println("Give y coordinate:");
		double y = input.nextDouble();
		
		if ((x == 5d || x == -5d) && (y == 2.5d || y == -2.5d)) {
			System.out.println("Point is on the edge of rectangle");
		}
		
		else if ((x < -5d || x > 5d) || ((y < -2.5 || y > 2.5d))) {
			System.out.println("Point is outside of the rectangle");
		}
		
		else {
			System.out.println("Inside rectangle");
		}
		
	input.close();
	}
}
