package ol222es_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Avstand {

	public static void main(String[] args) {
		
		double x1 = 0, y1 = 0, x2 = 0, y2 = 0, avstand;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in ditt x-värdet för punkt 1");
		x1 = input.nextDouble();
		
		System.out.println("Skriv in ditt y-värdet för punkt 1");
		y1 = input.nextDouble();
		
		System.out.println("Skriv in ditt x-värdet för den punkt 2");
		x2 = input.nextDouble();
		
		System.out.println("Skriv in ditt y-värdet för punkt 1");
		y2 = input.nextDouble();
		
		input.close();
		
	    avstand = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
	    
	    DecimalFormat avrundat = new DecimalFormat("0.###");
	    String avrundatAvstand = avrundat.format(avstand);
	    
	    System.out.println("\nAvståndet mellan punkterna är: " + avrundatAvstand);
	}

}
