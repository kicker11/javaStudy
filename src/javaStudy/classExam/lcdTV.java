package javaStudy.classExam;

public class lcdTV implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV On");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV Off");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println(String.format("Volume  %d Changed", volume));
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println(String.format("Channel  %d Changed", channel));
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
