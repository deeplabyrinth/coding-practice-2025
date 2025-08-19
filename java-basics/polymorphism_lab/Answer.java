public class Answer {

	static EmployeeReport generateReport(Employee[] employees) {	

		int managerCount = 0;
		int engineerCount = 0;
		int internCount = 0;

		// TODO: Process the array of Employee objects and categorize them
		// based on their class. Count how many are an instance of Manager,
		// Engineer, and Intern and return an EmployeeReport with accurate counts
		for (Employee employee : employees) {

			// TODO: Determine the employee's role and increase the count appropiately
			if (employee instanceof Manager) {
				managerCount++;
			} else if (employee instanceof Engineer) {
				engineerCount++;
			} else if (employee instanceof Intern) {
				internCount++;
			}
		}


		return new EmployeeReport(managerCount, engineerCount, internCount);
	}
}
