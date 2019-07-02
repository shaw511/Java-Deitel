public class OperatorTest{
	public static void main(String[] args){
		int test = 5;
		System.out.printf("My test value is %d%n",test);
		System.out.printf("If I use post-fix I get %d%n",test++);
		test = 5;
		System.out.printf("If I use pre-fix I get %d%n",++test);
		test = 5;
		System.out.printf("If I use brackets I get %d%n",(test++));

	}
}