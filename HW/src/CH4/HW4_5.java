package CH4;
import java.util.Scanner;
public class HW4_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		int sides = in.nextInt();
		System.out.print("Enter the length of a side: ");
		double length = in.nextDouble();
		double area = (sides * Math.pow(length, 2) / 	(4 * Math.tan(Math.PI / sides)));
		System.out.printf("The area of the polygon is %.2f", area);
	}
}