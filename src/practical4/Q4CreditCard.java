package practical4;

import java.util.Scanner;

public class Q4CreditCard {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter credit card number:");
		String card = input.next();

		String newCard = "";
		for ( int i = 0; i < card.length(); i++) {
			if (Character.isDigit(card.charAt(i))) {
				newCard += card.charAt(i);
			}
		}

		String reverseCard = "";
		for ( int i = newCard.length() -1; i > -1; i--) {
			reverseCard += newCard.charAt(i);
		}
		
		if (isValidNumber(newCard, reverseCard)) {
			System.out.println("Card is valid");
		}
		else {
			System.out.println("Card is not valid");
		}
		input.close();
	}

	// Return true if the card number is valid
	public static boolean isValidNumber(String number, String reverseNumber) {
		if (hasValidLength(number) && hasValidPrefix(number) && satisfiesMod10Check(reverseNumber)) 
			return true;
		else
			return false;
	}

	// Return true if the card number has between 13 and 16 digits
	public static boolean hasValidLength(String number) {

		if ( number.length() >= 13 && number.length() <= 16) {
			return true;
		}
		else {
			return false;
		}
	}

	// Return true if the card number has a valid prefix
	public static boolean hasValidPrefix(String number) {
		if ( number.charAt(0) == '4' || number.charAt(0) == '5' || number.charAt(0) == '6' || (number.charAt(0) == '3' && number.charAt(1) == '7') ) {
			return true;
		}
		return false;
	}

	// Return true if the Mod 10 check is satisfied
	public static boolean satisfiesMod10Check(String number) {
		if ((sumOfDoubleEvenPlace(number)+sumOfOddPlace(number))%10 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	// Double every second digit from right to left and return sum
	public static int sumOfDoubleEvenPlace(String number) {
		int sum = 0;
		for ( int i = 1; i < number.length(); i+=2) {
			int num = (number.charAt(i)-48)*2;
			if (num > 9) {
				String newNum = Integer.toString(num);
				int x = newNum.charAt(0)-48;
				int y = newNum.charAt(1)-48;
				int z = x + y;
				sum += z;
			}
			else {
				sum += num;
			}
		}
		return sum;
	}

	// Return sum of digits in odd places from right to left
	public static int sumOfOddPlace(String number) {
		int sum = 0;
		for ( int i = 0; i < number.length(); i+=2 ) {
			sum += number.charAt(i)-48;
		}
		return sum;
	}		
}