package com.trimindtech.training.day04;

public class ImagingRunner {
    public static void main(String[] args) {
        Imaging im = new Imaging();
        System.out.println(im.toString());
        Imaging img = new Imaging("elg","Payment",5,600);
        System.out.println(img.toString());
        img.calcCollectionPerGroup();
    }
}
