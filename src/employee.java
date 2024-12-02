class Employee extends Person {
    protected String role;
    protected double salary;

    public Employee(int id, String name, String email, String role, double salary) {
        super(id, name, email);
        this.role = role;
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }
}