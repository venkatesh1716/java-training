package com.trimindtech.training.day2;

import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        int qnt;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1 for products");
        System.out.println("enter 2 for products");
        System.out.println("enter 3 for products");
        System.out.println("enter 4 for products");
        int ch = sc.nextInt();
        System.out.println("enter quantity");
        qnt = sc.nextInt();
        switch (ch){
            case 1:
                double amt = qnt*2.98;
                System.out.println("amount is"+amt);
                break;
            case 2:
                 amt = qnt*4.50;
                System.out.println("amount is"+amt);
                break;
                case 3:
                 amt = qnt*9.98;
                System.out.println("amount is"+amt);
                break;
                case 4:
                amt = qnt*4.49;
                System.out.println(amt);
                break;
                default:
                    System.out.println("error");
        }
    }
}
