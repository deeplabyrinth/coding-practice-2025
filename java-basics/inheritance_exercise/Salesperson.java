package inheritance_exercise;

public class Salesperson extends Employee {
    //TODO: Generalize attributes name, salary, and age in a super class
//    private String name; inherited from employee
//    private double salary; inherited from employee
//    private int age; intherited from employee
    private double commissionPercentage;

    public Salesperson(String name, double salary, int age, double commissionPercentage) {
        super(name, age, salary);
        setCommissionPercentage(commissionPercentage);
    }

    public double getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(double commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public void raiseSalary() {
        this.salary += this.salary * 1.2;
    }

    public void raiseCommission() {
        if (this.commissionPercentage < .30) {
            this.commissionPercentage =
                    this.commissionPercentage * 1.2;
        }
    }
}
