public class VarLenArgList{ //Doing this to showcase getting arguments from the command line and then also passing those arguments when it could be variable
	public static void main(String[] args){
		int total = 1;
		for(String num:args){ //Uses the user supplied arguments to calculate the product of them
			total*=Integer.parseInt(num);
		}
		System.out.printf("The product of the numbers you entered is %d%n",total); //Outputs the product of the arguments that the user supplied

		double d1 = 3.0; //just creating some variables so I can test the variable parameter length
		double d2 = 4.3;
		double d3 = 9.9;
		double d4 = 6.4;
		System.out.printf("The first number is %.1f%nThe second number is %.1f%nThe third number is %.1f%nThe fourth number is %.1f%n",d1,d2,d3,d4); //Just shows the users the different numebers I am using
		System.out.printf("For the first 2 arguments it is %.2f%nFor the first 3 it is %.2f%nFor all 4 it is %.2f%n",varProductDouble(d1,d2),varProductDouble(d1,d2,d3),varProductDouble(d1,d2,d3,d4)); //Then uses the variable length to calculate it at variable lengths and outputs to the user

	}
	public static double varProductDouble(double... num){ //Here is the function that can take multiple arguments
		double total = 1.0;
		for(double numbers:num){ //Using extended for to look fancy
			total*=numbers;
		}
		return total;
	} 

}