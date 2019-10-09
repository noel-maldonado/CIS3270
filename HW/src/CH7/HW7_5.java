package CH7;

import java.util.Scanner;

public class HW7_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] numbers = new int[10]; 
		int num; 
		int count = 0; 
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			num = in.nextInt();
			if (dist(numbers, num)) {
				numbers[count] = num;
				count++; 
			}
		}
		
		
		System.out.println("The number of distinct numbers is " + count);
		System.out.print("The distinct numbers are");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0)
				System.out.print(" " + numbers[i]);
		}
		System.out.println();
	}
	public static boolean dist(int[] a, int num) {
		for (int i = 0; i < a.length; i++) {
			if (num == a[i])
				return false;
		}
		return true;
	}
}