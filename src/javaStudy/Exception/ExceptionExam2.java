package javaStudy.Exception;

public class ExceptionExam2 {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;

		try {
			int k = divide(i, j);
			System.out.println(k);
		} catch (IllegalArgumentException ie) {

			System.out.println("Error : " + ie.toString());
			System.out.println("Error : " + ie.getMessage());
		}
	}

	public static int divide(int i, int j) throws IllegalArgumentException {
		if (j == 0) {
			throw new IllegalArgumentException("0 으로 나눌 수 없습니다.");
		} else {
			int k = i / j;
			return k;
		}
	}
}
