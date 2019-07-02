import java.security.SecureRandom;

public class Hare{
	private static final SecureRandom randomNumber = new SecureRandom(); //Creating an object so I can now have random numbers
	private int position = 1; //setting the starting position of a new object of Hare

	public int getPosition(){
		return position;
	}

	public void move(){ //moves the hare depening on the random number
		int chance = randomNumber.nextInt(100);
		if(chance<20){ //sleep

		}else if(chance < 30){ //big slip
			if(position > 12){
				position-=12;
			}else{
				position = 1;
			}
		}else if(chance < 50){ //big hop
			position+= 9;
		} else if(chance< 70){//small slip
			position-=2;
		}else{				//small hop
			position++;
		}
	}


}