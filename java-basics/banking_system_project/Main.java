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

		System.out.print(testMenu);
		menuInput = console.next().charAt(0);

		System.out.println(menuInput);

		// Decision structure for menu navigation

	}
}
