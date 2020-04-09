package ol222es_lab2;

import java.util.Scanner;

public class RaknaSiffror {

	public static void main(String[] args) {
		
		String number = " "; 
		int zeroCounter = 0, evenCounter = 0, unEvenCounter = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mata in ett heltal: ");
		number = input.nextLine();
			
		for (int i = 0; i < number.length(); i++) {
			
			char tempNumber = number.charAt(i);
			
			if(tempNumber == '0') {
				zeroCounter++;
			}else if(tempNumber % 2 == 0) {
				evenCounter++;
			}else if(!(tempNumber % 2 == 0)) {
				unEvenCounter++;
			}
		}
		
		System.out.println("Nollor: " + zeroCounter);
		System.out.println("Udda: " + unEvenCounter);
		System.out.println("Jämna: " + evenCounter);
		
		input.close();
	}

}
