package javaBasics;

public class SwitchCase {

	// similar to if else
	// tests with only one value, cannot test two values in single case
	// no logical and relational operators
	// switch accepts byte, short, int, char and string
	// switch doesn't accept boolean, float, long, double data tyes
	// break statement to come out of switch case
	// cannot write duplicate case blocks

	public static void main(String[] args) {
		int month = 11;

		switch (month) {
		case 1:
			System.out.println("Month is Jan");
			break;
		case 2:
			System.out.println("Month is Feb");
			break;
		case 3:
			System.out.println("Month is March");
			break;
		default:
			System.out.println("number is InValid");
		}
	}
}
