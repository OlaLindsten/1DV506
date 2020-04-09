package ol222es_lab1;

import java.util.Scanner;

public class VaxelPengar {
	
	public static void main(String[] args) {
		
		double totalt = 0, givna = 0, tillbaka = 0, tusen = 0, femHundra = 0, hundra = 0, femtio = 0, tjugo = 0, tio = 0, fem = 0; 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ange kostnaden: ");
		totalt = input.nextDouble();
		
		System.out.print("Ange erhållet belopp: ");
		givna = input.nextDouble();
		
		input.close();
		
		tillbaka = givna - totalt;
		System.out.println("Tillbaka: " + Math.round(tillbaka) + " kronor");
		
		tusen = tillbaka;						
		tillbaka = tillbaka % 1000;				
		tusen = (tusen - tillbaka)/1000;
		System.out.println("1000-lappar: " + Math.round(tusen));
		
		femHundra = tillbaka;						
		tillbaka = tillbaka % 500;				
		femHundra = (femHundra - tillbaka)/500;
		System.out.println(" 500-lappar: " + Math.round(femHundra));
		
		hundra = tillbaka;
		tillbaka = tillbaka % 100;
		hundra = (hundra - tillbaka)/100;
		System.out.println(" 100-lappar: " + Math.round(hundra));
		
		femtio = tillbaka;
		tillbaka = tillbaka % 50;
		femtio = (femtio - tillbaka)/50;
		System.out.println("  50-lappar: " + Math.round(femtio));
		
		tjugo = tillbaka;
		tillbaka = tillbaka % 20;
		tjugo = (tjugo - tillbaka)/20;
		System.out.println("  20-lappar: " + Math.round(tjugo));
		
		tio = tillbaka;
		tillbaka = tillbaka % 10;
		tio = (tio - tillbaka)/10;
		System.out.println("  10-kronor: " + Math.round(tio));
		
		fem = tillbaka;
		tillbaka = tillbaka % 5;
		fem = (fem - tillbaka)/5;
		System.out.println("   5-kronor: " + Math.round(fem));

		System.out.println("   1-kronor: " + Math.round(tillbaka));
		
	}
}
