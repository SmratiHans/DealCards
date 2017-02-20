/**
 * This is where execution of program starts.
 * It access Objects of Class CardDeck and Card. 
 * @author Smrati Hans
 * @version 1.0
 */
public class DealCards {

	/**
	 * The starting point of the execution of the program
	 */
	public static void main(String[] args) {

		CardDeck cardDeck = new CardDeck();
		Card card;
		cardDeck.shuffle();
		System.out.println("Dealing cards from deck in random order");
		while (cardDeck.getTotalNumberOfCardsDealt() > -1) {
			card = cardDeck.dealOneCard();
			if (null != card) {
				card.display();
			}
		}
	}
}
