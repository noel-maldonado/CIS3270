package CH2;
import java.util.Scanner;

public class HW2_14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weight = in.nextDouble();
		System.out.print("Enter height in inches: ");
		double height = in.nextDouble();
		double BMI;
		BMI = (weight * 703.0) / (Math.pow(height,2)); 
		String sBMI = String.format("%.2f", BMI);
		System.out.println("BMI is " + sBMI);

	}

}
