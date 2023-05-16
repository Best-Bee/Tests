
public class Test1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if ((i % 5) == 0) {
				System.out.println(i + " HiFive");
			} else if ((i % 2) == 0) {
				System.out.println(i + " HiTwo");
			} else if (((i % 3) == 0) || ((i % 7) == 0)) {
				System.out.println(i + " HiThreeOrSeven");
			} else {
				System.out.println(i);
			}
		}

	}

}
