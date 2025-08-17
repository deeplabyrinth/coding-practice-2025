package decision_structures_lab;

public class Answer {

	public static boolean isADollar(int numOfPennies, int numOfNickels, int numOfDimes, int numOfQuarters) {
		
		// Value of each coin
		double penny = 0.01;
		double nickel = 0.05;
		double dime = 0.10;
		double quarter = 0.25;
		double dollar = 1.00;

		boolean won = false;

		// TODO: Implement solution here
		double total = (penny * numOfPennies) +
			       (nickel * numOfNickels) +
			       (dime * numOfDimes) +
			       (quarter * numOfQuarters);
		System.out.println(total);

		return won;
	}
}
