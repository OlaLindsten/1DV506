package ol222es_lab1;

import java.util.Scanner;

public class SummaAvTre {
	
	public static void main(String[] args) {
		
		int heltal = 0, tal1 = 0, tal2 = 0, tal3 = 0, summa = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ange ett tresiffrigt heltal: ");
		heltal = input.nextInt();
		
		input.close();
		
		tal1 = heltal % 10;
		tal2 = (heltal / 10) % 10;
		tal3 = (heltal / 10) / 10;
		
		summa = tal1 + tal2 + tal3;
		
		System.out.println("Summan av sifforna i heltalet är: " + summa);	
	}
}
