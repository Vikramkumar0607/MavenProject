package assignment;
import java.util.Iterator;

public class trianglepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 5;
		for (int i=0; i<rows;i++) {
			for(int j =i; j<rows-1;j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		int row = 5;
		for (int i=0; i<row;i++) {
			for(int j =0; j<rows;j++) {
				if(i+j >=row-1) {
					System.out.print("*");
				} else  {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}



	}

}

