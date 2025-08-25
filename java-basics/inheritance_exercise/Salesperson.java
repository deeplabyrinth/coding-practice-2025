package inheritance_exercise;

public class Salesperson {

    private String name;
    private double salary;
    private int age;
    private double commissionPercentage;

    public Salesperson(String name, double salary, int age, double commissionPercentage) {
        setName(name);
        setSalary(salary);
        setAge(age);
        setCommissionPercentage(commissionPercentage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
