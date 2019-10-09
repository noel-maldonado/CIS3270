package CH6;
import java.util.Scanner;
public class HW6_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter a positive integer: ");
		int num = in.nextInt();
		System.out.println(num + (isPalindrome(num) ? " is " : " is not ") + "a palindrome.");
	}

	public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
	}

	public static int reverse(int number) {
		String or = number + ""; 
		String rev = ""; 	
		for (int i = or.length() - 1; i >= 0; i--) {
			rev += or.charAt(i);
		}
		return Integer.parseInt(rev); 
	}
}






