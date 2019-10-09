package CH7;
import java.util.Scanner;
public class HW7_14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int[] num = new int[5];
		System.out.print("Enter five integers: ");
		for (int i = 0; i < num.length; i++) {
			num[i] = in.nextInt();
		}

		System.out.println("The gcd of these five integers is " + gcd(num));
	}
	public static int gcd(int... numbs) {
		int gcd = 1;
		boolean d; 

		for (int i = 2; i < min(numbs); i++) {
			d = true;
			for (int e : numbs) {
				if (e % i != 0)
					d = false;
			}
			if (d)
				gcd = i;
		}
		return gcd;
	}
	public static int min(int... numbz) {
		int min = numbz[0];
		for (int e : numbz) {
			if (e < min)
				min = e;
		}
		return min;
	}
}