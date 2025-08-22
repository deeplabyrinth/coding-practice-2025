import java.util.*;

public class Main {

	public static void main(String[] args) {
		/* This application allows the user to access a car reservation service via a command
		 * interface where you can show rental availabily and reserve a selected car. The
		 * CarReservationService class is a controller that contains the filtering and
		 * validation of available cars. The service filters by ID (allows user to select car 
		 * that they want to reserve) and type (type of car for organization when viewing the 
		 * inventory). Each Car has attributes based on its ID, model, make, type, color, price, 
		 * inventory, and whether or not it is reserved. The only action to perform on a 
		 * Car is "reserve".
		 */

		//TODO: Create car reservation commands
		final String commandInterface = """

			==============================
			Welcome to Car Reservation
			==============================
			[0] Show availability
			[1] Reserve car

			Select an option [q/quit]\s""";

		Scanner console = new Scanner(System.in);
		char command;

		do {
			System.out.print(commandInterface);
			command = console.next().charAt(0);

			switch (command) {
				case '0':
					System.out.println("Option 0 selected");
					//CarReservationService.show();
					break;
				case '1':
					System.out.println("Option 1 selected");
					CarReservationService.reserve(console);
					break;
				case 'q':
					System.out.println("Application terminated");
					break;
				default:
					System.out.println("Incorrect command, try again");
			}
		} while (command != 'q');

		console.close();
	}
}
