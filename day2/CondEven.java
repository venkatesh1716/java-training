package com.trimindtech.training.day2;

import java.util.Scanner;

public class CondEven {
    public static void main(String[] args) {
        int n;
        System.out.printf("enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String a = (n%2==0)? "even":"odd";
        System.out.println(a);
    }
}
