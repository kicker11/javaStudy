package javaStudy.classExam;

public class Bus extends Car {
	public void pp() {
		System.out.println("빵빵");
	}
	
	public void run() {
		super.run() ;
		System.out.println("Bus 달린다");
	}
}
