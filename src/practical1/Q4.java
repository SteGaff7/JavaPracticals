package practical1;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a temperature between -58 and 41 farenheit.");
		double temp = input.nextDouble();
		
		System.out.println("Enter a wind speed in mph (Min speed = 2mph)");
		double windSpeed = input.nextDouble();
		
		double windChill = 35.74 + 0.6215*temp - (35.75*Math.pow(windSpeed, 0.16)) + 0.4275*temp*Math.pow(windSpeed, 0.16);
	
		System.out.println("Wind chill is:");
		System.out.println(windChill);
		
		input.close();
	}
	

}
