package com.trimindtech.training.day2;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        //int n;
        System.out.println("enter the plan:");
        Scanner sc = new Scanner(System.in);
       int plan = sc.nextInt();
       switch (plan){
           case 1:
               System.out.println("the company pays for all");
               break;
           case 2:
               System.out.println("the company pays 4.65");
               break;
           case 3:
               System.out.println("the company pays 7.85");
               break;
           case 4:
               System.out.println("the company pays 5.50");
               break;
               default:
                   System.out.println("error");


       }
    }
}
