public class Main {

	public static void main(String[] args) {

		String[] concertSounds = Answer.performConcert();
		
		for (String sound : concertSounds) {
			System.out.println(sound);
		}
	}
}
