package CH2;
import java.util.Scanner;
public class HW2_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT: ");
		// grab offset  
		int offset = in.nextInt();
		// convert offset to seconds
		offset = offset * 60 * 60;
		// grab systems current time in milliseconds (GMT) 
		long milliseconds = System.currentTimeMillis();
		// convert to seconds by dividing by 1000 and adding offset seconds
		long seconds = (milliseconds / 1000) + offset;
		// grab current seconds by using % to find remainder of 60
		long cseconds = seconds % 60;
		//add padding
		String CurrentSeconds = String.format("%02d", cseconds);
		// grab minutes by dividing 60 which will remove the seconds
		long minutes = seconds / 60;
		// grab current minutes 
		long cminutes = minutes % 60;
		String CurrentMinutes = String.format("%02d", cminutes);
		// grab hours 
		long hours = minutes / 60;
		// grab current hour by adding the offset and getting the remainder of hours
		long chours = hours % 24;
		String CurrentHour = String.format("%02d", chours);
		System.out.println("Current time is " + CurrentHour + ":" + CurrentMinutes + ":" + CurrentSeconds);
		
		
	}

}
