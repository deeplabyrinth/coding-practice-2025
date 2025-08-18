package objects_lab;

public class Answer {

	static Car buildCar(String make, String model, int year, String, color) {

		Car car = new Car();

		return car;
	}
}

public class Car {

	private String make;
	private String model;
	private int year;
	private String color;

	public Car(String make, String model) {
		setMake(make);
		setModel(model);
	}

	public void setMake(String make) {
		this.make = make;
	}

}
