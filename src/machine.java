import java.util.Date;

class Machine {
    private int id;
    private String type;
    private Date purchaseDate;
    private double value;
    private double monthlyCost;

    public Machine(int id, String type, Date purchaseDate, double value, double monthlyCost) {
        this.id = id;
        this.type = type;
        this.purchaseDate = purchaseDate;
        this.value = value;
        this.monthlyCost = monthlyCost;
    }

    public double getAnnualCost() {
        return monthlyCost * 12;
    }
}