class RealEstate {
    private int id;
    private String location;
    private double size;
    private double value;
    private double monthlyCost;
    private double subleaseIncome;

    public RealEstate(int id, String location, double size, double value, double monthlyCost, double subleaseIncome) {
        this.id = id;
        this.location = location;
        this.size = size;
        this.value = value;
        this.monthlyCost = monthlyCost;
        this.subleaseIncome = subleaseIncome;
    }

    public double getAnnualCost() {
        return monthlyCost * 12;
    }

    public double getAnnualIncome() {
        return subleaseIncome * 12;
    }
}