public abstract class Employee{
	private String firstName;
	private String lastName;
	private int socialSecurityNumber;

	public Employee(String firstName, String lastName, int socialSecurityNumber){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public int getSocialSecurityNumber(){
		return socialSecurityNumber;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setSocialSecurityNumber(int socialSecurityNumber){
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	@Override
	public String toString(){
		return String.format("%s %s%nSocial Security Number:%d%n",getFirstName(),getLastName(),getSocialSecurityNumber());
	}

	public abstract double earnings(){

	}


}