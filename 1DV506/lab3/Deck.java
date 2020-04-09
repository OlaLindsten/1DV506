package ol222es_lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	
	private ArrayList<Card> dealtCards = new ArrayList<Card>(); 
	private ArrayList<Card> deck = new ArrayList<Card>();

	public int getSize() {
		return deck.size();
	}
		
	public String dealACard() {
		Random random = new Random();			
		
		int temp = random.nextInt(deck.size());
		String tempS = deck.get(temp).toString();		
		dealtCards.add(deck.get(temp));
		deck.remove(temp);	
		
		return tempS;
	}
	
	public String dealtCards() {
		return dealtCards.toString();
	}
	
	public void shuffleCards() {
		if (isValidDeckSize()) {
			Collections.shuffle(deck);
		}else {
			System.out.println("Kortleken är inte full, blandar därför inte kortleken.");
		}
	}
	
	public ArrayList<Card> createDeck() {

		for (Card.Color color : Card.Color.values()) {
			for (Card.Denomination denomination : Card.Denomination.values()) {
				deck.add(new Card(color, denomination));
			}
		}
		return deck;
	}
	
	private boolean isValidDeckSize() {
		return deck.size() == 52;
	}
	
}
