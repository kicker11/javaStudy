package javaStudy.classExam;

public class EnumExam {

	public static final String MALE = "MALE" ;
	public static final String FEMALE = "FEMALE" ;
//	private Gender gender1;
	enum Gender  { MALE, FEMALE; } 
	
	public void run() {
	    Gender gender1;
		gender1 = Gender.MALE ;
		gender1 = Gender.FEMALE ;
	}
	
	public static void main(String[] args) {
		EnumExam enumEx = new EnumExam() ;
		
		enumEx.run() ;

	}

}
