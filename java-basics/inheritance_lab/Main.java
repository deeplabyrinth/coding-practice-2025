public class Main {

	public static void main(String[] args) {

		var cake = Answer.createCake();
		var birthdayCake = Answer.createBirthdayCake();
		var weddingCake = Answer.createWeddingCake();

		String cakeObjectName = cake.getClass().getName();
		String birthdayCakeObjectName = birthdayCake.getClass().getName();
		String weddingCakeObjectName = weddingCake.getClass().getName();

		System.out.println(cake.toString(cakeObjectName));
		System.out.println(birthdayCake.toString(birthdayCakeObjectName));
		System.out.println(weddingCake.toString(weddingCakeObjectName));
	}
}
