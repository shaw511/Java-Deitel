import java.util.concurrent.TimeUnit;

public class TortoiseAndHare{
	public static void main(String[] args){
		Hare hare = new Hare(); //Creates new instances of a tortoise and a hare
		Tortoise tortoise = new Tortoise();

		while(tortoise.getPosition() <70 && hare.getPosition() <70){ //Unless the game is finished, draws a new iteration and then moves the two animals
			for(int i = 0;i<hare.getPosition();i++){
				System.out.print("-");
			}
			System.out.print("H");
			for(int i = 0;i<(70-hare.getPosition());i++){
				System.out.print("-");
			}
			System.out.println();
			for(int i = 0;i<tortoise.getPosition();i++){
				System.out.print("-");
			}
			System.out.print("T");
			for(int i = 0;i<(70-tortoise.getPosition());i++){
				System.out.print("-");
			}
			System.out.printf("%n%n%n");//drops it down a few lines to give some space for the next drawing iteration 
			hare.move(); //moves the different animals
			tortoise.move();
			try { //uhh don't even mind this, this was copied so I don't really understand it but idk how else to wait 0.25 seconds
			    Thread.sleep(250);           
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}


		}
		if(tortoise.getPosition()>=70){ //displayed something if one of them won
			System.out.println("WOO THE TORTOISE WON WOOOOO");
		}else{
			System.out.println("Okay, umm soo the hare won?");
		}
	}
}