package CH1;

public class HW1_11 {

	public static void main(String[] args) {
		System.out.println("Current Population: 312,032,496. \n"
				+ "One birth every seven seconds. \n"
				+ "One death every thirteen seconds. \n"
				+ "One new immigrant every forty-five seconds.");
		System.out.println("Population projection per year equals: \n"
				+ "Current populations + (birth per year + immigrant per year - death per year)");
		System.out.print("Population in one year equals: ");
		System.out.print((312032496 + ((31536000/7) - (31536000/13) + (31536000/45))));
		System.out.println();
		
		
		
		
	}

}
