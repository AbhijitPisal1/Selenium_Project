package javaCommonQuestions;

/*
Question: Calculate the sum of digits of a number.
Input: 987
Output: 24
*/
public class SumOfDigits {
	public static void main(String[] args) {
		int n = 987;
		int sum = 0;
		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		System.out.println("Sum of digits: " + sum);
	}
}