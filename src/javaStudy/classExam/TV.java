package javaStudy.classExam;

public interface TV {
    public int MAX_VOLUME = 100;
    public int MIN_VOLUME = 0;
    public int MAX_CHANNEL = 300;
    public int MIN_CHANNEL = 0;

    public void turnOn();
    public void turnOff();
    public int changeVolume(int currVol, int chgVol);
    public int changeChannel(int currChannel, int chgChannel);
    public String isHangOn(boolean yn) ;
}
