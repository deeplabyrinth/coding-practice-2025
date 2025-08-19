public class Cake {

	private String flavor;
	private double price;

	public Cake() {
		this("vanilla");
	}

	public Cake(String flavor) {
		setFlavor(flavor);
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFlavor() {
		return flavor;
	}

	public double getPrice() {
		return price;
	}

	//Overload
	public String toString(String objectName) {
		return String.format("%s{flavor='%s', price='%f'}", objectName, flavor, price);
	}
}
