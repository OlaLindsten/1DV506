package ol222es_lab1;

import java.util.Scanner;

public class Citat {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Skriv in en rad text: ");
		System.out.println("Citat: " +'"' + input.nextLine() + '"');
		
		input.close();
	}
}
