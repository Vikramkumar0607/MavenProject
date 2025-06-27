package assignment;

public class Assignment8ConditionalStatementsLoops {

	public static void main(String[] args) {

		int[] bankTransactions = { 50000, -2000, 3000, -15000, -200, -300, 4000, -3000 };

		int totalCredit = 0;
		int totalDebit = 0;
		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		int suspiciousTransactions = 0;
		int finalBalance = 0;
		for (int amount : bankTransactions) {

			if (amount > 0) {
				totalCredit++;
				totalCreditAmount += amount;
				if (amount > 10000) {
					System.out.println("Suspicious credit transaction with Amount: " + amount);
					suspiciousTransactions++;

				} else {
					totalDebit++;
					totalDebitAmount += amount;
					if (amount > -10000) {
						System.out.println("Suspicious credit transaction with Amount: " + amount);
						suspiciousTransactions++;
					}

				}
			}

		}
		finalBalance = totalCredit - totalDebit;

		System.out.println("********* Bank Total Summary Details************");
		System.out.println("Total Number of Credit Transcations :  " + totalCredit);
		System.out.println("Total Number of Debit Transcations :  " + totalDebit);
		System.out.println("Total Number of Credit Amount Transcations :  " + totalCreditAmount);
		System.out.println("Total Number of Debit Amount Transcations :  " + totalDebitAmount);
		System.out.println("Final remaining amount in the account: " + finalBalance);
		System.out.println("Total number of suspicious transactions: " + suspiciousTransactions);

	}
}
