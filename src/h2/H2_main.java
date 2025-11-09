package h2;

public class H2_main {
	public static void main(String[] args) {
		boolean x, y, a, b, c;
		int input;

		x = true;
		y = false;
		a = true;
		b = false;
		c = true;
		input = 10;

		switch (input) {
		case 0:
			x = false;
			y = false;
			break;
		case 1:
			x = false;
			y = true;
			break;

		case 10:
			x = true;
			y = false;
			break;

		case 11:
			x = true;
			y = true;
			break;
		default:
			System.out.println("Fehlerhafter Input!");
		}

		a = x && y;
		b = x || y;
		if ((x && !y) || (!x && !y)) {
			c = true;
		} else {
			c = false;
		}

		// System.out.println("X: " + x + "\nY: " + y + "\nA: " + a + "\nB: " + b +
		// "\nC: " + c);
	}
}
