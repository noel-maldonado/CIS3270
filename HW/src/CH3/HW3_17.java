package CH3;
import java.util.Scanner;
public class HW3_17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int comp = (int)(Math.random() * 3);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int user = in.nextInt();

		if(comp == 0) {
			System.out.print("The computer is scissors.");
			if(user == 0) {
				System.out.print(" You are scissors too. It is a draw.");
			} 
			else if( user == 1) {
				System.out.print( " You are rock. You lost.");
			}
			else if(user == 2) {
				System.out.print( " You are paper. You lost.");
			}
		} else if (comp == 1) {
			System.out.print("The computer is rock.");
			if(user == 0) {
				System.out.print(" You are scissors. You lost.");
			} 
			else if( user == 1) {
				System.out.print( " You are rock too. It is a draw.");
			}
			else if(user == 2) {
				System.out.print( " You are paper. You lost.");
			}
		} else if(comp == 2) {
			System.out.print("The computer is paper.");
			if(user == 0) {
				System.out.print(" You are scissors. You lost.");
			} 
			else if( user == 1) {
				System.out.print( " You are rock. You lost.");
			}
			else if(user == 2) {
				System.out.print( " You are paper too. It is a draw.");
			}
		} 
		
	}
}
