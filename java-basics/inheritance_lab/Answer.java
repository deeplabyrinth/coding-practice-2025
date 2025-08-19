public class Answer {

	public Cake createCake() {

		Cake cake = new Cake();
		cake.setPrice(29.99);

		return cake;
	}

	public BirthdayCake createBirthdayCake() {

		BirthdayCake birthdayCake = new BirthdayCake();
		birthdayCake.setPrice(9.99);

		return birthdayCake;
	}

	public WeddingCake createWeddingCake() {

		WeddingCake weddingCake = new WeddingCake();
		weddingCake.setPrice(349.99);

		return weddingCake;
	}
}
