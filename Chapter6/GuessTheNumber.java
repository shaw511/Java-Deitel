import java.security.SecureRandom;  //Importing correct package to generate a secure random number
import java.util.Scanner; //Importing the scanner so I can read user input

public class GuessTheNumber{

	public static void main(String[] args){
		SecureRandom randomNumber = new SecureRandom();  //Initialising an object of SecureRandom so I can create the number
		Scanner input = new Scanner(System.in); //Initialising an object of Scanner so I can read input from Sytem.in(i.e. the user)
		int computerNumber = 1 + randomNumber.nextInt(1000); //Generating the number for the user to guess
		int humanGuess; //initialising the human guess
		
		System.out.println("Guess a number between 1 and 1000 inclusive");
		humanGuess = input.nextInt(); //Using the Scanner to then identify the user's initial guess
		int loopCounter = 1; //initialises counter to count how many times the loop loops to calculate the amount of guesses at the end

		while(humanGuess != computerNumber){ // A loop that terminates when the user has the correct number
			if(humanGuess < computerNumber){ //Simple logic to evaluate what happens in different cases
				System.out.println("Too low!");
			}else{
				System.out.println("Too high!");
			}
			System.out.println("Guess again.");
			humanGuess = input.nextInt(); //Registers the new guess
			++loopCounter;  //increment loop counter
		}	
		System.out.printf("Well done you got it right, the computer's number was %d%n",computerNumber);
		if(loopCounter<10){  //Some logic dependent on how many loop cycles or guesses the user used, then displayes an output dependent on that
			System.out.println("Either you know the secret or you got lucky!");
		}else if (loopCounter == 10) {
			System.out.println("Aha! You know the secret !");
		}else{
			System.out.println("You should be able to do better !");
		}
	}
}