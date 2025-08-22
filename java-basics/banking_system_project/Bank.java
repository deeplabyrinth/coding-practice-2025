import java.util.*;

public class Bank {

	private static Map<String, Account> bank = new HashMap<>();
	private static Account account;

	static void createAccount(Scanner console) {

		char userInput;

		System.out.print("""

				******************************
				CREATE ACCOUNT
				******************************
				[0] Checking
				[1] Savings

				Select an option [q/quit]\s""");

		userInput = console.next().charAt(0);

		switch (userInput) {
			case '0':
				System.out.println("<user selected checking>");
				account = new CheckingAccount();
				bank.put("001", account);
				break;
			case '1':
				System.out.println("<user selected savings>");
				account = new SavingsAccount();
				bank.put("002", account);
				break;
			case 'q':
				System.out.println("<Cancelled account creation>");
				break;
			default:
				System.out.println("ERROR: wrong input, account not created");
				break;
		}
	}

	static void deposit(Scanner console) {

		if (bank.isEmpty()) {
			System.out.println("No account exists. Returning to menu");
		} else {
			// This block implements the ability to select an account and
			// make a deposit if at least one account is created
			System.out.println("""

					*********************************
					DEPOSIT FUNDS
					*********************************\
					""");

			// Convert keys into a list
			Set<String> keySet = bank.keySet();
			List<String> keyList = new ArrayList<>(keySet);

			// Show the existing accounts and get the option of which account
			// to deposit to from the user
			for (int i = 0; i < bank.size(); ++i) {
				System.out.println("""
						[%d] %s %s\
						""".formatted(i, keyList.get(i), bank.get(keyList.get(i))));
			}
			
			System.out.print("\nSelect an account to deposit [q/quit] ");
			char userInput = console.next().charAt(0);

			// Get the amount that the user wants to deposit
			System.out.print("How much would you like to deposit? ");
			double amount = console.nextDouble();

			// Make the deposit
			switch (userInput) {
				case '0':
					bank.keySet().stream()
						.filter(k -> k.contains("001"))
						.forEach(k -> bank.get(k).deposit(amount));
					break;
				case '1':
					bank.keySet().stream()
						.filter(k -> k.contains("002"))
						.forEach(k -> bank.get(k).deposit(amount));
					break;
				case 'q':
					System.out.println("You cancelled making a deposit, returning to menu");
					break;
				default:
					System.out.println("There was an error input");
					break;
			}
		}
	}

	static void checkBalance() {

		System.out.println("""

				********************************
				BALANCE
				********************************
				""");

		bank.forEach((id, account) ->
				System.out.println("""
					Account type: %s
					Balance: %.2f
					""".formatted(account.getAccountType(), 
						account.getBalance())));
	}


}
