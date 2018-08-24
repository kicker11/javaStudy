package javaStudy.classExam;

//public class AccessObj{
//    private int i = 1;      // 자기 자신만 접근할 수 있습니다.
//    public int p = 3;       // 어떤 클래스든 접근할 수 있다는 것을 의미합니다.
//    protected int p2 = 4;   // 자기 자신만 접근할 수 있다는 것을 의미합니다. 이 클래스를 슈퍼클래스로 상속 받은 자식 클래스에서는 사용 가능
//}

public class AccessObj {
	public int p = 3 ;
	protected int p2  = 4 ;  // access allow same package and extends classes
	private int p3 = 5 ;   // acces allow this class
	int k = 2 ;
}
