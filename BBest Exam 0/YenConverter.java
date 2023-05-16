import java.util.Scanner;

public class YenConverter {

	public static void main(String[] args) {
		//initialize scanner
		Scanner input = new Scanner(System.in);
		
		double value = 0;
				
		//Prompt user for month and year input
		System.out.print("Enter the exchange rate from dollars to YEN: ");
		double exchangeRate = input.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to YEN and 1 vice versa: ");
		int choice = input.nextInt();
		
		if (choice == 0) {
			System.out.print("Enter the dollar amount: ");
			value = input.nextDouble();
			System.out.print("$" + value + " is ");
			double num = (value * exchangeRate);
			System.out.printf("%.1f%s", num, " Yen");
		} else if (choice == 1) {
			System.out.print("Enter the YEN amount: ");
			value = input.nextDouble();
			System.out.print("" + value + " YEN is $");
			double num = (value / exchangeRate);
			System.out.printf("%.2f", num);
		} else {
			System.out.println("Incorrect input");
		}
	}

}
