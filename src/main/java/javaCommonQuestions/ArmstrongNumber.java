package javaCommonQuestions;

/*
Question: Check if a number is an Armstrong number.
Input: 153
Output: Yes, 153 is an Armstrong number.
*/
//import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int sum = 0, res, temp;
		int num = 153; // Number to check Armstrong
		temp = num;
		while (num > 0) {
			res = num % 10;
			num = num / 10;
			sum = sum + (res * res * res);
		}
		if (temp == sum)
			System.out.println(temp + " is an Armstrong number");
		else
			System.out.println(temp + " is Not an Armstrong number");
	}
}