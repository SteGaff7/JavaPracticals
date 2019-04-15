package practical1;

import java.util.Scanner;

public class FuelEfficiency {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter distance to drive (miles)");
		double dist = input.nextDouble();
		
		System.out.println("Enter fuel efficiency (miles per gallon)");
		double fuelEff = input.nextDouble();
		
		System.out.println("Enter price per gallon");
		double priceGallon = input.nextDouble();
		
		input.close();
		
		double price = dist/fuelEff * priceGallon;
		
		System.out.println("Price is");
		System.out.println(price);
	}

}
