package project.studentmanagement;

// Runner class that demonstrates all the OOP concepts by creating objects and invoking methods.

public class StudentManagementRunner {

	public static void main(String[] args) {

		// Creating objects for student and teacher
		Student student1 = new Student("Alice", 101, "Math");
		Teacher teacher1 = new Teacher("Mr. John", 202, "Math");

		// Creating course and grade objects
		Course mathCourse = new Course("Mathematics", "MATH101");
		Grade grade1 = new Grade(101, "MATH101", 95.5);
		Attendance attendance1 = new Attendance(101, "MATH101", true);

		// Sending notifications
		NotificationService notificationService = new NotificationService();
		notificationService.sendNotification(student1, "Your grades are updated.");
		notificationService.sendNotification(teacher1, "Please review your course materials.");

		// Displaying student details
		student1.displayStudentDetails();
		teacher1.displayTeacherDetails();
		mathCourse.displayCourseDetails();
		grade1.displayGradeDetails();
		attendance1.displayAttendanceDetails();
	}
}

/**
 * Explanation: This class is the Runner for the entire Student Management
 * System, where we create instances of Student, Teacher, Course, Grade, and
 * Attendance and demonstrate OOP concepts such as Inheritance, Encapsulation,
 * and Polymorphism.
 */


/**
 * Expected Output
 * Sending notification to student: Alice
 * Message: Your grades are updated.
 * Sending notification to teacher: Mr. John
 * Message: Please review your course materials.
 * Student Name: Alice
 * Student ID: 101
 * Enrolled Course: Math
 * Teacher Name: Mr. John
 * Teacher ID: 202
 * Teaching Subject: Math
 * Course Name: Mathematics
 * Course Code: MATH101
 * Student ID: 101
 * Course Code: MATH101
 * Grade: 95.5
 * Student ID: 101
 * Course Code: MATH101
 * Attendance: Present
 */
