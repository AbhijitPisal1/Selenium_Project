package javaCommonQuestions;

/*
Question: Find common elements in two arrays.
Input: array1 = {4, 2, 3, 1, 6}; array2 = {6, 7, 8, 4}
Output: Common Elements: 4, 6
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsInArrays {
	public static void main(String[] args) {
		Integer[] array1 = { 4, 2, 3, 1, 6 };
		Integer[] array2 = { 6, 7, 8, 4 };
		List<Integer> commonElements = new ArrayList<Integer>(); // Explicit type parameter

		// By using the for loop
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i].equals(array2[j])) {
					commonElements.add(array1[i]);
				}
			}
		}
		System.out.println("Common Elements for given two arrays: " + commonElements);

		// By using ArrayList with the retainAll method
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(array1)); // Explicit type parameter
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(array2)); // Explicit type parameter
		list1.retainAll(list2);
		System.out.println("Common Elements using retainAll: " + list1);
	}
}