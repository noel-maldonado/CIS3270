package CH2;
import java.util.Scanner;

public class HW2_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter subtotal and gratuity rate: ");
		double sub = in.nextDouble();
		double rate = in.nextDouble();
		double grat = sub * (rate / 100); 
		double total = grat + sub;
		System.out.println("The gratuity is " + grat + " and the total is " + total +".");
		
	}
	
	
	
}
