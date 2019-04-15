package practical5;

import java.util.Arrays;
import java.util.Scanner;

public class Q4HangmanIncomplete {
	public static void main(String[] args) {
		String [] words = {"hello", "world", "apple", "pie", "elephant"};
		int random = (int)(Math.random()*words.length);
		String word = words[random].toLowerCase();
		
		char[] wordArray = new char[word.length()];
		char[] displayArray = new char[word.length()];
		int charactersRemaining = displayArray.length;
		
		for (var i=0; i < wordArray.length; i++) {
			wordArray[i] = word.charAt(i);
			displayArray[i] = '*';
		}
		
		Scanner input = new Scanner(System.in);
		
		while (charactersRemaining > 0) {
			String remainingWord = Arrays.toString(displayArray);
			
			System.out.println("Guess a letter "+ remainingWord);
			char guess = input.next().charAt(0);
			
			boolean found = false;
			
			for (var i= 0; i < displayArray.length; i++) {
				if (guess == wordArray[i]) {
					displayArray[i] = guess;
					charactersRemaining--;
					found = true;
				}
			}
			
			if (found == false) {
				System.out.println(guess + " is not in the word.");
			}

		}
		
		System.out.println(word);
		System.out.println(wordArray);
		System.out.println(displayArray);
	}

}
