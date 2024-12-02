import java.util.ArrayList;
import java.util.List;

class Factory {
    private int companyNumber;
    private String name;
    private CEO ceo;
    private List<Department> departments;
    private List<Machine> machines;
    private List<RealEstate> realEstates;
    private List<Customer> customers;

    public Factory(int companyNumber, String name, CEO ceo) {
        this.companyNumber = companyNumber;
        this.name = name;
        this.ceo = ceo;
        this.departments = new ArrayList<>();
        this.machines = new ArrayList<>();
        this.realEstates = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addMachine(Machine machine) {
        machines.add(machine);
    }

    public void addRealEstate(RealEstate realEstate) {
        realEstates.add(realEstate);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public int getNumberOfEmployees() {
        int count = 0;
        for (Department department : departments) {
            count += department.getEmployees().size();
        }
        return count + 1; // Including the CEO
    }

    public double calculateAnnualRevenue() {
        double revenue = 0;
        for (Customer customer : customers) {
            revenue += customer.getAnnualIncome();
        }
        for (RealEstate realEstate : realEstates) {
            revenue += realEstate.getAnnualIncome();
        }
        return revenue;
    }

    public double calculateAnnualExpenses() {
        double expenses = 0;

        // Employee salaries
        for (Department department : departments) {
            expenses += department.getManager().getAnnualSalary();
            for (Employee employee : department.getEmployees()) {
                expenses += employee.getAnnualSalary();
            }
        }

        // CEO salary
        expenses += ceo.getAnnualSalary();

        // Machines and Real Estate costs
        for (Machine machine : machines) {
            expenses += machine.getAnnualCost();
        }
        for (RealEstate realEstate : realEstates) {
            expenses += realEstate.getAnnualCost();
        }

        return expenses;
    }

    public double calculateNetIncome() {
        return calculateAnnualRevenue() - calculateAnnualExpenses();
    }

    public void printFactoryDetails() {
        System.out.println("Factory Name: " + name);
        System.out.println("Company Number: " + companyNumber);
        System.out.println("CEO: " + ceo.name);
        System.out.println("Number of Employees: " + getNumberOfEmployees());
    }

    public void printEmployeesAndSalaries() {
        System.out.println("Employees and Salaries for Factory: " + name);
        for (Department department : departments) {
            System.out.println("Department: " + department.getName());
            for (Employee employee : department.getEmployees()) {
                System.out.println(" - " + employee.name + ": $" + employee.getAnnualSalary());
            }
        }
    }

    public void printFinancialDetails() {
        System.out.println("Factory: " + name);
        System.out.println("Annual Revenue: $" + calculateAnnualRevenue());
        System.out.println("Net Income: $" + calculateNetIncome());
    }
}