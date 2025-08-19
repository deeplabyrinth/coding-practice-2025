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

	@Override
	public String toString() {
		return String.format("...{flavor='%s', price='%f'}", flavor, price);
	}
}
