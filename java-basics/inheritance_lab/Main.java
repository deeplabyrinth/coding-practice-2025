public class Main {

	public static void main(String[] args) {

		var cake = Answer.createCake();
		var birthdayCake = Answer.createBirthdayCake();
		var weddingCake = Answer.createWeddingCake();

		System.out.println(cake.toString());
		System.out.println(birthdayCake.toString());
		System.out.println(weddingCake.toString());
	}
}
