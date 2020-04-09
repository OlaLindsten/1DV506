package ol222es_lab3;

public class Card {

	public enum Color{
		SPADES, 
		HEARTS, 
		CLUBS, 
		DIAMONDS
	}
	
	public enum Denomination {
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		JACK,
		QUEEN,
		KING,
		ACE
	}

	private Color color;
	private Denomination denomination;
	
	public Color getColor() {
		return color;
	}

	public Denomination getDenomination() {
		return denomination;
	}
	
	public String toString() {
		return this.denomination + " of " + this.color;
	}
	
	public Card(Color color, Denomination denomination) {
		this.color = color;
		this.denomination = denomination;
	}
	
}