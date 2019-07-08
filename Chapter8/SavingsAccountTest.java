public class SavingsAccountTest{

	public static void main(String[] args){
		SavingsAccount saver1 = new SavingsAccount(2000.0);
		SavingsAccount saver2 = new SavingsAccount(3000.0);

		SavingsAccount.setInterestRate(0.04);

		for(int month=0;month<12;month++){
			System.out.printf("$%f $%f%n",saver1.getSavingsBalance(),saver2.getSavingsBalance());
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
		}
	}
}