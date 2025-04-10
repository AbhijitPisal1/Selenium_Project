package project.employeemanagement;

/**
 * ITDepartment is a concrete subclass of Department.
 * It provides a specific implementation for managing employees in the IT department.
 */
public class ITDepartment extends Department {

    public ITDepartment() {
        super("IT");
    }

    @Override
    public void manageEmployee(Employee employee) {
        System.out.println("Managing IT employee: " + employee.getName());
    }
}
