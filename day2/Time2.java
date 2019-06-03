package com.trimindtech.training.day2;

import java.util.Scanner;

public class Time2 {
    public static void main(String[] args) {
        int minutes,hours;
        System.out.println("enter the minutes");
        Scanner sc = new Scanner(System.in);
        minutes = sc.nextInt();
        hours = minutes / 60;
        minutes = minutes % 60;
       // System.out.println("enter the minutes");
        System.out.println("hours" +" "+hours +" " +"and \n minutes"+" "+minutes);

    }
}
