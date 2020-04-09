package ol222es_lab4.sorter_orter;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SorteraOrter {
	
	public static void main(String[] args) {

		ArrayList<Ort> orter = new ArrayList<Ort>();	
		
		try {
			
			File file = new File("C:\\Temp\\orter.txt");
			Scanner input = new Scanner(file);
			
			System.out.println("Läser in filen: " + file);
			
			while (input.hasNext()) {
				String temp = input.nextLine();
						
					String[] ort = temp.split(";");

					String postKod = ort[0];
					String stad = ort[1];
					orter.add(new Ort(Integer.parseInt(postKod), stad));
			}
			
			System.out.println("Antal funna orter: " + orter.size());

			Collections.sort(orter);
			
			for (Ort ort : orter) {
				System.out.println(ort);
			}
			
			input.close();
		} catch (Exception e) {
			e.printStackTrace (); 						//Print exception
		}		
	}
}
