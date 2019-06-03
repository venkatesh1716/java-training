package com.trimindtech.training.day05;

import java.util.Scanner;

public class ExceptionEx
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();
        System.out.println("Name is "+name);
        System.out.println("enter the age");
        //System.out.println("age is "+age);
       // int age = sc.nextInt();      //error generating code
        int age;
        try{
            age = sc.nextInt();
            System.out.println("age is "+age);
        } catch (Exception e){
            System.out.println("enter the age in numeric values");
            e.printStackTrace();

        }

    }
}
