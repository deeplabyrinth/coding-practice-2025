import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// Increment each number in the 'numbers' array by one
		int[] numbers = new int[] {1, 2, 3, 4, 5};
		int[] result = incrementArray(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	static int[] incrementArray(int[] numbers) {
		int[] result = new int[numbers.length];

		for (int i = 0; i < numbers.length; ++i) {
			result[i] = numbers[i] + 1;
		}

		// Using stream operators
		//return Arrays.stream(numbers)
			//.map(number -> number + 1)
			//.toArray();

		return result;
	}
}
