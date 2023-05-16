
public class SumTotal {

	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		int count2 = 0;
		while (i <= 50) {
			count += i;
			i++;
		}
		System.out.println("Adding number 1 to 50 using while loop."
				+ "\nSum total is : " + count);
		for (int j = 1; j <= 50; j++) {
			if (j % 7 == 0) {
				
			} else {
				count2 += j;
			}
		}
		System.out.println("Adding number 1 to 50 not include number divisible by 7 using for\r\n"
				+ "loop."
				+ "\nSum total is : " + count2);
	}

}
