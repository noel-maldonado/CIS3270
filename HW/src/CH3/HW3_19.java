package CH3;
import java.util.Scanner;
public class HW3_19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three edges (length in double): ");
		double s1 = in.nextDouble();
		double s2 = in.nextDouble();
		double s3 = in.nextDouble();
		double perimeter = s1 + s2 + s3;
		if( s1 + s2 > s3 && s3 + s1 > s2 && s3+ s2 > s1) {
			System.out.println("The perimeter is " + perimeter);
		}else {
			System.out.println("The input is invalid");
		}
	}
}