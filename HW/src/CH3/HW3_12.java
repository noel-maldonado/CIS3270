package CH3;
import java.util.Scanner;

public class HW3_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a three-digit integer: ");
		int num = in.nextInt();
		int d1 = num / 100;
		int mid = num % 100;
		int d3 = (int)(mid % 10);
		mid /= 10;
		String num2s = Integer.toString(d3) + Integer.toString(mid) + Integer.toString(d1); 
		int num2 = Integer.parseInt(num2s);
		
		System.out.println(num + ((num == num2) ? " is a " : " is not a ") + "palindrome");
	}
}