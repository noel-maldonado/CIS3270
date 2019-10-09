package CH5;

public class HW5_24 {
	public static void main(String[] args) {
		double sum = 0.0;
		for (double i = 1.0; i <= 97.0; i += 2) {
			sum += (i / (i + 2));
		}
		System.out.print("The sum of the series is " );
		System.out.printf("%.2f", sum);
	}
}
