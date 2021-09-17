package composite;

import composite.employee.Designer;
import composite.employee.Developer;
import composite.organization.Organization;

public class CompositeMain {
    public static void main(String[] args) {
        // Prepare the employees
        Developer john = new Developer("John Doe", 12000);
        Designer jane = new Designer("Jane Doe", 15000);

        // Add them to organization
        Organization organization = new Organization();
        organization.addEmployee(john);
        organization.addEmployee(jane);
        System.out.println("Net salaries:" + organization.getNetSalaries()); // Net Salaries: 27000
    }
}
