package javaCommonQuestions;

/*
Question: Reverse each word in a sentence.
Input: "reverse each word in a string"
Output: "esrever hcae drow ni a gnirts"
*/
public class ReverseEachWordInSentence {
	public static void main(String[] args) {
		String str = "reverse each word in a string";
		String[] words = str.split("\\s");
		StringBuilder reverseString = new StringBuilder();

		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseString.append(sb.toString()).append(" ");
		}

		System.out.println(reverseString.toString().trim());
	}
}