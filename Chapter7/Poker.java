import java.util.Scanner; //Importing scanner to get user information

public class Poker{
	private DeckOfCards deck = new DeckOfCards();
	private Card[] tableCards = new Card[5];
	private int playerNumber = 10; //initialised to out of bounds to the while loop that lets the user chose actually starts

	public static void main(String[] args){ //Runs the actual game
		Scanner input = new Scanner(System.in);
		deck.shuffle();

		System.out.println("How many players will be at the table, pick a number between 1 and 9");
		while(playerNumber > 9 || playerNumber < 1){
			try{
				playerNumber = input.nextInt();
			}catch(NumberFormatException e){
				System.out.println("That was an invalid input, please try again");
			}
			if(playerNumber>9 || playerNumber < 1){
				System.out.println("That was an invalid input, please try again");
			}	
		}



	}
	public void flop(){ //separate method for when the flop is dealt so that it is nice and reusable
		tableCards[0] = deck.dealCard();
		tableCards[1] = deck.dealCard();
		tableCards[2] = deck.dealCard();
		System.out.printf("And the flop comes: %s%s%s%n%nYour hand is %s%s",tableCards[0].getCard(),tableCards[1].getCard(),tableCards[2].getCard(),hand[0].getCard(),hand[1].getCard());
	}
	public void turn(){ //same for the turn, reusable chunk
		tableCards[3] = deck.dealCard();
		System.out.printf("And the turn is a %s%n%nThe table is now %s%s%s%s%n%nYour hand is %s%s",tableCards[3],tableCards[0],tableCards[1],tableCards[2],tableCards[3],hand[0],hand[1]);
	}

	public void river(){ //and for the river, nice chunk
		tableCards[4]
		System.out.printf("And the river is a %s%n%nThe table is now %s%s%s%s%s%n%nYour hand is %s%s",tableCards[4],tableCards[0],tableCards[1],tableCards[2],tableCards[3],tableCards[4],hand[0],hand[1]);
	}
}


//I am going to scrap this idea because it requires more than I initially thought, as poker is a multiplayer game I have become increasingly unsure how to handle multiple players if at all. I also just want to move on with the rest of the book.