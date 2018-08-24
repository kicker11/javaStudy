package javaStudy.classExam;

public class MethodOverloadExam {

	public static void main(String[] args) {
		MyClass2 m = new MyClass2() ;
		
		System.out.println(m.plus(10, 20));
		System.out.println(m.plus(10, 20, 30));
		System.out.println(m.plus("My ", "Test"));

	}

}
