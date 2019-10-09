package CH5;

public class HW5_18d {
	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
				}
			for (int z = 0; z < 6 - i; z++) {
				System.out.print((z + 1 + i) + " ");
				}
			System.out.println();
			}
		}
}
