package javaStudy;

public class forEachExam {

	public static void main(String[] args) {
		int[] iarr = { 10, 20, 30, 40, 50 };
		
		for( int i = 0 ; i < iarr.length ; i++) {
			int value = iarr[i] ;
			System.out.println(value);
		}
		
		
		//for each
		for(int val:iarr) {
			System.out.println(val);
		}

	}

}
