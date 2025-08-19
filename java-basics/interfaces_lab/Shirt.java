public class Shirt implements Product {

	private String name;
	private double price;
	private String size;
	private String color;

	// TODO: implement this class' methods and abstract methods
	public Shirt(String name, double price, String size, String color) {
		setName(name);
		setPrice(price);
		setSize(size);
		setColor(color);
	}

	public void setName(String name) { // implemented from Product
		this.name = name;
	}
	public void setPrice(double price) { // implemented from Product
		this.price = price;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getSize() {
		return size;
	}
	public String getColor() {
		return color;
	}
}
