package employeemanagement;

/**
 * The Employee class encapsulates basic employee details like name, age, position, and department.
 */
public class Employee {
    private String name;
    private int age;
    private String position;
    private String department;

    // Constructor
    public Employee(String name, int age, String position, String department) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.department = department;
    }

    // Getter methods (Encapsulation)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    // Setter method (Encapsulation)
    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to display employee details
    public void showEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
        System.out.println("Department: " + department);
    }
}
