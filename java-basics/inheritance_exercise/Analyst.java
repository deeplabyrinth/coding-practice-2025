package inheritance_exercise;

public class Analyst {
    //TODO: Create a super class that includes general attributes
    private String name;
    private double salary;
    private int age;

    public Analyst(String name, double salary, int age) {
        setName(name);
        setSalary(salary);
        setAge(age);
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

    public double getAnnualBonus() {
        return this.salary * .05;
    }

    public void raiseSalary() { this.salary = this.salary * 1.2; }
}
