package composite.employee;

public class Developer implements Employee {
    String name;
    float salary;

    public Developer(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public float getSalary() {
        return salary;
    }

    @Override
    public String[] getRoles() {
        return new String[]{"backend"};
    }
}
