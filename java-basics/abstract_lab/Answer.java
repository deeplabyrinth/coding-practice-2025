public class Answer {

	static Instrument addFlute() {
		return new Flute();
	}

	static Instrument addHorn() {
		return new Horn();
	}

	static Instrument addViolin() {
		return new Violin();
	}

	static String[] performConcert() {

		var flute = addFlute();
		var horn = addHorn();
		var violin = addViolin();

		String[] sounds = new String[3];

		sounds[0] = flute;
		sounds[1] = horn;
		sounds[2] = violin;

		return sounds;
	}
}
