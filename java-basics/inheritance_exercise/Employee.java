package inheritance_exercise;

public class Employee extends Person {
    //TODO: Establish generalized employee attributes to be inherited
    // by salesperson and analyst classes
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
