package assignment;

public class conditionalStatements {

	public static void main(String[] args) {
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = false;
		double debtToIncomeRatio = 35.0;

		if (creditScore > 750) {
			System.out.println(customerName + "is eligible for the loan (automatically approved).");
		} else if (creditScore >= 650 && creditScore <= 750) {
			if (income >= 50000.0) {
				if (isEmployed) {
					if (debtToIncomeRatio < 40.0) {
						System.out.println(customerName + " is eligible for the loan.");
					}
					// If the DTI ratio is 40% or greater, the loan is denied.
					else {
						System.out.println(customerName + "is not eligible for the loan(DTI ratio is greater)");
					}
				} else {
					System.out.println(customerName + " is not employed (loan is denied.)");

				}

			} else {
				System.out.println(customerName + " is not eligible for the loan (income below $50,000).");

			}
		} else if (creditScore < 650) {
			System.out.println(customerName + " is not eligible for the loan (credit score below 650).");
		}

	}

}
