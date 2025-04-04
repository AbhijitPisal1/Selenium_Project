package javaCommonQuestions;

/*
Question: Print Fibonacci series up to a certain number.
Input: First 10 Numbers
Output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
*/
public class FibonacciSeries {
	public static void main(String[] args) {
		int num1 = 0, num2 = 1, num = 10;
		for (int i = 0; i < num; i++) {
			System.out.print(num1 + " ");
			int num3 = num2 + num1; // Swap
			num1 = num2;
			num2 = num3;
		}
	}
}