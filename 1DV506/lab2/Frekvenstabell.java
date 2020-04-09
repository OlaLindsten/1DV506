package ol222es_lab2;

import java.util.Random;

public class Frekvenstabell {

	public static void main(String[] args) {
		
		int[] numbers = {0, 0, 0, 0, 0, 0};
		Random random = new Random();
		
		System.out.println("Frequencies when rolling a dice 6000 times.");
		
		for (int i = 0; i < 6000; i++) {
			
			int temp = random.nextInt(6) + 1;
			
			switch (temp) {
			case 1:	
				numbers[0] = numbers[0] + 1;
				break;
			case 2:
				numbers[1] = numbers[1] + 1;
				break;
			case 3:
				numbers[2] = numbers[2] + 1;
				break;
			case 4: 
				numbers[3] = numbers[3] + 1;
				break;
			case 5:
				numbers[4] = numbers[4] + 1;
				break;
			case 6:
				numbers[5] = numbers[5] + 1;
				break;
			default:
				System.out.println("N/A");
				break;
			}

		}
		System.out.println("1: " + numbers[0]);
		System.out.println("2: " + numbers[1]);
		System.out.println("3: " + numbers[2]);
		System.out.println("4: " + numbers[3]);
		System.out.println("5: " + numbers[4]);
		System.out.println("6: " + numbers[5]);
		
	}

}
