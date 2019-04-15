package practical5;

import java.util.Scanner;

public class Q1MeanSD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of numbers to be entered:");
		int n = input.nextInt();
		
		double[] myArray = createArray(n);
		
		double x = mean(myArray);
		
		System.out.printf("Mean is %f", x);
		
		double y = deviation(myArray, x);
		
		System.out.printf("Deviation is %.20f", y);
		
	}
	
	public static double[] createArray(int n) {
		Scanner input = new Scanner(System.in);
		
		double [] numberArray = new double[n];
		
		for ( int i = 0; i < numberArray.length; i++ ) {
			
			System.out.println("Enter number:");
			double d = input.nextDouble();
			
			numberArray[i] = d;
		}
		return numberArray;
	}
	
	public static double mean(double[] array) {
		double sum = 0;
		for ( int i =0; i < array.length; i++ ) {
			sum += array[i];
		}
		double mean = sum/(array.length);
		
		return mean; 
	}
	
	public static double deviation(double[] array, double mean) {
		double deviation = 0;
		double sum = 0;
		for ( int i =0; i < array.length; i++ ) {
			sum += Math.pow(array[i] - mean, 2);
		}
		deviation = Math.sqrt((sum/(array.length-1)));
		
		return deviation;
	}

}
