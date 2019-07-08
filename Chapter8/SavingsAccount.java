public class SavingsAccount{
	private static double annualInterestRate;
	private double savingsBalance;

	public SavingsAccount(double savingsBalance){
		this.savingsBalance = savingsBalance;
	}

	public static void setInterestRate(double interestRate){
		annualInterestRate = interestRate;
	}

	public void calculateMonthlyInterest(){
		savingsBalance+= ((savingsBalance * annualInterestRate)/12);

	}

	public double getSavingsBalance(){
		return savingsBalance;
	}
}