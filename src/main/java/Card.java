/**
 * This class is used to define the various Suits and Values(Face and numbers) of the cards
 * @author Smrati Hans
 * @version 1.0 
 */

enum Suits {
	HEARTS, SPADES, CLUBS, DIAMONDS
};
enum Ranks {
	ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
};
public class Card {

	private Suits suit;
	private Ranks rank;

	/**
	 * Contructor to initialize Suit and Value of each card
	 * @param suit
	 * @param rank
	 */
	Card(int suit, int rank) {
		this.suit = Suits.values()[suit];
		this.rank = Ranks.values()[rank];
	}

	/**
	 * Method to print card dealt on stdout.
	 */
	public void display() {
		System.out.println(this.rank + " of " + this.suit);
	}

}
