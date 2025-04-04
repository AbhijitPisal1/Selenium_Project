package javaCommonQuestions;

/*
Question: Remove spaces from a given string.
Input: "hello java Learning "
Output: "hellojavaLearning"
*/
import java.util.Scanner;

public class RemoveSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		System.out.println("Original String: " + input);
		input = input.replaceAll("\\s", ""); // Remove spaces
		System.out.println("Final String: " + input);
	}
}