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
		
		
	}

}
