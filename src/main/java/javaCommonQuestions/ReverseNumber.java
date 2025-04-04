package javaCommonQuestions;

/*
Question: Reverse a number and check if it is a palindrome.
Input: 12321
Output: 12321
*/
public class ReverseNumber {
	public static void main(String[] args) {
		int num = 12321;
		int rev = 0;
		int temp = num;
		int rem; // remainder
		while (num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		System.out.println("Reversed Number is " + rev);
		// Verify number is palindrome or not
		if (rev == temp) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not palindrome");
		}
	}
}