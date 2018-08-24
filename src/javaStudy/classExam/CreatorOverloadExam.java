package javaStudy.classExam;

// 생성자 오버로딩과 this
public class CreatorOverloadExam {

	public static void main(String[] args) {
	
		Car c1 = new Car() ;
		Car c2 = new Car("소방차") ;
		Car c3 = new Car("그랜저", 2222) ;
		
		System.out.println(c1.name = " " + c1.number);
		System.out.println(c2.name + " " + c3.number);
		System.out.println(c3.name + " " + c3.number);
		

	}

}
