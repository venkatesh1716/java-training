package com.trimindtech.training.day2;

import java.util.Scanner;

public class Condi {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter the two values");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
         int c = (a>b)? a:b;
        System.out.println(c +" "+ "is greater");
    }
}
