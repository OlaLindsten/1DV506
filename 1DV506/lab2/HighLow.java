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
					System.out.print("   Rätt svar efter bara " + i + " gissningar - Strålande!");
				} else {
					System.out.print("   Rätt svar efter " + i + " gissningar - Bra jobbat!");
				}
				pass = true;
				break;
			} else if (guess < answer) {
				System.out.println("   Ledtråd: högre");
			} else if (guess > answer) {
				System.out.println("   Ledtråd: lägre");
			}
		}
		if (!pass == true) {
			System.out.println("Du klarade tyvärr inte det, bättre lycka nästa gång!");
		}
		
		input.close();
	}
}
