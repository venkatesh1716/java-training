package com.trimindtech.training.day2;

import java.util.Scanner;

public class Circle1 {
    public static void main(String[] args) {
        float radius;
        double area;
        System.out.println("enter the radius");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextFloat();
        if(radius >=0) {
            area = 22.0/7 * radius * radius;
            System.out.printf("area is" + area);
        }
            else{
            System.out.println("u entered -ve value");

        }
    }
}
