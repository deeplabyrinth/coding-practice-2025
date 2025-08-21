package basics_lab;

public class Main {

	public static void main(String[] args) {

		String answer = "The name of this method is fooBar";
		String methodName = Answer.getMethodName();

		if (methodName.equals(answer)) {
			System.out.println("Correct! Answer: " + answer);
		} else {
			System.out.println("Uh oh, the answer was incorrect.");
		}
	}
}
