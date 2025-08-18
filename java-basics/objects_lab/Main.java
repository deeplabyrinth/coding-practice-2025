package objects_lab;

public class Main {

	public static void main(String[] args) {

		String make = "Chevy";
		String model = "Silverado";
		int year = 2006;
		String color = "grey";
		var result = Answer.buildCar(make, model, year, color);

		System.out.println(result.toString());
	}
}
