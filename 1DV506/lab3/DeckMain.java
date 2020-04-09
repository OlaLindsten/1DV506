package ol222es_lab3;

public class DeckMain {

	public static void main(String[] args) {
		
		Deck dk = new Deck();
					
		dk.createDeck();
		
		dk.shuffleCards();
		
		System.out.println("Delar ut: " + dk.dealACard());
		System.out.println("Delar ut: " + dk.dealACard());
		System.out.println("Delar ut: " + dk.dealACard());
		
		System.out.println("Alla utdelade kort: " + dk.dealtCards());
		
		System.out.println("Det finns: " + dk.getSize() + " kort kvar i kortleken");
		
		dk.shuffleCards();
		
	}

}

