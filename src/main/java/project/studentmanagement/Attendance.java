package project.studentmanagement;

// This class represents student attendance in a specific course.
// It encapsulates attendance-related data.

public class Attendance {
	private int studentId;
	private String courseCode;
	private boolean isPresent;

	// Constructor to initialize attendance details
	public Attendance(int studentId, String courseCode, boolean isPresent) {
		this.studentId = studentId;
		this.courseCode = courseCode;
		this.isPresent = isPresent;
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

	public boolean isPresent() {
		return isPresent;
	}

	public void setPresent(boolean present) {
		isPresent = present;
	}

	// Method to display attendance details
	public void displayAttendanceDetails() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Course Code: " + courseCode);
		System.out.println("Attendance: " + (isPresent ? "Present" : "Absent"));
	}
}

/**
 * Explanation: This class uses Encapsulation to store attendance information
 * securely and provide methods to retrieve or update it.
 */
