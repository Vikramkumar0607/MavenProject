package assignment;

import java.util.Iterator;

public class ArraysLoops {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		for(int i=1; i <=array.length;i++) {
			 for (int s = array.length - i; s > 0; s--) {
	                System.out.print(" ");
	            }

			for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
			

		}
		
		for(int i= array.length-1;i >=0; i--) {
			 for (int s = array.length - i; s > 0; s--) {
	                System.out.print(" ");
	            }

			for (int j = 1; j <= i; j++) {
             System.out.print(j + " ");
         }
         System.out.println();
			

		}
		
		 
	}

}
