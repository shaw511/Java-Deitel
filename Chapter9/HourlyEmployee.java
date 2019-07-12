public class HourlyEmployee extends Employee{
	private double hours;
	private double wage;

	public HourlyEmployee(String firstName, String lastName, int socialSeciurityNumber, double hours, double wage){
		super(firstName,lastName,socialSeciurityNumber);
		this.hours = hours;
		this.wage = wage;
	}

	public double getWage(){
		return wage;
	}
	public double getHours(){
		return hours;
	}

	public void setWage(double wage){
		if(wage<0){
			throw new IllegalArgumentException("Negative value")
		} else{
			this.wage = wage;
		}
	}
	public void setHours(double hours){
		if(hours < 0 || hours > 168){
			throw new IllegalArgumentException("Out of bounds for hours per week")
		} else{
			this.hours = hours;
		}
	}

	public double earnings(){
		return wage * hours;
	}

	@Override
	public String toString(){
		return super.toString() + String.format("Hours worked is %f and they earn £%f/h%n",hours,wage);
	}

}