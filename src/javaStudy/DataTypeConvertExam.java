package javaStudy;

public class DataTypeConvertExam {

	public static void main(String[] args) {

		// 묵시적 형 변환
		int i = 50000;
		long l = i;

		System.out.println(l);

		// 강제적 형 변환(type casting )
		long l2 = 5;
		int i2 = (int) l2;

		System.out.println(i2);

	}

}
