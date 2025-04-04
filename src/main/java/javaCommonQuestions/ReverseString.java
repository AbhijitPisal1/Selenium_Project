package javaCommonQuestions;

/*
Question: Reverse a string.
Input: "mama"
Output: "amaM"
*/
public class ReverseString {
	public static void main(String[] args) {
		String str = "mama";
		String s2 = "";
		// 1. By using the charAt() method
		for (int i = str.length() - 1; i >= 0; i--) {
			s2 = s2 + str.charAt(i);
		}
		System.out.println("Reversed word: " + s2);
		// Check if the given string is a palindrome or not
		if (str.equalsIgnoreCase(s2)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}
	}
}