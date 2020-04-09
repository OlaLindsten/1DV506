package ol222es_lab1;

import java.util.Scanner;

public class Konvertera {

	public static void main(String[] args) {
		
		double fahrenheit = 0, celsius = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Var snäll och ange en tempratur i farenheit: ");
		fahrenheit = input.nextDouble();
		
		input.close();
		
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Tempraturen i Celsius är: " + Math.round(celsius * 10.0) / 10.0);
	}

}
