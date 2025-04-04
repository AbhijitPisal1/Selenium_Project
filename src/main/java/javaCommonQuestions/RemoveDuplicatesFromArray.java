package javaCommonQuestions;

/*
Question: Remove duplicates from an array.
Input: {"abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr"}
Output: {def, mno, pqr, xyz}
*/
import java.util.HashSet;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		String[] strArray = { "abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr" };

		// Using brute force method
		for (int i = 0; i < strArray.length - 1; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i].equals(strArray[j])) {
					System.out.println("Duplicate Element: " + strArray[j]);
				}
			}
		}

		// Using HashSet
		HashSet<String> hs = new HashSet<String>();
		for (String arrayElement : strArray) {
			if (!hs.add(arrayElement)) {
				System.out.println("HashSet: Duplicate Element: " + arrayElement);
			}
		}
	}
}