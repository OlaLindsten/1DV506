package ol222es_lab2;

import java.util.Scanner;

public class RaknaA {

	public static void main(String[] args) {
		
		int upperCase = 0, lowerCase = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mata in en textrad: ");
		String word = input.nextLine();	
				
		
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'a') {
				lowerCase++;
			}
			else if(word.charAt(i) == 'A') {
				upperCase++;
			}
		}
		
		System.out.println("Antal a: " + lowerCase);
		System.out.println("Antal A: " + upperCase);
		
		input.close();
	}

}
