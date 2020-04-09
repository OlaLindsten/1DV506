package ol222es_lab2;

import java.util.Scanner;

public class Baklanges {

	public static void main(String[] args) {
		
		String text = "";

		Scanner input = new Scanner(System.in);
		StringBuilder newWord = new StringBuilder();
		
		System.out.print("Mata in en textrad: ");
		text = input.nextLine();

		for (int i = text.length() - 1; 0 <= i; i--) {
			newWord.append(text.charAt(i));
		}
				
		System.out.println("Baklänges: " + newWord);
		input.close();
	}

}
