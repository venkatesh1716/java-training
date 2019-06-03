package com.trimindtech.training.day03;

public class RemoteRunner {
    public static void main(String[] args) {
        Remote rem = new Remote();
        rem.increaseChannel();
        rem.start();
        rem.increaseChannel();
        rem.increaseChannel();
        rem.decreaseChannel();
        rem.increaseVolume();

    }
}
