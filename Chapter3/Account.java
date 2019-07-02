public class Account{

	private String name;
	private double balance;

	public Account(String name, double balance){
		this.name = name;
		if(balance > 0.0){
			this.balance = balance;
		}
	}

	public void deposit(double amount){
		if(amount > 0.0){
			balance += amount;
			System.out.printf("You have deposited £%.2f into your account successfully.%nYour balance is now £%.2f.%n",amount,balance);
		} else{
			System.out.println("That is not a valid amount to deposit, please try again.");
		}
	}
	public void withdraw(double amount){
		if(amount > 0.0 & amount <= balance){
			balance -= amount;
			System.out.printf("You have withdrawn £%.2f from your account successfully.%nYour balance is now £%.f.%n", amount, balance );
		} else if (amount > 0.0) {
			System.out.println("You do not have enough funds to withdraw that much.");
		} else {
			System.out.println("That is not a valid amount to withdraw, please try again.");
		}
	}

	public double getBalance(){
		return balance;
	}

	public void setName(String name){
		this.name = name;

	}

	public String getName(){
		return name;

	}



}