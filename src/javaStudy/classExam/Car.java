package javaStudy.classExam;

public class Car {

	// field 선언 :  type 필드명
	// 델파이의 type 과 비슷
	String name ;
	int number ;
	
	public Car(String name) {
		this.name = name ;
	}
	
	
	public Car() {
//		this.name = "no name" ;
//		this.number = 0 ;
		this("no name", 0) ;
	}
	

	
	public Car(String name, int number) {
		this.name = name ;
		this.number = number ;
	}
		
	
	
	
	public int fw(int curr, int val) {
	    curr += val ;
	    System.out.println(String.format("Forward %d Steps", val));
	    curr = printCurr(curr) ;
		return curr ;
		
	}
	
	public int bw(int curr, int val) {
		curr -= val ;
		System.out.println(String.format("Backward %d Steps", val));
		curr = printCurr(curr) ;
		return curr ;
	}	
	
	public int printCurr(int curr) {
		System.out.println(String.format("Current Step : %d", curr));
		for(int i = 1; i <= curr; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
		return curr ;
	}
	
	public void run() {
		System.out.println("달린다") ;
	}
} //end of class Car
