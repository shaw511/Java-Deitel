import java.security.SecureRandom; //importing secure random so I can generate random numbers for the game simulation

public class Tortoise{
	private static final SecureRandom randomNumber = new SecureRandom();
	private int position = 1;

	public int getPosition(){
		return position;
	}
	public void move(){
		int chance = randomNumber.nextInt(100);
		if(chance<50){ //fast plod
			position += 3; 
		}else if(chance <70){ //slip
			if(position > 6){
				position-=6;
			}else{
				position = 1;
			}
		} else{
			position++; //slow plod
		}

	}

}