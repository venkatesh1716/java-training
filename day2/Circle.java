package com.trimindtech.training.day2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        double radius;
        double area;
       final double PI = 22.0/7;
        /*
        * code to read data from the console
        * */
        System.out.println("enter radius");
        Scanner scan= new Scanner(System.in);
        radius=scan.nextDouble();
        area = PI*radius*radius;
        /*
        * print area
        * */
        System.out.println(area);
    }
}
