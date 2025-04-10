package project.studentmanagement;

// This class represents a course offered in the school/university system.
// It encapsulates course-related data like course name and course code.

public class Course {
	private String courseName;
	private String courseCode;

	// Constructor to initialize course details
	public Course(String courseName, String courseCode) {
		this.courseName = courseName;
		this.courseCode = courseCode;
	}

	// Getters and Setters (Encapsulation)
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	// Method to display course details
	public void displayCourseDetails() {
		System.out.println("Course Name: " + courseName);
		System.out.println("Course Code: " + courseCode);
	}
}

/**
 * Explanation: The Course class uses Encapsulation to protect the course
 * details (name and code) and provide public getters and setters.
 */