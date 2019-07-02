import java.util.Scanner;
import java.util.Random;

public class Test{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Account account1 = new Account("Adolf Hitler");
		Account account2 = new Account("Joseph Stalin");

		
	
		System.out.printf("The account name at the moment is %s",myAccount.getName());	
		
		System.out.println("Please enter the name you want for the account");
		String inputName = input.nextLine();
		myAccount.setName(inputName);
		System.out.printf("The new name for the account is: %s%n", myAccount.getName());
		
	}
}