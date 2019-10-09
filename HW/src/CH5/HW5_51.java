package CH5;
import java.util.Scanner;
public class HW5_51 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String s1 = in.nextLine();
		System.out.print("Enter the second string: ");
		String s2 = in.nextLine();
		int ind = 0;
		String prefix = "";	
		while (s1.charAt(ind) == s2.charAt(ind)) {
			prefix += s1.charAt(ind);
			ind++;
		}
		if (prefix.length() > 0)
			System.out.println("The commmon prefix between \"" + s1 + "\" and \"" + s2 + "\" is " + prefix);
		else
			System.out.println(s1 + " and " + s2 + " do not have a commmon prefix");
	}
}