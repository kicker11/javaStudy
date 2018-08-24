package javaStudy.classExam;

public class Duck extends Bird {

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("꽥괙");
	}

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.sing();
		duck.fly();

	}

}
