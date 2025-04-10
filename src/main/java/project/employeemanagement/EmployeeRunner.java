package project.employeemanagement;

/**
 * This runner demonstrates encapsulation by accessing employee data via getter and setter methods.
 */
public class EmployeeRunner {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 30, "Developer", "IT");

        // Accessing and displaying employee details using getter methods
        emp.showEmployeeDetails();

        // Updating department using setter
        emp.setDepartment("HR");
        System.out.println("\nUpdated Employee Details:");
        emp.showEmployeeDetails();
    }
}

/**
 * Name: John Doe
 * Age: 30
 * Position: Developer
 * Department: IT
 * 
 * Updated Employee Details:
 * Name: John Doe
 * Age: 30
 * Position: Developer
 * Department: HR
*/
