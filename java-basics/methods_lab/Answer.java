package methods_lab;

public class Answer {

	static double calculateNumbers(int firstNumber, int secondNumber) {

		double result = 0;

		result = add(firstNumber, secondNumber);
		result = subtract(firstNumber, secondNumber);
		result = multiply(firstNumber, secondNumber);
		result = divide(firstNumber, secondNumber);

		return result;
	}

	static double add(int num1, int num2) {

		return num1 + num2;
	}

	static double subtract(int num1, int num2) {

		return num1 - num2;
	}

	static double multiply(int num1, int num2) {

		return num1 * num2;
	}

	static double divide(int num1, int num2) {

		return num1 / num2;
	}
}
