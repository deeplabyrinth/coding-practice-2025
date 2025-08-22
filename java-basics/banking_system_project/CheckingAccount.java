public class CheckingAccount extends Account {

	public CheckingAccount() {
		super("checking");
	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println(String.format("\nYou just deposited $%.2f into your checking account", amount));
	}
}
