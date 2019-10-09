package CH7;

public class HW7_7 {
	public static void main(String[] args) {
		int[] count = new int[10];
		for (int i = 1; i <= 100; i++) {
			count[(int) (Math.random() * 10)]++;
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println("The count for " + i + "s is: " + count[i]);
		}
	}
}