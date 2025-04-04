package javaBasics;

public class VariablesDemo {

	static String StateName = "California";
	// stored in Method Memory Area
	// variable value is shared across all objects
	// not mandatory to assign value to variable
	// accessible to all methods and blocks written within a class
	// Access modifiers are applied

	String CompanyName = "AMAZON";
	// Instance Variable - created outside the method but inside the class
	// Accessible within all methods and blocks within a class
	// stored in heap memory area- object store area
	// not mandatory to assign value to variable
	// default value for not assigned values
	// String = null, int =o
	// cannot apply static keyword
	// Access modifiers are applied - public, private, protected, default

	public static void main(String[] args) {

		String Name = "Alex";

		// variable created inside the method -- local variable
		// accessible inside same method/block only
		// stored in stack memory area
		// Value has to be assigned before use
		// cannot apply static keyword
		// no access modifiers are applied
		System.out.println(Name);

	}

	public void PrintName() {

//		System.out.println(Name);
		System.out.println(CompanyName);
		System.out.println(StateName);

	}

}
