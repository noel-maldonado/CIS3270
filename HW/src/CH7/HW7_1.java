package CH7;

import java.util.Scanner;
public class HW7_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the nubmer of students: ");
		int[] scores = new int[in.nextInt()];
		char[] grades = new char[scores.length];
		System.out.print("Enter " + scores.length + " scores: ");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = in.nextInt();
		}
		int max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > max)
				max = scores[i];
		}
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= max - 10)
				grades[i] = 'A';
			else if (scores[i] >= max - 20)
				grades[i] = 'B';
			else if (scores[i] >= max - 30)
				grades[i] = 'C';
			else if (scores[i] >= max - 40)
				grades[i] = 'D';
			else
				grades[i] = 'F';
		}
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
		}
	}	
}