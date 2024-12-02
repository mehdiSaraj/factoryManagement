import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;
    private Specialization specialization;
    private Manager manager;
    private List<Employee> employees;

    public Department(String name, Specialization specialization, Manager manager) {
        this.name = name;
        this.specialization = specialization;
        this.manager = manager;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public Manager getManager() {
        return manager;
    }
}
