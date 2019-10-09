package CH6;
import java.util.Scanner;
public class HW6_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		int num = in.nextInt();
		System.out.println("The sum of the digits in " + num + " is " +
			sumDigits(num));
	}
	public static int sumDigits(long n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}
}