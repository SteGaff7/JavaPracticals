package practical2;

import java.util.Scanner;

public class Q6Switch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//Enter year
		System.out.println("Enter year: ");
		int year = input.nextInt();

		//Enter month
		System.out.println("Enter a month (e.g. Jan, Feb, etc.): ");
		String month = input.next();
		char c1 = month.charAt(0);
		char c2 = month.charAt(1);
		char c3 = month.charAt(2);

		if ( c1 < 'A' || c1 > 'Z' || c2 < 'a' || c2 > 'z' || c3 < 'a' || c3 > 'z') {
			System.out.println("Correct format not followed (Jan, Feb, Mar etc..)");

		}

		else {
			if ((year % 400 == 0) || (year % 4 == 0 && !(year % 100 == 0)) && month == "Feb") {
				System.out.println("29 days in month " + month);
			}
			
			else {
				switch (month) {
				case "Jan":
				case "Mar":
				case "May":
				case "Jul":
				case "Aug":
				case "Oct":
				case "Dec": System.out.println("31 days in month " + month); break;
				case "Apr":
				case "Jun":
				case "Sep":
				case "Nov": System.out.println("30 days in month " + month); break;
				case "Feb": System.out.println("28 days in month " + month); break;
				}


			}
		}
	input.close();
	}
}
