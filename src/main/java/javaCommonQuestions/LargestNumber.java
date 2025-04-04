package javaCommonQuestions;

/*
Question: Find the largest number from three numbers.
Input: num1 = 7, num2 = 9, num3 = 10
Output: 10 is the largest number.
*/
import java.util.ArrayList;
import java.util.Collections; // Import Collections for using Collections.max

public class LargestNumber {
	public static void main(String[] args) {
		int num1 = 7, num2 = 9, num3 = 10;

		// Using simple conditional statements to find the largest number
		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " is the largest number.");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is the largest number.");
		} else {
			System.out.println(num3 + " is the largest number.");
		}

		// Using the Collections.max() method with ArrayList
		ArrayList<Integer> numbers = new ArrayList<Integer>(); // Explicit type parameters
		numbers.add(num1);
		numbers.add(num2);
		numbers.add(num3);
		System.out.println(Collections.max(numbers) + " is the largest number from the three numbers.");
	}
}