import java.util.*;

public class Main {

	public static void main(String[] args) {

		final String testMenu = """

				**********************************
				TEST MENU
				**********************************
				[0] Create account
				[1] Deposit
				[2] Withdraw
				[3] Check balance

				Select an option [q/quit]\s""";
		char menuInput;
		Scanner console = new Scanner(System.in);

		// Decision structure for menu navigation
		do {
			System.out.print(testMenu);
			menuInput = console.next().charAt(0);

			switch (menuInput) {
				case '0':
					System.out.println("TEST: Option 0 was selected");
					break;
				case '1':
					System.out.println("TEST: Option 1 was selected");
					break;
				case '2':
					System.out.println("TEST: Option 2 was selected");
					break;
				case '3':
					System.out.println("TEST: Option 3 was selected");
					break;
				case 'q':
					System.out.println("TEST: Testing ended");
					break;
				default:
					System.out.println("ERROR: Incorrect input. Try again");
					break;
			}

		} while (menuInput != 'q');

		console.close();
	}
}
