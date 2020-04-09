package ol222es_lab3;

public class Play123Main {
			
	private static int wins = 0;			
	private static int lost = 0;
	
	public static boolean play123() {
		
		Deck dk = new Deck();		
		dk.shuffleCards();
		int counter = 1;
		
		
		for (int i = 0; i < 52; i++) {
			
			String temp = dk.dealACard();
			
			if (temp.contains("ACE") && counter == 1) {
				return false;
			}else if(temp.contains("TWO") && counter == 2) {
				return false;
			}else if(temp.contains("THREE") && counter == 3) {
				return false;
			}  

			counter++;
			if (counter == 4) {
				counter = 1;
			}
		}
		return true;
	}
	
	public static double probability() {
		double tries = 10000;				//Needs to be a double otherwise java "rounds" it to zero
		return wins/tries;
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10000; i++) {
			if (play123()) {
				wins++;
			}else {
				lost++;
			}
		}
	
		System.out.println("Antal vunna: " + wins);
		System.out.println("Antal förlorade: " + lost);
		System.out.println("Sannolikheten att vinna är: " + probability() + "%");
		
	}

}
