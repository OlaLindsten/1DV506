package ol222es_lab4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RaknaTecken {

	public static int whitespace = 0, upperCase = 0, lowerCase = 0, numbers = 0, others = 0;		//Whitespaces maybe should start on -1 I'm not sure
																								//When it is zero it count the ending of each line as a whitespace
	public static void textInput() {

		try {
			File file = new File("C:\\Temp\\HistoryOfProgramming.txt");
			Scanner input = new Scanner(file);
			
			while (input.hasNext()) {
				String temp = input.nextLine(); 
				for (int i = 0; i < temp.length(); i++) {
					char c = temp.charAt(i);
					checkinput(c);
				}
				whitespace++;					//New line
			}
		input.close ();
		} catch (IOException e) {
			e.printStackTrace (); 
		}
	}
	
	private static void checkinput(char character) {
		
		if (Character.isUpperCase(character)) {
			upperCase++;
		}else if(Character.isLowerCase(character)){
			lowerCase++;
		}else if(Character.isDigit(character)) {
			numbers++;
		}else if(Character.isWhitespace(character)) {
			whitespace++;
		}else {
			others++;
		}
	}
	
	public static void main(String[] args) {
		
		textInput();
		
		System.out.println("Uppercase: " + upperCase);
		System.out.println("LoweCase: " + lowerCase);
		System.out.println("Numbers: " + numbers);					
		System.out.println("Whitespace: " + whitespace);
		System.out.println("Other: " + others);
	}

}
