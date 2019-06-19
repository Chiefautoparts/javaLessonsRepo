public class Card {
	private int value;
	private String suit;
	
	// Constructor
	Card(int value, String suit){
		this.value = value;
		this.suit = suit;
	}

	String getSuit(){
		return suit;
	}
	int getValue(){
		return value;
	}

	public String toString(){
		return value + " of " + suit;
	}
}