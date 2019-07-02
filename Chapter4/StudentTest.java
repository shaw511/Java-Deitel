public class StudentTest{
	public static void main(String[] args){
		Student account1 = new Student("Nick Cage", 69.0);
		Student account2 = new Student("Richard Feynman", 42.0);

		System.out.printf("%s's letter grade is: %s%n",account1.getName(), account1.getLetterGrade());
		System.out.printf("%s's letter grade is: %s%n",account2.getName(), account2.getLetterGrade());


	}
}