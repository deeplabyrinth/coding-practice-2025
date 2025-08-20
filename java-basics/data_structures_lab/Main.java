import java.util.*;

public class Main {

	public static void main(String[] args) {

		Map<String, Integer> gradebook = new HashMap<>();

		gradebook.put("Isaac", 95);
		gradebook.put("Bob", 32);
		gradebook.put("Grace", 59);
		gradebook.put("Eve", 79);
		gradebook.put("Alice", 24);
		gradebook.put("Hannah", 55);
		gradebook.put("Charlie", 80);
		gradebook.put("Daniel", 50);
		gradebook.put("Jane", 63);

		Map<String, Integer> makeupGrades = new HashMap<>();

		makeupGrades.put("Isaac", 90);
		makeupGrades.put("Bob", 82);
		makeupGrades.put("Grace", 80);
		makeupGrades.put("Eve", 79);
		makeupGrades.put("Alice", 97);
		makeupGrades.put("Hannah", 95);
		makeupGrades.put("Charlie", 76);
		makeupGrades.put("Daniel", 89);
		makeupGrades.put("Jane", 62);

		System.out.println("1st attempt: " + gradebook);
		System.out.println("2nd attempt: " + makeupGrades);
		var updatedGrades = Answer.updateGrades(gradebook, makeupGrades);
		System.out.println("Updated gradebook: " + updatedGrades);

	}
}
