epublic class Card{
	private final String value; //the class card has attributes of value and suit to identify the card
	private final String suit;

	public Card(String value,String suit){
		this.value = value;
		this.suit = suit;
	}

	public String getCard(){ //simple function that returns a value like '2c' or 'Jh' for 'two of clubs' and 'jack of hearts' respectively
		return (value + suit);
	}
}