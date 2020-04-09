package ol222es_lab2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int heltal = 0;
		
		System.out.print("Mata in ett udda heltal: ");
		heltal = input.nextInt();
		
		if(!(heltal % 2 == 0)) {
			System.out.println("Rätvinklig triangel:");
			
			for (int i = 0; i < heltal; i++) {
				
				for (int j = heltal; i < j; j--) {
					System.out.print(" ");
				}
				
				for (int k = 1; k <= i + 1; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
			System.out.println("\nLikbent triangel:");
			
			for (int i = 0; i <= heltal; i+= 2) {

				for (int j = heltal; i <= j; j-= 2) {
					System.out.print(" ");
				}
				for (int k = 1; k < i + 2; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
		}else {
			System.out.println("Var snäll och mata in ett udda heltal tack!");
		}
		input.close();
	}

}
