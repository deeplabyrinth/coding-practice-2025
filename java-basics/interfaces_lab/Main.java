public class Main {
	
	public static void main(String() args) {
		
		String name = "golf shirt";
		double price = 24.99;
		String size = "large";
		String color = "grey";
		
		Shirt Shirt = Answer.buyShirt(name, price, size, color);
		System.out.println(String.format("Name: %s\nPrice: %f\nSize: %s\nColor: %s\n", shirt.getName(), shirt.getPrice(), shirt.getSize(), shirt.getColor());
	}
}
