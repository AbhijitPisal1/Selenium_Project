package javaCommonQuestions;

/*
Question: Swap two numbers.
Input: a = 100, b = 200;
Output: a = 200, b = 100;
*/
import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		int a = 100, b = 200;
		System.out.println("Before swapping: a = " + a + ", b = " + b);

		// 1. Swapping using three variables
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping, a = " + a + ", b = " + b);

		// 2. Using two variables
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping, a = " + a + ", b = " + b);

		// 3. Swapping a and b using XOR
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping, a = " + a + ", b = " + b);
	}
}