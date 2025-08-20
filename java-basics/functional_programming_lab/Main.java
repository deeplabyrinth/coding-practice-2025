import java.util.*;

public class Main {

	public static void main(String[] args) {

		//List<String> colors = new ArrayList<>();

		/*colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("pink");
		colors.add("black");
		colors.add("brown");
		colors.add("yellow");
		colors.add("purple");
		colors.add("orange");
		colors.add("white");*/

		List<String> colors = List.of("red", "green", "blue", "pink", "black", "brown", "yellow", "purple", "orange", "white"); // Immutable internal concrete class

		System.out.println("Before: " + colors);
		var newColors = Answer.filterColors(colors);
		System.out.println("After: " + newColors);

	}
}
