package javaStudy;

public class ArrayExam {

	public static void main(String[] args) {
		int[] array1 = new int[100];
		
		for(int i = 0; i < 100; i++) {
			array1[i] = i ;
			System.out.println(array1[i]);
		}

		int[] array2 = new int[] {1,2,3,4} ;
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		
		int[] array3 = {1,2,3,4} ;
		for(int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}

		int total = 0;
		for(int i = 0; i < array3.length; i++) {
			total += array3[i] ;
			System.out.println(total);
		}		
		
		/**
		 * 2-Dimension array
		 */
		
		int [][] array2Dim = new int[3][4] ;
		
		int [][] array2DNS = new int[3][] ;
		array2DNS[0] = new int[1] ;
		array2DNS[1] = new int[2] ;
		array2DNS[2] = new int[3] ;
		
		System.out.println(array2Dim[0].length);
		System.out.println(array2DNS[0].length);
		System.out.println(array2DNS[1].length);
		System.out.println(array2DNS[2].length);
	
		
		
	}

}
