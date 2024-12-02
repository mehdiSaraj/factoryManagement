import java.util.Date;


public class Main {
    public static void main(String[] args) {
        CEO ceo = new CEO(1, "mohammed", "mohammat@gmail.com", "CEO", 20000, 50000, 100000);

        // Create Factory
        Factory factory = new Factory(1001, "Tech Factory", ceo);

        // Create Departments and Employees
        Manager productionManager = new Manager(2, "mahdi sarraj", "mahdi.sarraj@gmail.com", "Production Manager", 10000, 20000, true);
        Department production = new Department("Production", Specialization.PRODUCTION, productionManager);
        production.addEmployee(new Employee(3, "ali", "ali@gmail.com", "Technician", 5000));
        production.addEmployee(new Employee(4, "hasan", "hasan@gmail.com", "Technician", 5000));

        factory.addDepartment(production);

        // Add Machines
        factory.addMachine(new Machine(1, "gggg", new Date(), 50000, 2000));

        // Add Real Estates
        factory.addRealEstate(new RealEstate(1, "jerusalem", 500, 1000000, 5000, 2000));

        // Add Customers
        factory.addCustomer(new Customer(1, "person1 ", "contact@person1.com", "person1", 10000));

        // Perform actions
        factory.printFactoryDetails();
        System.out.println();
        factory.printEmployeesAndSalaries();
        System.out.println();
        factory.printFinancialDetails();
    }
}