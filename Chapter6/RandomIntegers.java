import java.security.SecureRandom;  //importing SecureRandom

public class RandomIntegers{  // so essentially you are meant to role dice, but I think just all the numbers coming on the screen looks cool, so the more numbers the better in my opinion.
	public static void main(String[] args){
		SecureRandom randomNumbers = new SecureRandom();  //Creating the instance of securerandom

		int freq0 = 0;  //Variables for tracking frequency for each occurance
		int freq1 = 0;
		int freq2 = 0;
		int freq3 = 0;
		int freq4 = 0;
		int freq5 = 0;
		int freq6 = 0;
		int freq7 = 0;
		int freq8 = 0;
		int freq9 = 0;

		for(int counter = 1;counter<=100000000;counter++){ //for loop to loop and create new random integers
			int num = randomNumbers.nextInt(10); //

			System.out.printf("%d ", num); //printing out the numbers
			if(counter % 60 == 0){ //creating new line every 20th number
				System.out.println();
			}
			switch(num){
				case 0:
					freq0++;
					break;
				case 1:
					freq1++;
					break;
				case 2:
					freq2++;
					break;
				case 3:
					freq3++;
					break;
				case 4:
					freq4++;
					break;
				case 5:
					freq5++;
					break;
				case 6:
					freq6++;
					break;
				case 7:
					freq7++;
					break;
				case 8:
					freq8++;
					break;
				case 9:
					freq9++;
					break;
			}



		}
		System.out.printf("%d, %d, %d, %d, %d%n%d, %d, %d, %d, %d ",freq0,freq1,freq2,freq3,freq4,freq5,freq6,freq7,freq8,freq9);
	}
}