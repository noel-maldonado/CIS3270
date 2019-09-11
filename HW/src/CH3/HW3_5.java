package CH3;
import java.util.Scanner;
public class HW3_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter today's day (ex. 0 for Sunday or 6 for Saturday): ");
		int present = in.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int days = in.nextInt();
		String today = "";
		String future = "";
		days = days + present;
		if (present % 7 == 0) {
			today = "Sunday";
		}else if (present % 7 == 1) {
			today = "Monday";
		}else if (present % 7 == 2) {
			today = "Tuesday";
		}else if (present % 7 == 3) {
			today = "Wednesday";
		}else if (present % 7 == 4) {
			today = "Thursday";
		}else if (present % 7 == 5) {
			today = "Friday";
		}else if (present % 7 == 6) {
			today = "Saturday";
		}
		if (days % 7 == 0 ) {
			future = "Sunday";
		}else if (days % 7 == 1) {
			future = "Monday";
		}else if (days % 7 == 2) {
			future = "Tuesday";
		}else if (days % 7 == 3) {
			future = "Wednesday";
		}else if (days % 7 == 4) {
			future = "Thursday";
		}else if (days % 7 == 5) {
			future = "Friday";
		}else if (days % 7 == 6) {
			future = "Saturday";
		}
		System.out.println("Today is " + today + " and the future day is " + future);	
	}
}
