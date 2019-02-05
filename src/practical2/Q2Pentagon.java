package practical2;

import java.util.Scanner;

public class Q2Pentagon {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the length from vertex to centre of pentagon: ");
		//r is length
		double r = input.nextDouble();

		if (r>0) {

			//s is 2rSin(pi/5)
			double s = 2*r*(Math.sin(Math.PI/5.0));
			//System.out.println(s);

			//area is (5s**2)/4 tan(pi/5)
			double area = (5.0*Math.pow(s, 2))/(4*Math.tan(Math.PI/5.0));
			System.out.println("Area is " + area);
		}

		else {
			System.out.println("Error, length must be > 0!");
		}

		input.close();

	}

}
