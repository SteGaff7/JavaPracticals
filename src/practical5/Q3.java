package practical5;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter number of points.");
		int numRows = input.nextInt();

		double[][] myArray = createPointsArray(numRows);

		display(myArray);
		input.close();
		
		double d = distance(myArray[0], myArray[1]);
		System.out.println(d);
		
		double [][] y = createDistanceMatrix(myArray);
		
		display(y);
	}

	public static double [][] createPointsArray(int numRows) {

		Scanner input = new Scanner(System.in);

		double [][] array = new double[numRows][2];

		for ( int i =0; i < array.length; i++ ) {
			System.out.printf("Enter point %d x co-ords", i+1);
			double x = input.nextDouble();

			System.out.printf("Enter point %d y co-ords", i+1);
			double y = input.nextDouble();

			array[i][0] = x;
			array[i][1] = y;		
		}

		return array;

	}

	public static void display(double[][] array) {
		for ( int row = 0; row < array.length; row++ ) {
			System.out.printf("point %d: (%f,%f)", row+1, array[row][0], array[row][1]);
			System.out.println();
		}
	}
	
	public static double distance(double [] i, double[] j ) {
		double distance;
		distance = Math.sqrt((Math.pow(j[0]-i[0],2)+Math.pow(j[1]-i[1], 2)));
				
		return distance;
	}
	
	public static double [][] createDistanceMatrix(double [][] array) {
		double [][]distanceArray = new double[array.length][array.length];
		for ( int i = 0; i < distanceArray.length; i++ ) {
			for ( int j = 0; j < distanceArray.length; j++) {
				distanceArray[i][j] = distance(array[i], array[j]);
			}
		}
		return distanceArray;
	}
}


