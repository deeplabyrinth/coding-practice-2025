import java.util.Random;

public class Answer {

	public static BingoCard getBingoCard() {

		int[] b = generateColumn(1, 15);
		int[] i = generateColumn(16, 30);
		int[] n = generateColumn(31, 45);
		int[] g = generateColumn(46, 60);
		int[] o = generateColumn(61, 75);

		BingoCard bingoCard = new BingoCard(b, i, n, g, o);


		return bingoCard;
	}

	private static int[] generateColumn(int min, int max) {

		Random random = new Random();
		int count = 0;
		int entries = 5;
		// TODO: initialize an array here
		int[] column = new int[entries];

		while (count < entries) {
			int number = random.nextInt(min, max + 1);

			if (!elementExists(column, number)) {
				column[count] = number;

				count++;
			}
		}

		return column;
	}

	private static boolean elementExists(int[] array, int element) {
		for (int i = 0; i < array.length; ++i) {
			if (array[i] == element) {
				return true;
			}
		}

		return false;
	}
}
