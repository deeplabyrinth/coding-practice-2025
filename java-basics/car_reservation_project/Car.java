public class Car {

	private String make;
	private String model;
	private String color;
	private String type;
	private double price;
	private boolean reserved;

	public Car(String make, String model, String color, String type, double price, boolean reserved) {

		setMake(make);
		setModel(model);
		setColor(color);
		setType(type);
		setPrice(price);
		setReserved(reserved);
	}

	public void setMake(String make) { this.make = make; }
	public void setModel(String model) { this.model = model; }
	public void setColor(String color) { this.color = color; }
	public void setType(String type) { this.type = type; }
	public void setPrice(double price) { this.price = price; }
	public void setReserved(boolean reserved) { this.reserved = reserved; }
	public String getMake() { return make; }
	public String getModel() { return model; }
	public String getColor() { return color; }
	public String getType() { return type; }
	public double getPrice() { return price; }
	public boolean isReserved() { return reserved; }
}
