package com.employeemanagementsystem;

public class Contractor extends Employee {

    // Constructor for Contractor (inherits from Employee)
    public Contractor(String name, String employeeId, double baseSalary) {
        super(name, employeeId, baseSalary); // Call Employee constructor
    }

    // Overriding calculateSalary method for Contractors (polymorphism)
    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}
