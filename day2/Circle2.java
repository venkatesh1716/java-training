package com.trimindtech.training.day2;

import java.util.Scanner;

import static java.lang.System.exit;

public class Circle2 {
    public static void main(String[] args) {
        double area;
        float radius;
        System.out.println("enter the radius");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextFloat();
        while(radius>=0){
            area = 22.0/7 * radius * radius;
            System.out.printf("area is" + area);
            exit(0);
        }
        System.out.println("u entered -ve value plz enter +ve value");
        System.out.println("enter the radius");
        Scanner scr = new Scanner(System.in);
        radius = scr.nextFloat();

    }
}

/*
Scanner sr = new Scanner(System.in);

do{
sout("enter the radius");
radius = sc.nextFloat();
}while(radius<0)
area = 22.0/7 * radius * radius;
sout("area is"+area);
 */