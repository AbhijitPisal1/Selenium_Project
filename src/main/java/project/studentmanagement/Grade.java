package project.studentmanagement;

// This class represents the grade of a student in a specific course.
// It encapsulates grade-related information.

public class Grade {
	private int studentId;
	private String courseCode;
	private double grade;

	// Constructor to initialize grade details
	public Grade(int studentId, String courseCode, double grade) {
		this.studentId = studentId;
		this.courseCode = courseCode;
		this.grade = grade;
	}

	// Getters and Setters (Encapsulation)
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	// Method to display grade details
	public void displayGradeDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Grade: " + grade);
    }
}

/**
 * Explanation: This class demonstrates Encapsulation by hiding the grade
 * information and using getter and setter methods to access it.
 */