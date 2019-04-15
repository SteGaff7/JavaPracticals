package practical4;

public class Q2Perfect {
	public static void main(String[] args) {
		int count = 0;
		int num = 2;
		while ( count != 4) {
			if (isPerfectNumber(num)) {
				System.out.printf("%d is a pefect number", num);
				System.out.println();
				num++;
			}
			else {
				num++;
			}
		}

	}

	public static boolean isPerfectNumber(int number) {
		
		int sum = 0;

		for ( int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		
		if ( sum == number ) {
			return true;
		}
		else {
			return false;
		}
	}
}
