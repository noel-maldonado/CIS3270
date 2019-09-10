package CH3;
import java.util.Scanner;
public class HW3_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ax^2 + bx + c");
		System.out.print("Enter a, b, c: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double disc = ((Math.pow(b, 2)) + (-1 * (4 * a * c)));

		if (disc > 0) {
			double r1 = (((-1 * b) + Math.sqrt(disc))/ (2.0 * a));
			double r2 = (((-1 * b) - Math.sqrt(disc))/ (2.0 * a));	
			String r1p = String.format("%.2f", r1);
			String r2p = String.format("%.2f", r2);
			System.out.println("The equation has two roots " + r1p + " and " + r2p);
			
		} else if (disc == 0) {
			double r1 = (((-1 * b) + Math.sqrt(disc))/ (2.0 * a));
			String r1p = String.format("%.2f", r1);
			System.out.println("The equation has one root " + r1p);
			
		} else if (disc < 0) {
			System.out.println("The equation has no real roots.");
		}

		
	}

}
