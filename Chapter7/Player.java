import java.util.Scanner;

public class Player{
	private Card[] hand = new Card[2];
	private int balance = 1000;

	public Player(String id){ //simple constructor to set the name of the player
		this.id = id;
	}
	public void turn(){ //stuff needs to go here pertaining to what the player does during their turn

	}

	public void newHand(DeckOfCards deck){ //deals the player a new hand with a parameter being the deck that is being used
		hand[0] = deck.dealCard();
		hand[1] = deck.dealCard();
		System.out.printf("Your hand is: %s%s%n",hand[0].getCard(),hand[1].getCard());
	}
}