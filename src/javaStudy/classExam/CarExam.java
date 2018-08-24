package javaStudy.classExam;

public class CarExam {

	public void runCarExam() {
		Car c1 = new Car("소방차") ;
		Car c2 = new Car("구급차") ;
		
		String str = new String("helloWorld") ;
		
		System.out.println(str);
		
		String str1 = "hello" ;
		String str2 = "hello" ;
		
		String str3 = new String("hello") ;
		String str4 = new String("hello") ;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		// reference memory
		if (str1 == str2) {
			System.out.println("str1 and str2 : Same reference is True");
		} else {
			System.out.println("str1 and str2 : Same reference is False");
		}
		
		if (str3 == str4) {
			System.out.println("str3 and str4 : Same reference is True");
		} else {
			System.out.println("str3 and str4 : Same reference is False");
		}
		
		// .equals() : reference value
		if (str1.equals(str2)) {
			System.out.println("str1 and str2 : Same value is True");
		} else {
			System.out.println("str1 and str2 : Same value is False");
		}
		
		if (str3.equals(str4)) {
			System.out.println("str3 and str4 : Same value is True");
		} else {
			System.out.println("str3 and str4 : Same value is False");
		}
		
		System.out.println(str3.substring(3));
		
		System.out.println(str1);
		
		
		/**
		 * Car 객체의 field use
		 */
		c1.name = "소방차"; 
		c1.number = 1234;
		
		c2.name = "구급차" ;
		c2.number = 1111 ;
		
		System.out.println(c1.name);
		System.out.println(c2.number);
		System.out.println(c2.name);
		System.out.println(c2.number);
		
		final int baseCurr = 10 ;
		int curr = baseCurr ;
		
		curr = c1.printCurr(baseCurr) ;
		curr = c1.fw(curr, 3);
		curr = c1.bw(curr, 3);
		curr = c1.fw(curr, 4);
		curr = c1.bw(curr, 8);
		curr = c1.fw(curr, 50);
	}
	
	public static void main(String[] args) {

	CarExam carEx = new CarExam() ;	
	
	carEx.runCarExam();
		
	}

}
