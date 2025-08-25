package inheritance_exercise;

public class Analyst extends Employee {
    //TODO: Create a super class that includes general attributes
//    private String name; INHERITED
//    private double salary; INHERITED
//    private int age; INHERITED

    public Analyst(String name, double salary, int age) {
        super(name, age, salary);
    }

    public double getAnnualBonus() {
        return this.salary * .05;
    }

    public void raiseSalary() { this.salary = this.salary * 1.2; }
}
