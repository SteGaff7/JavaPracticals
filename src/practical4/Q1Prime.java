package practical4;


public class Q1Prime {
	public static void main (String[] args) {

		System.out.println("1 is a prime number.");

		for ( int i = 2; i <= 20; i++ ) {
			if (isPrime(i)) {
				System.out.printf("%d is a prime number", i);
				System.out.println();
			}
		}
	}

	public static boolean isPrime(int number) {
		boolean prime = true;
		for ( int j = 2; j < number; j++) {
			if (number % j == 0) {
				prime = false;
			}
		}
		return prime;
	}
}
