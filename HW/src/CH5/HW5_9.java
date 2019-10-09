package CH5;
import java.util.Scanner;
public class HW5_9 {
	public static void main(String[] args) {
		// create new Scanner 
		Scanner in = new Scanner(System.in);
		// Prompt user how many students 
		System.out.print("Enter the number of students: ");
		// create students variable and 
		int students = in.nextInt();
		double topScore = 0.0;
		String topScorer = "";
		double secondTopScore = 0.0;
		String secondTopScorer = "";
		String student = "";
		double score = 0.0;
		for(int i = 0; i < students; i++) {
			System.out.print("Enter a student name: ");
			student = in.next();
			System.out.print("Enter a student score: ");
			score = in.nextDouble();
			if (i == 0) {
				topScore  = score;
				topScorer = student;
			}else if (i == 1 && score > topScore){
				secondTopScore = topScore;
				secondTopScorer = topScorer;
				topScore = score;
				topScorer = student;
			}else if (i == 1) {
				secondTopScore = score;
				secondTopScorer = student;
			}else if ( i > 1 && score > topScore) { 
				secondTopScore = topScore;
				secondTopScorer = topScorer;
				topScore = score;
				topScorer = student;
			}else if (i > 1 && score > secondTopScore) {
				secondTopScore = score;
				secondTopScorer = student;
			}
		}
		System.out.println("Top two students: ");
		System.out.println(topScorer + "'s score is " + topScore);
		System.out.println(secondTopScorer + "'s score is " + secondTopScore);

	}
}