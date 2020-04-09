package ol222es_lab1;

import java.util.Scanner;

public class VindAvkylning {

	public static void main(String[] args) {
		
		double tempratur = 0, vindhastighet = 0, celsius;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ange en tempratur (C): ");
		tempratur = input.nextDouble();
		
		System.out.print("Ange vindhastigheten (m/s): ");
		vindhastighet = input.nextDouble();
		
		input.close();
		
		vindhastighet = vindhastighet * 3.6;
		
		celsius = 13.12 + (0.6215 * tempratur) - (11.37  * Math.pow(vindhastighet, 0.16)) + (0.3965 * tempratur * Math.pow(vindhastighet, 0.16));
		
		System.out.println("Effektiv tempratur (C): " + Math.round(celsius) + " grader Celsius");
	}

}
