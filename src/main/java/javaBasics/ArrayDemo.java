package javaBasics;

public class ArrayDemo {

	// one variable can store one value only, array can store multiple values
	// multiple elements of similar data type
	// elements are stored based on index
	// array size is fixed - index always start with 0

	public static void main(String[] args) {

		String StudentName[] = new String[5];
		StudentName[0] = "John";
		StudentName[1] = "Mike";
		StudentName[2] = "Joe";
		StudentName[3] = "Shawn";
		StudentName[4] = "Larry";
//		System.out.println(StudentName[2]);
//		System.out.println(StudentName[5]);	//ArrayIndexOutofbound exception

		for (int i = 0; i < StudentName.length; i++) {
			System.out.println(StudentName[i]);
		}
	}
}
