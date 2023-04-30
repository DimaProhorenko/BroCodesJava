import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbers {
	
	public static List<Integer> checkIfPrime(int n) {
		List<Integer> primeNumbers = new ArrayList<>();
		
		for (int numberToCheck = 2; numberToCheck <= n; numberToCheck++) {
			boolean isPrime = true;
			
			for (int factor = 2; factor <= numberToCheck/2; factor++) {
				if (numberToCheck % factor == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				primeNumbers.add(numberToCheck);
			}
		}
		
		return primeNumbers;
	}
	
	public static List<Integer> firstPrimeNumbers(int n) {
		List<Integer> primeNumbers = new ArrayList<>();
		int numberToCheck = 2;
		int counter = 0;
		
		while (counter < n) {
			boolean isPrime = true;
			
			for (int factor = 2; factor <= numberToCheck/2; factor++) {
				if (numberToCheck % factor == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				primeNumbers.add(numberToCheck);
				counter++;
			}
			numberToCheck++;
		}
		
		
		return primeNumbers;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number up to which to check: ");
		int n = scanner.nextInt();
//		List<Integer> primeNumbers = checkIfPrime(n);
		List<Integer> primeNumbers = firstPrimeNumbers(n);
		
		
		
		System.out.println("Prime numbers are: " + Arrays.toString(primeNumbers.toArray()));
	}
}
