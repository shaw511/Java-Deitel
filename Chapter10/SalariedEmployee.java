public class SalariedEmployee extends Employee{
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, int socialSecurityNumber, double weeklySalary){
		super(firstName,lastName,socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary){
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double earnings(){
		return weeklySalary;
	}

	@Override
	public String toString(){
		return super.toString + String.format("Weekly wage is: %.2f",earnings());
	}
}