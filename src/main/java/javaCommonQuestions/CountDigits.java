package javaCommonQuestions;

/*
Question: Count the number of digits in an integer.
Input: 29845315
Output: 8
*/
public class CountDigits {
	public static void main(String[] args) {
		long num = 29845315;
		int count = 0;
		// Using while loop
		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Number of digits: " + count);
	}
}