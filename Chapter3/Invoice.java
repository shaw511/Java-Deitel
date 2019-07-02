public class Invoice{
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;

	public Invoice(String partNumber, String partDescription, int quantity, double price){
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}

	public void setPartNumber(String partNumber){
		this.partNumber = partNumber;
	}

	public String getPartNumber(){
		return partNumber;
	}

	public void setPartDescription(String partDescription){
		this.partDescription = partDescription;
	}

	public String getPartDescription(){
		return partDescription;
	}

	public void setQuantity(int quantity){
		if(quantity > 0){
			this.quantity = quantity;
		} else{
			this.quantity = 0;
		}
	}

	public int getQuantity(){
		return quantity;
	}

	public void setPrice(double price){
		if(price > 0.0){
			this.price = price;
		} else {
			this.price = 0.0;
		}
	}

	public double getPrice(){
		return price;
	}

	public double getInvoiceAmount(){
		return (price * quantity);
	}


}