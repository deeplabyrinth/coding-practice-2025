public class Main {

	public static void main(String[] args) {
		
		Employee[] employees = {
			new Manager(),
			new Manager(),
			new Manager(),
			new Intern(),
			new Engineer(),
			new Intern(),
			new Engineer()
		};

		EmployeeReport report = Answer.generateReport(employees);
		System.out.println("""
				Managers: %d
				Engineers: %d
				Interns: %d
				""".formatted(report.getManagerCount(),
					report.getEngineerCount(),
					report.getInternCount()));

	}
}
