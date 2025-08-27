import java.util.LinkedList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>(Arrays.asList("Mercury", "Venus", "Mars"));
		String newWord = "Earth";
		int index = 1;

		myList = updateLinkedList(myList, newWord, index);
		System.out.println(myList);
	}

	static LinkedList<String> updateLinkedList(LinkedList<String> myList, String newWord, int index) {
		myList.add(index, newWord);

		return myList;
	}
}


