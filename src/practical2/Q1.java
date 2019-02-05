package practical2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the lengths of the sides of the triangle: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		if (a+b > c && a+c > b && c+b > a) {
			System.out.println("Perimeter of triangle is");
			System.out.println(a+b+c);
		}
		
		else {
			System.out.println("Error, not a triangle!");
		}
		input.close();
	}
}
