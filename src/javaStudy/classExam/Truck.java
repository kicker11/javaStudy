package javaStudy.classExam;

public class Truck extends Car {
	public void truck() {
		System.out.println("Truck의 기본 생성자입니다");
	}

   public void run() {
	   super.run();
	   System.out.println("Truck 달린다");
   }
}
