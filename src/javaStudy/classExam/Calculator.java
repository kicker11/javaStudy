package javaStudy.classExam;

public interface Calculator {
	public int plus(int i, int j) ;
	public int multiple( int i, int j) ;
	
	default int execPlus(int i, int j) {
		return (i +j) ;
	}	

	public static int execMultiple(int i, int j) {
		return (i * j) ;
	}

}
