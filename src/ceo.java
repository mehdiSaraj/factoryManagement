class CEO extends Manager {
    private double annualBudget;

    public CEO(int id, String name, String email, String role, double salary, double annualBonus, double annualBudget) {
        super(id, name, email, role, salary, annualBonus, true); // CEO always has 13th salary
        this.annualBudget = annualBudget;
    }
}