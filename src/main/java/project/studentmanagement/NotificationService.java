package project.studentmanagement;

// The NotificationService class provides various methods for sending notifications.
// Polymorphism is demonstrated as the `sendNotification` method is overloaded with different parameter types.

public class NotificationService {

	// Method to send notification to a student
	public void sendNotification(Student student, String message) {
		System.out.println("Sending notification to student: " + student.getStudentName());
		System.out.println("Message: " + message);
	}

	// Method to send notification to a teacher
	public void sendNotification(Teacher teacher, String message) {
		System.out.println("Sending notification to teacher: " + teacher.getName());
		System.out.println("Message: " + message);
	}

	// Overloaded method to send a notification to both student and teacher
	public void sendNotification(Student student, Teacher teacher, String message) {
		sendNotification(student, message);
		sendNotification(teacher, message);
	}
}

/**
 * Explanation: This demonstrates Polymorphism by overloading the
 * sendNotification method to handle notifications for different entities
 * (Student and Teacher) using the same method name.
 */
