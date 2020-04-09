package ol222es_lab2;

import java.util.Scanner;

public class NastStorsta {

	public static void main(String[] args) {
				
		int biggestNumber = 0, secondBiggest = 0, currentNumber = 0, counter = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mata in 10 heltal: ");

		while(counter < 10) {
			currentNumber = input.nextInt();
			if (currentNumber > biggestNumber) {
				secondBiggest = biggestNumber;
				biggestNumber = currentNumber;
			}else if(currentNumber > secondBiggest) {
				secondBiggest = currentNumber;
			}
			counter++;
		}
		
		System.out.println("Det näst största talet är: " + secondBiggest);
		input.close();
	}

}
