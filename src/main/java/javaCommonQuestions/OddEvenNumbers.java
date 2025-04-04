package javaCommonQuestions;

/*
Question: Determine if a number is odd or even.
Input: 11
Output: Given number is odd number
*/
import java.util.Scanner;

public class OddEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		if (num % 2 == 0) // Brute Force Approach
		{
			System.out.println("Given number is even number");
		} else {
			System.out.println("Given number is odd number");
		}
	}
}