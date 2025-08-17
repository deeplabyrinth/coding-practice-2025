package decision_structures_lab;

public class Main {

	public static void main(String[] args) {

		int numOfPennies = 10;
		int numOfNickels = 3;
		int numOfDimes = 5;
		int numOfQuarters = 1;
		boolean result = Answer.isADollar(numOfPennies, numOfNickels, numOfDimes, numOfQuarters);

		if (result) {
			System.out.println("You win!");
		} else {
			System.out.println("You lose.");
		}
	}
}
