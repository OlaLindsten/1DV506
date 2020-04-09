package ol222es_lab2;

import java.util.Random;
import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		int guess = 0;
		boolean pass = false;
	
		int answer = random.nextInt(100) + 1;
		
		for (int i = 1; i <= 10; i++) {

			System.out.print("Gissning " + i + ": ");
			guess = input.nextInt();

			if (guess == answer) {
				if (i < 5) {
					System.out.print("   R�tt svar efter bara " + i + " gissningar - Str�lande!");
				} else {
					System.out.print("   R�tt svar efter " + i + " gissningar - Bra jobbat!");
				}
				pass = true;
				break;
			} else if (guess < answer) {
				System.out.println("   Ledtr�d: h�gre");
			} else if (guess > answer) {
				System.out.println("   Ledtr�d: l�gre");
			}
		}
		if (!pass == true) {
			System.out.println("Du klarade tyv�rr inte det, b�ttre lycka n�sta g�ng!");
		}
		
		input.close();
	}
}
