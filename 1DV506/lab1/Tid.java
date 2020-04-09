package ol222es_lab1;

import java.util.Scanner;

public class Tid {
	
	public static void main(String[] args) {
		
		int heltal = 0, timmar = 0, minuter = 0, sekunder = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ange antal sekunder: ");
		heltal = input.nextInt();
		
		timmar = heltal / 3600;	 
		minuter = (heltal - (3600 * timmar)) / 60;
		sekunder = heltal - (3600 * timmar) - (minuter * 60);
	
		input.close();
		
		System.out.println("Detta motsvarar: " + timmar + " timmar, " + minuter + " Minuter" + " och " + sekunder + " sekunder");		
	}
}
