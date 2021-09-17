package composite.organization;

import composite.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    protected List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public float getNetSalaries() {
        float netSalary = 0.0f;
        for (Employee employee : employeeList) {
            netSalary += employee.getSalary();
        }
        return netSalary;
    }
}
