package CH6;
import java.util.Scanner;
public class HW6_23 {
		/** Main Method */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: " );
		String word = in.nextLine();
		System.out.print("Enter a character: ");
		String ch = in.nextLine();
		char a = ch.charAt(0);
		System.out.println("The number of occurrences of \"" + ch + "\" in \'" + word + "\" is: " + count(word, a));

	}
	public static int count(String str, char a) {
		int rep = 0;
		for (int i = 0; i < str.length(); i++) {
			if (a == str.charAt(i))
				rep++;
		}
		return rep;
	}
}