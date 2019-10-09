package CH6;
import java.util.Scanner;
public class HW6_18 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter a string for password: ");
		String password = in.nextLine();
		System.out.println(
			(isValidPassword(password) ? "Valid " : "Invalid ") + "Password");
	}
	public static boolean isValidPassword(String pass) {
		final int length = 8;
	    final int dig = 2;	
		boolean validPass = 
			pass.length() >= length 
			&& 
			isOnlyLettersAndDigits(pass) 
			&&
			hasNDigits(pass, dig);

		return validPass;
	}
	public static boolean isOnlyLettersAndDigits(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isLetterOrDigit(password.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public static boolean hasNDigits(String password, int n) {
		int numberOfDigits = 0;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				numberOfDigits++;
			}
			if (numberOfDigits >= n) {
				return true;
			}
		}
		return false;
	}
}