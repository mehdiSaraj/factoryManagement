class Manager extends Employee {
    protected double annualBonus;
    protected boolean hasThirteenthSalary;

    public Manager(int id, String name, String email, String role, double salary, double annualBonus, boolean hasThirteenthSalary) {
        super(id, name, email, role, salary);
        this.annualBonus = annualBonus;
        this.hasThirteenthSalary = hasThirteenthSalary;
    }

    @Override
    public double getAnnualSalary() {
        double total = super.getAnnualSalary() + annualBonus;
        if (hasThirteenthSalary) {
            total += salary; // 13th salary is equal to the monthly salary
        }
        return total;
    }
}