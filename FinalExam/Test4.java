import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = input.nextInt();
		System.out.print("Last 7 primes in ascending order : ");
		lastPrimes(num);
	}
	
	public static void lastPrimes(int num) {
		int lastPrime = num - 1;
		int counter = 0;
		int[] primes = new int[7];
		for (int j = lastPrime; j >= 1; j--) {
			if (isPrime(j)) {
				if (counter < 7) {
					primes[counter] = j;
					counter++;
				}
			}
		}
		for (int i = 6; i >= 0; i--) {
			System.out.print(primes[i] + " ");
		}
	}
	
	public static boolean isPrime(int num) {
		for (int i = 2; i <= (num / 2); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
