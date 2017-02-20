/**
 * This class performs operations on the deck of Cards.
 * @author Smrati Hans
 * @version 1.0
 */
public class CardDeck {
	// Array of type Card consisting of all possible Cards in a deck.
	private int numberOfCards = 52;
	private Card deck[] = new Card[numberOfCards];

	/**
	 * Constructor used to initialize deck of cards.
	 */
	public CardDeck() {
		for (int iter = 0; iter < deck.length; iter++) {
			deck[iter] = new Card(iter/13, iter%13);
		}
	}

	/**
	 * Method to shuffle the cards
	 */
	public void shuffle() {
		for (int iter = 0; iter < deck.length; iter++) {
			int randomInd = (int) (Math.random() * deck.length);
			Card tempCard = deck[iter];
			deck[iter] = deck[randomInd];
			deck[randomInd] = tempCard;
		}
	}
	
	/**
	 * Method to deal a card from the deck 
	 * returns a card every time till all the cards are not returned once.
	 */
	public Card dealOneCard() {
		if (numberOfCards == 0) {
			return null;
		}
		int index;
		Card tempCard = null;
		
		do {
			index = (int) (Math.random() * deck.length);
		} while(deck[index] == null);
		
		tempCard = deck[index];
		deck[index] = null;
		numberOfCards --;
		return tempCard;
	}

	/**
	 * Method to get count of number of cards left in the deck
	 * @return the number of card not dealt yet from the deck
	 */
	public int getTotalNumberOfCardsDealt(){
		return numberOfCards;
	}
}