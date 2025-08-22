public class SavingsAccount extends Account {

	public SavingsAccount() {
		super("savings");
	}

	@Override
	public void deposit(double amount) {
		System.out.println(String.format("\nYou just deposited $%.2f into your savings account", amount));
	}
}
