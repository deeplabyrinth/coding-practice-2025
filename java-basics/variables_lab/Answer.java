package variables_lab;

public class Answer {

	static String fillInTheBlank(String season, int numberOfCups, String adjective) {

		// TODO: Add variables to string block to create a story
		String story = """
			On a %s %s day, I drink a minimum of %d cups of coffee.
			""".formatted(adjective, season, numberOfCups);
		return story;
	}
}
