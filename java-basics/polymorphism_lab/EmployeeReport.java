public class EmployeeReport {
	
	private int managerCount;
	private int engineerCount;
	private int internCount;

	public EmployeeReport() {
		setManagerCount(0);
		setEngineerCount(0);
		setInternCount(0);
	}

	public EmployeeReport(int managerCount, int engineerCount, int internCount) {
		setManagerCount(managerCount);
		setEngineerCount(engineerCount);
		setInternCount(internCount);
	}

	public void setManagerCount(int managerCount) {
		this.managerCount = managerCount;
	}

	public void setEngineerCount(int engineerCount) {
		this.engineerCount = engineerCount;
	}

	public void setInternCount(int internCount) {
		this.internCount = internCount;
	}

	public int getManagerCount() {
		return managerCount;
	}

	public int getEngineerCount() {
		return engineerCount;
	}

	public int getInternCount() {
		return internCount;
	}
}
