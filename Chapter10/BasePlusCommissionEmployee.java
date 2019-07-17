public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, int socialSecurityNumber, double commissionRate, double grossSales, double baseSalary){
		super(firstName,lastName,socialSecurityNumber,commissionRate,grossSales);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary(){
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary){
		this.baseSalary = baseSalary;
	}

	@Override
	public double earnings(){
		return getBaseSalary() + super.earnings();
	}

	@Override
	public String toString(){
		return super.toString() + String.format("Base Salary for this employee is: %f%n",baseSalary);
	}
}