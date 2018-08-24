package javaStudy.classExam;

import javaStudy.OperatorExam;


public class CreatorTest {


	public static void main(String[] args) {
		//Car c1 = new Car() ;
		Car c2 = new Car("소방자");
		Car c3 = new Car("구급자");

		System.out.println(c2.name) ;
		System.out.println(c3.name) ;
		
		OperatorExam opEx  = new OperatorExam() ;
	}

}
