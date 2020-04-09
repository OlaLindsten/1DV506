package ol222es_lab1;

import java.util.Scanner;

public class Sekunder {
		
	public static void main(String[] args) {
		
		int timmar = 0, minuter = 0, sekunder = 0, totalt = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Timmar: ");
		timmar = input.nextInt();
		
		System.out.print("Minuter: ");
		minuter = input.nextInt();
		
		System.out.print("Sekunder: ");
		sekunder = input.nextInt();
		
		input.close();
		
		timmar = timmar * 3600;
		minuter = minuter * 60;
		
		totalt = timmar + minuter + sekunder;
		
		System.out.println("\nTotala antalet sekunder: " + totalt);		
	}
	
}
