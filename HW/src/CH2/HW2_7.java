package CH2;
import java.util.Scanner;

public class HW2_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		int minutes = in.nextInt();
		int minutes2 = minutes;
		int years = minutes2 / 525600;
		minutes2 %= 525600;
		int days = minutes2 / 1440;
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
		
		
	}

}
