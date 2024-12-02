class Customer {
    private int id;
    private String name;
    private String email;
    private String companyName;
    private double monthlyIncome;

    public Customer(int id, String name, String email, String companyName, double monthlyIncome) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.companyName = companyName;
        this.monthlyIncome = monthlyIncome;
    }

    public double getAnnualIncome() {
        return monthlyIncome * 12;
    }
}