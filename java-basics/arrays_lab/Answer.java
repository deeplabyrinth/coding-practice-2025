package arrays_lab;

public class Answer {

	int[] b = generateColumn(1, 15);
	int[] i = generateColumn(16, 30);
	int[] n = generateColumn(31, 45);
	int[] g = generateColumn(46, 60);
	int[] o = generateColumn(61, 75);

	BingoCard bingoCard = new BingoCard(b, i, n, g, o);


	return bingoCard;
}

class BingoCard {

	private int[] b, i, n, g, o;

	public BingoCard(int[] b, int[] i, int[] n, int[] g, int[] o) {
		setB(b);
		setI(i);
		setN(n);
		setG(g);
		setO(o);
	}

	public void setB(int[] b) {
		this.b = b;
	}

	public void setI(int[] i) {
		this.i = i;
	}

	public void setN(int[] n) {
		this.n = n;
	}

	public void setG(int[] g) {
		this.g = g;
	}

	public void setO(int[] o) {
		this.o = o;
	}

	public int[] getB() {
		return b;
	}

	public int[] getI() {
		return i;
	}

	public int[] getN() {
		return n;
	}

	public int[] getG() {
		return g;
	}

	public int[] getO() {
		return o;
	}

	public void printCard() {
		System.out.println(" B  I  N  G  O");
		for (int row = 0; row < 5; ++row) {
			System.out.printf("%2d %2d %2d %2d %2d%n", b[row], i[row], n[row], g[row], o[row]);
		}
	}
}
