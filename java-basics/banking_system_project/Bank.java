import java.util.*;

public class Bank {

	private static Map<String, Account> bank = new HashMap<>();
	private static Account account;
	private static double amount;
	private static double balance;

	static void createAccount(Scanner console) {

		char userInput;

		System.out.println("""
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
				bank.put("checking", account);
				break;
			case '1':
				System.out.println("<user selected savings>");
				//account = new SavingsAccount();
				//bank.add("savings", account);
				break;
			case 'q':
				System.out.println("<Cancelled account creation>");
				break;
			default:
				System.out.println("ERROR: wrong input, account not created");
				break;
		}
	}


}
