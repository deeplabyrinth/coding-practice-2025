public class Account {

	private String accountType;
	private double balance;

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
}
