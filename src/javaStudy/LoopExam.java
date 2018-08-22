package javaStudy;

import java.util.Scanner;

public class LoopExam {

	public static void main(String[] args) {
		int i = 0 ;
		
		while ( i < 10) {
			System.out.println(i);
			i++ ;
		}
		
		int sum = 0;
		i = 1;
		while ( i < 101) {
			sum += i;
			System.out.println(sum);
			i++ ;
		}
		
		
		/**
		 * do while() : 무조건 해당 코드를 한 번은 수행한다.
		 */
		int val = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			val = scan.nextInt();
			System.out.println("입력받은 값 : " + val);
		} while(val != 10) ;
		scan.close();
		
		/**
		 * for loop 
		 */
		
		int total = 0;
		for ( int j = 1; j < 101; j++) {
			total += j ;
		}
		
		System.out.println(total);
		
		int total2 = 0;
		for ( int j = 1; j < 101; j++) {
			if ( (j % 2) == 0) {
				total2 += j ;
			} else {
				continue ;
			}
		}
		
		System.out.println(total2);
		
		int total3= 0;
		for ( int j = 1; j < 101; j++) {
				total3 += j ;
				if ( j == 50) {
					break ;
				}
		}
		
		System.out.println(total3);		
		
		
	} // enf of main
}	// end of class
