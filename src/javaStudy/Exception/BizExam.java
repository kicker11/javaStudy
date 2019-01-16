package javaStudy.Exception;

public class BizExam {

	public static void main(String[] args) {
		BizServie biz = new BizServie() ;
		try {
		biz.bizMethod(5);
		biz.bizMethod(-3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
