public class Cake {

	private String flavor = "vanilla";
	private double price  = 29.99;

	public Cake(String flavor) {
		setFlavor(flavor);
	}

	public Cake(String flavor, double price) {
		setFlavor(flavor);
		setPrice(price);
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
}
