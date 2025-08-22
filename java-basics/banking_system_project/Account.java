public class Account {

	protected String accountType;
	protected double balance;

	public Account() {
		this("unspecified");
	}

	public Account(String accountType) {
		setAccountType(accountType);
		setBalance(0.00);
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		System.out.println("Depositing from the superclass");
	}
}
