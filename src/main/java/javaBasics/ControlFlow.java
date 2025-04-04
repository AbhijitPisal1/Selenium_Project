package javaBasics;

public class ControlFlow {

	// decides flow of code execution
	// selection statements if else, switch case
	// iterative statement for and while loop

	public static void main(String[] args) {

		int age = 9;
		if (age > 18) {
			System.out.println("Yes, You can vote!");
		} else {
			System.out.println("No, you cannnot vote");
		}

		// if -else if multiple condition tested
		int marks = 93;

		if (marks < 35) {
			System.out.println("C Grade");
		} else if (marks >= 35 && marks <= 70) {
			System.out.println("B Grade");
		} else if (marks > 70) {
			System.out.println("A Grade");
		}

	}
}
