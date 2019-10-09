package CH5;

import java.util.Scanner;
public class HW5_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pos = 0;
		int neg = 0;
		int numbers = 0;
		double total = 0;
		
		System.out.print("Enter intergers ending with 0: ");
		int number = in.nextInt();
		
		if(number == 0) { 
			System.out.println("No numbers are entered exept 0");
			
		}
		while (number != 0) {
			if (number > 0) {
				pos++;
			}else {
				neg++;
			}
			numbers++;
			total += number;
			number = in.nextInt();
		}
		double ave = (double) (total / numbers); 
		System.out.println("The number of positives is " + pos);
		System.out.println("The number of negatives is " + neg);
		System.out.println("The total is " + total);
		System.out.println("The average is " + ave);
	}

}
