package oopsBasics;

/**
 * Main class to demonstrate inheritance with Student and Professor classes.
 */
public class RunnerInheritance {
	public static void main(String[] args) {
		// Creating a new Student object and printing details
		Student student = new Student("Mike", 24, "US", "Java", 500);
		student.printStudent();

		// Creating a new Professor object and printing details
		Professor professor = new Professor("John", 45, "US", 70332, 12);
		professor.printProf();
	}
}