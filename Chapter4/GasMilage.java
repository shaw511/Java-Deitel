import java.util.Scanner;

public class GasMilage{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		
		int sentinel = 0;
		int sumMiles = 0;
		int sumGallons = 0;

		while(sentinel != 1){
			System.out.println("How many miles did you record?");

			int currentMiles = input.nextInt();
			sumMiles+= currentMiles;

			System.out.println("How many gallons did you use?");

			int currentGallons = input.nextInt();
			sumGallons+= currentGallons;

			System.out.printf("The miles per gallon for this trip is %.2f%n",((double) currentMiles / currentGallons));
			System.out.printf("The running total for the trip in miles per callon is %.2f%n",((double) sumMiles / sumGallons));
			System.out.println("Do you want to input another value?(0 = yes, 1 = no)");
			sentinel = input.nextInt();

		}
	}
}