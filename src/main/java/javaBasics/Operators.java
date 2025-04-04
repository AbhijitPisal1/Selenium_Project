package javaBasics;

public class Operators {
	public static void main(String[] args) {
		// specific symbol : +,-, + , >, <
		// applicable for primitive and non primitive data type

		// arithmetic operator +, -, *, /, %
		int num1 = 13;
		int num2 = 3;

		System.out.println("Addition is ");
		System.out.println(num1 + num2);
		System.out.println("subtraction is ");
		System.out.println(num1 - num2);
		System.out.println("Multiplication is ");
		System.out.println(num1 * num2);
		System.out.println("Division is ");
		System.out.println(num1 / num2);
		System.out.println("Reminder is ");
		System.out.println(num1 % num2); // modular operator - gives reminder

		// assignment operator =, +=, -=, *=, /=
		int num3 = 10; // assigns value
		num3 += 5; // add new value to existing
		num3 -= 5; // subtracts value from existing value
		num3 *= 2; // multiplies value from existing value
		num3 /= 4; // divides value from existing value
		System.out.println(num3);

		// relational operator >, < , <=, >=, ==, !=
		// used to check relation between two variables
		// gives output in true OR false
		int num4 = 5;
		int num5 = 12;

		System.out.println(num4 < num5);
		System.out.println(num4 <= num5);
		System.out.println(num4 > num5);
		System.out.println(num4 >= num5);
		System.out.println(num4 == num5);
		System.out.println(num4 != num5);

		// logic operator && ||
		// comparing multiple conditions
		int num6 = 30;
		int num7 = 20;
		int num8 = 40;

		System.out.println(num6 > num7 && num6 < num8);
		// AND Operator && - both condition TRUE then only output is true
		// all conditions are validated

		System.out.println(num6 > num7 || num6 < num8);
		// || - any condition is TRUE then output is true
		// after first condition is true then remaining are not checked
	}
}