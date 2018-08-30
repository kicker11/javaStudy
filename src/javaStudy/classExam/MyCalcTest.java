package javaStudy.classExam;

public class MyCalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new MyCalc() ;
		
		int i, j ;
		i = 100 ; 
		j = 5 ;
		
		System.out.println(cal.plus(i, j)) ;
		System.out.println(cal.multiple(i, j)) ;
		System.out.println(cal.execPlus(i, j)) ;
		System.out.println(Calculator.execMultiple(i, j) );

	}

}
