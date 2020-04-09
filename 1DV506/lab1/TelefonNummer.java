package ol222es_lab1;

import java.util.Random;

public class TelefonNummer {

	public static void main(String[] args) {
		
		int n1 = 0, n2 = 0, n3 = 0, numbers = 0;
		Random random = new Random();
		
		n1 = random.nextInt(10);
		n2 = random.nextInt(10);
		n3 = random.nextInt(10);
					
		numbers = random.nextInt(9000) + 1000;
		
		System.out.println("Ditt slumpade telefonnummer är: " + 
		"0" + n1 + n2 + n3 + "-" + numbers);
	}

}
