package project.studentmanagement;

// This class represents a student in the system with attributes like name, id, and course.
// Encapsulation is used to hide the data members and provide public getters and setters.

public class Student {
	// Private fields (Encapsulation)
	private String studentName;
	private int studentId;
	private String enrolledCourse;

	// Constructor to initialize student details
	public Student(String studentName, int studentId, String enrolledCourse) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.enrolledCourse = enrolledCourse;
	}

	// Getters and Setters (Encapsulation)
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getEnrolledCourse() {
		return enrolledCourse;
	}

	public void setEnrolledCourse(String enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}

	// Method to display student details
	public void displayStudentDetails() {
		System.out.println("Student Name: " + studentName);
		System.out.println("Student ID: " + studentId);
		System.out.println("Enrolled Course: " + enrolledCourse);
	}
}

/**
 * Explanation: This class uses Encapsulation to hide the student's details
 * (like name, ID, and course) and provide access through public getter and
 * setter methods. The constructor is used to initialize the student’s details.
 */
