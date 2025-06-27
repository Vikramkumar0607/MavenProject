package assignment;

public class ArraysandLoops10 {

	public static void main(String[] args) {
		int[] number = {12 ,34,11,36,87,98,93};
		int temp =0;
		for(int i=0;i <number.length;i++) {
			for(int j=1+i; j<number.length;j++) {
				if(number[i] < number[j]) {

					temp= number[i];
					number[i]=number[j];
					number[j]=temp;


				}
			}
		}
		// Printing the second largest number (at index 1)
		System.out.println("Second largest number is :" + number[1]);

		// Printing the third largest number (at index 2)
		System.out.println("Third largest number is :" + number[2]);
	}

}
