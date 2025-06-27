package assignment;

public class Powern19Assignment {
	


	public static void main(String[] args) {

		
		double xn = 2.00000;
		// Example 1:
		System.out.println("*****Example 1*****");
		double Input = 2.00000;
		int powern = 10;
		int i = 1;
		double number = 1;
		while (i <= powern) {
			number = number * Input;

			i++;
		}
		System.out.println(number);

		// Example 2:
		System.out.println("*****Example 2*****");
		double x = 2.10000;
		int n = 3;
		int j = 1;
		double numberone = 1;
		while (j <= n) {
			numberone = numberone * x;

			j++;
		}
		System.out.println(numberone);
		// Example 3:
		System.out.println("*****Example 3*****");
		double x1 = 2.00000;
		int n1 = -2;
		
		double numbertwo = 1;
		if (n1 > 0) {
			int k = 1;
			while (k <= n1) {
				numbertwo = numbertwo * x1;

				k++;
			}
		} else {
			int k = -1;
			while (k >=n1) {
				
				numbertwo = numbertwo / x1;

				k--;
			}
		}

		System.out.println(numbertwo);
		
		double xx = 2.00000; // Base number (can be any real number)
		int nn = -2;    // Exponent (can be negative, zero, or positive)
		double result = 1; // Variable to store the final result, initialized to 1

		// Case 1: If exponent is zero, any number raised to power 0 is 1
		if (nn == 0) {
			result = 1;
		}

		// Case 2: If exponent is negative
		if (nn < 0) {
			xx= 1 / xx; // Invert the base (e.g., 10 becomes 1/10)
			nn = -nn;    // Convert the exponent to positive for easier calculation
			System.out.println(nn);
			
		}

		// Loop to multiply the base 'x', 'n' times
		for(int m = 0; m < nn; m++) {
			result = result * xx; // Multiply result with base 'x' in each iteration
			System.out.println(result);
		}
		
		System.out.println(result); // Print the final result

	}

}
