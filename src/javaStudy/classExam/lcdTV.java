package javaStudy.classExam;

public class lcdTV implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV turn On");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV turn Off");
	}

	@Override
	public int changeVolume(int currVol, int chgVol) {
		// TODO Auto-generated method stub
		if ( (currVol + chgVol) > MIN_VOLUME && (currVol + chgVol) <= MAX_VOLUME ) {
			System.out.println(String.format("Volume  %d Changed", chgVol));
			currVol += chgVol ;
		} else {
			System.out.println(String.format("Volume range is not support. %d volume.", (currVol + chgVol)));
		}
		return currVol ;
	}

	@Override
	public int changeChannel(int currChannel, int chgChannel) {
		// TODO Auto-generated method stub
		if ( (currChannel + chgChannel) > MIN_CHANNEL && (currChannel + chgChannel) <= MAX_CHANNEL ) {
			System.out.println(String.format("Channel  %d Changed", chgChannel));
			currChannel += chgChannel ;
		} else {
			System.out.println(String.format("Channel %d is not support. You keep  %d channel.", (currChannel + chgChannel), currChannel));
		}
		return currChannel ;
	}	

	@Override
	public String isHangOn(boolean yn) {
		// TODO Auto-generated method stub
		if (yn = true) {
			return "벽걸이형";
		}else {
			return "스탠드형" ;
		}
		
	}

}
