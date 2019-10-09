package CH6;
public class HW6_10 {
	public static void main(String[] args) {
		int primes = 0;	
		for (int i = 1; i < 10000; i++) {
			if (PrimeNumberMethod.isPrime(i))
				primes++; 
		}
		System.out.println("The number of prime numbers less than 10000: " + primes);
	}	
}