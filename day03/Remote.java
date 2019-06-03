package com.trimindtech.training.day03;

public class Remote {
    private boolean isTVOn;
    private int currentVolume;
    private int currentChannel;

    public void start() {
        this.isTVOn = true;
        System.out.println("tv is on");
    }

    public void increaseChannel() {
        if (!this.isTVOn) {
            System.out.println("TV is not on,pls start TV");
            return;
        }
            this.currentChannel++;
            System.out.println("channel increased "+this.currentChannel);
        }


    public void increaseVolume()
    {
        if (!this.isTVOn) {
            System.out.println("TV is not on,pls start TV");
            return;
        }
        this.currentVolume++;
        System.out.println("volume is increased"+this.currentVolume);
        return;
    }
    public void decreaseVolume()
    {
        if (this.isTVOn) {
            System.out.println("TV is not on,pls start TV");
            return;}
        this.currentVolume--;
        System.out.println("volume decreased"+this.currentVolume);
    }
    public void decreaseChannel()
    {
        if (this.isTVOn) {
        System.out.println("TV is not on,pls start TV");
        return;
        }
        this.currentChannel--;
        System.out.println("channel decreased"+this.currentChannel);

    }
}

