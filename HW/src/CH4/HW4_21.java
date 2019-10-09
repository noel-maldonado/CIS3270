package CH4;
import java.util.Scanner;
public class HW4_21 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a SSN: ");
	String s = in.nextLine();
	if (s.length() != 11 || s.charAt(3) != '-' || s.charAt(7) != '-' ) {
		System.out.println(s + " is an invalid social security number");
		System.exit(0);
	}
	if((Character.isDigit(s.charAt(0))) && (Character.isDigit(s.charAt(1)))
			&& (Character.isDigit(s.charAt(2))) && (Character.isDigit(s.charAt(4))) 
			&& (Character.isDigit(s.charAt(5))) && (Character.isDigit(s.charAt(6))) 
			&& (Character.isDigit(s.charAt(8))) && (Character.isDigit(s.charAt(9)))
			&& (Character.isDigit(s.charAt(10)))) {
		System.out.println(s + " is a valid social security number");
	}else {
		System.out.println(s + " is an invalid social security number");
	}
		
	
	
	
	
	
	
	
}
	
}
