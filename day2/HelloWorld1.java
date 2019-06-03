package com.trimindtech.training.day2;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class HelloWorld1 {
    public static void main(String[] args) {
        int num;
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();


        if(num%2==0 && num%3==0){
            System.out.println("hello world");}
            else if(num%2==0 ){
                System.out.println("Hello");
            }
        else if(num%3==0) {
            System.out.println("world");
        }

        else
        {
            System.out.println("hello world");
        }
        }

    }

