package ol222es_lab1;

import java.util.Scanner;

public class KortNamn {

	public static void main(String[] args) {
		
		String fornamn, efternamn, kortFornamn, kortEfternamn;	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Var snäll och skriv in ditt förnamn");
		fornamn = input.nextLine();
		
		System.out.println("Var snäll och skriv in ditt efternamn");
		efternamn = input.nextLine();
		
		input.close();
		
		kortFornamn = fornamn.substring(0,1).toUpperCase();
		
		if(efternamn.length() < 4) {
			kortEfternamn = efternamn;
		}else {
			kortEfternamn = efternamn.substring(0,4);
		}
		
		System.out.println("\nFörnamn: " + fornamn);
		System.out.println("Efternamn: " + efternamn);
		System.out.println("Kort namn: " + kortFornamn + ". " + kortEfternamn);
	}

}
