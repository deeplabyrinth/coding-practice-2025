package objects_lab;

public class Answer {

	static Car buildCar(String make, String model, int year, String color) {

		Car car = new Car(make, model);
		car.setYear(year);
		car.setColor(color);

		return car;
	}
}

class Car {

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

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return String.format("Car [Make: %s, Model: %s, Year: %d, Color: %s]", make, model, year, color);
	}
}
