package javaBasics;

public class TwoDimensionArray {
	public static void main(String[] args) {

		int[][] StudentMarks = new int[3][2]; // [rows][columns]
		StudentMarks[0][0] = 10;
		StudentMarks[0][1] = 14;

		StudentMarks[1][0] = 7;
		StudentMarks[1][1] = 12;

		StudentMarks[2][0] = 12;
		StudentMarks[2][1] = 3;

		System.out.println(StudentMarks[1][1]);

	}

}