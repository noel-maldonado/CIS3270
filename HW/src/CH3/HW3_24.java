package CH3;
public class HW3_24 {
	public static void main(String[] args) {
	int num = ((int) (Math.random() * 13)) + 1;
	int type = ((int) (Math.random() * 4)) + 1;	
	if (num == 1 && type == 1 ) {
		System.out.println("The card you picked is Ace of Clubs");
	}else if (num == 1 && type == 2 ) {
		System.out.println("The card you picked is Ace of Diamonds");
	}else if (num == 1 && type == 3 ) {
		System.out.println("The card you picked is Ace of Hearts");
	}else if (num == 1 && type == 4 ) {
		System.out.println("The card you picked is Ace of Spades");
	}else if (num == 11 && type == 1 ) {
		System.out.println("The card you picked is Jack of Clubs");
	}else if (num == 11 && type == 2 ) {
		System.out.println("The card you picked is Jack of Diamonds");
	}else if (num == 11 && type == 3 ) {
		System.out.println("The card you picked is Jack of Hearts");
	}else if (num == 11 && type == 4 ) {
		System.out.println("The card you picked is Jack of Spades");
	}else if (num == 12 && type == 1 ) {
		System.out.println("The card you picked is Queen of Clubs");
	}else if (num == 12 && type == 2 ) {
		System.out.println("The card you picked is Queen of Diamonds");
	}else if (num == 12 && type == 3 ) {
		System.out.println("The card you picked is Queen of Hearts");
	}else if (num == 12 && type == 4 ) {
		System.out.println("The card you picked is Queen of Spades");
	}else if (num == 13 && type == 1 ) {
		System.out.println("The card you picked is King of Clubs");
	}else if (num == 13 && type == 2 ) {
		System.out.println("The card you picked is King of Diamonds");
	}else if (num == 13 && type == 3 ) {
		System.out.println("The card you picked is King of Hearts");
	}else if (num == 13 && type == 4 ) {
		System.out.println("The card you picked is King  of Spades");
	}else if (type == 1) {
		System.out.println("The card you picked is " + num + " of Clubs");
	}else if (type == 2) {
		System.out.println("The card you picked is " + num + " of Diamonds");
	}else if (type == 3) {
		System.out.println("The card you picked is " + num + " of Hearts");
	}else if (type == 4) {
		System.out.println("The card you picked is " + num + " of Spades");
	}	
	}
}
