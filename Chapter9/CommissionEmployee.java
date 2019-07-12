public class CommissionEmployee extends Employee{
	private double commissionRate;

	
	public CommissionEmployee(String firstname,String lastname, int socialSecurityNumber, double commissionRate){
		super(firstname,lastname,socialSecurityNumber);
		this.commissionRate = commissionRate;

	}

	public double getCommissionRate(){
		return commissionRate;
	}

	@Override
	public String toString(){
		return super.toString() + String.format("Commission rate for this employee is: %f",commissionRate);
	}

}