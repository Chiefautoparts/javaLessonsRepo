import java.util.*;

public class Deck{
	private ArrayList<Card> cardArray = new ArrayList<Card>();
	private Random r = new Random();
	private Card[] cards = new Card[13*4];

	public Deck() {
		int k = 0;
		for(int suit = 0; suit <= 3; suit++){
			for(int value = 1; value <= 13; value++){
				cards[k++] = new Card(value, suit);
			}
		}
		reset();
	}

	public void reset(){
		cardArray.clear();
		for(int i = 0; i < cards.length; i++){
			cardArray.add(cards[i]);
		}
	}

	public Card[] getCards(int n){
		if(n > cardArray.size())
			throw new IllegalStateException("You requested " + n + " cards. There are only " + cardArray.size() + " cards left in the deck.");
		Card[] selected = new Card[n];
		for(int i = 0; i < n; i++){
			selected[i] = cardArray.remove(r.nextInt(cardArray.size()));
		}
		return selected;
	}

	public static void main(String[] args){
		Deck deck = new Deck();
		Card[] cards = deck.getCards(10);
		for(int i = 0; i < cards.length; i++){
			System.out.println("Cards[" + i + "] is the " + cards[i]);
		}
	}
}