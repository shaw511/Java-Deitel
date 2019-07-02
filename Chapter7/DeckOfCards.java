import java.security.SecureRandom; //importing randomness for the shuffling algorithm

public class DeckOfCards{
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final int NUMBER_OF_CARDS = 52;

	private Card[] deck = new Card[NUMBER_OF_CARDS]; //Creates the actual deck using an array of class Card
	private int currentCard = 0;         //This is essentially a pointer to the current top of the deck

	public DeckOfCards(){
		String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"}; //list of values that the card can hold
		String[] suits = {"s", "h", "c", "d"}; //list of suits that the card can be

		for(int i = 0;i<NUMBER_OF_CARDS;i++){ //simple loop that attributes a different value and suit to each card
			deck[i] = new Card(values[i % 13],suits[i % 4]); //be weary on replicating this kind of statement, this only works as 13 and 4 are co-prime
		}
	}
	public void shuffle(){ //method that shuffles the whole deck, by swapping every element in the deck with another one sequentially.
		currentCard = 0;
		for(int i =0;i<NUMBER_OF_CARDS;i++){
			int swap = randomNumber.nextInt(NUMBER_OF_CARDS);

			Card temp = deck[i];
			deck[i] = deck[swap];
			deck[swap] = temp;
		}
	}

	public Card dealCard(){ //method that returns a Card type, then increments the currentCard pointer
		if(currentCard<deck.length){
			return deck[currentCard++];

		}else{
			return null;
		}
	}

}