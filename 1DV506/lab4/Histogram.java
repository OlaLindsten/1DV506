package ol222es_lab4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Histogram {
	
	public static String count1 = "", count2 = "", count3 = "", count4 = "", count5 = "", count6 = "", count7 = "", count8 = "", count9 = "", count10 = "";
	public static int other, amount;
	
	public static void textInput() {

		try {
			File file = new File("C:\\Temp\\heltal.txt");
			System.out.print("Läser in ett heltal från filen: " + file);
			Scanner input = new Scanner(file);
			
			while (input.hasNext()) {
				String temp = input.next(); 
				checkInput(temp);
			}
		input.close ();
		} catch (IOException e) {
			e.printStackTrace (); 
		}
	}

	private static void checkInput(String number) {
		int numb = Integer.parseInt(number);
		
		if (numb >= 1 && numb <= 100) {
			amount++;
			
			if (numb >= 1 && numb <= 10) {
				count1 += "*"; 
			}else if(numb >= 11 && numb <= 20) {
				count2 += "*";
			}else if(numb >= 21 && numb <= 30) {
				count3 += "*";			
			}else if(numb >= 31 && numb <= 40) {
				count4 += "*";
			}else if(numb >= 41 && numb <= 50) {
				count5 += "*";
			}else if(numb >= 51 && numb <= 60) {
				count6 += "*";
			}else if(numb >= 61 && numb <= 70) {
				count7 += "*";
			}else if(numb >= 71 && numb <= 80) {
				count8 += "*";
			}else if(numb >= 81 && numb <= 90) {
				count9 += "*";
			}else if(numb >= 91 && numb <= 100) {
				count10 += "*";
			}
		}else {
			other++;
		}
		
	}
	
	public static void main(String[] args) {
		
		textInput();
		System.out.println("\nAntal i intervallet [1,100]: " + amount);
		System.out.println("Övriga: " + other);
		System.out.println("Histogram");
		
		System.out.println("  1  - 10  | " + count1);
		System.out.println("  11 - 20  | " + count2);
		System.out.println("  21 - 30  | " + count3);
		System.out.println("  31 - 40  | " + count4);
		System.out.println("  41 - 50  | " + count5);
		System.out.println("  51 - 60  | " + count6);
		System.out.println("  61 - 70  | " + count7);
		System.out.println("  71 - 80  | " + count8);
		System.out.println("  81 - 90  | " + count9);
		System.out.println("  91 - 100 | " + count10);
	}

}
