package practical3;

import java.util.Scanner;

public class Q3Cypher {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter string: ");
		String word = input.next();

		String newWord = "";

		for ( int i = 0; i < word.length(); i++ ) {
			char x = word.charAt(i);
			char y;
			
			if ( Character.isLowerCase(x)) {
				if (x == 'z') {
					y = 'a';
				}

				else {
					y = (char)(x + 1);
				}
				
				newWord += y;
			}

			else {
				newWord += x;
			}
		}

		System.out.println(newWord);



		input.close();
	}

}
