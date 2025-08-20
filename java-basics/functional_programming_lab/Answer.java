import java.util.*;
import java.util.stream.*;

public class Answer {

	public static List<String> filterColors(List<String> colors) {

		List<String> newColors = colors.stream()
			.filter(c -> c.contains("e"))
			.collect(Collectors.toList());

		return newColors;
	}
}
