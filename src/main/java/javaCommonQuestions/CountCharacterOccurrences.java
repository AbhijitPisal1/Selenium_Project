package javaCommonQuestions;

/*
Question: Count occurrences of each character in a string.
Input: "This is an example"
Output: {T=1, h=1, i=2, s=2, a=2, n=1, e=2, m=1, p=1, l=1}
*/
import java.util.HashMap;
//import java.util.Map;

public class CountCharacterOccurrences {
	public static void main(String[] args) {
		String str = "This is an example";
		HashMap<Character, Integer> count = new HashMap<Character, Integer>(); // Explicit type parameters
		char[] arr = str.toCharArray();

		// Traverse every character and count the occurrences
		for (char c : arr) {
			// Filter out white spaces
			if (c != ' ') {
				// Increment count for existing character or initialize it
				if (count.containsKey(c)) {
					count.put(c, count.get(c) + 1);
				} else {
					count.put(c, 1);
				}
			}
		}

		// Print occurrences
		System.out.println("Character occurrences: " + count);
	}
}