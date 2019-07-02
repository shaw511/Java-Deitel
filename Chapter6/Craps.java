import java.security.SecureRandom;  //Importing correct utilities, securerandom for the random numbers and scanner to read user input.
import java.util.Scanner;
public class Craps{

		private static double bankBalance = 1000.0; //User's balance starts at 1000
		private static final SecureRandom randomNumbers = new SecureRandom();

		private enum Status {CONTINUE, WON, LOST}; //Creating enum Status to represent different gamestates

		private static final int SNAKE_EYES = 2; //Assigning variables to numbers for more clarity later in gameIteration()
		private static final int TREY = 3;
		private static final int SEVEN = 7;
		private static final int YO_LEVEN = 11;
		private static final int BOX_CARS = 12;

		public static void main(String[] args){
			while(bankBalance>0.0){ //The game runs until you are broke
				double wager = enterWager(); //Stars by asking for a wager amount

				int gameValue = gameIteration(); //Then runs through the game
				if(gameValue == 1){
					bankBalance+=wager;
					System.out.printf("Your new bank balance is $%.2f%n",bankBalance); //If you win the amount wagered gets added to your bank and new bank balance is displayed
				} else {
					bankBalance-=wager;
					System.out.printf("Your new bank balance is $%.2f%n",bankBalance); //Otherwise the wagered amount is lost from your bank and new bank balance is displayed
				}
			}
			System.out.println("Haha, you busted."); //When you lose you get a nice little message

		}
		public static double enterWager(){ //Static function to have a more compartmentalised structure with this separate
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a wager");
			double wager = input.nextInt(); //Nice instance of argument promotion assigning the user input to our wager variable
			while(wager > bankBalance || wager < 0.0){
				System.out.println("That was not a valid wager, please input a new wager"); //Checks for validity and then if not valid asks for another value
				wager = input.nextInt();
			}
			return wager; //returns correct value of the wager

		}
		public static int rollDice(){
			int die1 = 1 + randomNumbers.nextInt(6);
			int die2 = 1 + randomNumbers.nextInt(6); //uses SecureRandom to generate a random integer between 1 and 6

			int sum = die1 + die2;

			System.out.printf("You rolled %d + %d = %d%n",die1,die2,sum); //Outputs the result to the user

			return sum; //returns sum of two rolls of the dice
		}
		public static int gameIteration(){
			int myPoint = 0;
			Status gameStatus;
			


			int sumOfDice = rollDice();

			switch(sumOfDice){
				case SEVEN:
				case YO_LEVEN:
					gameStatus = Status.WON;
					break;
				case SNAKE_EYES:
				case TREY:
				case BOX_CARS:
					gameStatus = Status.LOST;
					break;
				default:
					gameStatus = Status.CONTINUE;
					myPoint = sumOfDice;
					System.out.printf("Point is %d%n", myPoint);
					break;

			}

			while(gameStatus == Status.CONTINUE){
				sumOfDice = rollDice();

				if(sumOfDice == myPoint){
					gameStatus = Status.WON;
				}
				else{
					if(sumOfDice == SEVEN){
						gameStatus = Status.LOST;
					}
				}
			}

			if(gameStatus ==Status.WON){
				System.out.println("You win!");
				return 1;
			}
			else{
				System.out.println("You lost :/");
				return 0;
			}
		}


}