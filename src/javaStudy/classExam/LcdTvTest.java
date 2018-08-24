package javaStudy.classExam;

public class LcdTvTest {

	public static void main(String[] args) {
		lcdTV tv = new lcdTV() ;
		
		tv.turnOn();
		tv.turnOff();
		tv.changeVolume(3);
		tv.changeChannel(17);
	}

}
