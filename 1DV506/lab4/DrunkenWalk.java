package ol222es_lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DrunkenWalk {
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int size, steps, randomWalks, drunksInWater = 0;
		double percent;
		RandomWalk rw;
		DecimalFormat df;		

		System.out.print("Ange storlek på planet: ");
		size = input.nextInt();
		
		System.out.print("Ange max antal steg: ");
		steps = input.nextInt();
		
		System.out.print("Ange antal slumpvandringar: ");
		randomWalks = input.nextInt();
		
		for (int i = 0; i < randomWalks; i++) {
			rw = new RandomWalk(steps, size);
			rw.walk();
			
			if (rw.inBounds() == false) {
				drunksInWater++;
			}
		}		
		df = new DecimalFormat("#.00");
		percent = (double) drunksInWater / randomWalks * 100;
		
		System.out.println("Av " + randomWalks + " onyktra personer, föll " + drunksInWater + " (" + df.format(percent) + "%) i vattnet.");
	
		input.close();
	}

}
