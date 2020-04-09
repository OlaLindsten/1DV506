package ol222es_lab1;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		double langd = 0, vikt = 0, bmi = 0;
		Scanner input = new Scanner(System.in);
				
		System.out.print("Ange din längd i meter: ");
		langd = input.nextDouble();
		
		System.out.print("Ange din vikt i kilogram: ");
		vikt = input.nextDouble();
		
		input.close();
		
		bmi = vikt / (langd * langd);
		
		System.out.println("Ditt BMI är: " + Math.round(bmi));
	}
}
