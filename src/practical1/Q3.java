package practical1;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter x co-ordinate of point one: ");
		double x1 = input.nextDouble();
		
		System.out.println("Enter y co-ordinate of point one: ");
		double y1 = input.nextDouble();
		
		System.out.println("Enter x co-ordinate of point two: ");
		double x2 = input.nextDouble();
		
		System.out.println("Enter y co-ordinate of point two: ");
		double y2 = input.nextDouble();
		
		double distance = Math.sqrt((Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)));
		
		System.out.println("Distance is:");
		System.out.println(distance);
		
		input.close();
	}
	

}
