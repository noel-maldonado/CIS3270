package CH1;

public class HW1_11 {

	public static void main(String[] args) {
		System.out.println("Current Population: 312,032,496. \n"
				+ "One birth every seven seconds. \n"
				+ "One death every thirteen seconds. \n"
				+ "One new immigrant every forty-five seconds.");
		System.out.println("Population projection per year equation: "
				+ "Current populations + (birth per year + immigrant per year - death per year)");
		System.out.print("Projected population in one year: ");
		System.out.print((312032496 + ((31536000/7) - (31536000/13) + (31536000/45))));
		System.out.println();
		System.out.print("Projected population in two years: ");
		System.out.print((312032496 + (((31536000/7) - (31536000/13) + (31536000/45) * 2))));
		System.out.println();
		System.out.print("Projected population in three years: ");
		System.out.print((312032496 + (((31536000/7) - (31536000/13) + (31536000/45) * 3))));
		System.out.println();
		System.out.print("Projected population in four years: ");
		System.out.print((312032496 + (((31536000/7) - (31536000/13) + (31536000/45) * 4))));
		System.out.println();
		System.out.print("Projected population in five years: ");
		System.out.print((312032496 + (((31536000/7) - (31536000/13) + (31536000/45) * 5))));

	}

}
