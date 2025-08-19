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

		sounds[0] = play(flute);
		sounds[1] = play(horn);
		sounds[2] = play(violin);

		return sounds;
	}

	static String play(Instrument instrument) {
		return instrument != null ? instrument.playSound() : null;
	}
}
