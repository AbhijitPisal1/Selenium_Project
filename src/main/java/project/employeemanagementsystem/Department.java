package project.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<Employee> employees;

    // Constructor for Department
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Method to add employees to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to display all employees in the department
    public void displayEmployees() {
        System.out.println("Employees in " + departmentName + " department:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
