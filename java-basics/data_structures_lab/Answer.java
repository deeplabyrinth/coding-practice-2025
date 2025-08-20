import java.util.*;

public class Answer {

	public static Map<String, Integer> updateGrades(Map<String, Integer> gradebook, Map<String, Integer> makeupGrades) {

		gradebook.forEach((student, grade) -> {
			if (makeupGrades.get(student) > grade) {
				gradebook.replace(student, makeupGrades.get(student));
			}
		});

		return gradebook;

	}
}
