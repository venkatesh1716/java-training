package com.trimindtech.training.day2;

import java.util.Scanner;

public class Dow {
    public static void main(String[] args) {
        int n,s=0;
        Scanner sc = new Scanner(System.in);

        do{
           /* System.out.println("enter a value");*/
            System.out.println("enter a value");
            n = sc.nextInt();
            s = s+n;
            System.out.println(s);
        }while(n!=0);
        System.out.println("sum is "+s);
    }
}
