package project.employeemanagement;

/**
 * Abstract class that defines a generic structure for departments.
 * Specific departments will extend this abstract class to implement unique functionality.
 */
public abstract class Department {
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    // Abstract method to be implemented by subclasses
    public abstract void manageEmployee(Employee employee);
}
