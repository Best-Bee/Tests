import java.util.Scanner;

public class MidTerm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal (double) number : ");
		double userData = input.nextDouble();
		System.out.println("you enter > " + userData);
		
		System.out.print("decimal " + userData + " is " + 
			convertToBinaryString(getTheWholeNumber(userData))
			+ "." +
			convertFractionToString(getTheFraction(userData)));
	}
	
	
	
	public static int getTheWholeNumber(double dec) {
		int num = (int) dec;
		return num;
	}
	
	public static double getTheFraction(double dec) {
		while (dec >= 1) {
			dec -= 1;
		}
		return dec;
	}
	
	public static String convertToBinaryString(int num) {
		String retVal = "";
		while (num >= 1) {
			if (num % 2 == 1) {
				retVal += 1;
			} else {
				retVal += 0;
			}
			num /= 2;
		}
		return revString(retVal);
	}
	
	public static String convertFractionToString(double d) {
		String retVal = "";
		int fractionMultiplier = 2;
		int count = 0;
		
		while ((d > 0) && (count < 23)) {
			if ((d < 1.0 / fractionMultiplier)) {
				fractionMultiplier *= 2;
				retVal += 0;
			} else {
				d -= (1.0 / fractionMultiplier);
				fractionMultiplier *= 2;
				retVal += 1;
			}
			count++;
		}
		return retVal;
	}
	
	//reverses the string given by going in reverse through the
	//string and adding them in order from last to first to 
	//another string (this was very useful to make this work well)
	public static String revString(String s) {
		String retVal = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			retVal += s.charAt(i);
		}
		return retVal;
	}
}
