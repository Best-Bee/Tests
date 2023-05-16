
public class Test2 {

	public static void main(String[] args) {
		System.out.printf("%-3s%3s%-8s", "  i"," ","  m(i)");
		System.out.println();
		System.out.printf("%3s%3s%8s", "----"," ","--------");
		System.out.println();
		for (int i = 1; i <= 51; i += 10) {
			System.out.printf("%1s%2d%3s%8.4f"," ",i," ",m(i));
			System.out.println();
		}
	}
	
	public static double m(int i) {
		double num = 0;
		for (int j = 1; j <= i; j++) {
			num += (((double) j) / ((2 * j) + 1));
		}
		return num;
	}
}
