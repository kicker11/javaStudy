package javaStudy.Exception;

public class ExceptionExam {

	public static void main(String[] args) {
		/*
		 * try {} catch (exception e) {} finally {}
		 */
		int i = 10;
		int j = 5;
		try {
			int k = i / j ;
			System.out.println(k);
		} catch (Exception e){
			System.out.println("Error : " + e.getMessage());
			System.out.println("Error : " + e.toString());
		} finally {
			System.out.println("Anyway, main end !!") ;			
		}

	}

}
