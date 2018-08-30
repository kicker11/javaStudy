package javaStudy.classExam;

public class LcdTvTest {

	public static void main(String[] args) {
		
		int BASE_VOLUME = 50 ;
		
		lcdTV tv = new lcdTV() ;
		
		tv.turnOn();
		
		int currVol = BASE_VOLUME ;
		int currChannel = 17 ;

		currVol = tv.changeVolume(currVol, 15) ;
		System.out.println(String.format("현재 볼륨을 %d 입니다.", currVol));
		currVol = tv.changeVolume(currVol, -30) ;		
		System.out.println(String.format("현재 볼륨을 %d 입니다.", currVol));
		currVol = tv.changeVolume(currVol, -300) ;
		
		currChannel = tv.changeChannel(currChannel, 200) ;
		System.out.println(String.format("현재 채널은 %d 입니다.", currChannel));
		currChannel = tv.changeChannel(currChannel, -400) ;
		System.out.println(String.format("현재 채널은 %d 입니다.", currChannel));
		
		tv.turnOff();
		
		
		System.out.println(tv.isHangOn(true));
	}

}
