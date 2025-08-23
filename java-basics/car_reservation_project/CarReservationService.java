import java.util.*;

public class CarReservationService {

	private static Map<String, Car> cars = new HashMap<>();

	//TODO: Initialize test data
	static {
		cars.put("1", new Car("toyota", "tacoma", "white", "truck", 49.99, true);
		cars.put("2", new Car("kia", "sportage", "red", "suv", 54.99, false);
		cars.put("3", new Car("bmw", "3 series", "white", "suv", 54.99, false);
		cars.put("4", new Car("honda", "civic", "silver", "sedan", 74.99, false);
		cars.put("5", new Car("nissan", "sentra", "gray", "sedan", 144.99, false);
		cars.put("6", new Car("chevrolet", "silverado", "gray", "truck", 64.99, true);
		cars.put("7", new Car("bmw", "5 series", "gray", "sedan", 94.99, true);
		cars.put("8", new Car("jeep", "gladiator", "green", "suv", 99.99, false);
		cars.put("9", new Car("chevrolet", "impala", "silver", "sedan", 64.99, true);
		cars.put("10", new Car("honda", "civic", "silver", "sedan", 99.99, false);
		cars.put("11", new Car("jeep", "wrangler", "green", "suv", 39.99, true);
		cars.put("12", new Car("hyundai", "elantra", "red", "sedan", 149.99, true);
		cars.put("13", new Car("chevrolet", "impala", "gold", "sedan", 114.99, false);
	}

	static void show() {
	}

	static void reserve(Scanner console) {

		//TODO: Read car identification and validate it exists
		System.out.println("Enter car ID: [q/quit] ");
		String carId = console.next();

		boolean isAvailable = cars.containsKey(carId) && !cars.get(carId).isReserved();

		if (!isAvailable) {
			System.out.println("The car is not available, returning to menu");
		} else {
			//TODO: Display car details and get user confirmation
			System.out.print(String.format("""

						==============================
						Selected car

						[x] %s
						\t%s %s
						\t%f

						Would you like to reserve this car? [y/n]\s
						""", 
						cars.get(carId).getType(),
						cars.get(carId).getMake(),
						cars.get(carId).getModel(),
						cars.get(carId).getPrice()));

			char userInput = console.next().charAt(0);

			switch (userInput) {
				case 'y':
					cars.get(carId).setReserved("true");
					System.out.println("Reservation complete");
					break;
				case 'n':
					System.out.println("Cancelling reservation, returning to menu");
					break;
				default:
					System.out.println("An error has occurred, returning to menu");
		}
	}
}
