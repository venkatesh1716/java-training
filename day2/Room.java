package com.trimindtech.training.day2;

import java.util.Scanner;

public class Room {
    public static void main(String[] args) {
        int l=20,w=12,area;
        area = l * w;
        System.out.println("entered Length = "+l);
        System.out.println("entered Length = "+w);
        System.out.println("area is "+area);
        System.out.println("enter the length");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("enter the width");
        Scanner scr = new Scanner(System.in);
        int width = scr.nextInt();
        int ar = length * width;
        System.out.println("area is "+ar);


    }
}
