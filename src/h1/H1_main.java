package h1;

public class H1_main {

	public static void main(String[] args) {
		int zone;
		double price;

		zone = 42;

		switch (zone) {
		case 1 -> price = 2.0;

		case 2 -> price = 2.35;

		case 3, 4 -> price = 2.85;

		case 5 -> price = 3.55;

		default -> price = 4;
		}

		//System.out.println(price);
	}

}
