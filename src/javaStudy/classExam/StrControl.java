package javaStudy.classExam;

public class StrControl {

	public void run() {
		String str = new String() ;
		
		str = "Hellow" ;
		myIntPrint(str.length()) ;

		myStrPrint("your brother", " is funny guy.") ;
	}
	
	public void myIntPrint(int val) {
		System.out.println(val);
	}
	
	public void myStrPrint(String val1, String val2) {
		System.out.println(val1);
		System.out.println(val2);
		
		System.out.println(val1.concat(val2));
		System.out.println(val1);
		System.out.println(val2);
		
		val1 = val1.concat(val2);
		System.out.println(val1);
		System.out.println(val2);

		System.out.println(val1.substring(0));
		System.out.println(val2.substring(2, 5));
			
	}
	
	public static void main(String[] args) {
		StrControl strCont = new StrControl() ;
		strCont.run() ;
	}

}
