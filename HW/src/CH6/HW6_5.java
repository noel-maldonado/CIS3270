package CH6;
import java.util.Scanner;
public class HW6_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		displaySortedNumbers(n1, n2, n3);
	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double temp;
		if (num3 < num1 && num3 < num2) {
				temp = num1;
				num1 = num3;
				num3 = temp;
		} else if (num2 < num1 && num2 < num3) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.println(num1 + " " + num2 + " " + num3);
	}
}