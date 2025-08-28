public class Employee {

	private int id;
	private int employeeId;
	private String firstName;
	private String lastName;
	private int departmentId;

	public Employee(int id, int employeeId, String firstName, String lastName, int departmentId) {

		setId(id);
		setEmployeeId(employeeId);
		setFirstName(firstName);
		setLastName(lastName);
		setDepartmentId(departmentId);
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getId() { return id; }
	public int getEmployeeId() { return employeeId; }
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public int getDepartmentId() { return departmentId; }

	@Override
	public String toString() {
		return "Employee [id=" + id + 
			", employeeId=" + employeeId + 
			", firstName=" + firstName + 
			", lastName=" + lastName + 
			", departmentId=" + departmentId + "]";
	}
}
