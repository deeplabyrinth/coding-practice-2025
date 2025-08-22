import java.util.*;

public class CarReservationService {

	private static List<Car> cars = new ArrayList<>();

	//TODO: Initialize test data
	static {
		cars.add(new Car("1", true));
		/*cars.add(new Car("1", "toyota", "tacoma", "white", "truck", 49.99, true);
		cars.add(new Car("2", "kia", "sportage", "red", "suv", 54.99, false);
		cars.add(new Car("3", "bmw", "3 series", "white", "suv", 54.99, false);
		cars.add(new Car("4", "honda", "civic", "silver", "sedan", 74.99, false);
		cars.add(new Car("5", "nissan", "sentra", "gray", "sedan", 144.99, false);
		cars.add(new Car("6", "chevrolet", "silverado", "gray", "truck", 64.99, true);
		cars.add(new Car("7", "bmw", "5 series", "gray", "sedan", 94.99, true);
		cars.add(new Car("8", "jeep", "gladiator", "green", "suv", 99.99, false);
		cars.add(new Car("9", "chevrolet", "impala", "silver", "sedan", 64.99, true);
		cars.add(new Car("10", "honda", "civic", "silver", "sedan", 99.99, false);
		cars.add(new Car("11", "jeep", "wrangler", "green", "suv", 39.99, true);
		cars.add(new Car("12", "hyundai", "elantra", "red", "sedan", 149.99, true);
		cars.add(new Car("13", "chevrolet", "impala", "gold", "sedan", 114.99, false);*/
	}

	static void show() {
	}

	static void reserve(Scanner console) {

		//TODO: Read car identification and validate it exists
		System.out.print("\nEnter car ID [q/quit] ");
		String carId = console.next();

		boolean isAvailable = cars.stream().anyMatch(c -> c.getId().equals(carId) && !c.isReserved());

		if (!isAvailable) {
			System.out.println("Car not available. Returning to menu");
		} else {

			//TODO: Display the specified car and mark it as reserved if specified

		}

	}
}
