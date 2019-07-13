public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissionRate;

	
	public CommissionEmployee(String firstname,String lastname, int socialSecurityNumber, double commissionRate, double grossSales){
		super(firstname,lastname,socialSecurityNumber);
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;

	}

	public double getCommissionRate(){
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate){
		this.commissionRate = commissionRate;
	}

	public double getGrossSales(){
		return grossSales;
	}
	public void setGrossSales(double grossSales){
		this.grossSales = grossSales;
	}

	@Override
	public String toString(){
		return super.toString() + String.format("Commission rate for this employee is: %f%nGross sales for this employee is: %f%n",commissionRate, grossSales);
	}

	@Override
	public double earnings(){
		return getCommissionRate() * getGrossSales();
	}

}