package ol222es_lab2;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		String palidrome = "";
		Scanner input = new Scanner(System.in);
		StringBuilder original = new StringBuilder();
		StringBuilder reversed = new StringBuilder();
		
		System.out.println("Mata in en textrad för att se om det är ett palidrom");
		palidrome = input.nextLine();
		palidrome = palidrome.toLowerCase();
		
		int length = palidrome.length();
		
		for (int i = 0; i < length; i++) {
			if(Character.isLetter(palidrome.charAt(i)) == true) {
				original.append(palidrome.charAt(i));
			}
		}
		
		for (int i = length - 1; 0 <= i; i--) {
			if (Character.isLetter(palidrome.charAt(i)) == true) {
				reversed.append(palidrome.charAt(i));
			}
		}
		
		if (original.toString().equals(reversed.toString())) {
			System.out.println("Det inmatade ordet är ett palidrom.");
		} else {
			System.out.println("Det inmatade ordet är inte ett palidrom.");
		}
		input.close();
	}

}
