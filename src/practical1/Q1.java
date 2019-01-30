package practical1;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter cylinder radius: ");
		double radius = input.nextDouble();
		
		System.out.println("Enter cylinder length: ");
		double length = input.nextDouble();
		
		double area = Math.PI*Math.pow(radius, 2);
		double volume = area*length;
		
		System.out.println("Area of cylinder is: ");
		System.out.println(area);
		System.out.println("Volume of cylinder is: ");
		System.out.println(volume);
		
		input.close();
	}

}
