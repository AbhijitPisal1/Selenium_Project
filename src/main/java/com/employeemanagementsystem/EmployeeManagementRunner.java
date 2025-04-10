package com.employeemanagementsystem;

public class EmployeeManagementRunner {

    public static void main(String[] args) {

        // Creating employee instances
        Employee emp1 = new Manager("Alice", "E101", 5000.0, 1500.0);
        Employee emp2 = new Developer("Bob", "E102", 4000.0, 800.0);
        Employee emp3 = new Contractor("Charlie", "E103", 3000.0);

        // Creating a department and adding employees
        Department department = new Department("IT Department");
        department.addEmployee(emp1);
        department.addEmployee(emp2);
        department.addEmployee(emp3);

        // Displaying all employees in the department
        department.displayEmployees();

        // Displaying payroll for each employee
        Payroll.displayPayroll(emp1);
        Payroll.displayPayroll(emp2);
        Payroll.displayPayroll(emp3);

        // Marking attendance
        Attendance attendance = new Attendance();
        attendance.markAttendance("E101", 20); // Alice present for 20 days
        attendance.markAttendance("E102", 18); // Bob present for 18 days
        attendance.markAttendance("E103", 22); // Charlie present for 22 days

        // Displaying attendance record
        attendance.displayAttendance();
    }
}

/**
 * Employees in IT Department department:
 * Employee [name=Alice, employeeId=E101, baseSalary=5000.0]
 * Employee [name=Bob, employeeId=E102, baseSalary=4000.0]
 * Employee [name=Charlie, employeeId=E103, baseSalary=3000.0]
 * Alice's Salary: $6500.0
 * Bob's Salary: $4800.0
 * Charlie's Salary: $3000.0
 * Employee ID: E101 - Days Present: 20
 * Employee ID: E102 - Days Present: 18
 * Employee ID: E103 - Days Present: 22
*/
