public class Main {

	public static void main(String[] args) {

		Employee[] employees = new Employee[2];

		Employee sally = new Employee("Sally", 32, 70500, "Florida");
		Employee butch = new Employee("Butch", 26, 36000, "California");

		employees[0] = sally;
		employees[1] = butch;

		int employeeCount = Employee.count();

		System.out.println(String.format("Employee count: %d", employeeCount));
		for (int i = 0; i < employees.length; ++i) {
			System.out.println(String.format("""
						Employee: %s
						\tAge: %d
						\tSalary: %f
						\tLocation: %s
						""", employees[i].getName(),
						employees[i].getAge(),
						employees[i].getSalary(),
						employees[i].getLocation()));
		}
	}
}
