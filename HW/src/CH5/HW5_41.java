package CH5;
import java.util.Scanner;
public class HW5_41 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer (0: for end of input): ");
		int num = in.nextInt();	
		int count = 1;					
		int max = num;						
		while (num > 0) {
			System.out.print("Enter an integer (0: for end of input): ");
			num = in.nextInt();
			if (num > max) {
				max = num;
				count = 0;
			}
			if (num == max)
				count++;
		} 
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);
	}
}
