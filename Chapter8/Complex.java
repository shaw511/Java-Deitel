public class Complex{ // Complex class that allows for manipulation of complex numbers
	private double real; // Declaring instance variables for the real and imaginary parts of the complex numbers
	private double imaginary;

	public Complex(){ // Overloaded constructors that account for no parameters, only one parameter(taken as the real value) or both real and imaginary values 
		real = 0;
		imaginary = 0; // Default values for each part is 0
	}
	public Complex(double real){
		this.real = real;
		imaginary = 0;
	}
	public Complex(double real,double imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal(){ // Returns the real part of the complex number
		return real;
	}

	public double getImaginary(){ // Returns the imaginary part of the complex number
		return imaginary;
	}

	public void add(double real,double imaginary){ // Overloaded methods for addition such that you can use values for real and imaginary or input a complex number
		this.real += real;
		this.imaginary += imaginary;
	}
	public void add(double real){
		this.real += real;
	}
	public void add(Complex num){
		this.real += num.getReal();
		this.imaginary += num.getImaginary();
	}

	public void subtract(double real, double imaginary){ // Overloaded methods for subtractions so that you can use values for real and imaginary or use complex
		this.real -= real;
		this.imaginary -= imaginary;
	}
	public void subtract(double real){
		this.real -= real;
	}
	public void subtract(Complex num){
		this.real -= num.getReal();
		this.imaginary -= num.getImaginary();
	}

	public String toString(){ // Retuns a string like "4.0 + 10.0i"
		return ("" + real + " + " imaginary  "i"); 
	}
}