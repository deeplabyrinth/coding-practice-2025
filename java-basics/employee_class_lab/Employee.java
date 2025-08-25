public class Employee {
	private String name;
	private int age;
	private double salary;
	private String location;
	static int count;

	public Employee(String name, int age, double salary, String location) {
		setName(name);
		setAge(age);
		setSalary(salary);
		setLocation(location);
		count++;
	}

	public void setName(String name) { this.name = name; }
	public void setAge(int age) { this.age = age; }
	public void setSalary(double salary) { this.salary = salary; }
	public void setLocation(String location) { this.location = location; }

	public String getName() { return name; }
	public int getAge() { return age; }
	public double getSalary() { return salary; }
	public String getLocation() { return location; }

	public void raiseSalary() {
		salary = salary * 1.2;
	}

	static int count() { return count; }
}
