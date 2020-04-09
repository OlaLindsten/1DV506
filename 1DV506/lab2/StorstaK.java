package ol222es_lab2;

import java.util.Scanner;

public class StorstaK {

	public static void main(String[] args) {
		
		int number = 0, biggestNumber = 0, k = -2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mata in ett positivt number: ");
		number = input.nextInt();
		
		if(number > 0) {

			while(biggestNumber < number) {
				k = k + 2;
				biggestNumber = biggestNumber + k;
			}
			
			biggestNumber = biggestNumber - k;
			k = k - 2;
			System.out.println("Största tal K sådant att 0+2+4+6+...+K < " + number + " => K=" + k);
		
		}else {
			System.out.println("Endast positiva number tack");
		}
				
		input.close();
	}

}
