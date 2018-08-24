package javaStudy.classExam;

public class VariableScopeExam {

	int globalScope = 10 ;
	private static int staticVal =  50 ;
//	localScope =  ;
//	value = ;
//	staticVal = ;
	
	public void scopeTest(int value) {
		int localScope = 20 ;
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(value2);
		
	}
	
	
	
	/**
	 * @return the staticVal
	 */
	public static int getStaticVal() {
		return staticVal;
	}


	/**
	 * @param staticVal the staticVal to set
	 */
	public static void setStaticVal(int staticVal) {
		VariableScopeExam.staticVal = staticVal;
	}


	public static void main(String[] args) {
		VariableScopeExam vse = new VariableScopeExam() ;
		System.out.println(vse.globalScope);
		
		System.out.println(vse.getStaticVal());

		
		VariableScopeExam vse2 = new VariableScopeExam() ;
		System.out.println(vse2.globalScope);
		
		System.out.println(vse2.getStaticVal());
		
		
		vse.globalScope = 10 ;
		vse2.globalScope = 20 ;
		
		// static variable 은 객체를 인스턴스하도라도 같은 저장소를 사용한다.
		vse.setStaticVal(10) ;
		System.out.println(vse.getStaticVal());
		System.out.println(vse2.getStaticVal());
		
		vse2.setStaticVal(100) ;
		System.out.println(vse.getStaticVal());
		System.out.println(vse2.getStaticVal());
		
		
	}

}
