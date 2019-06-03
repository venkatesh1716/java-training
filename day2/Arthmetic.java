package com.trimindtech.training.day2;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Arthmetic {
    public static void main(String[] args) {
       int a,b;
       int c;
       // char ch;
        System.out.println("enter the operation");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        //Scanner sc = new Scanner(System.in);
        /*System.out.println("Choose the operation you want to perform ");
        System.out.println("Choose 1 for ADDITION");
        System.out.println("Choose 2 for SUBTRACTION");
        System.out.println("Choose 3 for MULTIPLICATION");
        System.out.println("Choose 4 for DIVISION");
        System.out.println("Choose 5 for MODULUS");
        System.out.println("enter a number");*/
        //Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        Scanner scr = new Scanner(System.in);
        a = scr.nextInt();
        System.out.println("enter a number");
        Scanner scrt = new Scanner(System.in);
        b = scr.nextInt();
        /*Scanner sc = new Scanner(System.in);// Character input
        char c = sc.next().charAt(0);
*/
        switch(ch) {
            case '+':
                //int c;
                c = a + b;
                System.out.println("addition is "+c);
                break;
            case '-':
                //int d;
                c = a - b;
                System.out.println("Sub is "+c);
                break;
            case '*':
                //int e;
                c = a * 3;
                System.out.println("Mul is "+c);
                break;
            case '/' :
                //int f;
                c = a / b;
                System.out.println("DIV is "+c);
                break;
            case '%':
               // int 'g';
                c = a % b;
                System.out.println("rem is "+c);
                break;
            default:
                System.out.println("wrong");
        }

    }
}
