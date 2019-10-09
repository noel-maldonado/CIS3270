package CH5;

public class HW5_7 {

	public static void main(String[] args) {
		double tuition = 100000.00;
		double YearlyIncrease = 1.05; 
		String tuitionFormated = "";
		for(int i = 0; i < 11; i++) {
			if(i > 0) {
				tuition *= YearlyIncrease;
			}
			//tuitionFormated = String.format("%.2d", tuition);
			System.out.printf("Cost of tuition for year " + i + ": $%.2f",  tuition);
			System.out.println();
		}
		double fourYearTuition = 0;
		for (int i =0; i < 4; i++) {
			fourYearTuition += tuition;
			if( i < 3) {
			tuition *= YearlyIncrease;
			}
		}
		//String fourYearTuitionFormated = String.format("%.2d", fourYearTuition);
		System.out.println();
		System.out.printf("Cost of tuition for four years after the tenth year is $%.2f", fourYearTuition);

	}

}
