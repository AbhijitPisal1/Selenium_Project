package employeemanagement;

/**
 * Manager class implements EmployeeActions interface and provides specific implementations.
 */
public class Supervisor extends Employee implements EmployeeActions {

    public Supervisor(String name, int age, String position, String department) {
        super(name, age, position, department);
    }

    @Override
    public double calculateSalary() {
        return 5000;  // Salary for Managers
    }

    @Override
    public void assignTask() {
        System.out.println("Assigning tasks to the team.");
    }
}
