package project.employeemanagement;

/**
 * Demonstrates the concept of abstraction with different departments managing employees.
 */
public class DepartmentRunner {
    public static void main(String[] args) {
        ITDepartment itDept = new ITDepartment();

        Employee emp = new Employee("John", 30, "Developer", "IT");

        System.out.println("Department: " + itDept.getDepartmentName());
        itDept.manageEmployee(emp);
    }
}

/**
 * Department: IT
 * Managing IT employee: John
 */