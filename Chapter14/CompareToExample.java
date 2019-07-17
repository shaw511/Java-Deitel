import java.util.Scanner;

public class CompareToExample{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the first string you would like to compare?");
		String inp1 = input.next();
		System.out.println("Whas is the second string you would like to compare to the first string");
		String inp2 = input.next();
	
		int outcome = inp1.compareTo(inp2);
	
		switch(outcome){
			case 1:
			System.out.println("The first string is greater than the second string");
			break;
		
			case 0:
			System.out.println("Those strings are identical");
			break;
		
			case -1:
			System.out.println("The first string is less than the second string");
			break;
		}

	}
}