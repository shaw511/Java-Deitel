public class DeckTest{
	public static void main(String[] args){
		DeckOfCards deck1 = new DeckOfCards();
		deck1.shuffle();
		for(int i=0;i<52;i++){
			System.out.printf("%s%n",deck1.dealCard().getCard());
		}
	}
}