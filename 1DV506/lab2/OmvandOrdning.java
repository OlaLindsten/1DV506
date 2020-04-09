package ol222es_lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class OmvandOrdning {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>(); 
		int counter = 1;
		int temp = 0;
		
		System.out.println("Mata in positiva heltal. Avsluta med ett negativt. ");
		while(temp >= 0)
		{
			System.out.print("Tal" + counter + ": ");
			temp = input.nextInt();
			numbers.add(temp);
			counter++;
		}
		System.out.println("Antal positiva: " + (counter - 2));
		
		System.out.print("Baklänges: ");
		for (int i = numbers.size() - 2; 0 <= i; i--) {
			if (i == 0) {
				System.out.print(numbers.get(i));
			}else {
			System.out.print(numbers.get(i) + ", ");
			}
		}
		
		input.close();
	}

}
