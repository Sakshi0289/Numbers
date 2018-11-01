package devops.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class NumberWordsApplication {
	private final NumberWords numberWords ;
	private final BufferedReader reader ;
	
	public NumberWordsApplication() {
		numberWords = new NumberWords() ;
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
	
	public void execute() {
		while( true ) {
			try {
				System.out.print( "Enter number (0 to exit): " ) ;
				String value = reader.readLine() ;
				int number = Integer.parseInt( value ) ;
				String word =numberWords.toWords(number);
				System.out.println("The conversion from number to word is: " +word);
				
			} catch ( NumberFormatException | IOException e ) {
				System.out.println( "The input entered is not a number or is a special character" ) ;
			}
		}
	}

	public static void main(String[] args) {
		new NumberWordsApplication().execute() ;
	}

}
