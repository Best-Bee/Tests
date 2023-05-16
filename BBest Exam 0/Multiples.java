import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		//initialize scanner
		Scanner input = new Scanner(System.in);
				
		//Prompt user for an integer
		System.out.print("Enter an integer: ");
		int num = input.nextInt();

		//calculations lets gooooo
		if ((num % 5 == 0) && !((num % 2 == 0 ) || (num % 3 == 0))) {
			System.out.println("HiFive");
		} else if ((num % 2 == 0 ) || (num % 3 == 0) && (num % 5 != 0)) {
			System.out.println("Georgia");
		} else if ((num % 2 == 0 ) || (num % 3 == 0) && (num % 5 == 0)) {
			System.out.println("HiFive Georgia");
		}
	}

}
